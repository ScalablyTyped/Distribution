package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** List of error codes returned by database operations in the RequestCallback and FeedCallback. See the corresponding error message for more details. */
trait IErrorCodes extends js.Object {
  // Client error
  /** (400) Request failed due to bad inputs **/
  var BadRequest: Double
  /** (409) Resource with the specified id already exists **/
  var Conflict: Double
  /** (403) Request was denied access to the resource **/
  var Forbidden: Double
  // Server error
  /** (500) Server encountered an unexpected error in processing the request **/
  var InternalServerError: Double
  /** (404) Request tried to access a resource which doesn't exist **/
  var NotFound: Double
  /** (412) Conditions specified in the request options were not met **/
  var PreconditionFailed: Double
  /** (413) Request failed because it was too large **/
  var RequestEntityTooLarge: Double
  /** (449) Request conflicted with the current state of a resource and must be retried from a new transaction from the client side **/
  var RetryWith: Double
}

object IErrorCodes {
  @scala.inline
  def apply(
    BadRequest: Double,
    Conflict: Double,
    Forbidden: Double,
    InternalServerError: Double,
    NotFound: Double,
    PreconditionFailed: Double,
    RequestEntityTooLarge: Double,
    RetryWith: Double
  ): IErrorCodes = {
    val __obj = js.Dynamic.literal(BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], InternalServerError = InternalServerError.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], PreconditionFailed = PreconditionFailed.asInstanceOf[js.Any], RequestEntityTooLarge = RequestEntityTooLarge.asInstanceOf[js.Any], RetryWith = RetryWith.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IErrorCodes]
  }
}

