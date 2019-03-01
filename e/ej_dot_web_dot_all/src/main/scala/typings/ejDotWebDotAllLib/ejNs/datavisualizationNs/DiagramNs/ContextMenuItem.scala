package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuItem extends js.Object {
  /** Defines the CssClass for the collection of context menu items
    * @Default {null}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the image url for the collection of context menu items
    * @Default {null}
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the name for the collection of context menu items
    * @Default {null}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the collection of sub items for the context menu items
    * @Default {[]}
    */
  var subItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the text for the collection of context menu item
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuItem {
  @scala.inline
  def apply(
    cssClass: java.lang.String = null,
    imageUrl: java.lang.String = null,
    name: java.lang.String = null,
    subItems: js.Array[_] = null,
    text: java.lang.String = null
  ): ContextMenuItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subItems != null) __obj.updateDynamic("subItems")(subItems)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ContextMenuItem]
  }
}

