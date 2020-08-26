package typings.extjs.Ext.layout.boxoverflow

import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScroller extends IObservable {
  /** [Config Option] (String) */
  var afterCtCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var afterScrollerCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var animateScroll: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var beforeCtCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var beforeScrollerCls: js.UndefOr[String] = js.native
  /** [Method] Returns the current scroll position of the innerCt element
    * @returns Number The current scroll position
    */
  var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var scrollDuration: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scrollIncrement: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scrollRepeatInterval: js.UndefOr[Double] = js.native
  /** [Method] Scrolls to the given component
    * @param item String/Number/Ext.Component The item to scroll to. Can be a numerical index, component id or a reference to the component itself.
    * @param animate Boolean True to animate the scrolling
    */
  var scrollToItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (String) */
  var scrollerCls: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var wheelIncrement: js.UndefOr[Double] = js.native
}

object IScroller {
  @scala.inline
  def apply(): IScroller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScroller]
  }
  @scala.inline
  implicit class IScrollerOps[Self <: IScroller] (val x: Self) extends AnyVal {
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
    def setAfterCtCls(value: String): Self = this.set("afterCtCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCtCls: Self = this.set("afterCtCls", js.undefined)
    @scala.inline
    def setAfterScrollerCls(value: String): Self = this.set("afterScrollerCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterScrollerCls: Self = this.set("afterScrollerCls", js.undefined)
    @scala.inline
    def setAnimateScroll(value: Boolean): Self = this.set("animateScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateScroll: Self = this.set("animateScroll", js.undefined)
    @scala.inline
    def setBeforeCtCls(value: String): Self = this.set("beforeCtCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCtCls: Self = this.set("beforeCtCls", js.undefined)
    @scala.inline
    def setBeforeScrollerCls(value: String): Self = this.set("beforeScrollerCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeScrollerCls: Self = this.set("beforeScrollerCls", js.undefined)
    @scala.inline
    def setGetScrollPosition(value: () => Double): Self = this.set("getScrollPosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScrollPosition: Self = this.set("getScrollPosition", js.undefined)
    @scala.inline
    def setScrollDuration(value: Double): Self = this.set("scrollDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollDuration: Self = this.set("scrollDuration", js.undefined)
    @scala.inline
    def setScrollIncrement(value: Double): Self = this.set("scrollIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollIncrement: Self = this.set("scrollIncrement", js.undefined)
    @scala.inline
    def setScrollRepeatInterval(value: Double): Self = this.set("scrollRepeatInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollRepeatInterval: Self = this.set("scrollRepeatInterval", js.undefined)
    @scala.inline
    def setScrollToItem(value: (/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[Boolean]) => Unit): Self = this.set("scrollToItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteScrollToItem: Self = this.set("scrollToItem", js.undefined)
    @scala.inline
    def setScrollerCls(value: String): Self = this.set("scrollerCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollerCls: Self = this.set("scrollerCls", js.undefined)
    @scala.inline
    def setWheelIncrement(value: Double): Self = this.set("wheelIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelIncrement: Self = this.set("wheelIncrement", js.undefined)
  }
  
}

