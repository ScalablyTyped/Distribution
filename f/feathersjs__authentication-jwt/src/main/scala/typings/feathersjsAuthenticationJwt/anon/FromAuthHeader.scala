package typings.feathersjsAuthenticationJwt.anon

import typings.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromAuthHeader extends js.Object {
  def fromAuthHeader(): JwtFromRequestFunction
  def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction
  def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction
  def fromBodyField(field_name: String): JwtFromRequestFunction
  def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction
  def fromHeader(header_name: String): JwtFromRequestFunction
  def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction
}

object FromAuthHeader {
  @scala.inline
  def apply(
    fromAuthHeader: () => JwtFromRequestFunction,
    fromAuthHeaderAsBearerToken: () => JwtFromRequestFunction,
    fromAuthHeaderWithScheme: String => JwtFromRequestFunction,
    fromBodyField: String => JwtFromRequestFunction,
    fromExtractors: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction,
    fromHeader: String => JwtFromRequestFunction,
    fromUrlQueryParameter: String => JwtFromRequestFunction
  ): FromAuthHeader = {
    val __obj = js.Dynamic.literal(fromAuthHeader = js.Any.fromFunction0(fromAuthHeader), fromAuthHeaderAsBearerToken = js.Any.fromFunction0(fromAuthHeaderAsBearerToken), fromAuthHeaderWithScheme = js.Any.fromFunction1(fromAuthHeaderWithScheme), fromBodyField = js.Any.fromFunction1(fromBodyField), fromExtractors = js.Any.fromFunction1(fromExtractors), fromHeader = js.Any.fromFunction1(fromHeader), fromUrlQueryParameter = js.Any.fromFunction1(fromUrlQueryParameter))
    __obj.asInstanceOf[FromAuthHeader]
  }
}

