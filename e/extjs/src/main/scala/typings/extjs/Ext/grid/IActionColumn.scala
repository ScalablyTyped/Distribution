package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionColumn
  extends StObject
     with typings.extjs.Ext.grid.column.IColumn {
  
  /** [Config Option] (String) */
  var altText: js.UndefOr[String] = js.undefined
  
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
    * @param fn Object
    * @param scope Object
    * @returns Ext.Container this
    */
  @JSName("cascade")
  var cascade_IActionColumn: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], IContainer]] = js.undefined
  
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
  var defaultRenderer_IActionColumn: js.UndefOr[
    js.Function7[
      /* v */ js.UndefOr[Any], 
      /* meta */ js.UndefOr[Any], 
      /* record */ js.UndefOr[Any], 
      /* rowIdx */ js.UndefOr[Any], 
      /* colIdx */ js.UndefOr[Any], 
      /* store */ js.UndefOr[Any], 
      /* view */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Disables this ActionColumn s action at the specified index
    * @param index Number/Ext.grid.column.Action
    * @param silent Boolean
    */
  var disableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Enables this ActionColumn s action at the specified index
    * @param index Number/Ext.grid.column.Action
    * @param silent Boolean
    */
  var enableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Config Option] (Function) */
  @JSName("getClass")
  var getClass_FIActionColumn: js.UndefOr[Any] = js.undefined
  
  /** [Method] Private override because this cannot function as a Container and it has an items property which is an Array NOT a M  */
  @JSName("getRefItems")
  var getRefItems_IActionColumn: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var getTip: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object[]) */
  @JSName("items")
  var items_IActionColumn: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.undefined
}
object IActionColumn {
  
  inline def apply(): IActionColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IActionColumn] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setCascade(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => IContainer): Self = StObject.set(x, "cascade", js.Any.fromFunction2(value))
    
    inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    
    inline def setDefaultRenderer(
      value: (/* v */ js.UndefOr[Any], /* meta */ js.UndefOr[Any], /* record */ js.UndefOr[Any], /* rowIdx */ js.UndefOr[Any], /* colIdx */ js.UndefOr[Any], /* store */ js.UndefOr[Any], /* view */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction7(value))
    
    inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
    
    inline def setDisableAction(value: (/* index */ js.UndefOr[Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "disableAction", js.Any.fromFunction2(value))
    
    inline def setDisableActionUndefined: Self = StObject.set(x, "disableAction", js.undefined)
    
    inline def setEnableAction(value: (/* index */ js.UndefOr[Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "enableAction", js.Any.fromFunction2(value))
    
    inline def setEnableActionUndefined: Self = StObject.set(x, "enableAction", js.undefined)
    
    inline def setGetClass_(value: Any): Self = StObject.set(x, "getClass", value.asInstanceOf[js.Any])
    
    inline def setGetClass_Undefined: Self = StObject.set(x, "getClass", js.undefined)
    
    inline def setGetRefItems(value: () => Unit): Self = StObject.set(x, "getRefItems", js.Any.fromFunction0(value))
    
    inline def setGetRefItemsUndefined: Self = StObject.set(x, "getRefItems", js.undefined)
    
    inline def setGetTip(value: Any): Self = StObject.set(x, "getTip", value.asInstanceOf[js.Any])
    
    inline def setGetTipUndefined: Self = StObject.set(x, "getTip", js.undefined)
    
    inline def setHandler(value: Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconCls(value: String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    inline def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setStopSelection(value: Boolean): Self = StObject.set(x, "stopSelection", value.asInstanceOf[js.Any])
    
    inline def setStopSelectionUndefined: Self = StObject.set(x, "stopSelection", js.undefined)
  }
}
