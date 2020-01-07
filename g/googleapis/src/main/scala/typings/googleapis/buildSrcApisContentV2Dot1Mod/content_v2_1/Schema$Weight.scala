package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Weight extends js.Object {
  /**
    * The weight unit.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The weight represented as a number.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Weight {
  @scala.inline
  def apply(unit: String = null, value: String = null): Schema$Weight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Weight]
  }
}

