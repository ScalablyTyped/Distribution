package typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextOverflow extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.TextOverflow")
@js.native
object TextOverflow extends js.Object {
  //Hides the label when its width exceeds grid width
  @js.native
  sealed trait Hide extends TextOverflow
  
  //Displays the label within the grid width
  @js.native
  sealed trait None extends TextOverflow
  
  //Wrap the label by letter when its width exceeds grid width
  @js.native
  sealed trait Wrap extends TextOverflow
  
  //Wrap the label by word when its width exceeds grid width
  @js.native
  sealed trait WrapByWord extends TextOverflow
  
  /* 1 */ val Hide: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.TextOverflow.Hide with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.TextOverflow.None with Double = js.native
  /* 2 */ val Wrap: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.TextOverflow.Wrap with Double = js.native
  /* 3 */ val WrapByWord: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.TextOverflow.WrapByWord with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextOverflow with Double] = js.native
}

