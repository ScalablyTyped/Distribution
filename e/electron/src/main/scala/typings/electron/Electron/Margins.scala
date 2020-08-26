package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.default
import typings.electron.electronStrings.none
import typings.electron.electronStrings.printableArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Margins extends js.Object {
  /**
    * The bottom margin of the printed web page, in pixels.
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    * The left margin of the printed web page, in pixels.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Can be `default`, `none`, `printableArea`, or `custom`. If `custom` is chosen,
    * you will also need to specify `top`, `bottom`, `left`, and `right`.
    */
  var marginType: js.UndefOr[default | none | printableArea | custom] = js.native
  /**
    * The right margin of the printed web page, in pixels.
    */
  var right: js.UndefOr[Double] = js.native
  /**
    * The top margin of the printed web page, in pixels.
    */
  var top: js.UndefOr[Double] = js.native
}

object Margins {
  @scala.inline
  def apply(): Margins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margins]
  }
  @scala.inline
  implicit class MarginsOps[Self <: Margins] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMarginType(value: default | none | printableArea | custom): Self = this.set("marginType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginType: Self = this.set("marginType", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

