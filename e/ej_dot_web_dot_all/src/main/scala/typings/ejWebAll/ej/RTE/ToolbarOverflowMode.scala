package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarOverflowMode extends js.Object

@JSGlobal("ej.RTE.ToolbarOverflowMode")
@js.native
object ToolbarOverflowMode extends js.Object {
  ///To display the RTE toolbar overflow items as inline toolbar
  @js.native
  sealed trait Inline extends ToolbarOverflowMode
  
  ///To display the RTE toolbar overflow items as popup
  @js.native
  sealed trait Popup extends ToolbarOverflowMode
  
}

