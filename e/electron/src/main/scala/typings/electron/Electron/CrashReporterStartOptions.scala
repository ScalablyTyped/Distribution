package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrashReporterStartOptions extends js.Object {
  /**
    * Deprecated alias for `{ globalExtra: { _companyName: ... } }`.
    *
    * @deprecated
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * If true, crash reports will be compressed and uploaded with `Content-Encoding:
    * gzip`. Not all collection servers support compressed payloads. Default is
    * `false`.
    *
    * @platform darwin,win32
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * Extra string key/value annotations that will be sent along with crash reports
    * that are generated in the main process. Only string values are supported.
    * Crashes generated in child processes will not contain these extra parameters to
    * crash reports generated from child processes, call `addExtraParameter` from the
    * child process.
    */
  var extra: js.UndefOr[Record[String, String]] = js.native
  /**
    * Extra string key/value annotations that will be sent along with any crash
    * reports generated in any process. These annotations cannot be changed once the
    * crash reporter has been started. If a key is present in both the global extra
    * parameters and the process-specific extra parameters, then the global one will
    * take precedence. By default, `productName` and the app version are included, as
    * well as the Electron version.
    */
  var globalExtra: js.UndefOr[Record[String, String]] = js.native
  /**
    * If true, crashes generated in the main process will not be forwarded to the
    * system crash handler. Default is `false`.
    */
  var ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to `app.name`.
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * If true, limit the number of crashes uploaded to 1/hour. Default is `false`.
    *
    * @platform darwin,win32
    */
  var rateLimit: js.UndefOr[Boolean] = js.native
  /**
    * URL that crash reports will be sent to as POST.
    */
  var submitURL: String = js.native
  /**
    * Whether crash reports should be sent to the server. If false, crash reports will
    * be collected and stored in the crashes directory, but not uploaded. Default is
    * `true`.
    */
  var uploadToServer: js.UndefOr[Boolean] = js.native
}

object CrashReporterStartOptions {
  @scala.inline
  def apply(submitURL: String): CrashReporterStartOptions = {
    val __obj = js.Dynamic.literal(submitURL = submitURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReporterStartOptions]
  }
  @scala.inline
  implicit class CrashReporterStartOptionsOps[Self <: CrashReporterStartOptions] (val x: Self) extends AnyVal {
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
    def setSubmitURL(value: String): Self = this.set("submitURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setExtra(value: Record[String, String]): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setGlobalExtra(value: Record[String, String]): Self = this.set("globalExtra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalExtra: Self = this.set("globalExtra", js.undefined)
    @scala.inline
    def setIgnoreSystemCrashHandler(value: Boolean): Self = this.set("ignoreSystemCrashHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSystemCrashHandler: Self = this.set("ignoreSystemCrashHandler", js.undefined)
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    @scala.inline
    def setRateLimit(value: Boolean): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
    @scala.inline
    def setUploadToServer(value: Boolean): Self = this.set("uploadToServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadToServer: Self = this.set("uploadToServer", js.undefined)
  }
  
}

