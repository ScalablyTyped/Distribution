package typings.expressRequestsLogger.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://github.com/PayU/express-request-logger#options}
  */
@js.native
trait Options extends CommonOptions {
  
  /**
    * Additional to mask options, you can add your own functionality to mask request body.
    * This function will execute as a masking function before the package functions.
    * The custom function gets the full express request and should return the masked body.
    * {@link https://github.com/PayU/express-request-logger#custommaskbodyfunc}
    */
  var customMaskBodyFunc: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary, _, _, ParsedQs], String]] = js.native
  
  /**
    * `true` - log once the request arrives (request details), and log after response is sent (both request and response).
    * Useful if there is a concern that the server will crash during the request and there is a need to log the request before it's processed.
    * `false` - log only after the response is sent.
    * {@link https://github.com/PayU/express-request-logger#doubleaudit}
    */
  var doubleAudit: js.UndefOr[Boolean] = js.native
  
  /**
    * if the request url matches one of the values in the array, the request/response won't be logged.
    * {@link https://github.com/PayU/express-request-logger#excludeurls}
    */
  var excludeURLs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The logger to use for logging the request/response.
    * Package tested only with `bunyan` logger, but should work with any logger which has a info method which takes an object.
    * {@link https://github.com/PayU/express-request-logger#logger}
    */
  var logger: js.UndefOr[Logger] = js.native
  
  /**
    * Specific configuration for requests
    * {@link https://github.com/PayU/express-request-logger#request}
    */
  var request: js.UndefOr[js.Any] = js.native
  
  /**
    * Specific configuration for responses
    * {@link https://github.com/PayU/express-request-logger#response}
    */
  var response: js.UndefOr[ResponseOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCustomMaskBodyFunc(value: /* req */ Request[ParamsDictionary, _, _, ParsedQs] => String): Self = this.set("customMaskBodyFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomMaskBodyFunc: Self = this.set("customMaskBodyFunc", js.undefined)
    
    @scala.inline
    def setDoubleAudit(value: Boolean): Self = this.set("doubleAudit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleAudit: Self = this.set("doubleAudit", js.undefined)
    
    @scala.inline
    def setExcludeURLsVarargs(value: String*): Self = this.set("excludeURLs", js.Array(value :_*))
    
    @scala.inline
    def setExcludeURLs(value: js.Array[String]): Self = this.set("excludeURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeURLs: Self = this.set("excludeURLs", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setResponse(value: ResponseOptions): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
