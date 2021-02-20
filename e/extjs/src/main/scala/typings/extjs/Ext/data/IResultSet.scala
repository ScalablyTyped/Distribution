package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResultSet extends IBase {
  
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var totalRecords: js.UndefOr[Double] = js.native
}
object IResultSet {
  
  @scala.inline
  def apply(): IResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSet]
  }
  
  @scala.inline
  implicit class IResultSetMutableBuilder[Self <: IResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setRecords(value: Array): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
