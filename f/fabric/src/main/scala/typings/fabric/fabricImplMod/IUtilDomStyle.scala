package typings.fabric.fabricImplMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilDomStyle extends js.Object {
  /**
    * Cross-browser wrapper for setting element's style
    */
  def setStyle(element: HTMLElement, styles: js.Any): HTMLElement
}

object IUtilDomStyle {
  @scala.inline
  def apply(setStyle: (HTMLElement, js.Any) => HTMLElement): IUtilDomStyle = {
    val __obj = js.Dynamic.literal(setStyle = js.Any.fromFunction2(setStyle))
    __obj.asInstanceOf[IUtilDomStyle]
  }
}

