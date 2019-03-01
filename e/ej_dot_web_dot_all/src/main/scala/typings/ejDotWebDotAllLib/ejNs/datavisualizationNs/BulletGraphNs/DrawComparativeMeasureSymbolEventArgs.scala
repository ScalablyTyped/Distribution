package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawComparativeMeasureSymbolEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the value of the comparative measure symbol.
    */
  var Value: js.UndefOr[scala.Double] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the options of comparative measure element.
    */
  var targetElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object DrawComparativeMeasureSymbolEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    Value: scala.Int | scala.Double = null,
    scaleElement: stdLib.HTMLElement = null,
    targetElement: stdLib.HTMLElement = null
  ): DrawComparativeMeasureSymbolEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[DrawComparativeMeasureSymbolEventArgs]
  }
}

