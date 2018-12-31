package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Will contain error information if an error occurs, undefined otherwise. */
trait IFeedCallbackError extends js.Object {
  /** A string containing the error information. */
  var body: java.lang.String
  /** The HTTP response code corresponding to the error. */
  var number: scala.Double
}

