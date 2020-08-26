package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavigation extends IBase {
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Zooms the chart to the specified selection range
    * @param zoomConfig Object
    */
  var setZoom: js.UndefOr[js.Function1[/* zoomConfig */ js.UndefOr[js.Any], Unit]] = js.native
}

object INavigation {
  @scala.inline
  def apply(): INavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigation]
  }
  @scala.inline
  implicit class INavigationOps[Self <: INavigation] (val x: Self) extends AnyVal {
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
    def setRestoreZoom(value: () => Unit): Self = this.set("restoreZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRestoreZoom: Self = this.set("restoreZoom", js.undefined)
    @scala.inline
    def setSetZoom(value: /* zoomConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setZoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetZoom: Self = this.set("setZoom", js.undefined)
  }
  
}

