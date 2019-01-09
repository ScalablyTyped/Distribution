package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel
  extends extjsLib.ExtNs.panelNs.IAbstractPanel {
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

