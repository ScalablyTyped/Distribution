package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorLineType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ConnectorLineType")
@js.native
object ConnectorLineType extends js.Object {
  //string
  @js.native
  sealed trait Bezier extends ConnectorLineType
  
  //string
  @js.native
  sealed trait Line extends ConnectorLineType
  
  /* 1 */ val Bezier: typings.ejDotWebDotAll.ej.datavisualization.Chart.ConnectorLineType.Bezier with Double = js.native
  /* 0 */ val Line: typings.ejDotWebDotAll.ej.datavisualization.Chart.ConnectorLineType.Line with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectorLineType with Double] = js.native
}

