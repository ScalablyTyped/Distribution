package typings.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubjectSelectorAtom extends Atom {
  var subject: js.UndefOr[Boolean] = js.undefined
}

object SubjectSelectorAtom {
  @scala.inline
  def apply(`type`: String, subject: js.UndefOr[Boolean] = js.undefined): SubjectSelectorAtom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelectorAtom]
  }
}

