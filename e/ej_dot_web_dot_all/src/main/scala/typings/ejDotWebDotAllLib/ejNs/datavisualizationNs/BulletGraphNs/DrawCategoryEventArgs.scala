package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCategoryEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the text value of the category that is drawn.
    */
  var Value: js.UndefOr[java.lang.String] = js.undefined
  /** returns the options of category element.
    */
  var categoryElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object DrawCategoryEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    Value: java.lang.String = null,
    categoryElement: stdLib.HTMLElement = null,
    scaleElement: stdLib.HTMLElement = null
  ): DrawCategoryEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    if (categoryElement != null) __obj.updateDynamic("categoryElement")(categoryElement)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    __obj.asInstanceOf[DrawCategoryEventArgs]
  }
}

