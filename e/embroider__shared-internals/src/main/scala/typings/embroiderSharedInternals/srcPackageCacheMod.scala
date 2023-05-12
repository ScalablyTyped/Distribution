package typings.embroiderSharedInternals

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPackageCacheMod {
  
  @JSImport("@embroider/shared-internals/src/package-cache", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PackageCache {
    def this(appRoot: String) = this()
    
    /* CompleteClass */
    var appRoot: String = js.native
    
    /* CompleteClass */
    override def basedir(pkg: typings.embroiderSharedInternals.srcPackageMod.default): String = js.native
    
    /* CompleteClass */
    override def get(packageRoot: String): typings.embroiderSharedInternals.srcPackageMod.default = js.native
    
    /* CompleteClass */
    override def ownerOfFile(filename: String): js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default] = js.native
    
    /* protected */ /* CompleteClass */
    var resolutionCache: Map[
        typings.embroiderSharedInternals.srcPackageMod.default, 
        Map[String, typings.embroiderSharedInternals.srcPackageMod.default | Null]
      ] = js.native
    
    /* CompleteClass */
    override def resolve(packageName: String, fromPackage: typings.embroiderSharedInternals.srcPackageMod.default): typings.embroiderSharedInternals.srcPackageMod.default = js.native
    
    /* protected */ /* CompleteClass */
    var rootCache: Map[String, typings.embroiderSharedInternals.srcPackageMod.default] = js.native
    
    /* CompleteClass */
    override def seed(pkg: typings.embroiderSharedInternals.srcPackageMod.default): Unit = js.native
    
    /* CompleteClass */
    override def shareAs(identifier: String): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@embroider/shared-internals/src/package-cache", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def shared(identifier: String, appRoot: String): PackageCache = (^.asInstanceOf[js.Dynamic].applyDynamic("shared")(identifier.asInstanceOf[js.Any], appRoot.asInstanceOf[js.Any])).asInstanceOf[PackageCache]
  }
  
  trait PackageCache extends StObject {
    
    var appRoot: String
    
    def basedir(pkg: typings.embroiderSharedInternals.srcPackageMod.default): String
    
    def get(packageRoot: String): typings.embroiderSharedInternals.srcPackageMod.default
    
    def ownerOfFile(filename: String): js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default]
    
    /* protected */ var resolutionCache: Map[
        typings.embroiderSharedInternals.srcPackageMod.default, 
        Map[String, typings.embroiderSharedInternals.srcPackageMod.default | Null]
      ]
    
    def resolve(packageName: String, fromPackage: typings.embroiderSharedInternals.srcPackageMod.default): typings.embroiderSharedInternals.srcPackageMod.default
    
    /* protected */ var rootCache: Map[String, typings.embroiderSharedInternals.srcPackageMod.default]
    
    def seed(pkg: typings.embroiderSharedInternals.srcPackageMod.default): Unit
    
    def shareAs(identifier: String): Unit
  }
  object PackageCache {
    
    inline def apply(
      appRoot: String,
      basedir: typings.embroiderSharedInternals.srcPackageMod.default => String,
      get: String => typings.embroiderSharedInternals.srcPackageMod.default,
      ownerOfFile: String => js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default],
      resolutionCache: Map[
          typings.embroiderSharedInternals.srcPackageMod.default, 
          Map[String, typings.embroiderSharedInternals.srcPackageMod.default | Null]
        ],
      resolve: (String, typings.embroiderSharedInternals.srcPackageMod.default) => typings.embroiderSharedInternals.srcPackageMod.default,
      rootCache: Map[String, typings.embroiderSharedInternals.srcPackageMod.default],
      seed: typings.embroiderSharedInternals.srcPackageMod.default => Unit,
      shareAs: String => Unit
    ): PackageCache = {
      val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any], basedir = js.Any.fromFunction1(basedir), get = js.Any.fromFunction1(get), ownerOfFile = js.Any.fromFunction1(ownerOfFile), resolutionCache = resolutionCache.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve), rootCache = rootCache.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), shareAs = js.Any.fromFunction1(shareAs))
      __obj.asInstanceOf[PackageCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageCache] (val x: Self) extends AnyVal {
      
      inline def setAppRoot(value: String): Self = StObject.set(x, "appRoot", value.asInstanceOf[js.Any])
      
      inline def setBasedir(value: typings.embroiderSharedInternals.srcPackageMod.default => String): Self = StObject.set(x, "basedir", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => typings.embroiderSharedInternals.srcPackageMod.default): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setOwnerOfFile(value: String => js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default]): Self = StObject.set(x, "ownerOfFile", js.Any.fromFunction1(value))
      
      inline def setResolutionCache(
        value: Map[
              typings.embroiderSharedInternals.srcPackageMod.default, 
              Map[String, typings.embroiderSharedInternals.srcPackageMod.default | Null]
            ]
      ): Self = StObject.set(x, "resolutionCache", value.asInstanceOf[js.Any])
      
      inline def setResolve(
        value: (String, typings.embroiderSharedInternals.srcPackageMod.default) => typings.embroiderSharedInternals.srcPackageMod.default
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      inline def setRootCache(value: Map[String, typings.embroiderSharedInternals.srcPackageMod.default]): Self = StObject.set(x, "rootCache", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: typings.embroiderSharedInternals.srcPackageMod.default => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction1(value))
      
      inline def setShareAs(value: String => Unit): Self = StObject.set(x, "shareAs", js.Any.fromFunction1(value))
    }
  }
}
