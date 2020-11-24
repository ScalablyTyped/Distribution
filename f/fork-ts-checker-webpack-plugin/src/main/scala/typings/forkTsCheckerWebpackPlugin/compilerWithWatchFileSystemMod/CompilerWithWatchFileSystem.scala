package typings.forkTsCheckerWebpackPlugin.compilerWithWatchFileSystemMod

import typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatchFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler * / any */ @js.native
trait CompilerWithWatchFileSystem[TWatchFileSystem /* <: WatchFileSystem */] extends js.Object {
  
  var watchFileSystem: js.UndefOr[TWatchFileSystem] = js.native
}
object CompilerWithWatchFileSystem {
  
  @scala.inline
  def apply[TWatchFileSystem /* <: WatchFileSystem */](): CompilerWithWatchFileSystem[TWatchFileSystem] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerWithWatchFileSystem[TWatchFileSystem]]
  }
  
  @scala.inline
  implicit class CompilerWithWatchFileSystemOps[Self <: CompilerWithWatchFileSystem[_], TWatchFileSystem /* <: WatchFileSystem */] (val x: Self with CompilerWithWatchFileSystem[TWatchFileSystem]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWatchFileSystem(value: TWatchFileSystem): Self = this.set("watchFileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchFileSystem: Self = this.set("watchFileSystem", js.undefined)
  }
}
