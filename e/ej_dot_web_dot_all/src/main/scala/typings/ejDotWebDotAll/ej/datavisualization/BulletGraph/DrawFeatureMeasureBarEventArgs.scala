package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawFeatureMeasureBarEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the value of the feature measure bar.
    */
  var Value: js.UndefOr[Double] = js.undefined
  /** returns the options of feature measure element.
    */
  var currentElement: js.UndefOr[HTMLElement] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.undefined
}

object DrawFeatureMeasureBarEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    Value: Int | Double = null,
    currentElement: HTMLElement = null,
    scaleElement: HTMLElement = null
  ): DrawFeatureMeasureBarEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    __obj.asInstanceOf[DrawFeatureMeasureBarEventArgs]
  }
}

