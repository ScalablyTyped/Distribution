package typings
package electronLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process
  extends nodeLib.NodeJSNs.EventEmitter {
  /**
    * A Boolean. When app is started by being passed as parameter to the default app,
    * this property is true in the main process, otherwise it is undefined.
    */
  var defaultApp: js.UndefOr[scala.Boolean] = js.native
  /**
    * A Boolean. For Mac App Store build, this property is true, for other builds it
    * is undefined.
    */
  var mas: js.UndefOr[scala.Boolean] = js.native
  /**
    * A Boolean that controls ASAR support inside your application. Setting this to
    * true will disable the support for asar archives in Node's built-in modules.
    */
  var noAsar: js.UndefOr[scala.Boolean] = js.native
  /**
    * A Boolean that controls whether or not deprecation warnings are printed to
    * stderr. Setting this to true will silence deprecation warnings. This property is
    * used instead of the --no-deprecation command line flag.
    */
  var noDeprecation: js.UndefOr[scala.Boolean] = js.native
  /**
    * A String representing the path to the resources directory.
    */
  var resourcesPath: js.UndefOr[java.lang.String] = js.native
  /**
    * A Boolean. When the renderer process is sandboxed, this property is true,
    * otherwise it is undefined.
    */
  var sandboxed: js.UndefOr[scala.Boolean] = js.native
  /**
    * A Boolean that controls whether or not deprecation warnings will be thrown as
    * exceptions. Setting this to true will throw errors for deprecations. This
    * property is used instead of the --throw-deprecation command line flag.
    */
  var throwDeprecation: js.UndefOr[scala.Boolean] = js.native
  /**
    * A Boolean that controls whether or not deprecations printed to stderr include
    * their stack trace. Setting this to true will print stack traces for
    * deprecations. This property is instead of the --trace-deprecation command line
    * flag.
    */
  var traceDeprecation: js.UndefOr[scala.Boolean] = js.native
  /**
    * A Boolean that controls whether or not process warnings printed to stderr
    * include their stack trace. Setting this to true will print stack traces for
    * process warnings (including deprecations). This property is instead of the
    * --trace-warnings command line flag.
    */
  var traceProcessWarnings: js.UndefOr[scala.Boolean] = js.native
  /**
    * A String representing the current process's type, can be "browser" (i.e. main
    * process) or "renderer".
    */
  var `type`: js.UndefOr[java.lang.String] = js.native
  /**
    * A Boolean. If the app is running as a Windows Store app (appx), this property is
    * true, for otherwise it is undefined.
    */
  var windowsStore: js.UndefOr[scala.Boolean] = js.native
  @JSName("addListener")
  def addListener_loaded(event: electronLib.electronLibStrings.loaded, listener: js.Function): this.type = js.native
  /**
    * Causes the main thread of the current process crash.
    */
  def crash(): scala.Unit = js.native
  def getCPUUsage(): electronLib.ElectronNs.CPUUsage = js.native
  /**
    * Indicates the creation time of the application. The time is represented as
    * number of milliseconds since epoch. It returns null if it is unable to get the
    * process creation time.
    */
  def getCreationTime(): scala.Double | scala.Null = js.native
  /**
    * Returns an object with V8 heap statistics. Note that all statistics are reported
    * in Kilobytes.
    */
  def getHeapStatistics(): electronLib.ElectronNs.HeapStatistics = js.native
  def getIOCounters(): electronLib.ElectronNs.IOCounters = js.native
  /**
    * Returns an object giving memory usage statistics about the entire system. Note
    * that all statistics are reported in Kilobytes.
    */
  def getSystemMemoryInfo(): electronLib.ElectronNs.SystemMemoryInfo = js.native
  /**
    * Causes the main thread of the current process hang.
    */
  def hang(): scala.Unit = js.native
  // Docs: http://electronjs.org/docs/api/process
  /**
    * Emitted when Electron has loaded its internal initialization script and is
    * beginning to load the web page or the main script. It can be used by the preload
    * script to add removed Node global symbols back to the global scope when node
    * integration is turned off:
    */
  @JSName("on")
  def on_loaded(event: electronLib.electronLibStrings.loaded, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_loaded(event: electronLib.electronLibStrings.loaded, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(event: electronLib.electronLibStrings.loaded, listener: js.Function): this.type = js.native
  /**
    * Sets the file descriptor soft limit to maxDescriptors or the OS hard limit,
    * whichever is lower for the current process.
    */
  def setFdLimit(maxDescriptors: scala.Double): scala.Unit = js.native
  /**
    * Takes a V8 heap snapshot and saves it to filePath.
    */
  def takeHeapSnapshot(filePath: java.lang.String): scala.Boolean = js.native
}

