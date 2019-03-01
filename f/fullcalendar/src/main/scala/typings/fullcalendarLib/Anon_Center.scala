package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var center: java.lang.String
  var left: java.lang.String
  var right: java.lang.String
}

object Anon_Center {
  @scala.inline
  def apply(center: java.lang.String, left: java.lang.String, right: java.lang.String): Anon_Center = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Anon_Center]
  }
}

