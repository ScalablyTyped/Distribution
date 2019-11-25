package typings.atGoogleMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** This is the same as the HTTP status of the response. */
  var code: Double
  /**
    * A list of errors which occurred. Each error contains an identifier for the type of error (the `reason`)
    * and a short description (the `message`).
    */
  var errors: js.Array[Anon_Domain]
  /** A short description of the error. */
  var message: String
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, errors: js.Array[Anon_Domain], message: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Code]
  }
}

