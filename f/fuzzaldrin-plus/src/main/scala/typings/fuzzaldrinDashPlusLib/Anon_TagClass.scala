package typings
package fuzzaldrinDashPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagClass extends js.Object {
  var tagClass: js.UndefOr[java.lang.String] = js.undefined
  var tagClose: js.UndefOr[java.lang.String] = js.undefined
  var tagOpen: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TagClass {
  @scala.inline
  def apply(
    tagClass: java.lang.String = null,
    tagClose: java.lang.String = null,
    tagOpen: java.lang.String = null
  ): Anon_TagClass = {
    val __obj = js.Dynamic.literal()
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass)
    if (tagClose != null) __obj.updateDynamic("tagClose")(tagClose)
    if (tagOpen != null) __obj.updateDynamic("tagOpen")(tagOpen)
    __obj.asInstanceOf[Anon_TagClass]
  }
}

