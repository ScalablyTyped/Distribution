package typings.forkTsCheckerWebpackPlugin.watchFileSystemMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherV4 extends Watcher {
  
  def close(): Unit = js.native
  
  def getContextTimestamps(): Map[String, Double] = js.native
  
  def getFileTimestamps(): Map[String, Double] = js.native
  
  def pause(): Unit = js.native
}
object WatcherV4 {
  
  @scala.inline
  def apply(
    close: () => Unit,
    getContextTimestamps: () => Map[String, Double],
    getFileTimestamps: () => Map[String, Double],
    pause: () => Unit
  ): WatcherV4 = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimestamps = js.Any.fromFunction0(getContextTimestamps), getFileTimestamps = js.Any.fromFunction0(getFileTimestamps), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[WatcherV4]
  }
  
  @scala.inline
  implicit class WatcherV4Ops[Self <: WatcherV4] (val x: Self) extends AnyVal {
    
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
    def setGetContextTimestamps(value: () => Map[String, Double]): Self = this.set("getContextTimestamps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileTimestamps(value: () => Map[String, Double]): Self = this.set("getFileTimestamps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
  }
}
