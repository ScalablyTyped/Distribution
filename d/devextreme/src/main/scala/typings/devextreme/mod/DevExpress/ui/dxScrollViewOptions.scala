package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollViewOptions extends dxScrollableOptions[dxScrollView] {
  /** @name dxScrollView.Options.onPullDown */
  var onPullDown: js.UndefOr[js.Function1[/* e */ `9`, _]] = js.native
  /** @name dxScrollView.Options.onReachBottom */
  var onReachBottom: js.UndefOr[js.Function1[/* e */ `9`, _]] = js.native
  /** @name dxScrollView.Options.pulledDownText */
  var pulledDownText: js.UndefOr[String] = js.native
  /** @name dxScrollView.Options.pullingDownText */
  var pullingDownText: js.UndefOr[String] = js.native
  /** @name dxScrollView.Options.reachBottomText */
  var reachBottomText: js.UndefOr[String] = js.native
  /** @name dxScrollView.Options.refreshingText */
  var refreshingText: js.UndefOr[String] = js.native
}

object dxScrollViewOptions {
  @scala.inline
  def apply(): dxScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxScrollViewOptions]
  }
  @scala.inline
  implicit class dxScrollViewOptionsOps[Self <: dxScrollViewOptions] (val x: Self) extends AnyVal {
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
    def setOnPullDown(value: /* e */ `9` => _): Self = this.set("onPullDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPullDown: Self = this.set("onPullDown", js.undefined)
    @scala.inline
    def setOnReachBottom(value: /* e */ `9` => _): Self = this.set("onReachBottom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReachBottom: Self = this.set("onReachBottom", js.undefined)
    @scala.inline
    def setPulledDownText(value: String): Self = this.set("pulledDownText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePulledDownText: Self = this.set("pulledDownText", js.undefined)
    @scala.inline
    def setPullingDownText(value: String): Self = this.set("pullingDownText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullingDownText: Self = this.set("pullingDownText", js.undefined)
    @scala.inline
    def setReachBottomText(value: String): Self = this.set("reachBottomText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReachBottomText: Self = this.set("reachBottomText", js.undefined)
    @scala.inline
    def setRefreshingText(value: String): Self = this.set("refreshingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshingText: Self = this.set("refreshingText", js.undefined)
  }
  
}

