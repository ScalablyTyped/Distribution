package typings.ejDotWebDotAll.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait layoutType extends js.Object

@JSGlobal("ej.FileExplorer.layoutType")
@js.native
object layoutType extends js.Object {
  ///Supports to display files in grid view
  @js.native
  sealed trait Grid extends layoutType
  
  ///Supports to display files as large icons
  @js.native
  sealed trait LargeIcons extends layoutType
  
  ///Supports to display files in tile view
  @js.native
  sealed trait Tile extends layoutType
  
  /* 1 */ val Grid: typings.ejDotWebDotAll.ejNs.FileExplorerNs.layoutType.Grid with Double = js.native
  /* 2 */ val LargeIcons: typings.ejDotWebDotAll.ejNs.FileExplorerNs.layoutType.LargeIcons with Double = js.native
  /* 0 */ val Tile: typings.ejDotWebDotAll.ejNs.FileExplorerNs.layoutType.Tile with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[layoutType with Double] = js.native
}

