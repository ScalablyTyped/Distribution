package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwimlaneSettings extends js.Object {
  /** To enable or disable DragAndDrop across swim lane.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the swimlane rows with specified swimlane headers.
    * @Default {[]}
    */
  var headers: js.UndefOr[js.Array[SwimlaneSettingsHeader]] = js.undefined
  /** To enable or disable items count in swim lane.
    * @Default {true}
    */
  var showCount: js.UndefOr[Boolean] = js.undefined
  /** To enable or disable empty swimlane on Kanban board.  It is used to shown empty swimlane when no data's present on headers key mapping value.
    * @Default {false}
    */
  var showEmptySwimlane: js.UndefOr[Boolean] = js.undefined
  /** Customize the settings for unassigned category of swim lane.
    * @Default {Object}
    */
  var unassignedGroup: js.UndefOr[SwimlaneSettingsUnassignedGroup] = js.undefined
}

object SwimlaneSettings {
  @scala.inline
  def apply(
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[SwimlaneSettingsHeader] = null,
    showCount: js.UndefOr[Boolean] = js.undefined,
    showEmptySwimlane: js.UndefOr[Boolean] = js.undefined,
    unassignedGroup: SwimlaneSettingsUnassignedGroup = null
  ): SwimlaneSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(showCount)) __obj.updateDynamic("showCount")(showCount.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmptySwimlane)) __obj.updateDynamic("showEmptySwimlane")(showEmptySwimlane.asInstanceOf[js.Any])
    if (unassignedGroup != null) __obj.updateDynamic("unassignedGroup")(unassignedGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwimlaneSettings]
  }
}

