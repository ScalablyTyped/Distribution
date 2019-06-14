package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("ej.Gantt.ViewType")
@js.native
object ViewType extends js.Object {
  ///Displays the project in histogram view in Gantt
  @js.native
  sealed trait HistogramView
    extends ejDotWebDotAllLib.ejNs.GanttNs.ViewType
  
  ///Displays the project in task view in Gantt.
  @js.native
  sealed trait ProjectView
    extends ejDotWebDotAllLib.ejNs.GanttNs.ViewType
  
  ///Displays the project in resource allocation view in Gantt.
  @js.native
  sealed trait ResourceView
    extends ejDotWebDotAllLib.ejNs.GanttNs.ViewType
  
  /* 2 */ val HistogramView: HistogramView with scala.Double = js.native
  /* 0 */ val ProjectView: ProjectView with scala.Double = js.native
  /* 1 */ val ResourceView: ResourceView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.ViewType with scala.Double] = js.native
}

