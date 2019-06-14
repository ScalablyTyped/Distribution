package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemsLayoutMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.ItemsLayoutMode")
@js.native
object ItemsLayoutMode extends js.Object {
  //specifies the sliceanddiceauto as layout type position
  @js.native
  sealed trait Sliceanddiceauto
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode
  
  //specifies the sliceanddicehorizontal as layout type position
  @js.native
  sealed trait Sliceanddicehorizontal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode
  
  //specifies the sliceanddicevertical as layout type position
  @js.native
  sealed trait Sliceanddicevertical
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode
  
  //specifies the squarified as layout type position
  @js.native
  sealed trait Squarified
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode
  
  /* 3 */ val Sliceanddiceauto: Sliceanddiceauto with scala.Double = js.native
  /* 1 */ val Sliceanddicehorizontal: Sliceanddicehorizontal with scala.Double = js.native
  /* 2 */ val Sliceanddicevertical: Sliceanddicevertical with scala.Double = js.native
  /* 0 */ val Squarified: Squarified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode with scala.Double
  ] = js.native
}

