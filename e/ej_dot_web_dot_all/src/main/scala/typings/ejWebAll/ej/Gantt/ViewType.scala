package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
