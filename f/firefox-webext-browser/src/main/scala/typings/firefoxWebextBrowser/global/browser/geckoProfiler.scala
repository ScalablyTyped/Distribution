package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.geckoProfiler.StartSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes the browser's profiler.
  *
  * Permissions: `geckoProfiler`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object geckoProfiler {
  
  @JSGlobal("browser.geckoProfiler")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gathers the profile data from the current profiling session, and writes it to disk. The returned promise resolves to a path that locates the created file.
    * @param fileName The name of the file inside the profile/profiler directory
    */
  inline def dumpProfileToFile(fileName: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpProfileToFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  /** Gathers the profile data from the current profiling session. */
  inline def getProfile(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")().asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer that contains a JSON string.
    */
  inline def getProfileAsArrayBuffer(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileAsArrayBuffer")().asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer that contains a gzipped JSON string.
    */
  inline def getProfileAsGzippedArrayBuffer(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileAsGzippedArrayBuffer")().asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Gets the debug symbols for a particular library.
    * @param debugName The name of the library's debug file. For example, 'xul.pdb
    * @param breakpadId The Breakpad ID of the library
    */
  inline def getSymbols(debugName: String, breakpadId: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbols")(debugName.asInstanceOf[js.Any], breakpadId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /* geckoProfiler events */
  /**
    * Fires when the profiler starts/stops running.
    * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
    */
  @JSGlobal("browser.geckoProfiler.onRunning")
  @js.native
  val onRunning: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]] = js.native
  
  /** Pauses the profiler, keeping any profile data that is already written. */
  inline def pause(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[js.Promise[js.Any]]
  
  /** Resumes the profiler with the settings that were initially used to start it. */
  inline def resume(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[js.Promise[js.Any]]
  
  /* geckoProfiler functions */
  /** Starts the profiler with the specified settings. */
  inline def start(settings: StartSettings): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  /** Stops the profiler and discards any captured profile data. */
  inline def stop(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[js.Promise[js.Any]]
}
