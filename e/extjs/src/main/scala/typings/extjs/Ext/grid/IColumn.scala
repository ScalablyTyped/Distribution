package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import typings.extjs.Ext.grid.header.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumn
  extends StObject
     with IContainer {
  
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
  var align: js.UndefOr[String] = js.undefined
  
  /** [Method] Sizes this Column to fit the max content width
    * @param The Ext.grid.column.Column/Number header (or index of header) to auto size.
    */
  var autoSize: js.UndefOr[js.Function1[/* The */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Object[]) */
  var columns: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var dataIndex: js.UndefOr[String] = js.undefined
  
  /** [Method] When defined this will take precedence over the renderer config  */
  var defaultRenderer: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var editRenderer: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object/String) */
  var editor: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var emptyCellText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object/String) */
  var field: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Retrieves the editing field for editing associated with this header
    * @param record Object The Model instance being edited.
    * @param defaultField Object An object representing a default field to be created
    * @returns any field
    */
  var getEditor: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Method] Returns the index of this column only if this column is a base level Column
    * @returns Number
    */
  var getIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the parameter to sort upon when sorting this header
    * @returns String
    */
  var getSortParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the index of this column in the list of visible columns only if this column is a base level Column
    * @returns Number
    */
  var getVisibleIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var groupable: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.undefined
  
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
  var initRenderData_IColumn: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var menuText: js.UndefOr[String] = js.undefined
  
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
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.undefined
  
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
  var tdCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.Element) */
  var textEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var tooltip: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.Element) */
  var triggerEl: js.UndefOr[IElement] = js.undefined
}
object IColumn {
  
  @scala.inline
  def apply(): IColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumn]
  }
  
  @scala.inline
  implicit class IColumnMutableBuilder[Self <: IColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterComponentLayout(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterComponentLayout", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAfterComponentLayoutUndefined: Self = StObject.set(x, "afterComponentLayout", js.undefined)
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAutoSize(value: /* The */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "autoSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    @scala.inline
    def setColumns(value: Array): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setDataIndex(value: String): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    @scala.inline
    def setDefaultRenderer(value: () => Unit): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
    
    @scala.inline
    def setEditRenderer(value: js.Any): Self = StObject.set(x, "editRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditRendererUndefined: Self = StObject.set(x, "editRenderer", js.undefined)
    
    @scala.inline
    def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setEmptyCellText(value: String): Self = StObject.set(x, "emptyCellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCellTextUndefined: Self = StObject.set(x, "emptyCellText", js.undefined)
    
    @scala.inline
    def setField(value: js.Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setGetEditor(value: (/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "getEditor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEditorUndefined: Self = StObject.set(x, "getEditor", js.undefined)
    
    @scala.inline
    def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndexUndefined: Self = StObject.set(x, "getIndex", js.undefined)
    
    @scala.inline
    def setGetSortParam(value: () => String): Self = StObject.set(x, "getSortParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortParamUndefined: Self = StObject.set(x, "getSortParam", js.undefined)
    
    @scala.inline
    def setGetVisibleIndex(value: () => Double): Self = StObject.set(x, "getVisibleIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleIndexUndefined: Self = StObject.set(x, "getVisibleIndex", js.undefined)
    
    @scala.inline
    def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHide(value: /* fromOwner */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setHideable(value: Boolean): Self = StObject.set(x, "hideable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideableUndefined: Self = StObject.set(x, "hideable", js.undefined)
    
    @scala.inline
    def setInitRenderData(value: () => js.Any): Self = StObject.set(x, "initRenderData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitRenderDataUndefined: Self = StObject.set(x, "initRenderData", js.undefined)
    
    @scala.inline
    def setIsColumn(value: Boolean): Self = StObject.set(x, "isColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsColumnUndefined: Self = StObject.set(x, "isColumn", js.undefined)
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
    
    @scala.inline
    def setIsHideable(value: () => Unit): Self = StObject.set(x, "isHideable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHideableUndefined: Self = StObject.set(x, "isHideable", js.undefined)
    
    @scala.inline
    def setIsLockable(value: () => Unit): Self = StObject.set(x, "isLockable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLockableUndefined: Self = StObject.set(x, "isLockable", js.undefined)
    
    @scala.inline
    def setLockable(value: Boolean): Self = StObject.set(x, "lockable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockableUndefined: Self = StObject.set(x, "lockable", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setMenuDisabled(value: Boolean): Self = StObject.set(x, "menuDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuDisabledUndefined: Self = StObject.set(x, "menuDisabled", js.undefined)
    
    @scala.inline
    def setMenuText(value: String): Self = StObject.set(x, "menuText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuTextUndefined: Self = StObject.set(x, "menuText", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSetEditor(value: /* field */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEditor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEditorUndefined: Self = StObject.set(x, "setEditor", js.undefined)
    
    @scala.inline
    def setSetText(value: /* text */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
    
    @scala.inline
    def setShow(value: (/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any]) => IComponent): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTdCls(value: String): Self = StObject.set(x, "tdCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdClsUndefined: Self = StObject.set(x, "tdCls", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEl(value: IElement): Self = StObject.set(x, "textEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextElUndefined: Self = StObject.set(x, "textEl", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipType(value: String): Self = StObject.set(x, "tooltipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipTypeUndefined: Self = StObject.set(x, "tooltipType", js.undefined)
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTriggerEl(value: IElement): Self = StObject.set(x, "triggerEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerElUndefined: Self = StObject.set(x, "triggerEl", js.undefined)
  }
}
