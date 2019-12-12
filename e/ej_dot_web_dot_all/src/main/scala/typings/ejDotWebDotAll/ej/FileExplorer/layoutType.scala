package typings.ejDotWebDotAll.ej.FileExplorer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.FileExplorer.layoutType.LargeIcons
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[layoutType with Double] = js.native
  /* 1 */ @js.native
  object Grid
    extends TopLevel[typings.ejDotWebDotAll.ej.FileExplorer.layoutType.Grid with Double]
  
  /* 2 */ @js.native
  object LargeIcons extends TopLevel[LargeIcons with Double]
  
  /* 0 */ @js.native
  object Tile
    extends TopLevel[typings.ejDotWebDotAll.ej.FileExplorer.layoutType.Tile with Double]
  
}

