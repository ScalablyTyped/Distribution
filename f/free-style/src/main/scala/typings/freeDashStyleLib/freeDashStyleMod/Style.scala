package typings
package freeDashStyleLib.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Style")
@js.native
class Style protected ()
  extends Cache[Selector]
     with Container[Style] {
  def this(style: java.lang.String, id: java.lang.String) = this()
  /* CompleteClass */
  override var id: java.lang.String = js.native
  var style: java.lang.String = js.native
  /* CompleteClass */
  override def getStyles(): java.lang.String = js.native
}

