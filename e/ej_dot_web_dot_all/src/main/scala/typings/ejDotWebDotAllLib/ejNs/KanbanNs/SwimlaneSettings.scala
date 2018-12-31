package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwimlaneSettings extends js.Object {
  /** To enable or disable DragAndDrop across swim lane.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the swimlane rows with specified swimlane headers.
    * @Default {[]}
    */
  var headers: js.UndefOr[js.Array[SwimlaneSettingsHeader]] = js.undefined
  /** To enable or disable items count in swim lane.
    * @Default {true}
    */
  var showCount: js.UndefOr[scala.Boolean] = js.undefined
  /** To enable or disable empty swimlane on Kanban board.  It is used to shown empty swimlane when no data's present on headers key mapping value.
    * @Default {false}
    */
  var showEmptySwimlane: js.UndefOr[scala.Boolean] = js.undefined
  /** Customize the settings for unassigned category of swim lane.
    * @Default {Object}
    */
  var unassignedGroup: js.UndefOr[SwimlaneSettingsUnassignedGroup] = js.undefined
}

