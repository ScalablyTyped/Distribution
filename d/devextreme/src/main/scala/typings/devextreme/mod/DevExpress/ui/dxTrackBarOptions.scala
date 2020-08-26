package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTrackBarOptions[T] extends EditorOptions[T] {
  /** @name dxTrackBar.Options.max */
  var max: js.UndefOr[Double] = js.native
  /** @name dxTrackBar.Options.min */
  var min: js.UndefOr[Double] = js.native
}

object dxTrackBarOptions {
  @scala.inline
  def apply[T](): dxTrackBarOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTrackBarOptions[T]]
  }
  @scala.inline
  implicit class dxTrackBarOptionsOps[Self <: dxTrackBarOptions[_], T] (val x: Self with dxTrackBarOptions[T]) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

