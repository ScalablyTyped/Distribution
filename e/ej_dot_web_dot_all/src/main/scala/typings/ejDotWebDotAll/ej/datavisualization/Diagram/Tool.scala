package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.ContinuesDraw
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.DrawOnce
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.MultipleSelect
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.SingleSelect
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Tool.ZoomPan
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Tool with Double] = js.native
  /* 5 */ @js.native
  object ContinuesDraw extends TopLevel[ContinuesDraw with Double]
  
  /* 4 */ @js.native
  object DrawOnce extends TopLevel[DrawOnce with Double]
  
  /* 2 */ @js.native
  object MultipleSelect extends TopLevel[MultipleSelect with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object SingleSelect extends TopLevel[SingleSelect with Double]
  
  /* 3 */ @js.native
  object ZoomPan extends TopLevel[ZoomPan with Double]
  
}

