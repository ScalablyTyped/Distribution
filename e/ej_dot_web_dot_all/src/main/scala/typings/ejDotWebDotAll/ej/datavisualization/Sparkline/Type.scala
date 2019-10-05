package typings.ejDotWebDotAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.datavisualization.Sparkline.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Column
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Line
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Pie
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait WinLoss
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  /* 0 */ val Area: typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Area with Double = js.native
  /* 2 */ val Column: typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Column with Double = js.native
  /* 1 */ val Line: typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Line with Double = js.native
  /* 3 */ val Pie: typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Pie with Double = js.native
  /* 4 */ val WinLoss: typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.WinLoss with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type with Double] = js.native
}

