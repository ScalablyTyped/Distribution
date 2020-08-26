package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwimlaneSettings extends js.Object {
  /** To enable or disable DragAndDrop across swim lane.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to render the swimlane rows with specified swimlane headers.
    * @Default {[]}
    */
  var headers: js.UndefOr[js.Array[SwimlaneSettingsHeader]] = js.native
  /** To enable or disable items count in swim lane.
    * @Default {true}
    */
  var showCount: js.UndefOr[Boolean] = js.native
  /** To enable or disable empty swimlane on Kanban board.  It is used to shown empty swimlane when no data's present on headers key mapping value.
    * @Default {false}
    */
  var showEmptySwimlane: js.UndefOr[Boolean] = js.native
  /** Customize the settings for unassigned category of swim lane.
    * @Default {Object}
    */
  var unassignedGroup: js.UndefOr[SwimlaneSettingsUnassignedGroup] = js.native
}

object SwimlaneSettings {
  @scala.inline
  def apply(): SwimlaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwimlaneSettings]
  }
  @scala.inline
  implicit class SwimlaneSettingsOps[Self <: SwimlaneSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: SwimlaneSettingsHeader*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[SwimlaneSettingsHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setShowCount(value: Boolean): Self = this.set("showCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCount: Self = this.set("showCount", js.undefined)
    @scala.inline
    def setShowEmptySwimlane(value: Boolean): Self = this.set("showEmptySwimlane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEmptySwimlane: Self = this.set("showEmptySwimlane", js.undefined)
    @scala.inline
    def setUnassignedGroup(value: SwimlaneSettingsUnassignedGroup): Self = this.set("unassignedGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnassignedGroup: Self = this.set("unassignedGroup", js.undefined)
  }
  
}

