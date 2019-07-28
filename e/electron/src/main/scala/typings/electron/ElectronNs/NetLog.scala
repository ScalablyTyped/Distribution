package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetLog extends EventEmitter {
  /**
    * A Boolean property that indicates whether network logs are recorded.
    */
  var currentlyLogging: js.UndefOr[Boolean] = js.native
  /**
    * A String property that returns the path to the current log file.
    */
  var currentlyLoggingPath: js.UndefOr[String] = js.native
  // Docs: http://electronjs.org/docs/api/net-log
  /**
    * Starts recording network events to path.
    */
  def startLogging(path: String): Unit = js.native
  /**
    * Stops recording network events. If not called, net logging will automatically
    * end when app quits.
    */
  def stopLogging(): Unit = js.native
  def stopLogging(callback: js.Function1[/* path */ String, Unit]): Unit = js.native
}

