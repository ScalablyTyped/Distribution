package typings.gestalt.mod

import typings.gestalt.anon.ZIndex
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyProps extends js.Object {
  var bottom: js.UndefOr[Double | String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var dangerouslySetZIndex: js.UndefOr[ZIndex] = js.native
  var left: js.UndefOr[Double | String] = js.native
  var right: js.UndefOr[Double | String] = js.native
  var top: js.UndefOr[Double | String] = js.native
}

object StickyProps {
  @scala.inline
  def apply(): StickyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyProps]
  }
  @scala.inline
  implicit class StickyPropsOps[Self <: StickyProps] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDangerouslySetZIndex(value: ZIndex): Self = this.set("dangerouslySetZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetZIndex: Self = this.set("dangerouslySetZIndex", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

