package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends IAbstractPanel {
  /** [Method] Add tools to this panel
  		* @param tools Object[]/Ext.panel.Tool[] The tools to add
  		*/
  var addTool: js.UndefOr[js.Function1[/* tools */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Collapsed
  		* @param animated Boolean
  		*/
  var afterCollapse: js.UndefOr[js.Function1[/* animated */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Expanded
  		* @param animated Boolean
  		*/
  var afterExpand: js.UndefOr[js.Function1[/* animated */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var animCollapse: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var bbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var buttonAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var buttons: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Closes the Panel  */
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
      /* animate */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var collapseDirection: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var collapseMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
  		* @param collapseDir Object
  		*/
  var convertCollapseDir: js.UndefOr[js.Function1[/* collapseDir */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Ext.dd.DragSource/Ext.util.ComponentDragger) */
  var dd: js.UndefOr[js.Any] = js.undefined
  /** [Method] Expands the panel body so that it becomes visible
  		* @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
  		* @returns Ext.panel.Panel this
  		*/
  var expand: js.UndefOr[js.Function1[/* animate */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var fbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var floatable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var frameHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the current collapsed state of the panel
  		* @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
  		*/
  var getCollapsed: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the Header for this panel  */
  var getHeader: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var header: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var headerOverCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var headerPosition: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns true if this component is visible
  		* @param deep Object
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  @JSName("isVisible")
  var isVisible_IPanel: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var lbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var manageHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var minButtonWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_IPanel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
  		* @param destroying Object
  		*/
  @JSName("onRemoved")
  var onRemoved_IPanel: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IPanel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var overlapHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.Component/Object) */
  var placeholder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var placeholderCollapseHideMode: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var preventHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var rbar: js.UndefOr[js.Any] = js.undefined
  /** [Method]
  		* @param border Object
  		* @param targetEl Object
  		*/
  @JSName("setBorder")
  var setBorder_IPanel: js.UndefOr[
    js.Function2[/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Set the glyph for the panel s header
  		* @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* newGlyph */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Set the icon for the panel s header
  		* @param newIcon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* newIcon */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set the iconCls for the panel s header
  		* @param newIconCls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* newIconCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set a title for the panel s header
  		* @param newTitle String
  		*/
  var setTitle: js.UndefOr[js.Function1[/* newTitle */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the UI for the component
  		* @param ui Object
  		*/
  @JSName("setUI")
  var setUI_IPanel: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var tbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
  		* @returns Ext.panel.Panel this
  		*/
  var toggleCollapse: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Object[]/Ext.panel.Tool[]) */
  var tools: js.UndefOr[js.Any] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IAbstractPanel: IAbstractPanel = null,
    addTool: /* tools */ js.UndefOr[js.Any] => scala.Unit = null,
    afterCollapse: /* animated */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    afterExpand: /* animated */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    animCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    bbar: js.Any = null,
    buttonAlign: java.lang.String = null,
    buttons: js.Any = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    close: () => scala.Unit = null,
    closeAction: java.lang.String = null,
    collapse: (/* direction */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[scala.Boolean]) => IPanel = null,
    collapseDirection: java.lang.String = null,
    collapseFirst: js.UndefOr[scala.Boolean] = js.undefined,
    collapseMode: java.lang.String = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedCls: java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    constrain: js.UndefOr[scala.Boolean] = js.undefined,
    constrainHeader: js.UndefOr[scala.Boolean] = js.undefined,
    convertCollapseDir: /* collapseDir */ js.UndefOr[js.Any] => scala.Unit = null,
    dd: js.Any = null,
    dockedItems: js.Any = null,
    expand: /* animate */ js.UndefOr[scala.Boolean] => IPanel = null,
    fbar: js.Any = null,
    floatable: js.UndefOr[scala.Boolean] = js.undefined,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    frameHeader: js.UndefOr[scala.Boolean] = js.undefined,
    getCollapsed: () => _ = null,
    getHeader: () => scala.Unit = null,
    getState: () => _ = null,
    glyph: js.Any = null,
    header: js.Any = null,
    headerOverCls: java.lang.String = null,
    headerPosition: java.lang.String = null,
    hideCollapseTool: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    isLayoutRoot: () => scala.Unit = null,
    isVisible: /* deep */ js.UndefOr[js.Any] => scala.Boolean = null,
    lbar: js.Any = null,
    manageHeight: js.UndefOr[scala.Boolean] = js.undefined,
    minButtonWidth: scala.Int | scala.Double = null,
    onHide: () => scala.Unit = null,
    onRemoved: /* destroying */ js.UndefOr[js.Any] => scala.Unit = null,
    onShow: () => scala.Unit = null,
    overlapHeader: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: js.Any = null,
    placeholderCollapseHideMode: scala.Int | scala.Double = null,
    preventHeader: js.UndefOr[scala.Boolean] = js.undefined,
    rbar: js.Any = null,
    setBorder: (/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any]) => scala.Unit = null,
    setGlyph: /* newGlyph */ js.UndefOr[js.Any] => scala.Unit = null,
    setIcon: /* newIcon */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setIconCls: /* newIconCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setTitle: /* newTitle */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setUI: /* ui */ js.UndefOr[js.Any] => scala.Unit = null,
    simpleDrag: js.UndefOr[scala.Boolean] = js.undefined,
    tbar: js.Any = null,
    title: java.lang.String = null,
    titleAlign: java.lang.String = null,
    titleCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    toggleCollapse: () => IPanel = null,
    tools: js.Any = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractPanel)
    if (addTool != null) __obj.updateDynamic("addTool")(js.Any.fromFunction1(addTool))
    if (afterCollapse != null) __obj.updateDynamic("afterCollapse")(js.Any.fromFunction1(afterCollapse))
    if (afterExpand != null) __obj.updateDynamic("afterExpand")(js.Any.fromFunction1(afterExpand))
    if (!js.isUndefined(animCollapse)) __obj.updateDynamic("animCollapse")(animCollapse)
    if (bbar != null) __obj.updateDynamic("bbar")(bbar)
    if (buttonAlign != null) __obj.updateDynamic("buttonAlign")(buttonAlign)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (closeAction != null) __obj.updateDynamic("closeAction")(closeAction)
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2(collapse))
    if (collapseDirection != null) __obj.updateDynamic("collapseDirection")(collapseDirection)
    if (!js.isUndefined(collapseFirst)) __obj.updateDynamic("collapseFirst")(collapseFirst)
    if (collapseMode != null) __obj.updateDynamic("collapseMode")(collapseMode)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedCls != null) __obj.updateDynamic("collapsedCls")(collapsedCls)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (!js.isUndefined(constrainHeader)) __obj.updateDynamic("constrainHeader")(constrainHeader)
    if (convertCollapseDir != null) __obj.updateDynamic("convertCollapseDir")(js.Any.fromFunction1(convertCollapseDir))
    if (dd != null) __obj.updateDynamic("dd")(dd)
    if (dockedItems != null) __obj.updateDynamic("dockedItems")(dockedItems)
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (fbar != null) __obj.updateDynamic("fbar")(fbar)
    if (!js.isUndefined(floatable)) __obj.updateDynamic("floatable")(floatable)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(frameHeader)) __obj.updateDynamic("frameHeader")(frameHeader)
    if (getCollapsed != null) __obj.updateDynamic("getCollapsed")(js.Any.fromFunction0(getCollapsed))
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction0(getHeader))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerOverCls != null) __obj.updateDynamic("headerOverCls")(headerOverCls)
    if (headerPosition != null) __obj.updateDynamic("headerPosition")(headerPosition)
    if (!js.isUndefined(hideCollapseTool)) __obj.updateDynamic("hideCollapseTool")(hideCollapseTool)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (isLayoutRoot != null) __obj.updateDynamic("isLayoutRoot")(js.Any.fromFunction0(isLayoutRoot))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction1(isVisible))
    if (lbar != null) __obj.updateDynamic("lbar")(lbar)
    if (!js.isUndefined(manageHeight)) __obj.updateDynamic("manageHeight")(manageHeight)
    if (minButtonWidth != null) __obj.updateDynamic("minButtonWidth")(minButtonWidth.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction1(onRemoved))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(overlapHeader)) __obj.updateDynamic("overlapHeader")(overlapHeader)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderCollapseHideMode != null) __obj.updateDynamic("placeholderCollapseHideMode")(placeholderCollapseHideMode.asInstanceOf[js.Any])
    if (!js.isUndefined(preventHeader)) __obj.updateDynamic("preventHeader")(preventHeader)
    if (rbar != null) __obj.updateDynamic("rbar")(rbar)
    if (setBorder != null) __obj.updateDynamic("setBorder")(js.Any.fromFunction2(setBorder))
    if (setGlyph != null) __obj.updateDynamic("setGlyph")(js.Any.fromFunction1(setGlyph))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setUI != null) __obj.updateDynamic("setUI")(js.Any.fromFunction1(setUI))
    if (!js.isUndefined(simpleDrag)) __obj.updateDynamic("simpleDrag")(simpleDrag)
    if (tbar != null) __obj.updateDynamic("tbar")(tbar)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (!js.isUndefined(titleCollapse)) __obj.updateDynamic("titleCollapse")(titleCollapse)
    if (toggleCollapse != null) __obj.updateDynamic("toggleCollapse")(js.Any.fromFunction0(toggleCollapse))
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[IPanel]
  }
}

