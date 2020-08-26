package typings.flowdoc.Flow

import typings.flowdoc.Graphic
import typings.flowdoc.flowdocStrings.SCREEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Screen extends Graphic {
  var children: js.Array[Layer] = js.native
  var connections: js.UndefOr[js.Array[Connection]] = js.native
  @JSName("type")
  var type_Screen: SCREEN = js.native
}

object Screen {
  @scala.inline
  def apply(
    children: js.Array[Layer],
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: SCREEN
  ): Screen = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  @scala.inline
  implicit class ScreenOps[Self <: Screen] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: Layer*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Layer]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SCREEN): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = this.set("connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
  }
  
}

