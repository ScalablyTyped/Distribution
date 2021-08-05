package typings.extjs.Ext

import typings.extjs.Ext.panel.IAbstractPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanel
  extends StObject
     with IAbstractPanel {
  
  /** [Method] Add tools to this panel
    * @param tools Object[]/Ext.panel.Tool[] The tools to add
    */
  var addTool: js.UndefOr[js.Function1[/* tools */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Invoked after the Panel is Collapsed
    * @param animated Boolean
    */
  var afterCollapse: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Invoked after the Panel is Expanded
    * @param animated Boolean
    */
  var afterExpand: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var animCollapse: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object/Object[]) */
  var bbar: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var buttonAlign: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Object/Object[]) */
  var buttons: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Closes the Panel  */
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var closeAction: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Collapses the panel body so that the body becomes hidden
    * @param direction String The direction to collapse towards. Must be one of  Ext.Component.DIRECTION_TOP Ext.Component.DIRECTION_RIGHT Ext.Component.DIRECTION_BOTTOM Ext.Component.DIRECTION_LEFT Defaults to collapseDirection.
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  var collapse: js.UndefOr[
    js.Function2[
      /* direction */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var collapseDirection: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var collapseMode: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrainHeader: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
    * @param collapseDir Object
    */
  var convertCollapseDir: js.UndefOr[js.Function1[/* collapseDir */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Property] (Ext.dd.DragSource/Ext.util.ComponentDragger) */
  var dd: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Expands the panel body so that it becomes visible
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  var expand: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
  
  /** [Config Option] (Object/Object[]) */
  var fbar: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var floatable: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var frameHeader: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the current collapsed state of the panel
    * @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
    */
  var getCollapsed: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Gets the Header for this panel  */
  var getHeader: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] The supplied default state gathering method for the AbstractComponent class
    * @returns Object
    */
  @JSName("getState")
  var getState_IPanel: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var header: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var headerOverCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var headerPosition: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns true if this component is visible
    * @param deep Object
    * @returns Boolean true if this component is visible, false otherwise.
    */
  @JSName("isVisible")
  var isVisible_IPanel: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Boolean]] = js.undefined
  
  /** [Config Option] (Object/Object[]) */
  var lbar: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var manageHeight: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var minButtonWidth: js.UndefOr[Double] = js.undefined
  
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_IPanel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
    * @param destroying Object
    */
  @JSName("onRemoved")
  var onRemoved_IPanel: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IPanel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var overlapHeader: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.Component/Object) */
  var placeholder: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Number) */
  var placeholderCollapseHideMode: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preventHeader: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object/Object[]) */
  var rbar: js.UndefOr[js.Any] = js.undefined
  
  /** [Method]
    * @param border Object
    * @param targetEl Object
    */
  @JSName("setBorder")
  var setBorder_IPanel: js.UndefOr[
    js.Function2[/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Set the glyph for the panel s header
    * @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
    */
  var setGlyph: js.UndefOr[js.Function1[/* newGlyph */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Set the icon for the panel s header
    * @param newIcon String The new icon path
    */
  var setIcon: js.UndefOr[js.Function1[/* newIcon */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Set the iconCls for the panel s header
    * @param newIconCls String The new CSS class name
    */
  var setIconCls: js.UndefOr[js.Function1[/* newIconCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Set a title for the panel s header
    * @param newTitle String
    */
  var setTitle: js.UndefOr[js.Function1[/* newTitle */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the UI for the component
    * @param ui Object
    */
  @JSName("setUI")
  var setUI_IPanel: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var simpleDrag: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object/Object[]) */
  var tbar: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
    * @returns Ext.panel.Panel this
    */
  var toggleCollapse: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Object[]/Ext.panel.Tool[]) */
  var tools: js.UndefOr[js.Any] = js.undefined
}
object IPanel {
  
  inline def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  
  extension [Self <: IPanel](x: Self) {
    
    inline def setAddTool(value: /* tools */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addTool", js.Any.fromFunction1(value))
    
    inline def setAddToolUndefined: Self = StObject.set(x, "addTool", js.undefined)
    
    inline def setAfterCollapse(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "afterCollapse", js.Any.fromFunction1(value))
    
    inline def setAfterCollapseUndefined: Self = StObject.set(x, "afterCollapse", js.undefined)
    
    inline def setAfterExpand(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "afterExpand", js.Any.fromFunction1(value))
    
    inline def setAfterExpandUndefined: Self = StObject.set(x, "afterExpand", js.undefined)
    
    inline def setAnimCollapse(value: Boolean): Self = StObject.set(x, "animCollapse", value.asInstanceOf[js.Any])
    
    inline def setAnimCollapseUndefined: Self = StObject.set(x, "animCollapse", js.undefined)
    
    inline def setBbar(value: js.Any): Self = StObject.set(x, "bbar", value.asInstanceOf[js.Any])
    
    inline def setBbarUndefined: Self = StObject.set(x, "bbar", js.undefined)
    
    inline def setButtonAlign(value: java.lang.String): Self = StObject.set(x, "buttonAlign", value.asInstanceOf[js.Any])
    
    inline def setButtonAlignUndefined: Self = StObject.set(x, "buttonAlign", js.undefined)
    
    inline def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCloseAction(value: java.lang.String): Self = StObject.set(x, "closeAction", value.asInstanceOf[js.Any])
    
    inline def setCloseActionUndefined: Self = StObject.set(x, "closeAction", js.undefined)
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCollapse(value: (/* direction */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[Boolean]) => IPanel): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
    
    inline def setCollapseDirection(value: java.lang.String): Self = StObject.set(x, "collapseDirection", value.asInstanceOf[js.Any])
    
    inline def setCollapseDirectionUndefined: Self = StObject.set(x, "collapseDirection", js.undefined)
    
    inline def setCollapseFirst(value: Boolean): Self = StObject.set(x, "collapseFirst", value.asInstanceOf[js.Any])
    
    inline def setCollapseFirstUndefined: Self = StObject.set(x, "collapseFirst", js.undefined)
    
    inline def setCollapseMode(value: java.lang.String): Self = StObject.set(x, "collapseMode", value.asInstanceOf[js.Any])
    
    inline def setCollapseModeUndefined: Self = StObject.set(x, "collapseMode", js.undefined)
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedCls(value: java.lang.String): Self = StObject.set(x, "collapsedCls", value.asInstanceOf[js.Any])
    
    inline def setCollapsedClsUndefined: Self = StObject.set(x, "collapsedCls", js.undefined)
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setConstrainHeader(value: Boolean): Self = StObject.set(x, "constrainHeader", value.asInstanceOf[js.Any])
    
    inline def setConstrainHeaderUndefined: Self = StObject.set(x, "constrainHeader", js.undefined)
    
    inline def setConvertCollapseDir(value: /* collapseDir */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "convertCollapseDir", js.Any.fromFunction1(value))
    
    inline def setConvertCollapseDirUndefined: Self = StObject.set(x, "convertCollapseDir", js.undefined)
    
    inline def setDd(value: js.Any): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
    
    inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
    
    inline def setExpand(value: /* animate */ js.UndefOr[Boolean] => IPanel): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFbar(value: js.Any): Self = StObject.set(x, "fbar", value.asInstanceOf[js.Any])
    
    inline def setFbarUndefined: Self = StObject.set(x, "fbar", js.undefined)
    
    inline def setFloatable(value: Boolean): Self = StObject.set(x, "floatable", value.asInstanceOf[js.Any])
    
    inline def setFloatableUndefined: Self = StObject.set(x, "floatable", js.undefined)
    
    inline def setFrameHeader(value: Boolean): Self = StObject.set(x, "frameHeader", value.asInstanceOf[js.Any])
    
    inline def setFrameHeaderUndefined: Self = StObject.set(x, "frameHeader", js.undefined)
    
    inline def setGetCollapsed(value: () => js.Any): Self = StObject.set(x, "getCollapsed", js.Any.fromFunction0(value))
    
    inline def setGetCollapsedUndefined: Self = StObject.set(x, "getCollapsed", js.undefined)
    
    inline def setGetHeader(value: () => Unit): Self = StObject.set(x, "getHeader", js.Any.fromFunction0(value))
    
    inline def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
    
    inline def setGetState(value: () => js.Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
    
    inline def setGlyph(value: js.Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderOverCls(value: java.lang.String): Self = StObject.set(x, "headerOverCls", value.asInstanceOf[js.Any])
    
    inline def setHeaderOverClsUndefined: Self = StObject.set(x, "headerOverCls", js.undefined)
    
    inline def setHeaderPosition(value: java.lang.String): Self = StObject.set(x, "headerPosition", value.asInstanceOf[js.Any])
    
    inline def setHeaderPositionUndefined: Self = StObject.set(x, "headerPosition", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHideCollapseTool(value: Boolean): Self = StObject.set(x, "hideCollapseTool", value.asInstanceOf[js.Any])
    
    inline def setHideCollapseToolUndefined: Self = StObject.set(x, "hideCollapseTool", js.undefined)
    
    inline def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    inline def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIsVisible(value: /* deep */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setLbar(value: js.Any): Self = StObject.set(x, "lbar", value.asInstanceOf[js.Any])
    
    inline def setLbarUndefined: Self = StObject.set(x, "lbar", js.undefined)
    
    inline def setManageHeight(value: Boolean): Self = StObject.set(x, "manageHeight", value.asInstanceOf[js.Any])
    
    inline def setManageHeightUndefined: Self = StObject.set(x, "manageHeight", js.undefined)
    
    inline def setMinButtonWidth(value: Double): Self = StObject.set(x, "minButtonWidth", value.asInstanceOf[js.Any])
    
    inline def setMinButtonWidthUndefined: Self = StObject.set(x, "minButtonWidth", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnRemoved(value: /* destroying */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onRemoved", js.Any.fromFunction1(value))
    
    inline def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOverlapHeader(value: Boolean): Self = StObject.set(x, "overlapHeader", value.asInstanceOf[js.Any])
    
    inline def setOverlapHeaderUndefined: Self = StObject.set(x, "overlapHeader", js.undefined)
    
    inline def setPlaceholder(value: js.Any): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderCollapseHideMode(value: Double): Self = StObject.set(x, "placeholderCollapseHideMode", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderCollapseHideModeUndefined: Self = StObject.set(x, "placeholderCollapseHideMode", js.undefined)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPreventHeader(value: Boolean): Self = StObject.set(x, "preventHeader", value.asInstanceOf[js.Any])
    
    inline def setPreventHeaderUndefined: Self = StObject.set(x, "preventHeader", js.undefined)
    
    inline def setRbar(value: js.Any): Self = StObject.set(x, "rbar", value.asInstanceOf[js.Any])
    
    inline def setRbarUndefined: Self = StObject.set(x, "rbar", js.undefined)
    
    inline def setSetBorder(value: (/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setBorder", js.Any.fromFunction2(value))
    
    inline def setSetBorderUndefined: Self = StObject.set(x, "setBorder", js.undefined)
    
    inline def setSetGlyph(value: /* newGlyph */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setGlyph", js.Any.fromFunction1(value))
    
    inline def setSetGlyphUndefined: Self = StObject.set(x, "setGlyph", js.undefined)
    
    inline def setSetIcon(value: /* newIcon */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    inline def setSetIconCls(value: /* newIconCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
    
    inline def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
    
    inline def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
    
    inline def setSetTitle(value: /* newTitle */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setSetUI(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUI", js.Any.fromFunction1(value))
    
    inline def setSetUIUndefined: Self = StObject.set(x, "setUI", js.undefined)
    
    inline def setSimpleDrag(value: Boolean): Self = StObject.set(x, "simpleDrag", value.asInstanceOf[js.Any])
    
    inline def setSimpleDragUndefined: Self = StObject.set(x, "simpleDrag", js.undefined)
    
    inline def setTbar(value: js.Any): Self = StObject.set(x, "tbar", value.asInstanceOf[js.Any])
    
    inline def setTbarUndefined: Self = StObject.set(x, "tbar", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAlign(value: java.lang.String): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleCollapse(value: Boolean): Self = StObject.set(x, "titleCollapse", value.asInstanceOf[js.Any])
    
    inline def setTitleCollapseUndefined: Self = StObject.set(x, "titleCollapse", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToggleCollapse(value: () => IPanel): Self = StObject.set(x, "toggleCollapse", js.Any.fromFunction0(value))
    
    inline def setToggleCollapseUndefined: Self = StObject.set(x, "toggleCollapse", js.undefined)
    
    inline def setTools(value: js.Any): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
