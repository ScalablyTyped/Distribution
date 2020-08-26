package typings.figma.mod.global

import typings.figma.figmaStrings.GRID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridStyle extends BaseStyle {
  var layoutGrids: js.Array[LayoutGrid] = js.native
  @JSName("type")
  var type_GridStyle: GRID = js.native
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
  @scala.inline
  implicit class GridStyleOps[Self <: GridStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayoutGridsVarargs(value: LayoutGrid*): Self = this.set("layoutGrids", js.Array(value :_*))
    @scala.inline
    def setLayoutGrids(value: js.Array[LayoutGrid]): Self = this.set("layoutGrids", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GRID): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

