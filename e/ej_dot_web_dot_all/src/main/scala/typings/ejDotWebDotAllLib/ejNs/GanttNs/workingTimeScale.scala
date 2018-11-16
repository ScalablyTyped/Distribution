package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait workingTimeScale extends js.Object

@JSGlobal("ej.Gantt.workingTimeScale")
@js.native
object workingTimeScale extends js.Object {
  ///Sets twenty four hour timescale.
  @js.native
  sealed trait TimeScale24Hours
    extends ejDotWebDotAllLib.ejNs.GanttNs.workingTimeScale
  
  ///Sets eight hour timescale.
  @js.native
  sealed trait TimeScale8Hours
    extends ejDotWebDotAllLib.ejNs.GanttNs.workingTimeScale
  
  val TimeScale24Hours: TimeScale24Hours with java.lang.String = js.native
  val TimeScale8Hours: TimeScale8Hours with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.workingTimeScale with java.lang.String] = js.native
}

