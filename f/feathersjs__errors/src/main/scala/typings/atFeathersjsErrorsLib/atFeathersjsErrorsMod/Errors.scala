package typings
package atFeathersjsErrorsLib.atFeathersjsErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var BadGateway: BadGateway
  var BadRequest: BadRequest
  var Conflict: Conflict
  var FeathersError: FeathersError
  var Forbidden: Forbidden
  var GeneralError: GeneralError
  var LengthRequired: LengthRequired
  var MethodNotAllowed: MethodNotAllowed
  var NotAcceptable: NotAcceptable
  var NotAuthenticated: NotAuthenticated
  var NotFound: NotFound
  var NotImplemented: NotImplemented
  var PaymentError: PaymentError
  var Timeout: Timeout
  var TooManyRequests: TooManyRequests
  var Unavailable: Unavailable
  var Unprocessable: Unprocessable
}

object Errors {
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
  ): Errors = {
    val __obj = js.Dynamic.literal(BadGateway = BadGateway, BadRequest = BadRequest, Conflict = Conflict, FeathersError = FeathersError, Forbidden = Forbidden, GeneralError = GeneralError, LengthRequired = LengthRequired, MethodNotAllowed = MethodNotAllowed, NotAcceptable = NotAcceptable, NotAuthenticated = NotAuthenticated, NotFound = NotFound, NotImplemented = NotImplemented, PaymentError = PaymentError, Timeout = Timeout, TooManyRequests = TooManyRequests, Unavailable = Unavailable, Unprocessable = Unprocessable)
  
    __obj.asInstanceOf[Errors]
  }
}

