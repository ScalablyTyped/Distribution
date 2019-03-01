package typings
package fseventsLib.fseventsMod.fseventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInfo extends BaseEventInfo[EventType] {
  var id: scala.Double
}

object EventInfo {
  @scala.inline
  def apply(
    changes: fseventsLib.Anon_Access,
    event: EventType,
    flags: scala.Double,
    id: scala.Double,
    path: java.lang.String,
    `type`: fseventsLib.fseventsLibStrings.file | fseventsLib.fseventsLibStrings.directory | fseventsLib.fseventsLibStrings.symlink
  ): EventInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[EventInfo]
  }
}

