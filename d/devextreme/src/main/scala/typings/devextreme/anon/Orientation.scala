package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.layered
import typings.devextreme.devextremeStrings.off
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Orientation extends js.Object {
  var orientation: js.UndefOr[auto | vertical | horizontal] = js.native
  var `type`: js.UndefOr[auto | off | tree | layered] = js.native
}

object Orientation {
  @scala.inline
  def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  @scala.inline
  implicit class OrientationOps[Self <: Orientation] (val x: Self) extends AnyVal {
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
    def setOrientation(value: auto | vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setType(value: auto | off | tree | layered): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

