package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wildcard extends Selector {
  @JSName("type")
  var type_Wildcard: wildcard
  var value: typings.esquery.esqueryStrings.`*`
}

object Wildcard {
  @scala.inline
  def apply(
    `type`: wildcard,
    value: typings.esquery.esqueryStrings.`*`,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Wildcard = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wildcard]
  }
}

