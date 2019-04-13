package typings
package fseventsLib.fseventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fsevents", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: java.lang.String): Watcher = js.native
  def getInfo(path: java.lang.String, flags: scala.Double): BaseEventInfo[BaseEventType | fseventsLib.fseventsLibStrings.moved] = js.native
}

