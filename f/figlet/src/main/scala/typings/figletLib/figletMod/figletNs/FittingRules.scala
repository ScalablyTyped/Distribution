package typings
package figletLib.figletMod.figletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FittingRules extends js.Object {
  var hLayout: scala.Double
  var hRule1: scala.Boolean
  var hRule2: scala.Boolean
  var hRule3: scala.Boolean
  var hRule4: scala.Boolean
  var hRule5: scala.Boolean
  var hRule6: scala.Boolean
  var vLayout: scala.Double
  var vRule1: scala.Boolean
  var vRule2: scala.Boolean
  var vRule3: scala.Boolean
  var vRule4: scala.Boolean
  var vRule5: scala.Boolean
}

object FittingRules {
  @scala.inline
  def apply(
    hLayout: scala.Double,
    hRule1: scala.Boolean,
    hRule2: scala.Boolean,
    hRule3: scala.Boolean,
    hRule4: scala.Boolean,
    hRule5: scala.Boolean,
    hRule6: scala.Boolean,
    vLayout: scala.Double,
    vRule1: scala.Boolean,
    vRule2: scala.Boolean,
    vRule3: scala.Boolean,
    vRule4: scala.Boolean,
    vRule5: scala.Boolean
  ): FittingRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hLayout")(hLayout)
    __obj.updateDynamic("hRule1")(hRule1)
    __obj.updateDynamic("hRule2")(hRule2)
    __obj.updateDynamic("hRule3")(hRule3)
    __obj.updateDynamic("hRule4")(hRule4)
    __obj.updateDynamic("hRule5")(hRule5)
    __obj.updateDynamic("hRule6")(hRule6)
    __obj.updateDynamic("vLayout")(vLayout)
    __obj.updateDynamic("vRule1")(vRule1)
    __obj.updateDynamic("vRule2")(vRule2)
    __obj.updateDynamic("vRule3")(vRule3)
    __obj.updateDynamic("vRule4")(vRule4)
    __obj.updateDynamic("vRule5")(vRule5)
    __obj.asInstanceOf[FittingRules]
  }
}

