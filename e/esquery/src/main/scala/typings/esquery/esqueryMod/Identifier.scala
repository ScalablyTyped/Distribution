package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier extends Selector {
  @JSName("type")
  var type_Identifier: identifier
  var value: String
}

object Identifier {
  @scala.inline
  def apply(`type`: identifier, value: String, subject: js.UndefOr[Boolean] = js.undefined): Identifier = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Identifier]
  }
}

