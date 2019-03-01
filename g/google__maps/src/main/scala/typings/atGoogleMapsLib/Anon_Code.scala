package typings
package atGoogleMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** This is the same as the HTTP status of the response. */
  var code: scala.Double
  /**
    * A list of errors which occurred. Each error contains an identifier for the type of error (the `reason`)
    * and a short description (the `message`).
    */
  var errors: js.Array[Anon_Domain]
  /** A short description of the error. */
  var message: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(code: scala.Double, errors: js.Array[Anon_Domain], message: java.lang.String): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Code]
  }
}

