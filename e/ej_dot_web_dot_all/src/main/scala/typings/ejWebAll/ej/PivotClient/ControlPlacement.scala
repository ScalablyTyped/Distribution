package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlPlacement extends js.Object

@JSGlobal("ej.PivotClient.ControlPlacement")
@js.native
object ControlPlacement extends js.Object {
  ///Displays PivotChart and PivotGrid widgets in separate tabs.
  @js.native
  sealed trait Tab extends ControlPlacement
  
  ///Displays PivotChart and PivotGrid widgets one above the other.
  @js.native
  sealed trait Tile extends ControlPlacement
  
}

