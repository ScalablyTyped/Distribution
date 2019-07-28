package typings.freeDashStyle.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Selector")
@js.native
class Selector protected () extends Container[Selector] {
  def this(selector: String, id: String) = this()
  /* CompleteClass */
  override var id: String = js.native
  var selector: String = js.native
  /* CompleteClass */
  override def getStyles(): String = js.native
}

