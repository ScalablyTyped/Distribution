package typings
package freeDashStyleLib.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Selector")
@js.native
class Selector protected () extends Container[Selector] {
  def this(selector: java.lang.String, id: java.lang.String) = this()
  /* CompleteClass */
  override var id: java.lang.String = js.native
  var selector: java.lang.String = js.native
  /* CompleteClass */
  override def getStyles(): java.lang.String = js.native
}

