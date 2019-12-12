package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Sliceanddiceauto
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Sliceanddicehorizontal
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Sliceanddicevertical
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Squarified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemsLayoutMode with Double] = js.native
  /* 3 */ @js.native
  object Sliceanddiceauto extends TopLevel[Sliceanddiceauto with Double]
  
  /* 1 */ @js.native
  object Sliceanddicehorizontal extends TopLevel[Sliceanddicehorizontal with Double]
  
  /* 2 */ @js.native
  object Sliceanddicevertical extends TopLevel[Sliceanddicevertical with Double]
  
  /* 0 */ @js.native
  object Squarified extends TopLevel[Squarified with Double]
  
}

