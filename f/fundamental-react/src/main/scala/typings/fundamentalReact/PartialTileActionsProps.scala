package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileActionsProps> */
trait PartialTileActionsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object PartialTileActionsProps {
  @scala.inline
  def apply(className: String = null): PartialTileActionsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTileActionsProps]
  }
}

