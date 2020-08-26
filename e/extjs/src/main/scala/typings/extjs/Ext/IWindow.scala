package typings.extjs.Ext

import typings.extjs.Ext.util.IComponentDragger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindow
  extends typings.extjs.Ext.panel.IPanel {
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_IWindow: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_IWindow: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Ext.Element) */
  var animateTarget: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  @JSName("autoRender")
  var autoRender_IWindow: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.util.ComponentDragger) */
  @JSName("dd")
  var dd_IWindow: js.UndefOr[IComponentDragger] = js.native
  /** [Config Option] (String/Number/Ext.Component) */
  var defaultFocus: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var expandOnShow: js.UndefOr[Boolean] = js.native
  /** [Method] Gets the configured default focus item  */
  var getDefaultFocus: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Function) */
  var ghost: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hideShadowOnDeactivate: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isWindow: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var maximizable: js.UndefOr[Boolean] = js.native
  /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
    * @param animate Boolean true to animate this Window to full size.
    * @returns Ext.window.Window this
    */
  var maximize: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Config Option] (Boolean) */
  var maximized: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var minimizable: js.UndefOr[Boolean] = js.native
  /** [Method] Placeholder method for minimizing the window
    * @returns Ext.window.Window this
    */
  var minimize: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var onEsc: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  /** [Method] Restores a maximized window back to its original size and position prior to being maximized and also replaces the re
    * @param animate Object
    * @returns Ext.window.Window this
    */
  var restore: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] A shortcut method for toggling between maximize and restore based on the current maximized state of the window
    * @returns Ext.window.Window this
    */
  var toggleMaximize: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}

object IWindow {
  @scala.inline
  def apply(): IWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindow]
  }
  @scala.inline
  implicit class IWindowOps[Self <: IWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterCollapse(value: () => Unit): Self = this.set("afterCollapse", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterCollapse: Self = this.set("afterCollapse", js.undefined)
    @scala.inline
    def setAfterExpand(value: () => Unit): Self = this.set("afterExpand", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterExpand: Self = this.set("afterExpand", js.undefined)
    @scala.inline
    def setAnimateTarget(value: js.Any): Self = this.set("animateTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateTarget: Self = this.set("animateTarget", js.undefined)
    @scala.inline
    def setAutoRender(value: Boolean): Self = this.set("autoRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRender: Self = this.set("autoRender", js.undefined)
    @scala.inline
    def setDd(value: IComponentDragger): Self = this.set("dd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDd: Self = this.set("dd", js.undefined)
    @scala.inline
    def setDefaultFocus(value: js.Any): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFocus: Self = this.set("defaultFocus", js.undefined)
    @scala.inline
    def setExpandOnShow(value: Boolean): Self = this.set("expandOnShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandOnShow: Self = this.set("expandOnShow", js.undefined)
    @scala.inline
    def setGetDefaultFocus(value: () => Unit): Self = this.set("getDefaultFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaultFocus: Self = this.set("getDefaultFocus", js.undefined)
    @scala.inline
    def setGhost(value: js.Any): Self = this.set("ghost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGhost: Self = this.set("ghost", js.undefined)
    @scala.inline
    def setHideShadowOnDeactivate(value: Boolean): Self = this.set("hideShadowOnDeactivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideShadowOnDeactivate: Self = this.set("hideShadowOnDeactivate", js.undefined)
    @scala.inline
    def setIsWindow(value: Boolean): Self = this.set("isWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWindow: Self = this.set("isWindow", js.undefined)
    @scala.inline
    def setMaximizable(value: Boolean): Self = this.set("maximizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizable: Self = this.set("maximizable", js.undefined)
    @scala.inline
    def setMaximize(value: /* animate */ js.UndefOr[Boolean] => IWindow): Self = this.set("maximize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMaximize: Self = this.set("maximize", js.undefined)
    @scala.inline
    def setMaximized(value: Boolean): Self = this.set("maximized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximized: Self = this.set("maximized", js.undefined)
    @scala.inline
    def setMinimizable(value: Boolean): Self = this.set("minimizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizable: Self = this.set("minimizable", js.undefined)
    @scala.inline
    def setMinimize(value: () => IWindow): Self = this.set("minimize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setOnEsc(value: js.Any): Self = this.set("onEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEsc: Self = this.set("onEsc", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setRestore(value: /* animate */ js.UndefOr[js.Any] => IWindow): Self = this.set("restore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    @scala.inline
    def setToggleMaximize(value: () => IWindow): Self = this.set("toggleMaximize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToggleMaximize: Self = this.set("toggleMaximize", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

