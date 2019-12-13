package typings.atFormatjsIntlDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValue extends js.Object {
  var `type`: String
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_TypeValue {
  @scala.inline
  def apply(`type`: String, value: js.UndefOr[scala.Nothing] = js.undefined): Anon_TypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeValue]
  }
}

