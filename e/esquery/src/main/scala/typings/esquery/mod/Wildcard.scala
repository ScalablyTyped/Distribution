package typings.esquery.mod

import typings.esquery.esqueryStrings.Asterisk
import typings.esquery.esqueryStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wildcard
  extends SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  @JSName("type")
  var type_Wildcard: wildcard
  var value: Asterisk
}

object Wildcard {
  @scala.inline
  def apply(`type`: wildcard, value: Asterisk, subject: js.UndefOr[Boolean] = js.undefined): Wildcard = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wildcard]
  }
}

