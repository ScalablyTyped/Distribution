package typings
package ejDotWebDotAllLib.ejNs.TileNs

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
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the bottomleft position of tile image
  @js.native
  sealed trait BottomLeft
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the bottomright position of tile image
  @js.native
  sealed trait BottomRight
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the center position of tile image
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the fill position of tile image
  @js.native
  sealed trait Fill
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the left center position of tile image
  @js.native
  sealed trait LeftCenter
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the right center position of tile image
  @js.native
  sealed trait RightCenter
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the top center position of tile image
  @js.native
  sealed trait TopCenter
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the topleft position of tile image
  @js.native
  sealed trait TopLeft
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  ///To set the topright position of tile image
  @js.native
  sealed trait TopRight
    extends ejDotWebDotAllLib.ejNs.TileNs.ImagePosition
  
  /* 2 */ val BottomCenter: BottomCenter with scala.Double = js.native
  /* 8 */ val BottomLeft: BottomLeft with scala.Double = js.native
  /* 7 */ val BottomRight: BottomRight with scala.Double = js.native
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 9 */ val Fill: Fill with scala.Double = js.native
  /* 4 */ val LeftCenter: LeftCenter with scala.Double = js.native
  /* 3 */ val RightCenter: RightCenter with scala.Double = js.native
  /* 1 */ val TopCenter: TopCenter with scala.Double = js.native
  /* 5 */ val TopLeft: TopLeft with scala.Double = js.native
  /* 6 */ val TopRight: TopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.ImagePosition with scala.Double] = js.native
}

