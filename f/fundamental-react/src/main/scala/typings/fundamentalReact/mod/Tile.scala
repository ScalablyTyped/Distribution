package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.FunctionComponentTileActi
import typings.fundamentalReact.anon.FunctionComponentTileCont
import typings.fundamentalReact.anon.FunctionComponentTileMedi
import typings.fundamentalReact.anon.PartialTileProps
import typings.fundamentalReact.anon.WeakValidationMapTileProp
import typings.fundamentalReact.tileMod.TileProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Tile")
@js.native
object Tile extends js.Object {
  var Actions: FunctionComponentTileActi = js.native
  var Content: FunctionComponentTileCont = js.native
  var Media: FunctionComponentTileMedi = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileProps] = js.native
  var displayName: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Tile] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
  def apply(props: PropsWithChildren[TileProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileProps], context: js.Any): ReactElement | Null = js.native
}

