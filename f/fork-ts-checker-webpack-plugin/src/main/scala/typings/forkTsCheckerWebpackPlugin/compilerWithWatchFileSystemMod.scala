package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatchFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerWithWatchFileSystemMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler * / any */ trait CompilerWithWatchFileSystem[TWatchFileSystem /* <: WatchFileSystem */] extends StObject {
    
    var watchFileSystem: js.UndefOr[TWatchFileSystem] = js.undefined
  }
  object CompilerWithWatchFileSystem {
    
    @scala.inline
    def apply[TWatchFileSystem /* <: WatchFileSystem */](): CompilerWithWatchFileSystem[TWatchFileSystem] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerWithWatchFileSystem[TWatchFileSystem]]
    }
    
    @scala.inline
    implicit class CompilerWithWatchFileSystemMutableBuilder[Self <: CompilerWithWatchFileSystem[?], TWatchFileSystem /* <: WatchFileSystem */] (val x: Self & CompilerWithWatchFileSystem[TWatchFileSystem]) extends AnyVal {
      
      @scala.inline
      def setWatchFileSystem(value: TWatchFileSystem): Self = StObject.set(x, "watchFileSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchFileSystemUndefined: Self = StObject.set(x, "watchFileSystem", js.undefined)
    }
  }
}
