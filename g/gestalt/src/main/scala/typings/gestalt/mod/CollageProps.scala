package typings.gestalt.mod

import typings.gestalt.anon.Height
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollageProps extends js.Object {
  var columns: Double = js.native
  var cover: js.UndefOr[Boolean] = js.native
  var gutter: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var layoutKey: js.UndefOr[Double] = js.native
  var width: Double = js.native
  def renderImage(args: Height): ReactNode = js.native
}

object CollageProps {
  @scala.inline
  def apply(columns: Double, height: Double, renderImage: Height => ReactNode, width: Double): CollageProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], renderImage = js.Any.fromFunction1(renderImage), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollageProps]
  }
  @scala.inline
  implicit class CollagePropsOps[Self <: CollageProps] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderImage(value: Height => ReactNode): Self = this.set("renderImage", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setCover(value: Boolean): Self = this.set("cover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setLayoutKey(value: Double): Self = this.set("layoutKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutKey: Self = this.set("layoutKey", js.undefined)
  }
  
}

