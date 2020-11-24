package typings.feathersjsAuthenticationJwt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@feathersjs/authentication-jwt", "ExtractJwt")
@js.native
object ExtractJwt extends js.Object {
  
  def fromAuthHeader(): JwtFromRequestFunction = js.native
  
  def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = js.native
  
  def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = js.native
  
  def fromBodyField(field_name: String): JwtFromRequestFunction = js.native
  
  def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = js.native
  
  def fromHeader(header_name: String): JwtFromRequestFunction = js.native
  
  def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = js.native
}
