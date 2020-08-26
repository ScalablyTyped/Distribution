package typings.extjs.Ext.panel

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProxy extends IBase {
  /** [Method] Gets the proxy s element
    * @returns Ext.Element The proxy's element
    */
  var getEl: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Gets the proxy s ghost Panel
    * @returns Ext.panel.Panel The proxy's ghost Panel
    */
  var getGhost: js.UndefOr[js.Function0[IPanel]] = js.native
  /** [Method] Gets the proxy element
    * @returns Ext.Element The proxy's element
    */
  var getProxy: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[Boolean] = js.native
  /** [Method] Moves the proxy to a different position in the DOM
    * @param parentNode HTMLElement The proxy's parent DOM node
    * @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
    */
  var moveProxy: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement], Unit]
  ] = js.native
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[IPanel] = js.native
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}

object IProxy {
  @scala.inline
  def apply(): IProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProxy]
  }
  @scala.inline
  implicit class IProxyOps[Self <: IProxy] (val x: Self) extends AnyVal {
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
    def setGetEl(value: () => IElement): Self = this.set("getEl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    @scala.inline
    def setGetGhost(value: () => IPanel): Self = this.set("getGhost", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGhost: Self = this.set("getGhost", js.undefined)
    @scala.inline
    def setGetProxy(value: () => IElement): Self = this.set("getProxy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setInsertProxy(value: Boolean): Self = this.set("insertProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertProxy: Self = this.set("insertProxy", js.undefined)
    @scala.inline
    def setMoveOnDrag(value: Boolean): Self = this.set("moveOnDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveOnDrag: Self = this.set("moveOnDrag", js.undefined)
    @scala.inline
    def setMoveProxy(value: (/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement]) => Unit): Self = this.set("moveProxy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMoveProxy: Self = this.set("moveProxy", js.undefined)
    @scala.inline
    def setPanel(value: IPanel): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

