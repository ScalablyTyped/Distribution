package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.TileDotContent
import typings.fundamentalReact.tileMod.TileContentProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> & {  displayName  :'Tile.Content'} */
@js.native
trait FunctionComponentTileCont extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileContentProps] = js.native
  var displayName: js.UndefOr[String with TileDotContent] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileCont] = js.native
  def apply(props: PropsWithChildren[TileContentProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileContentProps], context: js.Any): ReactElement | Null = js.native
}

