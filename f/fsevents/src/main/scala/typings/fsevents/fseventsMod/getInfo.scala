package typings.fsevents.fseventsMod

import typings.fsevents.fseventsStrings.moved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fsevents", "getInfo")
@js.native
object getInfo extends js.Object {
  def apply(path: String, flags: Double): BaseEventInfo[BaseEventType | moved] = js.native
}

