package typings.fastifyCors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyCorsOptions extends js.Object {
  
  /**
    * Configures the Access-Control-Allow-Headers CORS header.
    * Expects a comma-delimited string (ex: 'Content-Type,Authorization')
    * or an array (ex: ['Content-Type', 'Authorization']). If not
    * specified, defaults to reflecting the headers specified in the
    * request's Access-Control-Request-Headers header.
    */
  var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Configures the Access-Control-Allow-Credentials CORS header.
    * Set to true to pass the header, otherwise it is omitted.
    */
  var credentials: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the Access-Control-Expose-Headers CORS header.
    * Expects a comma-delimited string (ex: 'Content-Range,X-Content-Range')
    * or an array (ex: ['Content-Range', 'X-Content-Range']).
    * If not specified, no custom headers are exposed.
    */
  var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Hide options route from the documentation built using fastify-swagger (default: true).
    */
  var hideOptionsRoute: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the Access-Control-Max-Age CORS header.
    * Set to an integer to pass the header, otherwise it is omitted.
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * Configures the Access-Control-Allow-Methods CORS header.
    * Expects a comma-delimited string (ex: 'GET,PUT,POST') or an array (ex: ['GET', 'PUT', 'POST']).
    */
  var methods: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Provides a status code to use for successful OPTIONS requests,
    * since some legacy browsers (IE11, various SmartTVs) choke on 204.
    */
  var optionsSuccessStatus: js.UndefOr[Double] = js.native
  
  /**
    * Configures the Access-Control-Allow-Origin CORS header.
    */
  var origin: js.UndefOr[ValueOrArray[OriginType] | OriginFunction] = js.native
  
  /**
    * Pass the CORS preflight response to the route handler (default: false).
    */
  var preflight: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass the CORS preflight response to the route handler (default: false).
    */
  var preflightContinue: js.UndefOr[Boolean] = js.native
}
object FastifyCorsOptions {
  
  @scala.inline
  def apply(): FastifyCorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyCorsOptions]
  }
  
  @scala.inline
  implicit class FastifyCorsOptionsOps[Self <: FastifyCorsOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowedHeadersVarargs(value: String*): Self = this.set("allowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHeaders(value: String | js.Array[String]): Self = this.set("allowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHeaders: Self = this.set("allowedHeaders", js.undefined)
    
    @scala.inline
    def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setExposedHeadersVarargs(value: String*): Self = this.set("exposedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposedHeaders(value: String | js.Array[String]): Self = this.set("exposedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposedHeaders: Self = this.set("exposedHeaders", js.undefined)
    
    @scala.inline
    def setHideOptionsRoute(value: Boolean): Self = this.set("hideOptionsRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOptionsRoute: Self = this.set("hideOptionsRoute", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: String | js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setOptionsSuccessStatus(value: Double): Self = this.set("optionsSuccessStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsSuccessStatus: Self = this.set("optionsSuccessStatus", js.undefined)
    
    @scala.inline
    def setOriginFunction2(value: (/* origin */ String, /* callback */ OriginCallback) => Unit): Self = this.set("origin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOrigin(value: ValueOrArray[OriginType] | OriginFunction): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPreflight(value: Boolean): Self = this.set("preflight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreflight: Self = this.set("preflight", js.undefined)
    
    @scala.inline
    def setPreflightContinue(value: Boolean): Self = this.set("preflightContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreflightContinue: Self = this.set("preflightContinue", js.undefined)
  }
}
