package typings.extjs.Ext.panel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanel extends IAbstractPanel {
  
  /** [Method] Add tools to this panel
    * @param tools Object[]/Ext.panel.Tool[] The tools to add
    */
  var addTool: js.UndefOr[js.Function1[/* tools */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Invoked after the Panel is Collapsed
    * @param animated Boolean
    */
  var afterCollapse: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Invoked after the Panel is Expanded
    * @param animated Boolean
    */
  var afterExpand: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var animCollapse: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object/Object[]) */
  var bbar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var buttonAlign: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object/Object[]) */
  var buttons: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.native
  
  /** [Method] Closes the Panel  */
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var closeAction: js.UndefOr[String] = js.native
  
  /** [Method] Collapses the panel body so that the body becomes hidden
    * @param direction String The direction to collapse towards. Must be one of  Ext.Component.DIRECTION_TOP Ext.Component.DIRECTION_RIGHT Ext.Component.DIRECTION_BOTTOM Ext.Component.DIRECTION_LEFT Defaults to collapseDirection.
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  var collapse: js.UndefOr[
    js.Function2[/* direction */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean], this.type]
  ] = js.native
  
  /** [Config Option] (String) */
  var collapseDirection: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var collapseMode: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var constrainHeader: js.UndefOr[Boolean] = js.native
  
  /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
    * @param collapseDir Object
    */
  var convertCollapseDir: js.UndefOr[js.Function1[/* collapseDir */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Property] (Ext.dd.DragSource/Ext.util.ComponentDragger) */
  var dd: js.UndefOr[js.Any] = js.native
  
  /** [Method] Expands the panel body so that it becomes visible
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  var expand: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
  
  /** [Config Option] (Object/Object[]) */
  var fbar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var floatable: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var frameHeader: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the current collapsed state of the panel
    * @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
    */
  var getCollapsed: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Gets the Header for this panel  */
  var getHeader: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var header: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var headerOverCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var headerPosition: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  
  /** [Method] Returns true if this component is visible
    * @param deep Object
    * @returns Boolean true if this component is visible, false otherwise.
    */
  @JSName("isVisible")
  var isVisible_IPanel: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Config Option] (Object/Object[]) */
  var lbar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var manageHeight: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var minButtonWidth: js.UndefOr[Double] = js.native
  
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_IPanel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
    * @param destroying Object
    */
  @JSName("onRemoved")
  var onRemoved_IPanel: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IPanel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var overlapHeader: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.Component/Object) */
  var placeholder: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var placeholderCollapseHideMode: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var preventHeader: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object/Object[]) */
  var rbar: js.UndefOr[js.Any] = js.native
  
  /** [Method]
    * @param border Object
    * @param targetEl Object
    */
  @JSName("setBorder")
  var setBorder_IPanel: js.UndefOr[
    js.Function2[/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Set the glyph for the panel s header
    * @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
    */
  var setGlyph: js.UndefOr[js.Function1[/* newGlyph */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Set the icon for the panel s header
    * @param newIcon String The new icon path
    */
  var setIcon: js.UndefOr[js.Function1[/* newIcon */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Set the iconCls for the panel s header
    * @param newIconCls String The new CSS class name
    */
  var setIconCls: js.UndefOr[js.Function1[/* newIconCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Set a title for the panel s header
    * @param newTitle String
    */
  var setTitle: js.UndefOr[js.Function1[/* newTitle */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the UI for the component
    * @param ui Object
    */
  @JSName("setUI")
  var setUI_IPanel: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var simpleDrag: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object/Object[]) */
  var tbar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.native
  
  /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
    * @returns Ext.panel.Panel this
    */
  var toggleCollapse: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Config Option] (Object[]/Ext.panel.Tool[]) */
  var tools: js.UndefOr[js.Any] = js.native
}
object IPanel {
  
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
    
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
    def setAddTool(value: /* tools */ js.UndefOr[js.Any] => Unit): Self = this.set("addTool", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddTool: Self = this.set("addTool", js.undefined)
    
    @scala.inline
    def setAfterCollapse(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = this.set("afterCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterCollapse: Self = this.set("afterCollapse", js.undefined)
    
    @scala.inline
    def setAfterExpand(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = this.set("afterExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterExpand: Self = this.set("afterExpand", js.undefined)
    
    @scala.inline
    def setAnimCollapse(value: Boolean): Self = this.set("animCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimCollapse: Self = this.set("animCollapse", js.undefined)
    
    @scala.inline
    def setBbar(value: js.Any): Self = this.set("bbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbar: Self = this.set("bbar", js.undefined)
    
    @scala.inline
    def setButtonAlign(value: String): Self = this.set("buttonAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonAlign: Self = this.set("buttonAlign", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Any): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseAction(value: String): Self = this.set("closeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseAction: Self = this.set("closeAction", js.undefined)
    
    @scala.inline
    def setCollapse(value: (/* direction */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean]) => IPanel): Self = this.set("collapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setCollapseDirection(value: String): Self = this.set("collapseDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseDirection: Self = this.set("collapseDirection", js.undefined)
    
    @scala.inline
    def setCollapseFirst(value: Boolean): Self = this.set("collapseFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseFirst: Self = this.set("collapseFirst", js.undefined)
    
    @scala.inline
    def setCollapseMode(value: String): Self = this.set("collapseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseMode: Self = this.set("collapseMode", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsedCls(value: String): Self = this.set("collapsedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedCls: Self = this.set("collapsedCls", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setConstrainHeader(value: Boolean): Self = this.set("constrainHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainHeader: Self = this.set("constrainHeader", js.undefined)
    
    @scala.inline
    def setConvertCollapseDir(value: /* collapseDir */ js.UndefOr[js.Any] => Unit): Self = this.set("convertCollapseDir", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConvertCollapseDir: Self = this.set("convertCollapseDir", js.undefined)
    
    @scala.inline
    def setDd(value: js.Any): Self = this.set("dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDd: Self = this.set("dd", js.undefined)
    
    @scala.inline
    def setExpand(value: /* animate */ js.UndefOr[Boolean] => IPanel): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setFbar(value: js.Any): Self = this.set("fbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFbar: Self = this.set("fbar", js.undefined)
    
    @scala.inline
    def setFloatable(value: Boolean): Self = this.set("floatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatable: Self = this.set("floatable", js.undefined)
    
    @scala.inline
    def setFrameHeader(value: Boolean): Self = this.set("frameHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameHeader: Self = this.set("frameHeader", js.undefined)
    
    @scala.inline
    def setGetCollapsed(value: () => _): Self = this.set("getCollapsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCollapsed: Self = this.set("getCollapsed", js.undefined)
    
    @scala.inline
    def setGetHeader(value: () => Unit): Self = this.set("getHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeader: Self = this.set("getHeader", js.undefined)
    
    @scala.inline
    def setGlyph(value: js.Any): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderOverCls(value: String): Self = this.set("headerOverCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderOverCls: Self = this.set("headerOverCls", js.undefined)
    
    @scala.inline
    def setHeaderPosition(value: String): Self = this.set("headerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderPosition: Self = this.set("headerPosition", js.undefined)
    
    @scala.inline
    def setHideCollapseTool(value: Boolean): Self = this.set("hideCollapseTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideCollapseTool: Self = this.set("hideCollapseTool", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconCls(value: String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    
    @scala.inline
    def setIsVisible(value: /* deep */ js.UndefOr[js.Any] => Boolean): Self = this.set("isVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    
    @scala.inline
    def setLbar(value: js.Any): Self = this.set("lbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLbar: Self = this.set("lbar", js.undefined)
    
    @scala.inline
    def setManageHeight(value: Boolean): Self = this.set("manageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManageHeight: Self = this.set("manageHeight", js.undefined)
    
    @scala.inline
    def setMinButtonWidth(value: Double): Self = this.set("minButtonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinButtonWidth: Self = this.set("minButtonWidth", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnRemoved(value: /* destroying */ js.UndefOr[js.Any] => Unit): Self = this.set("onRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemoved: Self = this.set("onRemoved", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOverlapHeader(value: Boolean): Self = this.set("overlapHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlapHeader: Self = this.set("overlapHeader", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: js.Any): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlaceholderCollapseHideMode(value: Double): Self = this.set("placeholderCollapseHideMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderCollapseHideMode: Self = this.set("placeholderCollapseHideMode", js.undefined)
    
    @scala.inline
    def setPreventHeader(value: Boolean): Self = this.set("preventHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventHeader: Self = this.set("preventHeader", js.undefined)
    
    @scala.inline
    def setRbar(value: js.Any): Self = this.set("rbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRbar: Self = this.set("rbar", js.undefined)
    
    @scala.inline
    def setSetBorder(value: (/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any]) => Unit): Self = this.set("setBorder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetBorder: Self = this.set("setBorder", js.undefined)
    
    @scala.inline
    def setSetGlyph(value: /* newGlyph */ js.UndefOr[js.Any] => Unit): Self = this.set("setGlyph", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGlyph: Self = this.set("setGlyph", js.undefined)
    
    @scala.inline
    def setSetIcon(value: /* newIcon */ js.UndefOr[String] => Unit): Self = this.set("setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    
    @scala.inline
    def setSetIconCls(value: /* newIconCls */ js.UndefOr[String] => Unit): Self = this.set("setIconCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIconCls: Self = this.set("setIconCls", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* newTitle */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    
    @scala.inline
    def setSetUI(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = this.set("setUI", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUI: Self = this.set("setUI", js.undefined)
    
    @scala.inline
    def setSimpleDrag(value: Boolean): Self = this.set("simpleDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleDrag: Self = this.set("simpleDrag", js.undefined)
    
    @scala.inline
    def setTbar(value: js.Any): Self = this.set("tbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTbar: Self = this.set("tbar", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleAlign(value: String): Self = this.set("titleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAlign: Self = this.set("titleAlign", js.undefined)
    
    @scala.inline
    def setTitleCollapse(value: Boolean): Self = this.set("titleCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleCollapse: Self = this.set("titleCollapse", js.undefined)
    
    @scala.inline
    def setToggleCollapse(value: () => IPanel): Self = this.set("toggleCollapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToggleCollapse: Self = this.set("toggleCollapse", js.undefined)
    
    @scala.inline
    def setTools(value: js.Any): Self = this.set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
}
