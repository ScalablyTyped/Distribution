package typings
package fseventsLib.fseventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fsevents", "FSEvents")
@js.native
class FSEvents protected () extends js.Object {
  def this(path: java.lang.String, handler: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]) = this()
  def start(): this.type = js.native
  def stop(): this.type = js.native
}

