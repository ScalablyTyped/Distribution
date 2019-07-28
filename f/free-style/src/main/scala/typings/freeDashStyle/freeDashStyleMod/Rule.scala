package typings.freeDashStyle.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Rule")
@js.native
class Rule protected ()
  extends Cache[Rule | Style]
     with Container[Rule] {
  def this(rule: String, style: String, id: String) = this()
  /* CompleteClass */
  override var id: String = js.native
  var rule: String = js.native
  var style: String = js.native
  /* CompleteClass */
  override def getStyles(): String = js.native
}

