package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilDomStyle extends js.Object {
  /**
  	 * Cross-browser wrapper for setting element's style
  	 */
  def setStyle(element: stdLib.HTMLElement, styles: js.Any): stdLib.HTMLElement
}

object IUtilDomStyle {
  @scala.inline
  def apply(setStyle: js.Function2[stdLib.HTMLElement, js.Any, stdLib.HTMLElement]): IUtilDomStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setStyle")(setStyle)
    __obj.asInstanceOf[IUtilDomStyle]
  }
}

