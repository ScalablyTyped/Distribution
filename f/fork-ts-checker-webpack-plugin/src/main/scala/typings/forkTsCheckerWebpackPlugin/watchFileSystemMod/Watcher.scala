package typings.forkTsCheckerWebpackPlugin.watchFileSystemMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV4
  - typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV5
*/
trait Watcher extends js.Object
object Watcher {
  
  @scala.inline
  def WatcherV4(
    close: () => Unit,
    getContextTimestamps: () => Map[String, Double],
    getFileTimestamps: () => Map[String, Double],
    pause: () => Unit
  ): Watcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimestamps = js.Any.fromFunction0(getContextTimestamps), getFileTimestamps = js.Any.fromFunction0(getFileTimestamps), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[Watcher]
  }
  
  @scala.inline
  def WatcherV5(
    close: () => Unit,
    getContextTimeInfoEntries: () => Map[String, Double],
    getFileTimeInfoEntries: () => Map[String, Double],
    pause: () => Unit
  ): Watcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimeInfoEntries = js.Any.fromFunction0(getContextTimeInfoEntries), getFileTimeInfoEntries = js.Any.fromFunction0(getFileTimeInfoEntries), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[Watcher]
  }
}
