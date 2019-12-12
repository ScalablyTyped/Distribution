package typings.ejDotWebDotAll.ej.Tile

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.BottomCenter
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.BottomLeft
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.BottomRight
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.Center
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.Fill
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.LeftCenter
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.RightCenter
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.TopCenter
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.TopLeft
import typings.ejDotWebDotAll.ej.Tile.ImagePosition.TopRight
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Tile.ImagePosition with Double] = js.native
  /* 2 */ @js.native
  object BottomCenter extends TopLevel[BottomCenter with Double]
  
  /* 8 */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with Double]
  
  /* 7 */ @js.native
  object BottomRight extends TopLevel[BottomRight with Double]
  
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 9 */ @js.native
  object Fill extends TopLevel[Fill with Double]
  
  /* 4 */ @js.native
  object LeftCenter extends TopLevel[LeftCenter with Double]
  
  /* 3 */ @js.native
  object RightCenter extends TopLevel[RightCenter with Double]
  
  /* 1 */ @js.native
  object TopCenter extends TopLevel[TopCenter with Double]
  
  /* 5 */ @js.native
  object TopLeft extends TopLevel[TopLeft with Double]
  
  /* 6 */ @js.native
  object TopRight extends TopLevel[TopRight with Double]
  
}

