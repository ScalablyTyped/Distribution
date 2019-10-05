package typings.extjs.Ext.grid.column

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn
  extends typings.extjs.Ext.grid.header.IContainer {
  /** [Method] private Inform the header container about the resize
  		* @param width Object
  		* @param height Object
  		* @param oldWidth Object
  		* @param oldHeight Object
  		*/
  @JSName("afterComponentLayout")
  var afterComponentLayout_IColumn: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sizes this Column to fit the max content width
  		* @param The Ext.grid.column.Column/Number header (or index of header) to auto size.
  		*/
  var autoSize: js.UndefOr[js.Function1[/* The */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  var columns: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var dataIndex: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] When defined this will take precedence over the renderer config  */
  var defaultRenderer: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var editRenderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/String) */
  var editor: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var emptyCellText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object/String) */
  var field: js.UndefOr[js.Any] = js.undefined
  /** [Method] Retrieves the editing field for editing associated with this header
  		* @param record Object The Model instance being edited.
  		* @param defaultField Object An object representing a default field to be created
  		* @returns any field
  		*/
  var getEditor: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Returns the index of this column only if this column is a base level Column
  		* @returns Number
  		*/
  var getIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the parameter to sort upon when sorting this header
  		* @returns String
  		*/
  var getSortParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the index of this column in the list of visible columns only if this column is a base level Column
  		* @returns Number
  		*/
  var getVisibleIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var groupable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @param fromOwner Object
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IColumn: js.UndefOr[js.Function1[/* fromOwner */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideable: js.UndefOr[Boolean] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  @JSName("initRenderData")
  var initRenderData_IColumn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Boolean) */
  var isColumn: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] Determines whether the UI should be allowed to offer an option to hide this column  */
  var isHideable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Determines whether the UI should be allowed to offer an option to lock or unlock this column  */
  var isLockable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var lockable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var menuDisabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var menuText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Function/String) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("resizable")
  var resizable_IColumn: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the form field to be used for editing
  		* @param field Object An object representing a field to be created. If no xtype is specified a 'textfield' is assumed.
  		*/
  var setEditor: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the header text for this Column
  		* @param text String The header to display on this Column.
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
  		* @param fromOwner Object
  		* @param fromChild Object
  		* @returns Ext.Component this
  		*/
  @JSName("show")
  var show_IColumn: js.UndefOr[
    js.Function2[/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any], IComponent]
  ] = js.undefined
  /** [Config Option] (String) */
  var tdCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var textEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var triggerEl: js.UndefOr[IElement] = js.undefined
}

object IColumn {
  @scala.inline
  def apply(
    IContainer: typings.extjs.Ext.grid.header.IContainer = null,
    afterComponentLayout: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit = null,
    afterRender: () => Unit = null,
    align: java.lang.String = null,
    autoSize: /* The */ js.UndefOr[js.Any] => Unit = null,
    baseCls: java.lang.String = null,
    columns: Array = null,
    componentLayout: js.Any = null,
    dataIndex: java.lang.String = null,
    defaultRenderer: () => Unit = null,
    detachOnRemove: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    editRenderer: js.Any = null,
    editor: js.Any = null,
    emptyCellText: java.lang.String = null,
    field: js.Any = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    getEditor: (/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any]) => _ = null,
    getIndex: () => Double = null,
    getSortParam: () => java.lang.String = null,
    getVisibleIndex: () => Double = null,
    groupable: js.UndefOr[Boolean] = js.undefined,
    header: java.lang.String = null,
    hide: /* fromOwner */ js.UndefOr[js.Any] => IComponent = null,
    hideable: js.UndefOr[Boolean] = js.undefined,
    initRenderData: () => _ = null,
    isColumn: js.UndefOr[Boolean] = js.undefined,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    isHideable: () => Unit = null,
    isLockable: () => Unit = null,
    lockable: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    menuDisabled: js.UndefOr[Boolean] = js.undefined,
    menuText: java.lang.String = null,
    onAdd: /* child */ js.UndefOr[js.Any] => Unit = null,
    onDestroy: () => Unit = null,
    onRemove: /* child */ js.UndefOr[js.Any] => Unit = null,
    renderTpl: js.Any = null,
    renderer: js.Any = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    scope: js.Any = null,
    setEditor: /* field */ js.UndefOr[js.Any] => Unit = null,
    setText: /* text */ js.UndefOr[java.lang.String] => Unit = null,
    show: (/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any]) => IComponent = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    stateId: java.lang.String = null,
    tdCls: java.lang.String = null,
    text: java.lang.String = null,
    textEl: IElement = null,
    tooltip: java.lang.String = null,
    tooltipType: java.lang.String = null,
    triggerEl: IElement = null
  ): IColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (afterComponentLayout != null) __obj.updateDynamic("afterComponentLayout")(js.Any.fromFunction4(afterComponentLayout))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (align != null) __obj.updateDynamic("align")(align)
    if (autoSize != null) __obj.updateDynamic("autoSize")(js.Any.fromFunction1(autoSize))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction0(defaultRenderer))
    if (!js.isUndefined(detachOnRemove)) __obj.updateDynamic("detachOnRemove")(detachOnRemove)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (editRenderer != null) __obj.updateDynamic("editRenderer")(editRenderer)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (emptyCellText != null) __obj.updateDynamic("emptyCellText")(emptyCellText)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (getEditor != null) __obj.updateDynamic("getEditor")(js.Any.fromFunction2(getEditor))
    if (getIndex != null) __obj.updateDynamic("getIndex")(js.Any.fromFunction0(getIndex))
    if (getSortParam != null) __obj.updateDynamic("getSortParam")(js.Any.fromFunction0(getSortParam))
    if (getVisibleIndex != null) __obj.updateDynamic("getVisibleIndex")(js.Any.fromFunction0(getVisibleIndex))
    if (!js.isUndefined(groupable)) __obj.updateDynamic("groupable")(groupable)
    if (header != null) __obj.updateDynamic("header")(header)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (!js.isUndefined(hideable)) __obj.updateDynamic("hideable")(hideable)
    if (initRenderData != null) __obj.updateDynamic("initRenderData")(js.Any.fromFunction0(initRenderData))
    if (!js.isUndefined(isColumn)) __obj.updateDynamic("isColumn")(isColumn)
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader)
    if (isHideable != null) __obj.updateDynamic("isHideable")(js.Any.fromFunction0(isHideable))
    if (isLockable != null) __obj.updateDynamic("isLockable")(js.Any.fromFunction0(isLockable))
    if (!js.isUndefined(lockable)) __obj.updateDynamic("lockable")(lockable)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (!js.isUndefined(menuDisabled)) __obj.updateDynamic("menuDisabled")(menuDisabled)
    if (menuText != null) __obj.updateDynamic("menuText")(menuText)
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (setEditor != null) __obj.updateDynamic("setEditor")(js.Any.fromFunction1(setEditor))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction2(show))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (stateId != null) __obj.updateDynamic("stateId")(stateId)
    if (tdCls != null) __obj.updateDynamic("tdCls")(tdCls)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textEl != null) __obj.updateDynamic("textEl")(textEl)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType)
    if (triggerEl != null) __obj.updateDynamic("triggerEl")(triggerEl)
    __obj.asInstanceOf[IColumn]
  }
}

