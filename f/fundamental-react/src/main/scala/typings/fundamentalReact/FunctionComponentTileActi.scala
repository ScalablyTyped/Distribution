package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.TileDotActions
import typings.fundamentalReact.tileMod.TileActionsProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tile/Tile.TileActionsProps> & {  displayName  :'Tile.Actions'} */
@js.native
trait FunctionComponentTileActi extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileActionsProps] = js.native
  var displayName: js.UndefOr[String with TileDotActions] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileActi] = js.native
  def apply(props: PropsWithChildren[TileActionsProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileActionsProps], context: js.Any): ReactElement | Null = js.native
}

