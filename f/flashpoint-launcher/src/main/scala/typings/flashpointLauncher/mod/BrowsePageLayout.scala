package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BrowsePageLayout extends StObject
/** Modes for displaying the game collection at the BrowsePage */
@JSImport("flashpoint-launcher", "BrowsePageLayout")
@js.native
object BrowsePageLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BrowsePageLayout & Double] = js.native
  
  /** Games are in a table-like grid, each cell is a game */
  @js.native
  sealed trait grid
    extends StObject
       with BrowsePageLayout
  /* 1 */ val grid: typings.flashpointLauncher.mod.BrowsePageLayout.grid & Double = js.native
  
  /** Games are in a vertical list, one game per row */
  @js.native
  sealed trait list
    extends StObject
       with BrowsePageLayout
  /* 0 */ val list: typings.flashpointLauncher.mod.BrowsePageLayout.list & Double = js.native
}
