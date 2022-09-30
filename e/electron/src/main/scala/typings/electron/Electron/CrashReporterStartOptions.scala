package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrashReporterStartOptions extends StObject {
  
  /**
    * Deprecated alias for `{ globalExtra: { _companyName: ... } }`.
    *
    * @deprecated
    */
  var companyName: js.UndefOr[String] = js.undefined
  
  /**
    * If true, crash reports will be compressed and uploaded with `Content-Encoding:
    * gzip`. Default is `true`.
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Extra string key/value annotations that will be sent along with crash reports
    * that are generated in the main process. Only string values are supported.
    * Crashes generated in child processes will not contain these extra parameters to
    * crash reports generated from child processes, call `addExtraParameter` from the
    * child process.
    */
  var extra: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Extra string key/value annotations that will be sent along with any crash
    * reports generated in any process. These annotations cannot be changed once the
    * crash reporter has been started. If a key is present in both the global extra
    * parameters and the process-specific extra parameters, then the global one will
    * take precedence. By default, `productName` and the app version are included, as
    * well as the Electron version.
    */
  var globalExtra: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * If true, crashes generated in the main process will not be forwarded to the
    * system crash handler. Default is `false`.
    */
  var ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `app.name`.
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * If true, limit the number of crashes uploaded to 1/hour. Default is `false`.
    *
    * @platform darwin,win32
    */
  var rateLimit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * URL that crash reports will be sent to as POST. Required unless `uploadToServer`
    * is `false`.
    */
  var submitURL: js.UndefOr[String] = js.undefined
  
  /**
    * Whether crash reports should be sent to the server. If false, crash reports will
    * be collected and stored in the crashes directory, but not uploaded. Default is
    * `true`.
    */
  var uploadToServer: js.UndefOr[Boolean] = js.undefined
}
object CrashReporterStartOptions {
  
  inline def apply(): CrashReporterStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrashReporterStartOptions]
  }
  
  extension [Self <: CrashReporterStartOptions](x: Self) {
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setExtra(value: Record[String, String]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setGlobalExtra(value: Record[String, String]): Self = StObject.set(x, "globalExtra", value.asInstanceOf[js.Any])
    
    inline def setGlobalExtraUndefined: Self = StObject.set(x, "globalExtra", js.undefined)
    
    inline def setIgnoreSystemCrashHandler(value: Boolean): Self = StObject.set(x, "ignoreSystemCrashHandler", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSystemCrashHandlerUndefined: Self = StObject.set(x, "ignoreSystemCrashHandler", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setRateLimit(value: Boolean): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    
    inline def setSubmitURL(value: String): Self = StObject.set(x, "submitURL", value.asInstanceOf[js.Any])
    
    inline def setSubmitURLUndefined: Self = StObject.set(x, "submitURL", js.undefined)
    
    inline def setUploadToServer(value: Boolean): Self = StObject.set(x, "uploadToServer", value.asInstanceOf[js.Any])
    
    inline def setUploadToServerUndefined: Self = StObject.set(x, "uploadToServer", js.undefined)
  }
}
