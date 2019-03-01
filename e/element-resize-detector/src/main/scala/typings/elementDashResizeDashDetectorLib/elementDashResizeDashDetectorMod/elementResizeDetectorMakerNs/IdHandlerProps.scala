package typings
package elementDashResizeDashDetectorLib.elementDashResizeDashDetectorMod.elementResizeDetectorMakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdHandlerProps extends js.Object {
  def get(element: stdLib.HTMLElement, readonly: scala.Boolean): java.lang.String
  def set(element: stdLib.HTMLElement): java.lang.String
}

object IdHandlerProps {
  @scala.inline
  def apply(
    get: js.Function2[stdLib.HTMLElement, scala.Boolean, java.lang.String],
    set: js.Function1[stdLib.HTMLElement, java.lang.String]
  ): IdHandlerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[IdHandlerProps]
  }
}

