package typings.getNodeDimensions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDimensionsOptions extends js.Object {
  @JSName("clone")
  var clone_FNodeDimensionsOptions: js.UndefOr[Boolean] = js.native
  var display: js.UndefOr[String] = js.native
  var height: js.UndefOr[String] = js.native
  var margin: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String] = js.native
}

object NodeDimensionsOptions {
  @scala.inline
  def apply(): NodeDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDimensionsOptions]
  }
  @scala.inline
  implicit class NodeDimensionsOptionsOps[Self <: NodeDimensionsOptions] (val x: Self) extends AnyVal {
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: Boolean): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

