package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawComparativeMeasureSymbolEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the value of the comparative measure symbol.
    */
  var Value: js.UndefOr[Double] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.undefined
  /** returns the options of comparative measure element.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.undefined
}

object DrawComparativeMeasureSymbolEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    Value: Int | Double = null,
    scaleElement: HTMLElement = null,
    targetElement: HTMLElement = null
  ): DrawComparativeMeasureSymbolEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[DrawComparativeMeasureSymbolEventArgs]
  }
}

