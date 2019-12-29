package typings.ejDotWebDotAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewType with Double] = js.native
  /* 2 */ @js.native
  object HistogramView extends TopLevel[HistogramView with Double]
  
  /* 0 */ @js.native
  object ProjectView extends TopLevel[ProjectView with Double]
  
  /* 1 */ @js.native
  object ResourceView extends TopLevel[ResourceView with Double]
  
}

