package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTracing extends StObject {
  
  // Docs: https://electronjs.org/docs/api/content-tracing
  /**
    * resolves with an array of category groups once all child processes have
    * acknowledged the `getCategories` request
    *
    * Get a set of category groups. The category groups can change as new code paths
    * are reached. See also the list of built-in tracing categories.
    *
    * > **NOTE:** Electron adds a non-default tracing category called `"electron"`.
    * This category can be used to capture Electron-specific tracing events.
    */
  def getCategories(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Resolves with an object containing the `value` and `percentage` of trace buffer
    * maximum usage
    *
    * * `value` Number
    * * `percentage` Number
    *
    * Get the maximum usage across processes of trace buffer as a percentage of the
    * full state.
    */
  def getTraceBufferUsage(): js.Promise[TraceBufferUsageReturnValue] = js.native
  
  def startRecording(options: TraceCategoriesAndOptions): js.Promise[Unit] = js.native
  /**
    * resolved once all child processes have acknowledged the `startRecording`
    * request.
    *
    * Start recording on all processes.
    *
    * Recording begins immediately locally and asynchronously on child processes as
    * soon as they receive the EnableRecording request.
    *
    * If a recording is already running, the promise will be immediately resolved, as
    * only one trace operation can be in progress at a time.
    */
  def startRecording(options: TraceConfig): js.Promise[Unit] = js.native
  
  /**
    * resolves with a path to a file that contains the traced data once all child
    * processes have acknowledged the `stopRecording` request
    *
    * Stop recording on all processes.
    *
    * Child processes typically cache trace data and only rarely flush and send trace
    * data back to the main process. This helps to minimize the runtime overhead of
    * tracing since sending trace data over IPC can be an expensive operation. So, to
    * end tracing, Chromium asynchronously asks all child processes to flush any
    * pending trace data.
    *
    * Trace data will be written into `resultFilePath`. If `resultFilePath` is empty
    * or not provided, trace data will be written to a temporary file, and the path
    * will be returned in the promise.
    */
  def stopRecording(): js.Promise[String] = js.native
  def stopRecording(resultFilePath: String): js.Promise[String] = js.native
}
