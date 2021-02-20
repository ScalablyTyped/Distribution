package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrashReporterStartOptions extends StObject {
  
  /**
    * Deprecated alias for `{ globalExtra: { _companyName: ... } }`.
    *
    * @deprecated
    */
  var companyName: js.UndefOr[String] = js.native
  
  /**
    * If true, crash reports will be compressed and uploaded with `Content-Encoding:
    * gzip`. Default is `false`.
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
  implicit class CrashReporterStartOptionsMutableBuilder[Self <: CrashReporterStartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    @scala.inline
    def setExtra(value: Record[String, String]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setGlobalExtra(value: Record[String, String]): Self = StObject.set(x, "globalExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalExtraUndefined: Self = StObject.set(x, "globalExtra", js.undefined)
    
    @scala.inline
    def setIgnoreSystemCrashHandler(value: Boolean): Self = StObject.set(x, "ignoreSystemCrashHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSystemCrashHandlerUndefined: Self = StObject.set(x, "ignoreSystemCrashHandler", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Boolean): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    
    @scala.inline
    def setSubmitURL(value: String): Self = StObject.set(x, "submitURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadToServer(value: Boolean): Self = StObject.set(x, "uploadToServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadToServerUndefined: Self = StObject.set(x, "uploadToServer", js.undefined)
  }
}
