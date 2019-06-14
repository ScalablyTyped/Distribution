package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

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
  sealed trait Hide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.TextOverflow
  
  //Displays the label within the grid width
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.TextOverflow
  
  //Wrap the label by letter when its width exceeds grid width
  @js.native
  sealed trait Wrap
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.TextOverflow
  
  //Wrap the label by word when its width exceeds grid width
  @js.native
  sealed trait WrapByWord
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.TextOverflow
  
  /* 1 */ val Hide: Hide with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Wrap: Wrap with scala.Double = js.native
  /* 3 */ val WrapByWord: WrapByWord with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.TextOverflow with scala.Double
  ] = js.native
}

