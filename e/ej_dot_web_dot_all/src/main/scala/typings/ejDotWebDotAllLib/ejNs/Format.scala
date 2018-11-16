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
  
  val Cloud: Cloud with java.lang.String = js.native
  val List: List with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.Format with java.lang.String] = js.native
}

