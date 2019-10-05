package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An API Error returned by the Instant Games SDK
  */
trait APIError extends js.Object {
  /**
    * The relevant error code
    */
  var code: ErrorCodeType
  /**
    * A message describing the error
    */
  var message: String
}

object APIError {
  @scala.inline
  def apply(code: ErrorCodeType, message: String): APIError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[APIError]
  }
}

