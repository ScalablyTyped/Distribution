package typings.fsevents.fseventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fsevents", "FSEvents")
@js.native
class FSEvents protected () extends js.Object {
  def this(path: String, handler: js.Function3[/* path */ String, /* flags */ Double, /* id */ Double, Unit]) = this()
  def start(): this.type = js.native
  def stop(): this.type = js.native
}

