package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScheduleHeaderType extends js.Object
@JSGlobal("ej.Gantt.ScheduleHeaderType")
@js.native
object ScheduleHeaderType extends js.Object {
  
  ///Sets day Schedule Mode.
  @js.native
  sealed trait Day extends ScheduleHeaderType
  
  ///Sets hour Schedule Mode.
  @js.native
  sealed trait Hour extends ScheduleHeaderType
  
  ///Sets month Schedule Mode.
  @js.native
  sealed trait Month extends ScheduleHeaderType
  
  ///Sets week Schedule Mode.
  @js.native
  sealed trait Week extends ScheduleHeaderType
  
  ///Sets year Schedule Mode.
  @js.native
  sealed trait Year extends ScheduleHeaderType
}
