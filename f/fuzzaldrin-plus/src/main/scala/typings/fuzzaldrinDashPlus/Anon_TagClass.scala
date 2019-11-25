package typings.fuzzaldrinDashPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagClass extends js.Object {
  var tagClass: js.UndefOr[String] = js.undefined
  var tagClose: js.UndefOr[String] = js.undefined
  var tagOpen: js.UndefOr[String] = js.undefined
}

object Anon_TagClass {
  @scala.inline
  def apply(tagClass: String = null, tagClose: String = null, tagOpen: String = null): Anon_TagClass = {
    val __obj = js.Dynamic.literal()
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass.asInstanceOf[js.Any])
    if (tagClose != null) __obj.updateDynamic("tagClose")(tagClose.asInstanceOf[js.Any])
    if (tagOpen != null) __obj.updateDynamic("tagOpen")(tagOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TagClass]
  }
}

