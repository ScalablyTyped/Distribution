package typings.ejWebAll.ej.datavisualization.BulletGraph

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCategoryEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the text value of the category that is drawn.
    */
  var Value: js.UndefOr[String] = js.undefined
  /** returns the options of category element.
    */
  var categoryElement: js.UndefOr[HTMLElement] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.undefined
}

object DrawCategoryEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    Value: String = null,
    categoryElement: HTMLElement = null,
    scaleElement: HTMLElement = null
  ): DrawCategoryEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    if (categoryElement != null) __obj.updateDynamic("categoryElement")(categoryElement.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawCategoryEventArgs]
  }
}

