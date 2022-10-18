package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.FCTileContentPropsdisplay
import typings.fundamentalReact.anon.FCTileFooterPropsdisplayN
import typings.fundamentalReact.anon.FCTileHeaderPropsdisplayN
import typings.fundamentalReact.anon.PartialTileProps
import typings.fundamentalReact.anon.WeakValidationMapTileProp
import typings.fundamentalReact.libTileTileMod.TileProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> & {  displayName :'Tile',   Content :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> & {  displayName :'Tile.Content'},   Footer :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileFooterProps> & {  displayName :'Tile.Footer'},   Header :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> & {  displayName :'Tile.Header'}} */
object Tile {
  
  inline def apply(props: TileProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: TileProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Tile")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Tile.Content")
  @js.native
  def Content: FCTileContentPropsdisplay = js.native
  inline def Content_=(x: FCTileContentPropsdisplay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.Footer")
  @js.native
  def Footer: FCTileFooterPropsdisplayN = js.native
  inline def Footer_=(x: FCTileFooterPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.Header")
  @js.native
  def Header: FCTileHeaderPropsdisplayN = js.native
  inline def Header_=(x: FCTileHeaderPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTileProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialTileProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.displayName")
  @js.native
  def displayName: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Tile] = js.native
  inline def displayName_=(x: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Tile]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapTileProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
