package typings
package filewriterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSaver
  extends stdLib.EventTarget {
  /**
    * The entire Blob has been written to the file, an error occurred during the write, or the write was aborted using abort(). The FileSaver is no longer writing the blob.
    * @readonly
    */
  var DONE: scala.Double = js.native
  /**
    * The blob is being written.
    * @readonly
    */
  var INIT: scala.Double = js.native
  /**
    * The object has been constructed, but there is no pending write.
    * @readonly
    */
  var WRITING: scala.Double = js.native
  /**
    * The last error that occurred on the FileSaver.
    * @readonly
    */
  var error: stdLib.Error = js.native
  /**
    * The FileSaver object can be in one of 3 states. The readyState attribute, on getting, must return the current state, which must be one of the following values:
    * <ul>
    * <li>INIT</li>
    * <li>WRITING</li>
    * <li>DONE</li>
    * <ul>
    * @readonly
    */
  var readyState: scala.Double = js.native
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
  def abort(): scala.Unit = js.native
  /**
    * Handler for abort events.
    */
  def onabort(event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Handler for error events.
    */
  def onerror(event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Handler for progress events.
    */
  def onprogress(event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Handler for write events.
    */
  def onwrite(event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Handler for writeend events.
    */
  def onwriteend(event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Handler for writestart events
    */
  def onwritestart(event: stdLib.ProgressEvent): scala.Unit = js.native
}

@JSGlobal("FileSaver")
@js.native
object FileSaver
  extends /**
  * When the FileSaver constructor is called, the user agent must return a new FileSaver object with readyState set to INIT.
  * This constructor must be visible when the script's global object is either a Window object or an object implementing the WorkerUtils interface.
  */
org.scalablytyped.runtime.Instantiable1[/* data */ stdLib.Blob, FileSaver]

