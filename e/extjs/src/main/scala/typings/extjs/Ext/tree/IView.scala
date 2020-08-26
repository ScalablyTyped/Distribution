package typings.extjs.Ext.tree

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IView: js.UndefOr[Boolean] = js.native
  /** [Method] Collapses a record that is loaded in the view
    * @param record Ext.data.Model The record to collapse
    * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
    * @param callback Function The function to run after the collapse is completed
    * @param scope Object The scope of the callback function.
    */
  var collapse: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Expands a record that is loaded in the view
    * @param record Ext.data.Model The record to expand
    * @param deep Boolean True to expand nodes all the way down the tree hierarchy.
    * @param callback Function The function to run after the expand is completed
    * @param scope Object The scope of the callback function.
    */
  var expand: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  @JSName("getStoreListeners")
  var getStoreListeners_IView: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the base TreeStore from the bound TreePanel  */
  var getTreeStore: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isTreeView: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  @JSName("loadMask")
  var loadMask_IView: js.UndefOr[Boolean] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance  */
  @JSName("onBindStore")
  var onBindStore_IView: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance  */
  @JSName("onUnbindStore")
  var onUnbindStore_IView: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
  /** [Method] Toggles a record between expanded and collapsed
    * @param record Ext.data.Model
    * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
    * @param callback Function The function to run after the expand/collapse is completed
    * @param scope Object The scope of the callback function.
    */
  var toggle: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IView {
  @scala.inline
  def apply(): IView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setCollapse(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("collapse", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setExpand(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("expand", js.Any.fromFunction4(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setGetStoreListeners(value: () => _): Self = this.set("getStoreListeners", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStoreListeners: Self = this.set("getStoreListeners", js.undefined)
    @scala.inline
    def setGetTreeStore(value: () => Unit): Self = this.set("getTreeStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTreeStore: Self = this.set("getTreeStore", js.undefined)
    @scala.inline
    def setIsTreeView(value: Boolean): Self = this.set("isTreeView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTreeView: Self = this.set("isTreeView", js.undefined)
    @scala.inline
    def setLoadMask(value: Boolean): Self = this.set("loadMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMask: Self = this.set("loadMask", js.undefined)
    @scala.inline
    def setOnBindStore(value: () => Unit): Self = this.set("onBindStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    @scala.inline
    def setOnUnbindStore(value: () => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    @scala.inline
    def setRootVisible(value: Boolean): Self = this.set("rootVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootVisible: Self = this.set("rootVisible", js.undefined)
    @scala.inline
    def setToggle(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("toggle", js.Any.fromFunction4(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

