package typings.firefoxDashWebextDashBrowser.browser

import typings.firefoxDashWebextDashBrowser.Anon_BufferSize
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.windowLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exposes the browser's profiler.
  *
  * Permissions: `geckoProfiler`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.geckoProfiler")
@js.native
object geckoProfiler extends js.Object {
  /* geckoProfiler types */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.java
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.JS
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.leaf
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.mainthreadio
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.memory
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.privacy
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.responsiveness
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.screenshots
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.seqstyle
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.stackwalk
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tasktracer
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.threads
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.trackopts
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.jstracer
  */
  trait ProfilerFeature extends js.Object
  
  /* geckoProfiler events */
  /**
    * Fires when the profiler starts/stops running.
    * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
    */
  val onRunning: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]] = js.native
  /** Gathers the profile data from the current profiling session. */
  def getProfile(): js.Promise[_] = js.native
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer
    * that contains a JSON string.
    */
  def getProfileAsArrayBuffer(): js.Promise[_] = js.native
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
  def start(settings: Anon_BufferSize): js.Promise[_] = js.native
  /** Stops the profiler and discards any captured profile data. */
  def stop(): js.Promise[_] = js.native
  type Supports = windowLength
}

