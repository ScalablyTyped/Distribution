package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreakpadId extends js.Object {
  /* geckoProfiler events */
  /**
    * Fires when the profiler starts/stops running.
    * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
    */
  val onRunning: WebExtEvent[js.Function1[/* isRunning */ scala.Boolean, scala.Unit]]
  /** Gathers the profile data from the current profiling session. */
  def getProfile(): js.Promise[_]
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer
    * that contains a JSON string.
    */
  def getProfileAsArrayBuffer(): js.Promise[_]
  /**
    * Gets the debug symbols for a particular library.
    * @param debugName The name of the library's debug file. For example, 'xul.pdb
    * @param breakpadId The Breakpad ID of the library
    */
  def getSymbols(debugName: java.lang.String, breakpadId: java.lang.String): js.Promise[_]
  /** Pauses the profiler, keeping any profile data that is already written. */
  def pause(): js.Promise[_]
  /** Resumes the profiler with the settings that were initially used to start it. */
  def resume(): js.Promise[_]
  /* geckoProfiler functions */
  /** Starts the profiler with the specified settings. */
  def start(settings: Anon_BufferSize): js.Promise[_]
  /** Stops the profiler and discards any captured profile data. */
  def stop(): js.Promise[_]
}

