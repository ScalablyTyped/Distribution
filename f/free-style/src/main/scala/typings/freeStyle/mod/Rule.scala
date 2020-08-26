package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Rule")
@js.native
class Rule protected ()
  extends Cache[Rule | Style]
     with Container[Rule] {
  def this(rule: String, style: String, id: String) = this()
  var rule: String = js.native
  var style: String = js.native
}

