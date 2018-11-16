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
  
  val HistogramView: HistogramView with java.lang.String = js.native
  val ProjectView: ProjectView with java.lang.String = js.native
  val ResourceView: ResourceView with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.ViewType with java.lang.String] = js.native
}

