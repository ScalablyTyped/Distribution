package typings.ejDotWebDotAll.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwimlaneSettingsHeader extends js.Object {
  /** Gets or sets a value that indicates to render the Kanban with specified swimlane header key.
    * @Default {null}
    */
  var key: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to render the Kanban with specified swimlane header text.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
}

object SwimlaneSettingsHeader {
  @scala.inline
  def apply(key: String = null, text: String = null): SwimlaneSettingsHeader = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SwimlaneSettingsHeader]
  }
}

