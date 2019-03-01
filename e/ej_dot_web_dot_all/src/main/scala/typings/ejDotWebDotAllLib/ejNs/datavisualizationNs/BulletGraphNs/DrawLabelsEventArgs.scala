package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawLabelsEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the label type.
    */
  var labelType: js.UndefOr[java.lang.String] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the current label element.
    */
  var tickElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object DrawLabelsEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    labelType: java.lang.String = null,
    scaleElement: stdLib.HTMLElement = null,
    tickElement: stdLib.HTMLElement = null
  ): DrawLabelsEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object)
    if (labelType != null) __obj.updateDynamic("labelType")(labelType)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (tickElement != null) __obj.updateDynamic("tickElement")(tickElement)
    __obj.asInstanceOf[DrawLabelsEventArgs]
  }
}

