package typings
package atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-jwt", "ExtractJwt")
@js.native
object ExtractJwt extends js.Object {
  def fromAuthHeader(): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction = js.native
  def fromAuthHeaderAsBearerToken(): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction = js.native
  def fromAuthHeaderWithScheme(auth_scheme: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction = js.native
  def fromBodyField(field_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction = js.native
  def fromExtractors(
    extractors: js.Array[
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ]
  ): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction = js.native
  def fromHeader(header_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction = js.native
  def fromUrlQueryParameter(param_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction = js.native
}

