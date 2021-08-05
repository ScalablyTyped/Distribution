package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISorter
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  
  /** [Method] Set the sorting direction for this sorter
    * @param direction String The direction to sort in. Should be either 'ASC' or 'DESC'.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Toggles the sorting direction for this sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Update the sort function for this sorter
    * @param fn Function A new sorter function for this sorter. If not specified it will use the default sorting function.
    */
  var updateSortFunction: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object ISorter {
  
  inline def apply(): ISorter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISorter]
  }
  
  extension [Self <: ISorter](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    
    inline def setSorterFn(value: js.Any): Self = StObject.set(x, "sorterFn", value.asInstanceOf[js.Any])
    
    inline def setSorterFnUndefined: Self = StObject.set(x, "sorterFn", js.undefined)
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setTransform(value: js.Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUpdateSortFunction(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updateSortFunction", js.Any.fromFunction1(value))
    
    inline def setUpdateSortFunctionUndefined: Self = StObject.set(x, "updateSortFunction", js.undefined)
  }
}
