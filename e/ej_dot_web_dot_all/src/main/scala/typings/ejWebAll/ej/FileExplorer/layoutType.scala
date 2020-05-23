package typings.ejWebAll.ej.FileExplorer

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
  
}

