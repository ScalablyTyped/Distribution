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
  
  val Sliceanddiceauto: Sliceanddiceauto with java.lang.String = js.native
  val Sliceanddicehorizontal: Sliceanddicehorizontal with java.lang.String = js.native
  val Sliceanddicevertical: Sliceanddicevertical with java.lang.String = js.native
  val Squarified: Squarified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.ItemsLayoutMode with java.lang.String
  ] = js.native
}

