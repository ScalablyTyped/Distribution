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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BadGateway")(BadGateway)
    __obj.updateDynamic("BadRequest")(BadRequest)
    __obj.updateDynamic("Conflict")(Conflict)
    __obj.updateDynamic("FeathersError")(FeathersError)
    __obj.updateDynamic("Forbidden")(Forbidden)
    __obj.updateDynamic("GeneralError")(GeneralError)
    __obj.updateDynamic("LengthRequired")(LengthRequired)
    __obj.updateDynamic("MethodNotAllowed")(MethodNotAllowed)
    __obj.updateDynamic("NotAcceptable")(NotAcceptable)
    __obj.updateDynamic("NotAuthenticated")(NotAuthenticated)
    __obj.updateDynamic("NotFound")(NotFound)
    __obj.updateDynamic("NotImplemented")(NotImplemented)
    __obj.updateDynamic("PaymentError")(PaymentError)
    __obj.updateDynamic("Timeout")(Timeout)
    __obj.updateDynamic("TooManyRequests")(TooManyRequests)
    __obj.updateDynamic("Unavailable")(Unavailable)
    __obj.updateDynamic("Unprocessable")(Unprocessable)
    __obj.asInstanceOf[Errors]
  }
}

