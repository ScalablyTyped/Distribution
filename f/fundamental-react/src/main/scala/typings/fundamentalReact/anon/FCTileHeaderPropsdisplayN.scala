package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.TileDotHeader
import typings.fundamentalReact.tileMod.TileHeaderProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> & {  displayName :'Tile.Header'} */
@js.native
trait FCTileHeaderPropsdisplayN extends StObject {
  
  def apply(props: PropsWithChildren[TileHeaderProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileHeaderProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialTileHeaderProps] = js.native
  
  var displayName: js.UndefOr[String] with TileDotHeader = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTileHead] = js.native
}
