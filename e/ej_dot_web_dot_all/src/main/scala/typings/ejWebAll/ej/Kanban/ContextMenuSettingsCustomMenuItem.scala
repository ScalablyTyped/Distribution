package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettingsCustomMenuItem extends js.Object {
  /** Its sets target element to custom context menu item.
    * @Default {ej.Kanban.Target.All}
    */
  var target: js.UndefOr[Target | String] = js.undefined
  /** Gets the template to render custom context menu item.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Gets the display name to custom menu item.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
}

object ContextMenuSettingsCustomMenuItem {
  @scala.inline
  def apply(target: Target | String = null, template: String = null, text: String = null): ContextMenuSettingsCustomMenuItem = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuSettingsCustomMenuItem]
  }
}

