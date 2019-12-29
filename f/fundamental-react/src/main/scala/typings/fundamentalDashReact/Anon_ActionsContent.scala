package typings.fundamentalDashReact

import typings.fundamentalDashReact.fundamentalDashReactStrings.Tile
import typings.fundamentalDashReact.libTileTileMod.TileActionsProps
import typings.fundamentalDashReact.libTileTileMod.TileContentProps
import typings.fundamentalDashReact.libTileTileMod.TileMediaProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionsContent extends js.Object {
  var Actions: FunctionComponent[TileActionsProps] with Anon_DisplayNameTileActions
  var Content: FunctionComponent[TileContentProps] with Anon_DisplayNameTileContent
  var Media: FunctionComponent[TileMediaProps] with Anon_DisplayNameTileMedia
  var displayName: Tile
}

object Anon_ActionsContent {
  @scala.inline
  def apply(
    Actions: FunctionComponent[TileActionsProps] with Anon_DisplayNameTileActions,
    Content: FunctionComponent[TileContentProps] with Anon_DisplayNameTileContent,
    Media: FunctionComponent[TileMediaProps] with Anon_DisplayNameTileMedia,
    displayName: Tile
  ): Anon_ActionsContent = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionsContent]
  }
}

