package typings.fundamentalReact.tileMod

import typings.fundamentalReact.anon.FCTileContentPropsdisplay
import typings.fundamentalReact.anon.FCTileFooterPropsdisplayN
import typings.fundamentalReact.anon.FCTileHeaderPropsdisplayN
import typings.fundamentalReact.anon.PartialTileProps
import typings.fundamentalReact.anon.WeakValidationMapTileProp
import typings.fundamentalReact.fundamentalReactStrings.Tile
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/Tile/Tile", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[TileProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileProps], context: js.Any): ReactElement | Null = js.native
  
  var Content: FCTileContentPropsdisplay = js.native
  
  var Footer: FCTileFooterPropsdisplayN = js.native
  
  var Header: FCTileHeaderPropsdisplayN = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialTileProps] = js.native
  
  var displayName: js.UndefOr[String | Tile] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
}
