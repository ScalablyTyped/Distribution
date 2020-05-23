package typings.fuzzaldrinPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagClass extends js.Object {
  var tagClass: js.UndefOr[String] = js.undefined
  var tagClose: js.UndefOr[String] = js.undefined
  var tagOpen: js.UndefOr[String] = js.undefined
}

object TagClass {
  @scala.inline
  def apply(tagClass: String = null, tagClose: String = null, tagOpen: String = null): TagClass = {
    val __obj = js.Dynamic.literal()
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass.asInstanceOf[js.Any])
    if (tagClose != null) __obj.updateDynamic("tagClose")(tagClose.asInstanceOf[js.Any])
    if (tagOpen != null) __obj.updateDynamic("tagOpen")(tagOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagClass]
  }
}

