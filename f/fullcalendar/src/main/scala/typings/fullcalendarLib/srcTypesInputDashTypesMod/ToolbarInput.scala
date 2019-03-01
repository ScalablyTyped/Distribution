package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarInput extends js.Object {
  var center: js.UndefOr[java.lang.String] = js.undefined
  var left: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[java.lang.String] = js.undefined
}

object ToolbarInput {
  @scala.inline
  def apply(center: java.lang.String = null, left: java.lang.String = null, right: java.lang.String = null): ToolbarInput = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[ToolbarInput]
  }
}

