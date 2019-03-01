package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** List of error codes returned by database operations in the RequestCallback and FeedCallback. See the corresponding error message for more details. */
trait IErrorCodes extends js.Object {
  // Client error
  /** (400) Request failed due to bad inputs **/
  var BadRequest: scala.Double
  /** (409) Resource with the specified id already exists **/
  var Conflict: scala.Double
  /** (403) Request was denied access to the resource **/
  var Forbidden: scala.Double
  // Server error
  /** (500) Server encountered an unexpected error in processing the request **/
  var InternalServerError: scala.Double
  /** (404) Request tried to access a resource which doesn't exist **/
  var NotFound: scala.Double
  /** (412) Conditions specified in the request options were not met **/
  var PreconditionFailed: scala.Double
  /** (413) Request failed because it was too large **/
  var RequestEntityTooLarge: scala.Double
  /** (449) Request conflicted with the current state of a resource and must be retried from a new transaction from the client side **/
  var RetryWith: scala.Double
}

object IErrorCodes {
  @scala.inline
  def apply(
    BadRequest: scala.Double,
    Conflict: scala.Double,
    Forbidden: scala.Double,
    InternalServerError: scala.Double,
    NotFound: scala.Double,
    PreconditionFailed: scala.Double,
    RequestEntityTooLarge: scala.Double,
    RetryWith: scala.Double
  ): IErrorCodes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BadRequest")(BadRequest)
    __obj.updateDynamic("Conflict")(Conflict)
    __obj.updateDynamic("Forbidden")(Forbidden)
    __obj.updateDynamic("InternalServerError")(InternalServerError)
    __obj.updateDynamic("NotFound")(NotFound)
    __obj.updateDynamic("PreconditionFailed")(PreconditionFailed)
    __obj.updateDynamic("RequestEntityTooLarge")(RequestEntityTooLarge)
    __obj.updateDynamic("RetryWith")(RetryWith)
    __obj.asInstanceOf[IErrorCodes]
  }
}

