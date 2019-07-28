package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

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
  sealed trait LineThrough extends TextDecoration
  
  //Defines a normal text. This is default
  @js.native
  sealed trait None extends TextDecoration
  
  //Defines a line above the text
  @js.native
  sealed trait Overline extends TextDecoration
  
  //Defines a line below the text
  @js.native
  sealed trait Underline extends TextDecoration
  
  /* 2 */ val LineThrough: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.TextDecoration.LineThrough with Double = js.native
  /* 3 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.TextDecoration.None with Double = js.native
  /* 1 */ val Overline: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.TextDecoration.Overline with Double = js.native
  /* 0 */ val Underline: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.TextDecoration.Underline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDecoration with Double] = js.native
}

