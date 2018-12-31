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

