package typings
package freeDashStyleLib.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Rule")
@js.native
class Rule protected ()
  extends Cache[Rule | Style]
     with Container[Rule] {
  def this(rule: java.lang.String, style: java.lang.String, id: java.lang.String) = this()
  /* CompleteClass */
  override var id: java.lang.String = js.native
  var rule: java.lang.String = js.native
  var style: java.lang.String = js.native
  /* CompleteClass */
  override def getStyles(): java.lang.String = js.native
}

