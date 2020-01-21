package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/FilesWatcher", JSImport.Namespace)
@js.native
object filesWatcherMod extends js.Object {
  @js.native
  class FilesWatcher protected () extends js.Object {
    def this(watchPaths: js.Array[String], watchExtensions: js.Array[String]) = this()
    var listeners: js.Any = js.native
    var watchExtensions: js.Any = js.native
    var watchPaths: js.Any = js.native
    var watchers: js.Any = js.native
    def isFileSupported(filePath: String): Boolean = js.native
    def isWatching(): Boolean = js.native
    def isWatchingFile(filePath: String): Boolean = js.native
    def off(event: String, listener: js.Function): Unit = js.native
    def on(event: String, listener: js.Function): Unit = js.native
    def watch(): Unit = js.native
  }
  
}

