package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetLog extends js.Object {
  
  /**
    * A `Boolean` property that indicates whether network logs are currently being
    * recorded.
    *
    */
  val currentlyLogging: Boolean = js.native
  
  // Docs: https://electronjs.org/docs/api/net-log
  /**
    * resolves when the net log has begun recording.
    * 
  Starts recording network events to `path`.
    */
  def startLogging(path: String): js.Promise[Unit] = js.native
  def startLogging(path: String, options: StartLoggingOptions): js.Promise[Unit] = js.native
  
  /**
    * resolves when the net log has been flushed to disk.
    *
    * Stops recording network events. If not called, net logging will automatically
    * end when app quits.
    */
  def stopLogging(): js.Promise[Unit] = js.native
}
