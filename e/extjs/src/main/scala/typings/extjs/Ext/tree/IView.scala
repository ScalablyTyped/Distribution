package typings.extjs.Ext.tree

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IView: js.UndefOr[Boolean] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  @JSName("getStoreListeners")
  var getStoreListeners_IView: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the base TreeStore from the bound TreePanel  */
  var getTreeStore: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isTreeView: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("loadMask")
  var loadMask_IView: js.UndefOr[Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance  */
  @JSName("onBindStore")
  var onBindStore_IView: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance  */
  @JSName("onUnbindStore")
  var onUnbindStore_IView: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.undefined
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
  ] = js.undefined
}

object IView {
  @scala.inline
  def apply(
    ITable: ITable = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    collapse: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    expand: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    getStoreListeners: () => _ = null,
    getTreeStore: () => Unit = null,
    isTreeView: js.UndefOr[Boolean] = js.undefined,
    loadMask: js.UndefOr[Boolean] = js.undefined,
    onBindStore: () => Unit = null,
    onUnbindStore: () => Unit = null,
    rootVisible: js.UndefOr[Boolean] = js.undefined,
    toggle: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null
  ): IView = {
    val __obj = js.Dynamic.literal()
    if (ITable != null) js.Dynamic.global.Object.assign(__obj, ITable)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction4(collapse))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction4(expand))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction0(getStoreListeners))
    if (getTreeStore != null) __obj.updateDynamic("getTreeStore")(js.Any.fromFunction0(getTreeStore))
    if (!js.isUndefined(isTreeView)) __obj.updateDynamic("isTreeView")(isTreeView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadMask)) __obj.updateDynamic("loadMask")(loadMask.get.asInstanceOf[js.Any])
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction0(onBindStore))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction0(onUnbindStore))
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible.get.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction4(toggle))
    __obj.asInstanceOf[IView]
  }
}

