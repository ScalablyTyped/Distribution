package typings.ejDotWebDotAll.ejNs

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
  sealed trait Cloud extends Format
  
  //To render the TagCloud items in list format
  @js.native
  sealed trait List extends Format
  
  /* 0 */ val Cloud: typings.ejDotWebDotAll.ejNs.Format.Cloud with Double = js.native
  /* 1 */ val List: typings.ejDotWebDotAll.ejNs.Format.List with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Format with Double] = js.native
}

