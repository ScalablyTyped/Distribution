package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofgeckoProfiler extends js.Object {
  /* geckoProfiler events */
  /**
    * Fires when the profiler starts/stops running.
    * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
    */
  val onRunning: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]] = js.native
  /**
    * Gathers the profile data from the current profiling session, and writes it to disk. The returned promise
    * resolves to a path that locates the created file.
    * @param fileName The name of the file inside the profile/profiler directory
    */
  def dumpProfileToFile(fileName: String): js.Promise[_] = js.native
  /** Gathers the profile data from the current profiling session. */
  def getProfile(): js.Promise[_] = js.native
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer
    * that contains a JSON string.
    */
  def getProfileAsArrayBuffer(): js.Promise[_] = js.native
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer
    * that contains a gzipped JSON string.
    */
  def getProfileAsGzippedArrayBuffer(): js.Promise[_] = js.native
  /**
    * Gets the debug symbols for a particular library.
    * @param debugName The name of the library's debug file. For example, 'xul.pdb
    * @param breakpadId The Breakpad ID of the library
    */
  def getSymbols(debugName: String, breakpadId: String): js.Promise[_] = js.native
  /** Pauses the profiler, keeping any profile data that is already written. */
  def pause(): js.Promise[_] = js.native
  /** Resumes the profiler with the settings that were initially used to start it. */
  def resume(): js.Promise[_] = js.native
  /* geckoProfiler functions */
  /** Starts the profiler with the specified settings. */
  def start(settings: BufferSize): js.Promise[_] = js.native
  /** Stops the profiler and discards any captured profile data. */
  def stop(): js.Promise[_] = js.native
}

object TypeofgeckoProfiler {
  @scala.inline
  def apply(
    dumpProfileToFile: String => js.Promise[_],
    getProfile: () => js.Promise[_],
    getProfileAsArrayBuffer: () => js.Promise[_],
    getProfileAsGzippedArrayBuffer: () => js.Promise[_],
    getSymbols: (String, String) => js.Promise[_],
    onRunning: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]],
    pause: () => js.Promise[_],
    resume: () => js.Promise[_],
    start: BufferSize => js.Promise[_],
    stop: () => js.Promise[_]
  ): TypeofgeckoProfiler = {
    val __obj = js.Dynamic.literal(dumpProfileToFile = js.Any.fromFunction1(dumpProfileToFile), getProfile = js.Any.fromFunction0(getProfile), getProfileAsArrayBuffer = js.Any.fromFunction0(getProfileAsArrayBuffer), getProfileAsGzippedArrayBuffer = js.Any.fromFunction0(getProfileAsGzippedArrayBuffer), getSymbols = js.Any.fromFunction2(getSymbols), onRunning = onRunning.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[TypeofgeckoProfiler]
  }
  @scala.inline
  implicit class TypeofgeckoProfilerOps[Self <: TypeofgeckoProfiler] (val x: Self) extends AnyVal {
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
    def setDumpProfileToFile(value: String => js.Promise[_]): Self = this.set("dumpProfileToFile", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProfile(value: () => js.Promise[_]): Self = this.set("getProfile", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProfileAsArrayBuffer(value: () => js.Promise[_]): Self = this.set("getProfileAsArrayBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProfileAsGzippedArrayBuffer(value: () => js.Promise[_]): Self = this.set("getProfileAsGzippedArrayBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSymbols(value: (String, String) => js.Promise[_]): Self = this.set("getSymbols", js.Any.fromFunction2(value))
    @scala.inline
    def setOnRunning(value: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]]): Self = this.set("onRunning", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: () => js.Promise[_]): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => js.Promise[_]): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: BufferSize => js.Promise[_]): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => js.Promise[_]): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

