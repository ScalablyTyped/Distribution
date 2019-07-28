package typings.freeDashStyle.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Style")
@js.native
class Style protected ()
  extends Cache[Selector]
     with Container[Style] {
  def this(style: String, id: String) = this()
  /* CompleteClass */
  override var id: String = js.native
  var style: String = js.native
  /* CompleteClass */
  override def getStyles(): String = js.native
}

