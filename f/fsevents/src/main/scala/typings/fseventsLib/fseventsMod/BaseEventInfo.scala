package typings
package fseventsLib.fseventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEventInfo[E /* <: java.lang.String */] extends js.Object {
  var changes: fseventsLib.Anon_Access
  var event: E
  var flags: scala.Double
  var path: java.lang.String
  var `type`: fseventsLib.fseventsLibStrings.file | fseventsLib.fseventsLibStrings.directory | fseventsLib.fseventsLibStrings.symlink
}

object BaseEventInfo {
  @scala.inline
  def apply[E /* <: java.lang.String */](
    changes: fseventsLib.Anon_Access,
    event: E,
    flags: scala.Double,
    path: java.lang.String,
    `type`: fseventsLib.fseventsLibStrings.file | fseventsLib.fseventsLibStrings.directory | fseventsLib.fseventsLibStrings.symlink
  ): BaseEventInfo[E] = {
    val __obj = js.Dynamic.literal(changes = changes, event = event.asInstanceOf[js.Any], flags = flags, path = path)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEventInfo[E]]
  }
}

