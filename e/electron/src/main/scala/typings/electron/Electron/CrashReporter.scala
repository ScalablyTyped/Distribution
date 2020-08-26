package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrashReporter extends js.Object {
  // Docs: http://electronjs.org/docs/api/crash-reporter
  /**
    * Set an extra parameter to be sent with the crash report. The values specified
    * here will be sent in addition to any values set via the `extra` option when
    * `start` was called.
    *
    * Parameters added in this fashion (or via the `extra` parameter to
    * `crashReporter.start`) are specific to the calling process. Adding extra
    * parameters in the main process will not cause those parameters to be sent along
    * with crashes from renderer or other child processes. Similarly, adding extra
    * parameters in a renderer process will not result in those parameters being sent
    * with crashes that occur in other renderer processes or in the main process.
    *
    * **Note:** Parameters have limits on the length of the keys and values. Key names
    * must be no longer than 39 bytes, and values must be no longer than 127 bytes.
    * Keys with names longer than the maximum will be silently ignored. Key values
    * longer than the maximum length will be truncated.
    */
  def addExtraParameter(key: String, value: String): Unit = js.native
  /**
    * The directory where crashes are temporarily stored before being uploaded.
    * 
  **Note:** This method is deprecated, use `app.getPath('crashDumps')` instead.
    *
    * @deprecated
    */
  def getCrashesDirectory(): String = js.native
  /**
    * The date and ID of the last crash report. Only crash reports that have been
    * uploaded will be returned; even if a crash report is present on disk it will not
    * be returned until it is uploaded. In the case that there are no uploaded
    * reports, `null` is returned.
    * 
  **Note:** Calling this method from the renderer process is deprecated.
    */
  def getLastCrashReport(): CrashReport = js.native
  /**
    * The current 'extra' parameters of the crash reporter.
    */
  def getParameters(): Record[String, String] = js.native
  /**
    * Whether reports should be submitted to the server. Set through the `start`
    * method or `setUploadToServer`.
    * 
  **Note:** Calling this method from the renderer process is deprecated.
    */
  def getUploadToServer(): Boolean = js.native
  /**
    * Returns all uploaded crash reports. Each report contains the date and uploaded
    * ID.
  **Note:** Calling this method from the renderer process is deprecated.
    */
  def getUploadedReports(): js.Array[CrashReport] = js.native
  /**
    * Remove a extra parameter from the current set of parameters. Future crashes will
    * not include this parameter.
    */
  def removeExtraParameter(key: String): Unit = js.native
  /**
    * This would normally be controlled by user preferences. This has no effect if
    * called before `start` is called.
    * 
  **Note:** Calling this method from the renderer process is deprecated.
    */
  def setUploadToServer(uploadToServer: Boolean): Unit = js.native
  /**
    * This method must be called before using any other `crashReporter` APIs. Once
    * initialized this way, the crashpad handler collects crashes from all
    * subsequently created processes. The crash reporter cannot be disabled once
    * started.
    *
    * This method should be called as early as possible in app startup, preferably
    * before `app.on('ready')`. If the crash reporter is not initialized at the time a
    * renderer process is created, then that renderer process will not be monitored by
    * the crash reporter.
    *
    * **Note:** You can test out the crash reporter by generating a crash using
    * `process.crash()`.
    *
    * **Note:** If you need to send additional/updated `extra` parameters after your
    * first call `start` you can call `addExtraParameter`.
    *
    * **Note:** Parameters passed in `extra`, `globalExtra` or set with
    * `addExtraParameter` have limits on the length of the keys and values. Key names
    * must be at most 39 bytes long, and values must be no longer than 127 bytes. Keys
    * with names longer than the maximum will be silently ignored. Key values longer
    * than the maximum length will be truncated.
    * 
  **Note:** Calling this method from the renderer process is deprecated.
    */
  def start(options: CrashReporterStartOptions): Unit = js.native
}

object CrashReporter {
  @scala.inline
  def apply(
    addExtraParameter: (String, String) => Unit,
    getCrashesDirectory: () => String,
    getLastCrashReport: () => CrashReport,
    getParameters: () => Record[String, String],
    getUploadToServer: () => Boolean,
    getUploadedReports: () => js.Array[CrashReport],
    removeExtraParameter: String => Unit,
    setUploadToServer: Boolean => Unit,
    start: CrashReporterStartOptions => Unit
  ): CrashReporter = {
    val __obj = js.Dynamic.literal(addExtraParameter = js.Any.fromFunction2(addExtraParameter), getCrashesDirectory = js.Any.fromFunction0(getCrashesDirectory), getLastCrashReport = js.Any.fromFunction0(getLastCrashReport), getParameters = js.Any.fromFunction0(getParameters), getUploadToServer = js.Any.fromFunction0(getUploadToServer), getUploadedReports = js.Any.fromFunction0(getUploadedReports), removeExtraParameter = js.Any.fromFunction1(removeExtraParameter), setUploadToServer = js.Any.fromFunction1(setUploadToServer), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[CrashReporter]
  }
  @scala.inline
  implicit class CrashReporterOps[Self <: CrashReporter] (val x: Self) extends AnyVal {
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
    def setAddExtraParameter(value: (String, String) => Unit): Self = this.set("addExtraParameter", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCrashesDirectory(value: () => String): Self = this.set("getCrashesDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastCrashReport(value: () => CrashReport): Self = this.set("getLastCrashReport", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameters(value: () => Record[String, String]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUploadToServer(value: () => Boolean): Self = this.set("getUploadToServer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUploadedReports(value: () => js.Array[CrashReport]): Self = this.set("getUploadedReports", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveExtraParameter(value: String => Unit): Self = this.set("removeExtraParameter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUploadToServer(value: Boolean => Unit): Self = this.set("setUploadToServer", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: CrashReporterStartOptions => Unit): Self = this.set("start", js.Any.fromFunction1(value))
  }
  
}

