package typings
package gapiDotAuth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  var details: java.lang.String
  var error: java.lang.String
}

object Anon_Details {
  @scala.inline
  def apply(details: java.lang.String, error: java.lang.String): Anon_Details = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Details]
  }
}

