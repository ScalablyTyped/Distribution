package typings.extjs.Ext.panel

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.container.IDockingContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultDockWeights, addDocked, getDockedComponent, getDockedItems, insertDocked, onDockedAdd, onDockedRemove, removeDocked */ trait IAbstractPanel
  extends typings.extjs.Ext.container.IContainer {
  /** [Method] Adds a CSS class to the body element
  		* @param cls String The class to add
  		* @returns Ext.panel.Panel this
  		*/
  var addBodyCls: js.UndefOr[
    js.Function1[/* cls */ js.UndefOr[java.lang.String], typings.extjs.Ext.panel.IPanel]
  ] = js.undefined
  /** [Method] Adds docked item s to the container
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		* @param pos Number The index at which the Component will be added
  		* @returns Ext.Component[] The added components.
  		*/
  var addDocked: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Double], Array]] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Ext.dom.Element) */
  var body: js.UndefOr[typings.extjs.Ext.dom.IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var bodyBorder: js.UndefOr[Boolean] = js.undefined
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
  var getDockedComponent: js.UndefOr[js.Function1[js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Retrieves an array of all currently docked Components
  		* @param selector String A ComponentQuery selector string to filter the returned items.
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] The array of docked components meeting the specified criteria.
  		*/
  var getDockedItems: js.UndefOr[js.Function2[js.UndefOr[java.lang.String], js.UndefOr[Boolean], Array]] = js.undefined
  /** [Method] Inserts docked item s to the panel at the indicated position
  		* @param pos Number The index at which the Component will be inserted
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		*/
  var insertDocked: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isPanel: js.UndefOr[Boolean] = js.undefined
  /** [Method] Invoked after a docked item is added to the Panel
  		* @param component Ext.Component
  		*/
  var onDockedAdd: js.UndefOr[js.Function1[js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Invoked after a docked item is removed from the Panel
  		* @param component Ext.Component
  		*/
  var onDockedRemove: js.UndefOr[js.Function1[js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Removes a CSS class from the body element
  		* @param cls String The class to remove
  		* @returns Ext.panel.Panel this
  		*/
  var removeBodyCls: js.UndefOr[
    js.Function1[/* cls */ js.UndefOr[java.lang.String], typings.extjs.Ext.panel.IPanel]
  ] = js.undefined
  /** [Method] Removes the docked item from the panel
  		* @param item Ext.Component The Component to remove.
  		* @param autoDestroy Boolean Destroy the component after removal.
  		*/
  var removeDocked: js.UndefOr[js.Function2[js.UndefOr[IComponent], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the body style according to the passed parameters
  		* @param style Mixed A full style specification string, or object, or the name of a style property to set.
  		* @param value String If the first param was a style property name, the style property value.
  		* @returns Ext.panel.Panel this
  		*/
  var setBodyStyle: js.UndefOr[
    js.Function2[
      /* style */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      typings.extjs.Ext.panel.IPanel
    ]
  ] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var shrinkWrapDock: js.UndefOr[js.Any] = js.undefined
}

object IAbstractPanel {
  @scala.inline
  def apply(
    IContainer: typings.extjs.Ext.container.IContainer = null,
    addBodyCls: /* cls */ js.UndefOr[java.lang.String] => typings.extjs.Ext.panel.IPanel = null,
    addDocked: (js.UndefOr[js.Any], js.UndefOr[Double]) => Array = null,
    addUIClsToElement: /* cls */ js.UndefOr[js.Any] => Unit = null,
    body: typings.extjs.Ext.dom.IElement = null,
    bodyBorder: js.UndefOr[Boolean] = js.undefined,
    bodyCls: js.Any = null,
    bodyPadding: js.Any = null,
    bodyStyle: js.Any = null,
    defaultDockWeights: js.Any = null,
    dockedItems: js.Any = null,
    getDockedComponent: js.UndefOr[js.Any] => IComponent = null,
    getDockedItems: (js.UndefOr[java.lang.String], js.UndefOr[Boolean]) => Array = null,
    insertDocked: (js.UndefOr[Double], js.UndefOr[js.Any]) => Unit = null,
    isPanel: js.UndefOr[Boolean] = js.undefined,
    onDockedAdd: js.UndefOr[IComponent] => Unit = null,
    onDockedRemove: js.UndefOr[IComponent] => Unit = null,
    removeBodyCls: /* cls */ js.UndefOr[java.lang.String] => typings.extjs.Ext.panel.IPanel = null,
    removeDocked: (js.UndefOr[IComponent], js.UndefOr[Boolean]) => Unit = null,
    removeUIClsFromElement: /* cls */ js.UndefOr[js.Any] => Unit = null,
    setBodyStyle: (/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.panel.IPanel = null,
    shrinkWrapDock: js.Any = null
  ): IAbstractPanel = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (addBodyCls != null) __obj.updateDynamic("addBodyCls")(js.Any.fromFunction1(addBodyCls))
    if (addDocked != null) __obj.updateDynamic("addDocked")(js.Any.fromFunction2(addDocked))
    if (addUIClsToElement != null) __obj.updateDynamic("addUIClsToElement")(js.Any.fromFunction1(addUIClsToElement))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyBorder)) __obj.updateDynamic("bodyBorder")(bodyBorder.asInstanceOf[js.Any])
    if (bodyCls != null) __obj.updateDynamic("bodyCls")(bodyCls.asInstanceOf[js.Any])
    if (bodyPadding != null) __obj.updateDynamic("bodyPadding")(bodyPadding.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (defaultDockWeights != null) __obj.updateDynamic("defaultDockWeights")(defaultDockWeights.asInstanceOf[js.Any])
    if (dockedItems != null) __obj.updateDynamic("dockedItems")(dockedItems.asInstanceOf[js.Any])
    if (getDockedComponent != null) __obj.updateDynamic("getDockedComponent")(js.Any.fromFunction1(getDockedComponent))
    if (getDockedItems != null) __obj.updateDynamic("getDockedItems")(js.Any.fromFunction2(getDockedItems))
    if (insertDocked != null) __obj.updateDynamic("insertDocked")(js.Any.fromFunction2(insertDocked))
    if (!js.isUndefined(isPanel)) __obj.updateDynamic("isPanel")(isPanel.asInstanceOf[js.Any])
    if (onDockedAdd != null) __obj.updateDynamic("onDockedAdd")(js.Any.fromFunction1(onDockedAdd))
    if (onDockedRemove != null) __obj.updateDynamic("onDockedRemove")(js.Any.fromFunction1(onDockedRemove))
    if (removeBodyCls != null) __obj.updateDynamic("removeBodyCls")(js.Any.fromFunction1(removeBodyCls))
    if (removeDocked != null) __obj.updateDynamic("removeDocked")(js.Any.fromFunction2(removeDocked))
    if (removeUIClsFromElement != null) __obj.updateDynamic("removeUIClsFromElement")(js.Any.fromFunction1(removeUIClsFromElement))
    if (setBodyStyle != null) __obj.updateDynamic("setBodyStyle")(js.Any.fromFunction2(setBodyStyle))
    if (shrinkWrapDock != null) __obj.updateDynamic("shrinkWrapDock")(shrinkWrapDock.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractPanel]
  }
}

