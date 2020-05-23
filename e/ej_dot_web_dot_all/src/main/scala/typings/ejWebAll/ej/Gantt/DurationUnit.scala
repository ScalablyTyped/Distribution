package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DurationUnit extends js.Object

@JSGlobal("ej.Gantt.DurationUnit")
@js.native
object DurationUnit extends js.Object {
  ///Sets the Duration Unit as day.
  @js.native
  sealed trait Day extends DurationUnit
  
  ///Sets the Duration Unit as hour.
  @js.native
  sealed trait Hour extends DurationUnit
  
  ///Sets the Duration Unit as minute.
  @js.native
  sealed trait Minute extends DurationUnit
  
}

