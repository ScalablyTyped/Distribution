package typings.googleMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  /** This is the same as the HTTP status of the response. */
  var code: Double
  /**
    * A list of errors which occurred. Each error contains an identifier for the type of error (the `reason`)
    * and a short description (the `message`).
    */
  var errors: js.Array[Domain]
  /** A short description of the error. */
  var message: String
}

object Code {
  @scala.inline
  def apply(code: Double, errors: js.Array[Domain], message: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

