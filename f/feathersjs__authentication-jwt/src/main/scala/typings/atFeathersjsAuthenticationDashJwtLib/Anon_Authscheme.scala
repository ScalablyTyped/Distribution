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

object Anon_Authscheme {
  @scala.inline
  def apply(
    fromAuthHeader: () => atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction,
    fromAuthHeaderAsBearerToken: () => atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction,
    fromAuthHeaderWithScheme: java.lang.String => atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction,
    fromBodyField: java.lang.String => atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction,
    fromExtractors: js.Array[
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ] => atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction,
    fromHeader: java.lang.String => atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction,
    fromUrlQueryParameter: java.lang.String => atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
  ): Anon_Authscheme = {
    val __obj = js.Dynamic.literal(fromAuthHeader = js.Any.fromFunction0(fromAuthHeader), fromAuthHeaderAsBearerToken = js.Any.fromFunction0(fromAuthHeaderAsBearerToken), fromAuthHeaderWithScheme = js.Any.fromFunction1(fromAuthHeaderWithScheme), fromBodyField = js.Any.fromFunction1(fromBodyField), fromExtractors = js.Any.fromFunction1(fromExtractors), fromHeader = js.Any.fromFunction1(fromHeader), fromUrlQueryParameter = js.Any.fromFunction1(fromUrlQueryParameter))
  
    __obj.asInstanceOf[Anon_Authscheme]
  }
}

