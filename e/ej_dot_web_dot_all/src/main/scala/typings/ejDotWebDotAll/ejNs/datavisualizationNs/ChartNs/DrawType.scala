package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawType extends js.Object

@JSGlobal("ej.datavisualization.Chart.DrawType")
@js.native
object DrawType extends js.Object {
  //string
  @js.native
  sealed trait Area extends DrawType
  
  //string
  @js.native
  sealed trait Column extends DrawType
  
  //string
  @js.native
  sealed trait Line extends DrawType
  
  /* 1 */ val Area: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.DrawType.Area with Double = js.native
  /* 2 */ val Column: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.DrawType.Column with Double = js.native
  /* 0 */ val Line: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.DrawType.Line with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawType with Double] = js.native
}

