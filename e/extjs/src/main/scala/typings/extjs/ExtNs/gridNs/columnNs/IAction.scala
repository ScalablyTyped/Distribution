package typings.extjs.ExtNs.gridNs.columnNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction
  extends typings.extjs.ExtNs.gridNs.columnNs.IColumn {
  /** [Config Option] (String) */
  var altText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
  		* @param fn Object
  		* @param scope Object
  		* @returns Ext.Container this
  		*/
  @JSName("cascade")
  var cascade_IAction: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IContainer]
  ] = js.undefined
  /** [Method] Renderer closure iterates through items creating an element for each and tagging with an identifying class name x ac
  		* @param v Object
  		* @param meta Object
  		* @param record Object
  		* @param rowIdx Object
  		* @param colIdx Object
  		* @param store Object
  		* @param view Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_IAction: js.UndefOr[
    js.Function7[
      /* v */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* colIdx */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Disables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var disableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Enables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var enableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (Function) */
  @JSName("getClass")
  var getClass_FIAction: js.UndefOr[js.Any] = js.undefined
  /** [Method] Private override because this cannot function as a Container and it has an items property which is an Array NOT a M  */
  @JSName("getRefItems")
  var getRefItems_IAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var getTip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object[]) */
  @JSName("items")
  var items_IAction: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.undefined
}

object IAction {
  @scala.inline
  def apply(
    IColumn: typings.extjs.ExtNs.gridNs.columnNs.IColumn = null,
    altText: java.lang.String = null,
    cascade: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IContainer = null,
    defaultRenderer: (/* v */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* colIdx */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit = null,
    disableAction: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableAction: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit = null,
    getClass: js.Any = null,
    getRefItems: () => Unit = null,
    getTip: js.Any = null,
    handler: js.Any = null,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    items: Array = null,
    menuText: java.lang.String = null,
    scope: js.Any = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    stopSelection: js.UndefOr[Boolean] = js.undefined,
    tooltip: java.lang.String = null
  ): IAction = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (cascade != null) __obj.updateDynamic("cascade")(js.Any.fromFunction2(cascade))
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction7(defaultRenderer))
    if (disableAction != null) __obj.updateDynamic("disableAction")(js.Any.fromFunction2(disableAction))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enableAction != null) __obj.updateDynamic("enableAction")(js.Any.fromFunction2(enableAction))
    if (getClass != null) __obj.updateDynamic("getClass")(getClass)
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction0(getRefItems))
    if (getTip != null) __obj.updateDynamic("getTip")(getTip)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (items != null) __obj.updateDynamic("items")(items)
    if (menuText != null) __obj.updateDynamic("menuText")(menuText)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (!js.isUndefined(stopSelection)) __obj.updateDynamic("stopSelection")(stopSelection)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[IAction]
  }
}

