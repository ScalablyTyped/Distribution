package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomToolbarItem extends js.Object {
  /** Gets the template to render customToolbarItems.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
}

object CustomToolbarItem {
  @scala.inline
  def apply(template: String = null): CustomToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomToolbarItem]
  }
}

