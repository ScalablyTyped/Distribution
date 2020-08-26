package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.TileDotMedia
import typings.fundamentalReact.tileMod.TileMediaProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tile/Tile.TileMediaProps> & {  displayName :'Tile.Media'} */
@js.native
trait FunctionComponentTileMedi extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileMediaProps] = js.native
  var displayName: js.UndefOr[String] with TileDotMedia = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileMedi] = js.native
  def apply(props: PropsWithChildren[TileMediaProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileMediaProps], context: js.Any): ReactElement | Null = js.native
}

