package typings.fsevents.fseventsMod

import typings.fsevents.fseventsStrings.moved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fsevents", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: String): Watcher = js.native
  def getInfo(path: String, flags: Double): BaseEventInfo[BaseEventType | moved] = js.native
}

