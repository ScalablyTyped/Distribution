package typings
package atFeathersjsAuthenticationDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authscheme extends js.Object {
  def fromAuthHeader(): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
  def fromAuthHeaderAsBearerToken(): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
  def fromAuthHeaderWithScheme(auth_scheme: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
  def fromBodyField(field_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
  def fromExtractors(
    extractors: js.Array[
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ]
  ): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
  def fromHeader(header_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
  def fromUrlQueryParameter(param_name: java.lang.String): atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
}

