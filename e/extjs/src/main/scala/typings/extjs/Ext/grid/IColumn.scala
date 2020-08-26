package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import typings.extjs.Ext.grid.header.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends IContainer {
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
  ] = js.native
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  /** [Method] Sizes this Column to fit the max content width
    * @param The Ext.grid.column.Column/Number header (or index of header) to auto size.
    */
  var autoSize: js.UndefOr[js.Function1[/* The */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object[]) */
  var columns: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var dataIndex: js.UndefOr[String] = js.native
  /** [Method] When defined this will take precedence over the renderer config  */
  var defaultRenderer: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var editRenderer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object/String) */
  var editor: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var emptyCellText: js.UndefOr[String] = js.native
  /** [Config Option] (Object/String) */
  var field: js.UndefOr[js.Any] = js.native
  /** [Method] Retrieves the editing field for editing associated with this header
    * @param record Object The Model instance being edited.
    * @param defaultField Object An object representing a default field to be created
    * @returns any field
    */
  var getEditor: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Returns the index of this column only if this column is a base level Column
    * @returns Number
    */
  var getIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the parameter to sort upon when sorting this header
    * @returns String
    */
  var getSortParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the index of this column in the list of visible columns only if this column is a base level Column
    * @returns Number
    */
  var getVisibleIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Boolean) */
  var groupable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.native
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @param fromOwner Object
    * @returns Ext.Component this
    */
  @JSName("hide")
  var hide_IColumn: js.UndefOr[js.Function1[/* fromOwner */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Config Option] (Boolean) */
  var hideable: js.UndefOr[Boolean] = js.native
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  @JSName("initRenderData")
  var initRenderData_IColumn: js.UndefOr[js.Function0[_]] = js.native
  /** [Property] (Boolean) */
  var isColumn: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.native
  /** [Method] Determines whether the UI should be allowed to offer an option to hide this column  */
  var isHideable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Determines whether the UI should be allowed to offer an option to lock or unlock this column  */
  var isLockable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var lockable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var menuDisabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var menuText: js.UndefOr[String] = js.native
  /** [Config Option] (Function/String) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  @JSName("resizable")
  var resizable_IColumn: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the form field to be used for editing
    * @param field Object An object representing a field to be created. If no xtype is specified a 'textfield' is assumed.
    */
  var setEditor: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the header text for this Column
    * @param text String The header to display on this Column.
    */
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
    * @param fromOwner Object
    * @param fromChild Object
    * @returns Ext.Component this
    */
  @JSName("show")
  var show_IColumn: js.UndefOr[
    js.Function2[/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Config Option] (String) */
  var tdCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var textEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var tooltip: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var triggerEl: js.UndefOr[IElement] = js.native
}

object IColumn {
  @scala.inline
  def apply(): IColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
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
    def setAfterComponentLayout(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("afterComponentLayout", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterComponentLayout: Self = this.set("afterComponentLayout", js.undefined)
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAutoSize(value: /* The */ js.UndefOr[js.Any] => Unit): Self = this.set("autoSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    @scala.inline
    def setColumns(value: Array): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDataIndex(value: String): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    @scala.inline
    def setDefaultRenderer(value: () => Unit): Self = this.set("defaultRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDefaultRenderer: Self = this.set("defaultRenderer", js.undefined)
    @scala.inline
    def setEditRenderer(value: js.Any): Self = this.set("editRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditRenderer: Self = this.set("editRenderer", js.undefined)
    @scala.inline
    def setEditor(value: js.Any): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setEmptyCellText(value: String): Self = this.set("emptyCellText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyCellText: Self = this.set("emptyCellText", js.undefined)
    @scala.inline
    def setField(value: js.Any): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setGetEditor(value: (/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any]) => _): Self = this.set("getEditor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetEditor: Self = this.set("getEditor", js.undefined)
    @scala.inline
    def setGetIndex(value: () => Double): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIndex: Self = this.set("getIndex", js.undefined)
    @scala.inline
    def setGetSortParam(value: () => String): Self = this.set("getSortParam", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSortParam: Self = this.set("getSortParam", js.undefined)
    @scala.inline
    def setGetVisibleIndex(value: () => Double): Self = this.set("getVisibleIndex", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetVisibleIndex: Self = this.set("getVisibleIndex", js.undefined)
    @scala.inline
    def setGroupable(value: Boolean): Self = this.set("groupable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupable: Self = this.set("groupable", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHide(value: /* fromOwner */ js.UndefOr[js.Any] => IComponent): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setHideable(value: Boolean): Self = this.set("hideable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideable: Self = this.set("hideable", js.undefined)
    @scala.inline
    def setInitRenderData(value: () => _): Self = this.set("initRenderData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitRenderData: Self = this.set("initRenderData", js.undefined)
    @scala.inline
    def setIsColumn(value: Boolean): Self = this.set("isColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsColumn: Self = this.set("isColumn", js.undefined)
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHeader: Self = this.set("isHeader", js.undefined)
    @scala.inline
    def setIsHideable(value: () => Unit): Self = this.set("isHideable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsHideable: Self = this.set("isHideable", js.undefined)
    @scala.inline
    def setIsLockable(value: () => Unit): Self = this.set("isLockable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLockable: Self = this.set("isLockable", js.undefined)
    @scala.inline
    def setLockable(value: Boolean): Self = this.set("lockable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockable: Self = this.set("lockable", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setMenuDisabled(value: Boolean): Self = this.set("menuDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuDisabled: Self = this.set("menuDisabled", js.undefined)
    @scala.inline
    def setMenuText(value: String): Self = this.set("menuText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuText: Self = this.set("menuText", js.undefined)
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetEditor(value: /* field */ js.UndefOr[js.Any] => Unit): Self = this.set("setEditor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEditor: Self = this.set("setEditor", js.undefined)
    @scala.inline
    def setSetText(value: /* text */ js.UndefOr[String] => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    @scala.inline
    def setShow(value: (/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any]) => IComponent): Self = this.set("show", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTdCls(value: String): Self = this.set("tdCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTdCls: Self = this.set("tdCls", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextEl(value: IElement): Self = this.set("textEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEl: Self = this.set("textEl", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipType(value: String): Self = this.set("tooltipType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipType: Self = this.set("tooltipType", js.undefined)
    @scala.inline
    def setTriggerEl(value: IElement): Self = this.set("triggerEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerEl: Self = this.set("triggerEl", js.undefined)
  }
  
}

