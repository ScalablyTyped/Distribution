package typings.ejDotWebDotAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Gantt.DurationUnit.Day
import typings.ejDotWebDotAll.ej.Gantt.DurationUnit.Hour
import typings.ejDotWebDotAll.ej.Gantt.DurationUnit.Minute
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DurationUnit with Double] = js.native
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 1 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  /* 2 */ @js.native
  object Minute extends TopLevel[Minute with Double]
  
}

