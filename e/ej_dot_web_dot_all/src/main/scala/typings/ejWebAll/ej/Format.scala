package typings.ejWebAll.ej

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
  
}

