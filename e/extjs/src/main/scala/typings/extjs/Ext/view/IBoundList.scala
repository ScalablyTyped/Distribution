package typings.extjs.Ext.view

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.toolbar.IPaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IBoundList extends IView {
  /** [Method] Changes the data store bound to this view and refreshes it
  		* @param store Object
  		* @param initial Object
  		*/
  @JSName("bindStore")
  var bindStore_IBoundList: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] A method that returns the inner template for displaying items in the list
  		* @param displayField String The displayField for the BoundList.
  		* @returns String The inner template
  		*/
  var getInnerTpl: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** [Property] (Ext.toolbar.Paging) */
  var pagingToolbar: js.UndefOr[IPaging] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.undefined
}

object IBoundList {
  @scala.inline
  def apply(
    IView: IView = null,
    bindStore: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit = null,
    child: js.UndefOr[js.Any] => _ = null,
    displayField: java.lang.String = null,
    down: js.UndefOr[js.Any] => _ = null,
    getInnerTpl: /* displayField */ js.UndefOr[java.lang.String] => java.lang.String = null,
    pageSize: Int | Double = null,
    pagingToolbar: IPaging = null,
    query: js.UndefOr[java.lang.String] => Array = null,
    queryBy: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array = null,
    queryById: js.UndefOr[java.lang.String] => IComponent = null
  ): IBoundList = {
    val __obj = js.Dynamic.literal()
    if (IView != null) js.Dynamic.global.Object.assign(__obj, IView)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction2(bindStore))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1(child))
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (getInnerTpl != null) __obj.updateDynamic("getInnerTpl")(js.Any.fromFunction1(getInnerTpl))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pagingToolbar != null) __obj.updateDynamic("pagingToolbar")(pagingToolbar.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (queryById != null) __obj.updateDynamic("queryById")(js.Any.fromFunction1(queryById))
    __obj.asInstanceOf[IBoundList]
  }
}

