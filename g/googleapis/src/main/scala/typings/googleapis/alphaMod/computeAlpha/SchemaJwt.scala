package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JWT configuration for origin authentication.
  */
@js.native
trait SchemaJwt extends js.Object {
  
  /**
    * A JWT containing any of these audiences will be accepted. The service
    * name will be accepted if audiences is empty. Examples:
    * bookstore_android.apps.googleusercontent.com,
    * bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Identifies the issuer that issued the JWT, which is usually a URL or an
    * email address. Examples: https://securetoken.google.com,
    * 1234567-compute@developer.gserviceaccount.com
    */
  var issuer: js.UndefOr[String] = js.native
  
  /**
    * The provider?s public key set to validate the signature of the JWT.
    */
  var jwksPublicKeys: js.UndefOr[String] = js.native
  
  /**
    * jwt_headers and jwt_params define where to extract the JWT from an HTTP
    * request. If no explicit location is specified, the following default
    * locations are tried in order:  1. The Authorization header using the
    * Bearer schema. See `here `_. Example:  Authorization: Bearer .  2.
    * `access_token` query parameter. See `this `_  Multiple JWTs can be
    * verified for a request. Each JWT has to be extracted from the locations
    * its issuer specified or from the default locations.  This field is set if
    * JWT is sent in a request header. This field specifies the header name.
    * For example, if `header=x-goog-iap-jwt-assertion`, the header format will
    * be x-goog-iap-jwt-assertion: .
    */
  var jwtHeaders: js.UndefOr[js.Array[SchemaJwtHeader]] = js.native
  
  /**
    * This field is set if JWT is sent in a query parameter. This field
    * specifies the query parameter name. For example, if jwt_params[0] is
    * jwt_token, the JWT format in the query parameter is /path?jwt_token=.
    */
  var jwtParams: js.UndefOr[js.Array[String]] = js.native
}
object SchemaJwt {
  
  @scala.inline
  def apply(): SchemaJwt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwt]
  }
  
  @scala.inline
  implicit class SchemaJwtOps[Self <: SchemaJwt] (val x: Self) extends AnyVal {
    
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
    def setAudiencesVarargs(value: String*): Self = this.set("audiences", js.Array(value :_*))
    
    @scala.inline
    def setAudiences(value: js.Array[String]): Self = this.set("audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiences: Self = this.set("audiences", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setJwksPublicKeys(value: String): Self = this.set("jwksPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwksPublicKeys: Self = this.set("jwksPublicKeys", js.undefined)
    
    @scala.inline
    def setJwtHeadersVarargs(value: SchemaJwtHeader*): Self = this.set("jwtHeaders", js.Array(value :_*))
    
    @scala.inline
    def setJwtHeaders(value: js.Array[SchemaJwtHeader]): Self = this.set("jwtHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtHeaders: Self = this.set("jwtHeaders", js.undefined)
    
    @scala.inline
    def setJwtParamsVarargs(value: String*): Self = this.set("jwtParams", js.Array(value :_*))
    
    @scala.inline
    def setJwtParams(value: js.Array[String]): Self = this.set("jwtParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtParams: Self = this.set("jwtParams", js.undefined)
  }
}
