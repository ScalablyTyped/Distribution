package typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs

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
  sealed trait Sliceanddiceauto extends ItemsLayoutMode
  
  //specifies the sliceanddicehorizontal as layout type position
  @js.native
  sealed trait Sliceanddicehorizontal extends ItemsLayoutMode
  
  //specifies the sliceanddicevertical as layout type position
  @js.native
  sealed trait Sliceanddicevertical extends ItemsLayoutMode
  
  //specifies the squarified as layout type position
  @js.native
  sealed trait Squarified extends ItemsLayoutMode
  
  /* 3 */ val Sliceanddiceauto: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode.Sliceanddiceauto with Double = js.native
  /* 1 */ val Sliceanddicehorizontal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode.Sliceanddicehorizontal with Double = js.native
  /* 2 */ val Sliceanddicevertical: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode.Sliceanddicevertical with Double = js.native
  /* 0 */ val Squarified: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode.Squarified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemsLayoutMode with Double] = js.native
}

