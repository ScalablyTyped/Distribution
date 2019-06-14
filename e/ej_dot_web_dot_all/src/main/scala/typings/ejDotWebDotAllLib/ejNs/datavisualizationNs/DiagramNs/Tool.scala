package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Tool extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Tool")
@js.native
object Tool extends js.Object {
  //Enables/Disables ContinuousDraw tool
  @js.native
  sealed trait ContinuesDraw
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool
  
  //Enables/Disables DrawOnce tool
  @js.native
  sealed trait DrawOnce
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool
  
  //Enables/Disables MultiSelect tool
  @js.native
  sealed trait MultipleSelect
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool
  
  //Disables all Tools
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool
  
  //Enables/Disables SingleSelect tool
  @js.native
  sealed trait SingleSelect
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool
  
  //Enables/Disables ZoomPan tool
  @js.native
  sealed trait ZoomPan
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool
  
  /* 5 */ val ContinuesDraw: ContinuesDraw with scala.Double = js.native
  /* 4 */ val DrawOnce: DrawOnce with scala.Double = js.native
  /* 2 */ val MultipleSelect: MultipleSelect with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val SingleSelect: SingleSelect with scala.Double = js.native
  /* 3 */ val ZoomPan: ZoomPan with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool with scala.Double] = js.native
}

