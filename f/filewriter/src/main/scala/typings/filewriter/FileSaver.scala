package typings.filewriter

import org.scalablytyped.runtime.Instantiable1
import typings.std.Blob
import typings.std.Error
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSaver extends EventTarget {
  /**
    * The entire Blob has been written to the file, an error occurred during the write, or the write was aborted using abort(). The FileSaver is no longer writing the blob.
    * @readonly
    */
  var DONE: Double = js.native
  /**
    * The blob is being written.
    * @readonly
    */
  var INIT: Double = js.native
  /**
    * The object has been constructed, but there is no pending write.
    * @readonly
    */
  var WRITING: Double = js.native
  /**
    * The last error that occurred on the FileSaver.
    * @readonly
    */
  var error: Error = js.native
  /**
    * The FileSaver object can be in one of 3 states. The readyState attribute, on getting, must return the current state, which must be one of the following values:
    * <ul>
    * <li>INIT</li>
    * <li>WRITING</li>
    * <li>DONE</li>
    * <ul>
    * @readonly
    */
  var readyState: Double = js.native
  /**
    * When the abort method is called, user agents must run the steps below:
    * <ol>
    * <li> If readyState == DONE or readyState == INIT, terminate this overall series of steps without doing anything else. </li>
    * <li> Set readyState to DONE. </li>
    * <li> If there are any tasks from the object's FileSaver task source in one of the task queues, then remove those tasks. </li>
    * <li> Terminate the write algorithm being processed. </li>
    * <li> Set the error attribute to a DOMError object of type "AbortError". </li>
    * <li> Fire a progress event called abort </li>
    * <li> Fire a progress event called writeend </li>
    * <li> Terminate this algorithm. </li>
    * </ol>
    */
  def abort(): Unit = js.native
  /**
    * Handler for abort events.
    */
  def onabort(event: ProgressEvent): Unit = js.native
  /**
    * Handler for error events.
    */
  def onerror(event: ProgressEvent): Unit = js.native
  /**
    * Handler for progress events.
    */
  def onprogress(event: ProgressEvent): Unit = js.native
  /**
    * Handler for write events.
    */
  def onwrite(event: ProgressEvent): Unit = js.native
  /**
    * Handler for writeend events.
    */
  def onwriteend(event: ProgressEvent): Unit = js.native
  /**
    * Handler for writestart events
    */
  def onwritestart(event: ProgressEvent): Unit = js.native
}

@JSGlobal("FileSaver")
@js.native
class FileSaverCls protected () extends FileSaver {
  /**
    * When the FileSaver constructor is called, the user agent must return a new FileSaver object with readyState set to INIT.
    * This constructor must be visible when the script's global object is either a Window object or an object implementing the WorkerUtils interface.
    */
  def this(data: Blob) = this()
}

@JSGlobal("FileSaver")
@js.native
object FileSaver
  extends /**
  * When the FileSaver constructor is called, the user agent must return a new FileSaver object with readyState set to INIT.
  * This constructor must be visible when the script's global object is either a Window object or an object implementing the WorkerUtils interface.
  */
Instantiable1[/* data */ Blob, FileSaver]

