package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeValue extends js.Object {
  var `type`: String
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object TypeValue {
  @scala.inline
  def apply(`type`: String): TypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValue]
  }
}

