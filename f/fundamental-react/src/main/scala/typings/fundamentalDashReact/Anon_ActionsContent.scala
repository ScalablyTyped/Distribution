package typings.fundamentalDashReact

import typings.fundamentalDashReact.libTileTileMod.TileActionsProps
import typings.fundamentalDashReact.libTileTileMod.TileContentProps
import typings.fundamentalDashReact.libTileTileMod.TileMediaProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionsContent extends js.Object {
  var Actions: FunctionComponent[TileActionsProps]
  var Content: FunctionComponent[TileContentProps]
  var Media: FunctionComponent[TileMediaProps]
}

object Anon_ActionsContent {
  @scala.inline
  def apply(
    Actions: FunctionComponent[TileActionsProps],
    Content: FunctionComponent[TileContentProps],
    Media: FunctionComponent[TileMediaProps]
  ): Anon_ActionsContent = {
    val __obj = js.Dynamic.literal(Actions = Actions, Content = Content, Media = Media)
  
    __obj.asInstanceOf[Anon_ActionsContent]
  }
}

