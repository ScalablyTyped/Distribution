package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuItem extends js.Object {
  /** Defines the CssClass for the collection of context menu items
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Defines the image url for the collection of context menu items
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Defines the name for the collection of context menu items
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.undefined
  /** Defines the collection of sub items for the context menu items
    * @Default {[]}
    */
  var subItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the text for the collection of context menu item
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
}

object ContextMenuItem {
  @scala.inline
  def apply(
    cssClass: String = null,
    imageUrl: String = null,
    name: String = null,
    subItems: js.Array[_] = null,
    text: String = null
  ): ContextMenuItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subItems != null) __obj.updateDynamic("subItems")(subItems.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuItem]
  }
}

