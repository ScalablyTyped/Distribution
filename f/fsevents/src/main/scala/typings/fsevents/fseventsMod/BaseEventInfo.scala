package typings.fsevents.fseventsMod

import typings.fsevents.Anon_Access
import typings.fsevents.fseventsStrings.directory
import typings.fsevents.fseventsStrings.file
import typings.fsevents.fseventsStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEventInfo[E /* <: String */] extends js.Object {
  var changes: Anon_Access
  var event: E
  var flags: Double
  var path: String
  var `type`: file | directory | symlink
}

object BaseEventInfo {
  @scala.inline
  def apply[E /* <: String */](changes: Anon_Access, event: E, flags: Double, path: String, `type`: file | directory | symlink): BaseEventInfo[E] = {
    val __obj = js.Dynamic.literal(changes = changes, event = event.asInstanceOf[js.Any], flags = flags, path = path)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEventInfo[E]]
  }
}

