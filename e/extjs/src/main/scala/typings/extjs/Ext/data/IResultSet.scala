package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResultSet
  extends StObject
     with IBase {
  
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var totalRecords: js.UndefOr[Double] = js.undefined
}
object IResultSet {
  
  inline def apply(): IResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResultSet] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setRecords(value: Array): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
