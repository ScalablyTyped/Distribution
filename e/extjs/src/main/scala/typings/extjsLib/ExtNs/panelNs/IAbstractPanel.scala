package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.containerNs.IDockingContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultDockWeights, addDocked, getDockedComponent, getDockedItems, insertDocked, onDockedAdd, onDockedRemove, removeDocked */ trait IAbstractPanel
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Method] Adds a CSS class to the body element
  		* @param cls String The class to add
  		* @returns Ext.panel.Panel this
  		*/
  var addBodyCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], IPanel]] = js.undefined
  /** [Method] Adds docked item s to the container
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		* @param pos Number The index at which the Component will be added
  		* @returns Ext.Component[] The added components.
  		*/
  var addDocked: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[scala.Double], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Ext.dom.Element) */
  var body: js.UndefOr[extjsLib.ExtNs.domNs.IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var bodyBorder: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var bodyCls: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var bodyPadding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object/Function) */
  var bodyStyle: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var defaultDockWeights: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var dockedItems: js.UndefOr[js.Any] = js.undefined
  /** [Method] Finds a docked component by id itemId or position
  		* @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
  		* @returns Ext.Component The docked component (if found)
  		*/
  var getDockedComponent: js.UndefOr[js.Function1[js.UndefOr[js.Any], extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Retrieves an array of all currently docked Components
  		* @param selector String A ComponentQuery selector string to filter the returned items.
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] The array of docked components meeting the specified criteria.
  		*/
  var getDockedItems: js.UndefOr[
    js.Function2[js.UndefOr[java.lang.String], js.UndefOr[scala.Boolean], extjsLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Inserts docked item s to the panel at the indicated position
  		* @param pos Number The index at which the Component will be inserted
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		*/
  var insertDocked: js.UndefOr[js.Function2[js.UndefOr[scala.Double], js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isPanel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Invoked after a docked item is added to the Panel
  		* @param component Ext.Component
  		*/
  var onDockedAdd: js.UndefOr[js.Function1[js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Invoked after a docked item is removed from the Panel
  		* @param component Ext.Component
  		*/
  var onDockedRemove: js.UndefOr[js.Function1[js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Removes a CSS class from the body element
  		* @param cls String The class to remove
  		* @returns Ext.panel.Panel this
  		*/
  var removeBodyCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], IPanel]] = js.undefined
  /** [Method] Removes the docked item from the panel
  		* @param item Ext.Component The Component to remove.
  		* @param autoDestroy Boolean Destroy the component after removal.
  		*/
  var removeDocked: js.UndefOr[
    js.Function2[js.UndefOr[extjsLib.ExtNs.IComponent], js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the body style according to the passed parameters
  		* @param style Mixed A full style specification string, or object, or the name of a style property to set.
  		* @param value String If the first param was a style property name, the style property value.
  		* @returns Ext.panel.Panel this
  		*/
  var setBodyStyle: js.UndefOr[
    js.Function2[/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], IPanel]
  ] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var shrinkWrapDock: js.UndefOr[js.Any] = js.undefined
}

object IAbstractPanel {
  @scala.inline
  def apply(
    IContainer: extjsLib.ExtNs.containerNs.IContainer = null,
    IDockingContainer: extjsLib.ExtNs.containerNs.IDockingContainer = null,
    addBodyCls: /* cls */ js.UndefOr[java.lang.String] => IPanel = null,
    addDocked: (/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[scala.Double]) => extjsLib.ExtNs.Array = null,
    addUIClsToElement: /* cls */ js.UndefOr[js.Any] => scala.Unit = null,
    baseCls: java.lang.String = null,
    body: extjsLib.ExtNs.domNs.IElement = null,
    bodyBorder: js.UndefOr[scala.Boolean] = js.undefined,
    bodyCls: js.Any = null,
    bodyPadding: js.Any = null,
    bodyStyle: js.Any = null,
    border: js.Any = null,
    componentLayout: js.Any = null,
    contentPaddingProperty: java.lang.String = null,
    dockedItems: js.Any = null,
    getComponent: /* comp */ js.UndefOr[js.Any] => extjsLib.ExtNs.IComponent = null,
    getDockedComponent: /* comp */ js.UndefOr[js.Any] => extjsLib.ExtNs.IComponent = null,
    getDockedItems: (/* selector */ js.UndefOr[java.lang.String], /* beforeBody */ js.UndefOr[scala.Boolean]) => extjsLib.ExtNs.Array = null,
    getRefItems: /* deep */ js.UndefOr[js.Any] => scala.Unit = null,
    insertDocked: (/* pos */ js.UndefOr[scala.Double], /* component */ js.UndefOr[js.Any]) => scala.Unit = null,
    isPanel: js.UndefOr[scala.Boolean] = js.undefined,
    onDockedAdd: /* component */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    onDockedRemove: /* component */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    removeBodyCls: /* cls */ js.UndefOr[java.lang.String] => IPanel = null,
    removeDocked: (/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], /* autoDestroy */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    removeUIClsFromElement: /* cls */ js.UndefOr[js.Any] => scala.Unit = null,
    renderTpl: js.Any = null,
    setBodyStyle: (/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => IPanel = null,
    shrinkWrapDock: js.Any = null
  ): IAbstractPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    js.Dynamic.global.Object.assign(__obj, IDockingContainer)
    if (addBodyCls != null) __obj.updateDynamic("addBodyCls")(js.Any.fromFunction1(addBodyCls))
    if (addDocked != null) __obj.updateDynamic("addDocked")(js.Any.fromFunction2(addDocked))
    if (addUIClsToElement != null) __obj.updateDynamic("addUIClsToElement")(js.Any.fromFunction1(addUIClsToElement))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(bodyBorder)) __obj.updateDynamic("bodyBorder")(bodyBorder)
    if (bodyCls != null) __obj.updateDynamic("bodyCls")(bodyCls)
    if (bodyPadding != null) __obj.updateDynamic("bodyPadding")(bodyPadding)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (border != null) __obj.updateDynamic("border")(border)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (contentPaddingProperty != null) __obj.updateDynamic("contentPaddingProperty")(contentPaddingProperty)
    if (dockedItems != null) __obj.updateDynamic("dockedItems")(dockedItems)
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction1(getComponent))
    if (getDockedComponent != null) __obj.updateDynamic("getDockedComponent")(js.Any.fromFunction1(getDockedComponent))
    if (getDockedItems != null) __obj.updateDynamic("getDockedItems")(js.Any.fromFunction2(getDockedItems))
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction1(getRefItems))
    if (insertDocked != null) __obj.updateDynamic("insertDocked")(js.Any.fromFunction2(insertDocked))
    if (!js.isUndefined(isPanel)) __obj.updateDynamic("isPanel")(isPanel)
    if (onDockedAdd != null) __obj.updateDynamic("onDockedAdd")(js.Any.fromFunction1(onDockedAdd))
    if (onDockedRemove != null) __obj.updateDynamic("onDockedRemove")(js.Any.fromFunction1(onDockedRemove))
    if (removeBodyCls != null) __obj.updateDynamic("removeBodyCls")(js.Any.fromFunction1(removeBodyCls))
    if (removeDocked != null) __obj.updateDynamic("removeDocked")(js.Any.fromFunction2(removeDocked))
    if (removeUIClsFromElement != null) __obj.updateDynamic("removeUIClsFromElement")(js.Any.fromFunction1(removeUIClsFromElement))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setBodyStyle != null) __obj.updateDynamic("setBodyStyle")(js.Any.fromFunction2(setBodyStyle))
    if (shrinkWrapDock != null) __obj.updateDynamic("shrinkWrapDock")(shrinkWrapDock)
    __obj.asInstanceOf[IAbstractPanel]
  }
}

