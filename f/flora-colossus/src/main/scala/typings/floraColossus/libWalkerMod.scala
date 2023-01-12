package typings.floraColossus

import org.scalablytyped.runtime.StringDictionary
import typings.floraColossus.libDepTypesMod.DepType
import typings.floraColossus.libNativeModuleTypesMod.NativeModuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWalkerMod {
  
  @JSImport("flora-colossus/lib/Walker", "Walker")
  @js.native
  open class Walker protected () extends StObject {
    def this(modulePath: String) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var detectNativeModuleType: Any = js.native
    
    def getRootModule(): String = js.native
    
    /* private */ var loadPackageJSON: Any = js.native
    
    /* private */ var modules: Any = js.native
    
    /* private */ var relativeModule: Any = js.native
    
    /* private */ var rootModule: Any = js.native
    
    /* private */ var walkDependenciesForModule: Any = js.native
    
    /* private */ var walkDependenciesForModuleInModule: Any = js.native
    
    /* private */ var walkHistory: Any = js.native
    
    def walkTree(): js.Promise[js.Array[Module]] = js.native
  }
  
  trait Module extends StObject {
    
    var depType: DepType
    
    var name: String
    
    var nativeModuleType: NativeModuleType
    
    var path: String
  }
  object Module {
    
    inline def apply(depType: DepType, name: String, nativeModuleType: NativeModuleType, path: String): Module = {
      val __obj = js.Dynamic.literal(depType = depType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeModuleType = nativeModuleType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      inline def setDepType(value: DepType): Self = StObject.set(x, "depType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNativeModuleType(value: NativeModuleType): Self = StObject.set(x, "nativeModuleType", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackageJSON extends StObject {
    
    var dependencies: StringDictionary[VersionRange]
    
    var devDependencies: StringDictionary[VersionRange]
    
    var name: String
    
    var optionalDependencies: StringDictionary[VersionRange]
  }
  object PackageJSON {
    
    inline def apply(
      dependencies: StringDictionary[VersionRange],
      devDependencies: StringDictionary[VersionRange],
      name: String,
      optionalDependencies: StringDictionary[VersionRange]
    ): PackageJSON = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageJSON] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: StringDictionary[VersionRange]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependencies(value: StringDictionary[VersionRange]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependencies(value: StringDictionary[VersionRange]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
    }
  }
  
  type VersionRange = String
}
