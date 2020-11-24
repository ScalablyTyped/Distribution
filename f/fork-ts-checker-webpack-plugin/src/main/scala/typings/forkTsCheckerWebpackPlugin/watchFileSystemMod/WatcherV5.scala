package typings.forkTsCheckerWebpackPlugin.watchFileSystemMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherV5 extends Watcher {
  
  def close(): Unit = js.native
  
  def getContextTimeInfoEntries(): Map[String, Double] = js.native
  
  def getFileTimeInfoEntries(): Map[String, Double] = js.native
  
  def pause(): Unit = js.native
}
object WatcherV5 {
  
  @scala.inline
  def apply(
    close: () => Unit,
    getContextTimeInfoEntries: () => Map[String, Double],
    getFileTimeInfoEntries: () => Map[String, Double],
    pause: () => Unit
  ): WatcherV5 = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimeInfoEntries = js.Any.fromFunction0(getContextTimeInfoEntries), getFileTimeInfoEntries = js.Any.fromFunction0(getFileTimeInfoEntries), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[WatcherV5]
  }
  
  @scala.inline
  implicit class WatcherV5Ops[Self <: WatcherV5] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContextTimeInfoEntries(value: () => Map[String, Double]): Self = this.set("getContextTimeInfoEntries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileTimeInfoEntries(value: () => Map[String, Double]): Self = this.set("getFileTimeInfoEntries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
  }
}
