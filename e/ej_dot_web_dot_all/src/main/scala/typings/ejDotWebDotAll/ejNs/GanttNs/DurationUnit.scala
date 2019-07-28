package typings.ejDotWebDotAll.ejNs.GanttNs

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
  
  /* 0 */ val Day: typings.ejDotWebDotAll.ejNs.GanttNs.DurationUnit.Day with Double = js.native
  /* 1 */ val Hour: typings.ejDotWebDotAll.ejNs.GanttNs.DurationUnit.Hour with Double = js.native
  /* 2 */ val Minute: typings.ejDotWebDotAll.ejNs.GanttNs.DurationUnit.Minute with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DurationUnit with Double] = js.native
}

