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
    
    inline def apply[TWatchFileSystem /* <: WatchFileSystem */](): CompilerWithWatchFileSystem[TWatchFileSystem] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerWithWatchFileSystem[TWatchFileSystem]]
    }
    
    extension [Self <: CompilerWithWatchFileSystem[?], TWatchFileSystem /* <: WatchFileSystem */](x: Self & CompilerWithWatchFileSystem[TWatchFileSystem]) {
      
      inline def setWatchFileSystem(value: TWatchFileSystem): Self = StObject.set(x, "watchFileSystem", value.asInstanceOf[js.Any])
      
      inline def setWatchFileSystemUndefined: Self = StObject.set(x, "watchFileSystem", js.undefined)
    }
  }
}
