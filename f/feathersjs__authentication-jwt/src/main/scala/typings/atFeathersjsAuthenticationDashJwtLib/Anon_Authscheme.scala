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
    fromAuthHeader: js.Function0[
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ],
    fromAuthHeaderAsBearerToken: js.Function0[
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ],
    fromAuthHeaderWithScheme: js.Function1[
      java.lang.String, 
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ],
    fromBodyField: js.Function1[
      java.lang.String, 
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ],
    fromExtractors: js.Function1[
      js.Array[
        atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
      ], 
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ],
    fromHeader: js.Function1[
      java.lang.String, 
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ],
    fromUrlQueryParameter: js.Function1[
      java.lang.String, 
      atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod.JwtFromRequestFunction
    ]
  ): Anon_Authscheme = {
    val __obj = js.Dynamic.literal(fromAuthHeader = fromAuthHeader, fromAuthHeaderAsBearerToken = fromAuthHeaderAsBearerToken, fromAuthHeaderWithScheme = fromAuthHeaderWithScheme, fromBodyField = fromBodyField, fromExtractors = fromExtractors, fromHeader = fromHeader, fromUrlQueryParameter = fromUrlQueryParameter)
  
    __obj.asInstanceOf[Anon_Authscheme]
  }
}

