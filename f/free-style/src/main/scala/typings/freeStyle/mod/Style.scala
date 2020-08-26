package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Style")
@js.native
class Style protected ()
  extends Cache[Selector]
     with Container[Style] {
  def this(style: String, id: String) = this()
  var style: String = js.native
}

