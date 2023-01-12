package typings.extjs.Ext.layout.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITable
  extends StObject
     with IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_ITable: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.undefined
  
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Validates item is in the proper place in the dom
    * @param item Object
    * @param target Object
    * @param rowIdx Object
    * @param cellIdx Object
    */
  @JSName("isValidParent")
  var isValidParent_ITable: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[Any], 
      /* target */ js.UndefOr[Any], 
      /* rowIdx */ js.UndefOr[Any], 
      /* cellIdx */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[Any] = js.undefined
}
object ITable {
  
  inline def apply(): ITable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITable] (val x: Self) extends AnyVal {
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFinalizeLayout(value: () => Unit): Self = StObject.set(x, "finalizeLayout", js.Any.fromFunction0(value))
    
    inline def setFinalizeLayoutUndefined: Self = StObject.set(x, "finalizeLayout", js.undefined)
    
    inline def setIsValidParent(
      value: (/* item */ js.UndefOr[Any], /* target */ js.UndefOr[Any], /* rowIdx */ js.UndefOr[Any], /* cellIdx */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "isValidParent", js.Any.fromFunction4(value))
    
    inline def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
    
    inline def setTableAttrs(value: Any): Self = StObject.set(x, "tableAttrs", value.asInstanceOf[js.Any])
    
    inline def setTableAttrsUndefined: Self = StObject.set(x, "tableAttrs", js.undefined)
    
    inline def setTdAttrs(value: Any): Self = StObject.set(x, "tdAttrs", value.asInstanceOf[js.Any])
    
    inline def setTdAttrsUndefined: Self = StObject.set(x, "tdAttrs", js.undefined)
    
    inline def setTrAttrs(value: Any): Self = StObject.set(x, "trAttrs", value.asInstanceOf[js.Any])
    
    inline def setTrAttrsUndefined: Self = StObject.set(x, "trAttrs", js.undefined)
  }
}
