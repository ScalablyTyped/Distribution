package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  @JSName("type")
  var type_Identifier: identifier
  var value: String
}

object Identifier {
  @scala.inline
  def apply(`type`: identifier, value: String, subject: js.UndefOr[Boolean] = js.undefined): Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

