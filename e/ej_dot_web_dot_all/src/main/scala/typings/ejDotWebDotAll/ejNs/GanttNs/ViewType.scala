package typings.ejDotWebDotAll.ejNs.GanttNs

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
  sealed trait HistogramView extends ViewType
  
  ///Displays the project in task view in Gantt.
  @js.native
  sealed trait ProjectView extends ViewType
  
  ///Displays the project in resource allocation view in Gantt.
  @js.native
  sealed trait ResourceView extends ViewType
  
  /* 2 */ val HistogramView: typings.ejDotWebDotAll.ejNs.GanttNs.ViewType.HistogramView with Double = js.native
  /* 0 */ val ProjectView: typings.ejDotWebDotAll.ejNs.GanttNs.ViewType.ProjectView with Double = js.native
  /* 1 */ val ResourceView: typings.ejDotWebDotAll.ejNs.GanttNs.ViewType.ResourceView with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewType with Double] = js.native
}

