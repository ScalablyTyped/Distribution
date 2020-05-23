package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeMode extends js.Object

@JSGlobal("ej.Schedule.TimeMode")
@js.native
object TimeMode extends js.Object {
  ///Sets 12 hour time mode to Scheduler
  @js.native
  sealed trait Hour12 extends TimeMode
  
  ///Sets 24 hour time mode to Scheduler
  @js.native
  sealed trait Hour24 extends TimeMode
  
}

