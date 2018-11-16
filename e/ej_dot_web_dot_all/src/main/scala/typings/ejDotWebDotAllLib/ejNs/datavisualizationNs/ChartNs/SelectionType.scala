package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.datavisualization.Chart.SelectionType")
@js.native
object SelectionType extends js.Object {
  //string
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SelectionType
  
  //string
  @js.native
  sealed trait Single
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SelectionType
  
  val Multiple: Multiple with java.lang.String = js.native
  val Single: Single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SelectionType with java.lang.String
  ] = js.native
}

