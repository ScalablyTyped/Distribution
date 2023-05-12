package typings.embroiderSharedInternals

import org.scalablytyped.runtime.Instantiable3
import typings.embroiderSharedInternals.srcMetadataMod.AddonMeta
import typings.embroiderSharedInternals.srcMetadataMod.AppMeta
import typings.embroiderSharedInternals.srcMetadataMod.PackageInfo
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPackageMod {
  
  @JSImport("@embroider/shared-internals/src/package", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Package {
    def this(
      root: String,
      packageCache: typings.embroiderSharedInternals.srcPackageCacheMod.default,
      isApp: Boolean
    ) = this()
  }
  
  @js.native
  trait Package extends StObject {
    
    def dependencies: js.Array[Package] = js.native
    
    /* private */ var dependencyKeys: Any = js.native
    
    def findDescendants(): js.Array[Package] = js.native
    def findDescendants(filter: js.Function1[/* pkg */ this.type, Boolean]): js.Array[Package] = js.native
    
    def hasDependency(name: String): Boolean = js.native
    
    /* protected */ def internalPackageJSON: Any = js.native
    
    def isEmberPackage(): Boolean = js.native
    
    def isEngine(): Boolean = js.native
    
    def isLazyEngine(): Boolean = js.native
    
    def isV2Addon(): /* is @embroider/shared-internals.@embroider/shared-internals/src/package.V2AddonPackage */ Boolean = js.native
    
    def isV2App(): /* is @embroider/shared-internals.@embroider/shared-internals/src/package.V2AppPackage */ Boolean = js.native
    
    def isV2Ember(): /* is @embroider/shared-internals.@embroider/shared-internals/src/package.V2Package */ Boolean = js.native
    
    def mayRebuild: Boolean = js.native
    
    def meta: js.UndefOr[AddonMeta | AppMeta] = js.native
    
    def name: String = js.native
    
    def nonResolvableDeps: js.UndefOr[Map[String, Package]] = js.native
    
    /* protected */ var packageCache: typings.embroiderSharedInternals.srcPackageCacheMod.default = js.native
    
    def packageJSON: PackageInfo = js.native
    
    val root: String = js.native
    
    def version: String = js.native
  }
  
  @js.native
  trait PackageConstructor
    extends StObject
       with Instantiable3[
          /* root */ String, 
          /* mayUseDevDeps */ Boolean, 
          /* packageCache */ typings.embroiderSharedInternals.srcPackageCacheMod.default, 
          Package
        ]
  
  @js.native
  trait V2AddonPackage
    extends StObject
       with Package {
    
    @JSName("meta")
    var meta_FV2AddonPackage: AddonMeta = js.native
  }
  
  @js.native
  trait V2AppPackage
    extends StObject
       with Package {
    
    @JSName("meta")
    var meta_FV2AppPackage: AppMeta = js.native
  }
  
  @js.native
  trait V2Package
    extends StObject
       with Package {
    
    @JSName("meta")
    var meta_FV2Package: AddonMeta | AppMeta = js.native
  }
}
