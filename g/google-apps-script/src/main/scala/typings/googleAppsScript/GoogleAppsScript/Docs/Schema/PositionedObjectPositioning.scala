package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionedObjectPositioning extends js.Object {
  var layout: js.UndefOr[String] = js.native
  var leftOffset: js.UndefOr[Dimension] = js.native
  var topOffset: js.UndefOr[Dimension] = js.native
}

object PositionedObjectPositioning {
  @scala.inline
  def apply(): PositionedObjectPositioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPositioning]
  }
  @scala.inline
  implicit class PositionedObjectPositioningOps[Self <: PositionedObjectPositioning] (val x: Self) extends AnyVal {
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
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLeftOffset(value: Dimension): Self = this.set("leftOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftOffset: Self = this.set("leftOffset", js.undefined)
    @scala.inline
    def setTopOffset(value: Dimension): Self = this.set("topOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopOffset: Self = this.set("topOffset", js.undefined)
  }
  
}

