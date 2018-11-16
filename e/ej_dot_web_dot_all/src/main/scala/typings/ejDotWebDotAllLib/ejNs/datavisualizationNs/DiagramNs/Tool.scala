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
  
  val ContinuesDraw: ContinuesDraw with java.lang.String = js.native
  val DrawOnce: DrawOnce with java.lang.String = js.native
  val MultipleSelect: MultipleSelect with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val SingleSelect: SingleSelect with java.lang.String = js.native
  val ZoomPan: ZoomPan with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Tool with java.lang.String] = js.native
}

