package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.child
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Child extends BinarySelector {
  @JSName("type")
  var type_Child: child
}

object Child {
  @scala.inline
  def apply(left: Selector, right: Selector, `type`: child, subject: js.UndefOr[Boolean] = js.undefined): Child = {
    val __obj = js.Dynamic.literal(left = left, right = right)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Child]
  }
}

