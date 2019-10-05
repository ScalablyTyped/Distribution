package typings.ejDotWebDotAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImagePosition extends js.Object

@JSGlobal("ej.Tile.ImagePosition")
@js.native
object ImagePosition extends js.Object {
  ///To set the bottom center position of tile image
  @js.native
  sealed trait BottomCenter
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the bottomleft position of tile image
  @js.native
  sealed trait BottomLeft
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the bottomright position of tile image
  @js.native
  sealed trait BottomRight
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the center position of tile image
  @js.native
  sealed trait Center
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the fill position of tile image
  @js.native
  sealed trait Fill
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the left center position of tile image
  @js.native
  sealed trait LeftCenter
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the right center position of tile image
  @js.native
  sealed trait RightCenter
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the top center position of tile image
  @js.native
  sealed trait TopCenter
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the topleft position of tile image
  @js.native
  sealed trait TopLeft
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  ///To set the topright position of tile image
  @js.native
  sealed trait TopRight
    extends typings.ejDotWebDotAll.ej.Tile.ImagePosition
  
  /* 2 */ val BottomCenter: typings.ejDotWebDotAll.ej.Tile.ImagePosition.BottomCenter with Double = js.native
  /* 8 */ val BottomLeft: typings.ejDotWebDotAll.ej.Tile.ImagePosition.BottomLeft with Double = js.native
  /* 7 */ val BottomRight: typings.ejDotWebDotAll.ej.Tile.ImagePosition.BottomRight with Double = js.native
  /* 0 */ val Center: typings.ejDotWebDotAll.ej.Tile.ImagePosition.Center with Double = js.native
  /* 9 */ val Fill: typings.ejDotWebDotAll.ej.Tile.ImagePosition.Fill with Double = js.native
  /* 4 */ val LeftCenter: typings.ejDotWebDotAll.ej.Tile.ImagePosition.LeftCenter with Double = js.native
  /* 3 */ val RightCenter: typings.ejDotWebDotAll.ej.Tile.ImagePosition.RightCenter with Double = js.native
  /* 1 */ val TopCenter: typings.ejDotWebDotAll.ej.Tile.ImagePosition.TopCenter with Double = js.native
  /* 5 */ val TopLeft: typings.ejDotWebDotAll.ej.Tile.ImagePosition.TopLeft with Double = js.native
  /* 6 */ val TopRight: typings.ejDotWebDotAll.ej.Tile.ImagePosition.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Tile.ImagePosition with Double] = js.native
}

