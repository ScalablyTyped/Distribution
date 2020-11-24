package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification for allowing client side cross-origin requests. Please
  * see W3C Recommendation for Cross Origin Resource Sharing
  */
@js.native
trait SchemaCorsPolicy extends js.Object {
  
  /**
    * In response to a preflight request, setting this to true indicates that
    * the actual request can include user credentials. This translates to the
    * Access-Control-Allow-Credentials header. Default is false.
    */
  var allowCredentials: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the content for the Access-Control-Allow-Headers header.
    */
  var allowHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the content for the Access-Control-Allow-Methods header.
    */
  var allowMethods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the regualar expression patterns that match allowed origins.
    * For regular expression grammar please see
    * en.cppreference.com/w/cpp/regex/ecmascript  An origin is allowed if it
    * matches either allow_origins or allow_origin_regex.
    */
  var allowOriginRegexes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the list of origins that will be allowed to do CORS requests.
    * An origin is allowed if it matches either allow_origins or
    * allow_origin_regex.
    */
  var allowOrigins: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true, specifies the CORS policy is disabled. The default value of
    * false, which indicates that the CORS policy is in effect.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the content for the Access-Control-Expose-Headers header.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies how long the results of a preflight request can be cached. This
    * translates to the content for the Access-Control-Max-Age header.
    */
  var maxAge: js.UndefOr[Double] = js.native
}
object SchemaCorsPolicy {
  
  @scala.inline
  def apply(): SchemaCorsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorsPolicy]
  }
  
  @scala.inline
  implicit class SchemaCorsPolicyOps[Self <: SchemaCorsPolicy] (val x: Self) extends AnyVal {
    
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
    def setAllowCredentials(value: Boolean): Self = this.set("allowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCredentials: Self = this.set("allowCredentials", js.undefined)
    
    @scala.inline
    def setAllowHeadersVarargs(value: String*): Self = this.set("allowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowHeaders(value: js.Array[String]): Self = this.set("allowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHeaders: Self = this.set("allowHeaders", js.undefined)
    
    @scala.inline
    def setAllowMethodsVarargs(value: String*): Self = this.set("allowMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowMethods(value: js.Array[String]): Self = this.set("allowMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMethods: Self = this.set("allowMethods", js.undefined)
    
    @scala.inline
    def setAllowOriginRegexesVarargs(value: String*): Self = this.set("allowOriginRegexes", js.Array(value :_*))
    
    @scala.inline
    def setAllowOriginRegexes(value: js.Array[String]): Self = this.set("allowOriginRegexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOriginRegexes: Self = this.set("allowOriginRegexes", js.undefined)
    
    @scala.inline
    def setAllowOriginsVarargs(value: String*): Self = this.set("allowOrigins", js.Array(value :_*))
    
    @scala.inline
    def setAllowOrigins(value: js.Array[String]): Self = this.set("allowOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOrigins: Self = this.set("allowOrigins", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = this.set("exposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: js.Array[String]): Self = this.set("exposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeaders: Self = this.set("exposeHeaders", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
}
