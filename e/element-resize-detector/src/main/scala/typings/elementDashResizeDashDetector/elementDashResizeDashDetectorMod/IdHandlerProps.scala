package typings.elementDashResizeDashDetector.elementDashResizeDashDetectorMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdHandlerProps extends js.Object {
  def get(element: HTMLElement, readonly: Boolean): String
  def set(element: HTMLElement): String
}

object IdHandlerProps {
  @scala.inline
  def apply(get: (HTMLElement, Boolean) => String, set: HTMLElement => String): IdHandlerProps = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[IdHandlerProps]
  }
}

