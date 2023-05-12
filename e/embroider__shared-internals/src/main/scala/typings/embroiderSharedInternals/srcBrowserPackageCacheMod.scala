package typings.embroiderSharedInternals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserPackageCacheMod {
  
  @JSImport("@embroider/shared-internals/src/browser-package-cache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PackageCache {
    
    /* CompleteClass */
    override def ownerOfFile(_file: String): js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default] = js.native
    
    /* CompleteClass */
    override def resolve(_specifier: String, _from: typings.embroiderSharedInternals.srcPackageMod.default): typings.embroiderSharedInternals.srcPackageMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@embroider/shared-internals/src/browser-package-cache", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def shared(identifier: String): PackageCache = ^.asInstanceOf[js.Dynamic].applyDynamic("shared")(identifier.asInstanceOf[js.Any]).asInstanceOf[PackageCache]
  }
  
  trait PackageCache extends StObject {
    
    def ownerOfFile(_file: String): js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default]
    
    def resolve(_specifier: String, _from: typings.embroiderSharedInternals.srcPackageMod.default): typings.embroiderSharedInternals.srcPackageMod.default
  }
  object PackageCache {
    
    inline def apply(
      ownerOfFile: String => js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default],
      resolve: (String, typings.embroiderSharedInternals.srcPackageMod.default) => typings.embroiderSharedInternals.srcPackageMod.default
    ): PackageCache = {
      val __obj = js.Dynamic.literal(ownerOfFile = js.Any.fromFunction1(ownerOfFile), resolve = js.Any.fromFunction2(resolve))
      __obj.asInstanceOf[PackageCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageCache] (val x: Self) extends AnyVal {
      
      inline def setOwnerOfFile(value: String => js.UndefOr[typings.embroiderSharedInternals.srcPackageMod.default]): Self = StObject.set(x, "ownerOfFile", js.Any.fromFunction1(value))
      
      inline def setResolve(
        value: (String, typings.embroiderSharedInternals.srcPackageMod.default) => typings.embroiderSharedInternals.srcPackageMod.default
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    }
  }
}
