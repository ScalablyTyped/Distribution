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
    get: (stdLib.HTMLElement, scala.Boolean) => java.lang.String,
    set: stdLib.HTMLElement => java.lang.String
  ): IdHandlerProps = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[IdHandlerProps]
  }
}

