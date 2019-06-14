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
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Trim: Trim with scala.Double = js.native
  /* 2 */ val Wrap: Wrap with scala.Double = js.native
  /* 3 */ val WrapAndTrim: WrapAndTrim with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextOverflow with scala.Double
  ] = js.native
}

