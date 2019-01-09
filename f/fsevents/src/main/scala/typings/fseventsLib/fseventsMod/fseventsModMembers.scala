package typings
package fseventsLib.fseventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fsevents", JSImport.Namespace)
@js.native
object fseventsModMembers extends js.Object {
  val Constants: fseventsLib.Anon_0x0 = js.native
  def apply(path: java.lang.String): fseventsLib.fseventsMod.fseventsNs.Watcher = js.native
  def getInfo(path: java.lang.String, flags: scala.Double): fseventsLib.fseventsMod.fseventsNs.BaseEventInfo[
    fseventsLib.fseventsMod.fseventsNs.BaseEventType | fseventsLib.fseventsLibStrings.moved
  ] = js.native
}

