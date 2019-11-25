package typings.fundamentalDashReact

import typings.fundamentalDashReact.libTileProductTileMod.ProductTileContentProps
import typings.fundamentalDashReact.libTileProductTileMod.ProductTileMediaProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var Content: FunctionComponent[ProductTileContentProps]
  var Media: FunctionComponent[ProductTileMediaProps]
}

object Anon_Content {
  @scala.inline
  def apply(
    Content: FunctionComponent[ProductTileContentProps],
    Media: FunctionComponent[ProductTileMediaProps]
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

