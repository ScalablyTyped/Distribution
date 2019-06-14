package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

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
  sealed trait Brace
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait CurlyBrace
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait Rectangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait WithoutTopAndBottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType
  
  /* 3 */ val Brace: Brace with scala.Double = js.native
  /* 4 */ val CurlyBrace: CurlyBrace with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 0 */ val Rectangle: Rectangle with scala.Double = js.native
  /* 2 */ val WithoutTopAndBottom: WithoutTopAndBottom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType with scala.Double
  ] = js.native
}

