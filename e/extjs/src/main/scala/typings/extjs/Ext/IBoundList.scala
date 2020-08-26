package typings.extjs.Ext

import typings.extjs.Ext.toolbar.IPaging
import typings.extjs.Ext.view.IView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait IBoundList extends IView {
  /** [Method] Changes the data store bound to this view and refreshes it
    * @param store Object
    * @param initial Object
    */
  @JSName("bindStore")
  var bindStore_IBoundList: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] A method that returns the inner template for displaying items in the list
    * @param displayField String The displayField for the BoundList.
    * @returns String The inner template
    */
  var getInnerTpl: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], java.lang.String]] = js.native
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  /** [Property] (Ext.toolbar.Paging) */
  var pagingToolbar: js.UndefOr[IPaging] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.native
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.native
}

object IBoundList {
  @scala.inline
  def apply(): IBoundList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundList]
  }
  @scala.inline
  implicit class IBoundListOps[Self <: IBoundList] (val x: Self) extends AnyVal {
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
    def setBindStore(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = this.set("bindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setChild(value: js.UndefOr[js.Any] => _): Self = this.set("child", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setDisplayField(value: java.lang.String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    @scala.inline
    def setDown(value: js.UndefOr[js.Any] => _): Self = this.set("down", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setGetInnerTpl(value: /* displayField */ js.UndefOr[java.lang.String] => java.lang.String): Self = this.set("getInnerTpl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetInnerTpl: Self = this.set("getInnerTpl", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPagingToolbar(value: IPaging): Self = this.set("pagingToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagingToolbar: Self = this.set("pagingToolbar", js.undefined)
    @scala.inline
    def setQuery(value: js.UndefOr[java.lang.String] => Array): Self = this.set("query", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = this.set("queryBy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteQueryBy: Self = this.set("queryBy", js.undefined)
    @scala.inline
    def setQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = this.set("queryById", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryById: Self = this.set("queryById", js.undefined)
  }
  
}

