package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sibling extends BinarySelector {
  @JSName("type")
  var type_Sibling: sibling
}

object Sibling {
  @scala.inline
  def apply(left: Selector, right: Selector, `type`: sibling, subject: js.UndefOr[Boolean] = js.undefined): Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sibling]
  }
}

