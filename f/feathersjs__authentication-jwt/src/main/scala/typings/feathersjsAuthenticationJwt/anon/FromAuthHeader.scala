package typings.feathersjsAuthenticationJwt.anon

import typings.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromAuthHeader extends js.Object {
  
  def fromAuthHeader(): JwtFromRequestFunction = js.native
  
  def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = js.native
  
  def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = js.native
  
  def fromBodyField(field_name: String): JwtFromRequestFunction = js.native
  
  def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = js.native
  
  def fromHeader(header_name: String): JwtFromRequestFunction = js.native
  
  def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = js.native
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
  
  @scala.inline
  implicit class FromAuthHeaderOps[Self <: FromAuthHeader] (val x: Self) extends AnyVal {
    
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
    def setFromAuthHeader(value: () => JwtFromRequestFunction): Self = this.set("fromAuthHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFromAuthHeaderAsBearerToken(value: () => JwtFromRequestFunction): Self = this.set("fromAuthHeaderAsBearerToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFromAuthHeaderWithScheme(value: String => JwtFromRequestFunction): Self = this.set("fromAuthHeaderWithScheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromBodyField(value: String => JwtFromRequestFunction): Self = this.set("fromBodyField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromExtractors(value: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction): Self = this.set("fromExtractors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromHeader(value: String => JwtFromRequestFunction): Self = this.set("fromHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromUrlQueryParameter(value: String => JwtFromRequestFunction): Self = this.set("fromUrlQueryParameter", js.Any.fromFunction1(value))
  }
}
