package typings
package atFeathersjsAuthenticationDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authscheme extends js.Object {
  def fromAuthHeader(): atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
  def fromAuthHeaderAsBearerToken(): atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
  def fromAuthHeaderWithScheme(auth_scheme: java.lang.String): atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
  def fromBodyField(field_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
  def fromExtractors(
    extractors: js.Array[
      atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
    ]
  ): atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
  def fromHeader(header_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
  def fromUrlQueryParameter(param_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod.JwtFromRequestFunction
}

