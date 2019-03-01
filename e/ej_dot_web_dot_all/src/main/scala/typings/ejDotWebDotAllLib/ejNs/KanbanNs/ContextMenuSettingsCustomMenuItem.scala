package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettingsCustomMenuItem extends js.Object {
  /** Its sets target element to custom context menu item.
    * @Default {ej.Kanban.Target.All}
    */
  var target: js.UndefOr[Target | java.lang.String] = js.undefined
  /** Gets the template to render custom context menu item.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Gets the display name to custom menu item.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuSettingsCustomMenuItem {
  @scala.inline
  def apply(
    target: Target | java.lang.String = null,
    template: java.lang.String = null,
    text: java.lang.String = null
  ): ContextMenuSettingsCustomMenuItem = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ContextMenuSettingsCustomMenuItem]
  }
}

