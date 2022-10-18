package typings.galactus

import typings.floraColossus.libWalkerMod.Module
import typings.floraColossus.mod.Walker
import typings.galactus.libDestroyerOfModulesMod.ShouldKeepModuleTest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RelativePaths extends StObject {
    
    var relativePaths: Boolean
  }
  object RelativePaths {
    
    inline def apply(relativePaths: Boolean): RelativePaths = {
      val __obj = js.Dynamic.literal(relativePaths = relativePaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativePaths]
    }
    
    extension [Self <: RelativePaths](x: Self) {
      
      inline def setRelativePaths(value: Boolean): Self = StObject.set(x, "relativePaths", value.asInstanceOf[js.Any])
    }
  }
  
  trait RootDirectory extends StObject {
    
    var rootDirectory: js.UndefOr[String] = js.undefined
    
    var shouldKeepModuleTest: js.UndefOr[ShouldKeepModuleTest] = js.undefined
    
    var walker: js.UndefOr[Walker] = js.undefined
  }
  object RootDirectory {
    
    inline def apply(): RootDirectory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootDirectory]
    }
    
    extension [Self <: RootDirectory](x: Self) {
      
      inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      inline def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
      
      inline def setShouldKeepModuleTest(value: (/* module */ Module, /* isDevDep */ Boolean) => Boolean): Self = StObject.set(x, "shouldKeepModuleTest", js.Any.fromFunction2(value))
      
      inline def setShouldKeepModuleTestUndefined: Self = StObject.set(x, "shouldKeepModuleTest", js.undefined)
      
      inline def setWalker(value: Walker): Self = StObject.set(x, "walker", value.asInstanceOf[js.Any])
      
      inline def setWalkerUndefined: Self = StObject.set(x, "walker", js.undefined)
    }
  }
}
