package typings.galactus

import typings.floraColossus.mod.Walker
import typings.floraColossus.walkerMod.Module
import typings.galactus.destroyerOfModulesMod.ShouldKeepModuleTest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RelativePaths extends StObject {
    
    var relativePaths: Boolean
  }
  object RelativePaths {
    
    @scala.inline
    def apply(relativePaths: Boolean): RelativePaths = {
      val __obj = js.Dynamic.literal(relativePaths = relativePaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativePaths]
    }
    
    @scala.inline
    implicit class RelativePathsMutableBuilder[Self <: RelativePaths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelativePaths(value: Boolean): Self = StObject.set(x, "relativePaths", value.asInstanceOf[js.Any])
    }
  }
  
  trait RootDirectory extends StObject {
    
    var rootDirectory: js.UndefOr[String] = js.undefined
    
    var shouldKeepModuleTest: js.UndefOr[ShouldKeepModuleTest] = js.undefined
    
    var walker: js.UndefOr[Walker] = js.undefined
  }
  object RootDirectory {
    
    @scala.inline
    def apply(): RootDirectory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootDirectory]
    }
    
    @scala.inline
    implicit class RootDirectoryMutableBuilder[Self <: RootDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
      
      @scala.inline
      def setShouldKeepModuleTest(value: (/* module */ Module, /* isDevDep */ Boolean) => Boolean): Self = StObject.set(x, "shouldKeepModuleTest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldKeepModuleTestUndefined: Self = StObject.set(x, "shouldKeepModuleTest", js.undefined)
      
      @scala.inline
      def setWalker(value: Walker): Self = StObject.set(x, "walker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalkerUndefined: Self = StObject.set(x, "walker", js.undefined)
    }
  }
}
