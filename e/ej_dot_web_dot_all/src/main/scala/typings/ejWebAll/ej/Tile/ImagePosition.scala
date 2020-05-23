package typings.ejWebAll.ej.Tile

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
  sealed trait BottomCenter extends ImagePosition
  
  ///To set the bottomleft position of tile image
  @js.native
  sealed trait BottomLeft extends ImagePosition
  
  ///To set the bottomright position of tile image
  @js.native
  sealed trait BottomRight extends ImagePosition
  
  ///To set the center position of tile image
  @js.native
  sealed trait Center extends ImagePosition
  
  ///To set the fill position of tile image
  @js.native
  sealed trait Fill extends ImagePosition
  
  ///To set the left center position of tile image
  @js.native
  sealed trait LeftCenter extends ImagePosition
  
  ///To set the right center position of tile image
  @js.native
  sealed trait RightCenter extends ImagePosition
  
  ///To set the top center position of tile image
  @js.native
  sealed trait TopCenter extends ImagePosition
  
  ///To set the topleft position of tile image
  @js.native
  sealed trait TopLeft extends ImagePosition
  
  ///To set the topright position of tile image
  @js.native
  sealed trait TopRight extends ImagePosition
  
}

