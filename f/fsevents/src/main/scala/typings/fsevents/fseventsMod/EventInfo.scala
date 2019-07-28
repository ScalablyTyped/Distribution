package typings.fsevents.fseventsMod

import typings.fsevents.Anon_Access
import typings.fsevents.fseventsStrings.directory
import typings.fsevents.fseventsStrings.file
import typings.fsevents.fseventsStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInfo extends BaseEventInfo[EventType] {
  var id: Double
}

object EventInfo {
  @scala.inline
  def apply(
    changes: Anon_Access,
    event: EventType,
    flags: Double,
    id: Double,
    path: String,
    `type`: file | directory | symlink
  ): EventInfo = {
    val __obj = js.Dynamic.literal(changes = changes, event = event, flags = flags, id = id, path = path)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInfo]
  }
}

