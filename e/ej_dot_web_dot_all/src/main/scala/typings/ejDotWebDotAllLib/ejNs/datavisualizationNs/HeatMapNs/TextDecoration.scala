package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDecoration extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.TextDecoration")
@js.native
object TextDecoration extends js.Object {
  //Defines a line through the text
  @js.native
  sealed trait LineThrough
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.TextDecoration
  
  //Defines a normal text. This is default
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.TextDecoration
  
  //Defines a line above the text
  @js.native
  sealed trait Overline
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.TextDecoration
  
  //Defines a line below the text
  @js.native
  sealed trait Underline
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.TextDecoration
  
  /* 2 */ val LineThrough: LineThrough with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  /* 1 */ val Overline: Overline with scala.Double = js.native
  /* 0 */ val Underline: Underline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.TextDecoration with scala.Double
  ] = js.native
}

