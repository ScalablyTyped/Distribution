package typings.floraColossus

import org.scalablytyped.runtime.StringDictionary
import typings.floraColossus.depTypesMod.DepType
import typings.floraColossus.nativeModuleTypesMod.NativeModuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkerMod {
  
  @JSImport("flora-colossus/lib/Walker", "Walker")
  @js.native
  class Walker protected () extends StObject {
    def this(modulePath: String) = this()
    
    var cache: js.Any = js.native
    
    var detectNativeModuleType: js.Any = js.native
    
    def getRootModule(): String = js.native
    
    var loadPackageJSON: js.Any = js.native
    
    var modules: js.Any = js.native
    
    var relativeModule: js.Any = js.native
    
    var rootModule: js.Any = js.native
    
    var walkDependenciesForModule: js.Any = js.native
    
    var walkDependenciesForModuleInModule: js.Any = js.native
    
    var walkHistory: js.Any = js.native
    
    def walkTree(): js.Promise[js.Array[Module]] = js.native
  }
  
  @js.native
  trait Module extends StObject {
    
    var depType: DepType = js.native
    
    var name: String = js.native
    
    var nativeModuleType: NativeModuleType = js.native
    
    var path: String = js.native
  }
  object Module {
    
    @scala.inline
    def apply(depType: DepType, name: String, nativeModuleType: NativeModuleType, path: String): Module = {
      val __obj = js.Dynamic.literal(depType = depType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeModuleType = nativeModuleType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepType(value: DepType): Self = StObject.set(x, "depType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeModuleType(value: NativeModuleType): Self = StObject.set(x, "nativeModuleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PackageJSON extends StObject {
    
    var dependencies: StringDictionary[VersionRange] = js.native
    
    var devDependencies: StringDictionary[VersionRange] = js.native
    
    var name: String = js.native
    
    var optionalDependencies: StringDictionary[VersionRange] = js.native
  }
  object PackageJSON {
    
    @scala.inline
    def apply(
      dependencies: StringDictionary[VersionRange],
      devDependencies: StringDictionary[VersionRange],
      name: String,
      optionalDependencies: StringDictionary[VersionRange]
    ): PackageJSON = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageJSON]
    }
    
    @scala.inline
    implicit class PackageJSONMutableBuilder[Self <: PackageJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: StringDictionary[VersionRange]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependencies(value: StringDictionary[VersionRange]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependencies(value: StringDictionary[VersionRange]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
    }
  }
  
  type VersionRange = String
}
