package typings
package fseventsLib.fseventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fsevents", "FSEvents")
@js.native
class FSEvents protected ()
  extends fseventsLib.fseventsMod.fseventsNs.FSEvents {
  def this(path: java.lang.String, handler: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]) = this()
  /* CompleteClass */
  override def start(): this.type = js.native
  /* CompleteClass */
  override def stop(): this.type = js.native
}

