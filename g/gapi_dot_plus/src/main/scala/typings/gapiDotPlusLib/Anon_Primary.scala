package typings
package gapiDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Primary extends js.Object {
  var primary: scala.Boolean
  var value: java.lang.String
}

object Anon_Primary {
  @scala.inline
  def apply(primary: scala.Boolean, value: java.lang.String): Anon_Primary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primary")(primary)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Primary]
  }
}

