package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs

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
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait Column
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait Line
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait Pie
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait WinLoss
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type
  
  /* 0 */ val Area: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type.Area with Double = js.native
  /* 2 */ val Column: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type.Column with Double = js.native
  /* 1 */ val Line: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type.Line with Double = js.native
  /* 3 */ val Pie: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type.Pie with Double = js.native
  /* 4 */ val WinLoss: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type.WinLoss with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs.Type with Double] = js.native
}

