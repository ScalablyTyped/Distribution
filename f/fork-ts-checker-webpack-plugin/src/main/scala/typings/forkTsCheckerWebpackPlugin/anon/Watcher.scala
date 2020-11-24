package typings.forkTsCheckerWebpackPlugin.anon

import typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.Watchpack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watcher extends js.Object {
  
  var watcher: Watchpack = js.native
}
object Watcher {
  
  @scala.inline
  def apply(watcher: Watchpack): Watcher = {
    val __obj = js.Dynamic.literal(watcher = watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watcher]
  }
  
  @scala.inline
  implicit class WatcherOps[Self <: Watcher] (val x: Self) extends AnyVal {
    
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
    def setWatcher(value: Watchpack): Self = this.set("watcher", value.asInstanceOf[js.Any])
  }
}
