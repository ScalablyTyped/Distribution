package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MultiLevelLabelsBorderType extends js.Object

@JSGlobal("ej.datavisualization.Chart.MultiLevelLabelsBorderType")
@js.native
object MultiLevelLabelsBorderType extends js.Object {
  //string
  @js.native
  sealed trait Brace extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait CurlyBrace extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait None extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait Rectangle extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait WithoutTopAndBottom extends MultiLevelLabelsBorderType
  
  /* 3 */ val Brace: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType.Brace with Double = js.native
  /* 4 */ val CurlyBrace: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType.CurlyBrace with Double = js.native
  /* 1 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType.None with Double = js.native
  /* 0 */ val Rectangle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType.Rectangle with Double = js.native
  /* 2 */ val WithoutTopAndBottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType.WithoutTopAndBottom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MultiLevelLabelsBorderType with Double] = js.native
}

