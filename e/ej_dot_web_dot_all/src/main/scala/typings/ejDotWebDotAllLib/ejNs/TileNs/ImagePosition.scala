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
  
  val BottomCenter: BottomCenter with java.lang.String = js.native
  val BottomLeft: BottomLeft with java.lang.String = js.native
  val BottomRight: BottomRight with java.lang.String = js.native
  val Center: Center with java.lang.String = js.native
  val Fill: Fill with java.lang.String = js.native
  val LeftCenter: LeftCenter with java.lang.String = js.native
  val RightCenter: RightCenter with java.lang.String = js.native
  val TopCenter: TopCenter with java.lang.String = js.native
  val TopLeft: TopLeft with java.lang.String = js.native
  val TopRight: TopRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.ImagePosition with java.lang.String] = js.native
}

