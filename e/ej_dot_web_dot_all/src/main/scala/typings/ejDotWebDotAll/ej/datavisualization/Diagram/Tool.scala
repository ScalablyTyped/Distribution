package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait ContinuesDraw extends Tool
  
  //Enables/Disables DrawOnce tool
  @js.native
  sealed trait DrawOnce extends Tool
  
  //Enables/Disables MultiSelect tool
  @js.native
  sealed trait MultipleSelect extends Tool
  
  //Disables all Tools
  @js.native
  sealed trait None extends Tool
  
  //Enables/Disables SingleSelect tool
  @js.native
  sealed trait SingleSelect extends Tool
  
  //Enables/Disables ZoomPan tool
  @js.native
  sealed trait ZoomPan extends Tool
  
  /* 5 */ val ContinuesDraw: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.ContinuesDraw with Double = js.native
  /* 4 */ val DrawOnce: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.DrawOnce with Double = js.native
  /* 2 */ val MultipleSelect: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.MultipleSelect with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.None with Double = js.native
  /* 1 */ val SingleSelect: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.SingleSelect with Double = js.native
  /* 3 */ val ZoomPan: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.ZoomPan with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Tool with Double] = js.native
}

