package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextOverflow extends js.Object

@JSGlobal("ej.datavisualization.Chart.TextOverflow")
@js.native
object TextOverflow extends js.Object {
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextOverflow
  
  //string
  @js.native
  sealed trait Trim
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextOverflow
  
  //string
  @js.native
  sealed trait Wrap
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextOverflow
  
  //string
  @js.native
  sealed trait WrapAndTrim
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextOverflow
  
  val None: None with java.lang.String = js.native
  val Trim: Trim with java.lang.String = js.native
  val Wrap: Wrap with java.lang.String = js.native
  val WrapAndTrim: WrapAndTrim with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextOverflow with java.lang.String
  ] = js.native
}

