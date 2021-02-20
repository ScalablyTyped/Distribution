package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.geckoProfiler.StartSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes the browser's profiler.
  *
  * Permissions: `geckoProfiler`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object geckoProfiler {
  
  /**
    * Gathers the profile data from the current profiling session, and writes it to disk. The returned promise resolves to a path that locates the created file.
    * @param fileName The name of the file inside the profile/profiler directory
    */
  @JSGlobal("browser.geckoProfiler.dumpProfileToFile")
  @js.native
  def dumpProfileToFile(fileName: String): js.Promise[_] = js.native
  
  /** Gathers the profile data from the current profiling session. */
  @JSGlobal("browser.geckoProfiler.getProfile")
  @js.native
  def getProfile(): js.Promise[_] = js.native
  
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer that contains a JSON string.
    */
  @JSGlobal("browser.geckoProfiler.getProfileAsArrayBuffer")
  @js.native
  def getProfileAsArrayBuffer(): js.Promise[_] = js.native
  
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer that contains a gzipped JSON string.
    */
  @JSGlobal("browser.geckoProfiler.getProfileAsGzippedArrayBuffer")
  @js.native
  def getProfileAsGzippedArrayBuffer(): js.Promise[_] = js.native
  
  /**
    * Gets the debug symbols for a particular library.
    * @param debugName The name of the library's debug file. For example, 'xul.pdb
    * @param breakpadId The Breakpad ID of the library
    */
  @JSGlobal("browser.geckoProfiler.getSymbols")
  @js.native
  def getSymbols(debugName: String, breakpadId: String): js.Promise[_] = js.native
  
  /* geckoProfiler events */
  /**
    * Fires when the profiler starts/stops running.
    * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
    */
  @JSGlobal("browser.geckoProfiler.onRunning")
  @js.native
  val onRunning: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]] = js.native
  
  /** Pauses the profiler, keeping any profile data that is already written. */
  @JSGlobal("browser.geckoProfiler.pause")
  @js.native
  def pause(): js.Promise[_] = js.native
  
  /** Resumes the profiler with the settings that were initially used to start it. */
  @JSGlobal("browser.geckoProfiler.resume")
  @js.native
  def resume(): js.Promise[_] = js.native
  
  /* geckoProfiler functions */
  /** Starts the profiler with the specified settings. */
  @JSGlobal("browser.geckoProfiler.start")
  @js.native
  def start(settings: StartSettings): js.Promise[_] = js.native
  
  /** Stops the profiler and discards any captured profile data. */
  @JSGlobal("browser.geckoProfiler.stop")
  @js.native
  def stop(): js.Promise[_] = js.native
}
