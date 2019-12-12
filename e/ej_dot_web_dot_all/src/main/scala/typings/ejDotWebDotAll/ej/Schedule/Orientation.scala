package typings.ejDotWebDotAll.ej.Schedule

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Schedule.Orientation.Horizontal
import typings.ejDotWebDotAll.ej.Schedule.Orientation.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("ej.Schedule.Orientation")
@js.native
object Orientation extends js.Object {
  ///Set orientation as horizontal to Scheduler
  @js.native
  sealed trait Horizontal
    extends typings.ejDotWebDotAll.ej.Schedule.Orientation
  
  ///Set orientation as vertical to Scheduler
  @js.native
  sealed trait Vertical
    extends typings.ejDotWebDotAll.ej.Schedule.Orientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Schedule.Orientation with Double] = js.native
  /* 1 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 0 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

