package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionPosition extends js.Object
@JSGlobal("ej.Tile.CaptionPosition")
@js.native
object CaptionPosition extends js.Object {
  
  ///To set the inner bottom position of the tile text
  @js.native
  sealed trait Innerbottom extends CaptionPosition
  
  ///To set the inner top position of the tile text
  @js.native
  sealed trait Innertop extends CaptionPosition
  
  ///To set the outer position of the tile text
  @js.native
  sealed trait Outer extends CaptionPosition
}
