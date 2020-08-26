package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryable extends IBase {
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.native
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  var queryBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  var queryById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IComponent]] = js.native
}

object IQueryable {
  @scala.inline
  def apply(): IQueryable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryable]
  }
  @scala.inline
  implicit class IQueryableOps[Self <: IQueryable] (val x: Self) extends AnyVal {
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
    def setChild(value: /* selector */ js.UndefOr[js.Any] => _): Self = this.set("child", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setDown(value: /* selector */ js.UndefOr[js.Any] => _): Self = this.set("down", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = this.set("query", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Array): Self = this.set("queryBy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteQueryBy: Self = this.set("queryBy", js.undefined)
    @scala.inline
    def setQueryById(value: /* id */ js.UndefOr[java.lang.String] => IComponent): Self = this.set("queryById", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryById: Self = this.set("queryById", js.undefined)
  }
  
}

