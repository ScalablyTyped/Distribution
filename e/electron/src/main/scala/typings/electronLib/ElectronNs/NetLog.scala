package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetLog extends EventEmitter {
  /**
       * A Boolean property that indicates whether network logs are recorded.
       */
  var currentlyLogging: js.UndefOr[scala.Boolean] = js.native
  /**
       * A String property that returns the path to the current log file.
       */
  var currentlyLoggingPath: js.UndefOr[java.lang.String] = js.native
  // Docs: http://electronjs.org/docs/api/net-log
  /**
       * Starts recording network events to path.
       */
  def startLogging(path: java.lang.String): scala.Unit = js.native
  /**
       * Stops recording network events. If not called, net logging will automatically
       * end when app quits.
       */
  def stopLogging(): scala.Unit = js.native
  /**
       * Stops recording network events. If not called, net logging will automatically
       * end when app quits.
       */
  def stopLogging(callback: js.Function1[/* path */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

