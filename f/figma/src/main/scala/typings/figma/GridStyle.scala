package typings.figma

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
    val __obj = js.Dynamic.literal(description = description, id = id, key = key, layoutGrids = layoutGrids, name = name, remote = remote, remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GridStyle]
  }
}

