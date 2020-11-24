package typings.feathersjsErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors_ extends js.Object {
  
  var BadGateway: typings.feathersjsErrors.mod.BadGateway = js.native
  
  var BadRequest: typings.feathersjsErrors.mod.BadRequest = js.native
  
  var Conflict: typings.feathersjsErrors.mod.Conflict = js.native
  
  var FeathersError: typings.feathersjsErrors.mod.FeathersError = js.native
  
  var Forbidden: typings.feathersjsErrors.mod.Forbidden = js.native
  
  var GeneralError: typings.feathersjsErrors.mod.GeneralError = js.native
  
  var LengthRequired: typings.feathersjsErrors.mod.LengthRequired = js.native
  
  var MethodNotAllowed: typings.feathersjsErrors.mod.MethodNotAllowed = js.native
  
  var NotAcceptable: typings.feathersjsErrors.mod.NotAcceptable = js.native
  
  var NotAuthenticated: typings.feathersjsErrors.mod.NotAuthenticated = js.native
  
  var NotFound: typings.feathersjsErrors.mod.NotFound = js.native
  
  var NotImplemented: typings.feathersjsErrors.mod.NotImplemented = js.native
  
  var PaymentError: typings.feathersjsErrors.mod.PaymentError = js.native
  
  var Timeout: typings.feathersjsErrors.mod.Timeout = js.native
  
  var TooManyRequests: typings.feathersjsErrors.mod.TooManyRequests = js.native
  
  var Unavailable: typings.feathersjsErrors.mod.Unavailable = js.native
  
  var Unprocessable: typings.feathersjsErrors.mod.Unprocessable = js.native
}
object Errors_ {
  
  @scala.inline
  def apply(
    BadGateway: BadGateway,
    BadRequest: BadRequest,
    Conflict: Conflict,
    FeathersError: FeathersError,
    Forbidden: Forbidden,
    GeneralError: GeneralError,
    LengthRequired: LengthRequired,
    MethodNotAllowed: MethodNotAllowed,
    NotAcceptable: NotAcceptable,
    NotAuthenticated: NotAuthenticated,
    NotFound: NotFound,
    NotImplemented: NotImplemented,
    PaymentError: PaymentError,
    Timeout: Timeout,
    TooManyRequests: TooManyRequests,
    Unavailable: Unavailable,
    Unprocessable: Unprocessable
  ): Errors_ = {
    val __obj = js.Dynamic.literal(BadGateway = BadGateway.asInstanceOf[js.Any], BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], FeathersError = FeathersError.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], GeneralError = GeneralError.asInstanceOf[js.Any], LengthRequired = LengthRequired.asInstanceOf[js.Any], MethodNotAllowed = MethodNotAllowed.asInstanceOf[js.Any], NotAcceptable = NotAcceptable.asInstanceOf[js.Any], NotAuthenticated = NotAuthenticated.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], PaymentError = PaymentError.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], TooManyRequests = TooManyRequests.asInstanceOf[js.Any], Unavailable = Unavailable.asInstanceOf[js.Any], Unprocessable = Unprocessable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors_]
  }
  
  @scala.inline
  implicit class Errors_Ops[Self <: Errors_] (val x: Self) extends AnyVal {
    
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
    def setBadGateway(value: BadGateway): Self = this.set("BadGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadRequest(value: BadRequest): Self = this.set("BadRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflict(value: Conflict): Self = this.set("Conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeathersError(value: FeathersError): Self = this.set("FeathersError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbidden(value: Forbidden): Self = this.set("Forbidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralError(value: GeneralError): Self = this.set("GeneralError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthRequired(value: LengthRequired): Self = this.set("LengthRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNotAllowed(value: MethodNotAllowed): Self = this.set("MethodNotAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAcceptable(value: NotAcceptable): Self = this.set("NotAcceptable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAuthenticated(value: NotAuthenticated): Self = this.set("NotAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFound(value: NotFound): Self = this.set("NotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotImplemented(value: NotImplemented): Self = this.set("NotImplemented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentError(value: PaymentError): Self = this.set("PaymentError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooManyRequests(value: TooManyRequests): Self = this.set("TooManyRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnavailable(value: Unavailable): Self = this.set("Unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessable(value: Unprocessable): Self = this.set("Unprocessable", value.asInstanceOf[js.Any])
  }
}
