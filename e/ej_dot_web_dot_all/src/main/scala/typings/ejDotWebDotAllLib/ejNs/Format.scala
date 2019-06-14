package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Format extends js.Object

@JSGlobal("ej.Format")
@js.native
object Format extends js.Object {
  //To render the TagCloud items in cloud format
  @js.native
  sealed trait Cloud
    extends ejDotWebDotAllLib.ejNs.Format
  
  //To render the TagCloud items in list format
  @js.native
  sealed trait List
    extends ejDotWebDotAllLib.ejNs.Format
  
  /* 0 */ val Cloud: Cloud with scala.Double = js.native
  /* 1 */ val List: List with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.Format with scala.Double] = js.native
}

