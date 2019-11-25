package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.`!=`
import typings.esquery.esqueryStrings.`<=`
import typings.esquery.esqueryStrings.`<`
import typings.esquery.esqueryStrings.`=`
import typings.esquery.esqueryStrings.`>=`
import typings.esquery.esqueryStrings.`>`
import typings.esquery.esqueryStrings.attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends Selector {
  var name: String
  var operator: js.UndefOr[`=` | `!=` | `>` | `<` | `>=` | `<=`] = js.undefined
  @JSName("type")
  var type_Attribute: attribute
  var value: js.UndefOr[Literal | RegExpSelector | Type] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(
    name: String,
    `type`: attribute,
    operator: `=` | `!=` | `>` | `<` | `>=` | `<=` = null,
    subject: js.UndefOr[Boolean] = js.undefined,
    value: Literal | RegExpSelector | Type = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

