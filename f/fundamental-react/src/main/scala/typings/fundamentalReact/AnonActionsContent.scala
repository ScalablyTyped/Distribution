package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.Tile
import typings.fundamentalReact.tileMod.TileActionsProps
import typings.fundamentalReact.tileMod.TileContentProps
import typings.fundamentalReact.tileMod.TileMediaProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionsContent extends js.Object {
  var Actions: FunctionComponent[TileActionsProps] with AnonDisplayNameTileActions
  var Content: FunctionComponent[TileContentProps] with AnonDisplayNameTileContent
  var Media: FunctionComponent[TileMediaProps] with AnonDisplayNameTileMedia
  var displayName: Tile
}

object AnonActionsContent {
  @scala.inline
  def apply(
    Actions: FunctionComponent[TileActionsProps] with AnonDisplayNameTileActions,
    Content: FunctionComponent[TileContentProps] with AnonDisplayNameTileContent,
    Media: FunctionComponent[TileMediaProps] with AnonDisplayNameTileMedia,
    displayName: Tile
  ): AnonActionsContent = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionsContent]
  }
}

