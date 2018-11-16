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
  
  val Brace: Brace with java.lang.String = js.native
  val CurlyBrace: CurlyBrace with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Rectangle: Rectangle with java.lang.String = js.native
  val WithoutTopAndBottom: WithoutTopAndBottom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.MultiLevelLabelsBorderType with java.lang.String
  ] = js.native
}

