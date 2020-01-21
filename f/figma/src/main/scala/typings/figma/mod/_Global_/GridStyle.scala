package typings.figma.mod._Global_

import typings.figma.figmaStrings.GRID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridStyle extends BaseStyle {
  var layoutGrids: js.Array[LayoutGrid]
  @JSName("type")
  var type_GridStyle: GRID
}

object GridStyle {
  @scala.inline
  def apply(
    description: String,
    id: String,
    key: String,
    layoutGrids: js.Array[LayoutGrid],
    name: String,
    remote: Boolean,
    remove: () => Unit,
    `type`: GRID
  ): GridStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], layoutGrids = layoutGrids.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridStyle]
  }
}

