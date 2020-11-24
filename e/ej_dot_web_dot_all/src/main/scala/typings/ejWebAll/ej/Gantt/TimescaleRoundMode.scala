package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimescaleRoundMode extends js.Object
@JSGlobal("ej.Gantt.TimescaleRoundMode")
@js.native
object TimescaleRoundMode extends js.Object {
  
  ///The round-off value will be automatically calculated based on the data source values.
  @js.native
  sealed trait Auto extends TimescaleRoundMode
  
  ///Schedule headers start date will round off to the immediate month
  @js.native
  sealed trait Month extends TimescaleRoundMode
  
  ///Schedule header start date will round-off to the immediate week.
  @js.native
  sealed trait Week extends TimescaleRoundMode
  
  ///Schedule headers start date will round off to the immediate year
  @js.native
  sealed trait Year extends TimescaleRoundMode
}
