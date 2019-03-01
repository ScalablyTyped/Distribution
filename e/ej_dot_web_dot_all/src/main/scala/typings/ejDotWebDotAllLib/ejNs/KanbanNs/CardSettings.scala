package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardSettings extends js.Object {
  /** To customize the card border color based on assigned task. Colors and corresponding values defined here will be mapped with colorField mapped data source column.
    * @Default {Object}
    */
  var colorMapping: js.UndefOr[js.Any] = js.undefined
  /** This specifies the Kanban card to drop into particular target element.
    */
  var externalDropTarget: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to add the template for card .
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object CardSettings {
  @scala.inline
  def apply(
    colorMapping: js.Any = null,
    externalDropTarget: java.lang.String = null,
    template: java.lang.String = null
  ): CardSettings = {
    val __obj = js.Dynamic.literal()
    if (colorMapping != null) __obj.updateDynamic("colorMapping")(colorMapping)
    if (externalDropTarget != null) __obj.updateDynamic("externalDropTarget")(externalDropTarget)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[CardSettings]
  }
}

