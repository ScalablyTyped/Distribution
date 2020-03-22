package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnd extends js.Object {
  var and: js.UndefOr[String] = js.undefined
  var notAnd: js.UndefOr[String] = js.undefined
  var notOr: js.UndefOr[String] = js.undefined
  var or: js.UndefOr[String] = js.undefined
}

object AnonAnd {
  @scala.inline
  def apply(and: String = null, notAnd: String = null, notOr: String = null, or: String = null): AnonAnd = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(and.asInstanceOf[js.Any])
    if (notAnd != null) __obj.updateDynamic("notAnd")(notAnd.asInstanceOf[js.Any])
    if (notOr != null) __obj.updateDynamic("notOr")(notOr.asInstanceOf[js.Any])
    if (or != null) __obj.updateDynamic("or")(or.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnd]
  }
}

