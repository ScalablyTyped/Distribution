package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomToolbarItem extends js.Object {
  /** Gets the template to render customToolbarItems.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object CustomToolbarItem {
  @scala.inline
  def apply(template: java.lang.String = null): CustomToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[CustomToolbarItem]
  }
}

