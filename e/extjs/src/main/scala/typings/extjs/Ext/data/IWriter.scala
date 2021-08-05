package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWriter
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  
  /** [Method] Formats the data for each record before sending it to the server
    * @param record Ext.data.Model The record that we are writing to the server.
    * @param operation Ext.data.Operation An operation object.
    * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
    */
  var getRecordData: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation], js.Any]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.undefined
  
  /** [Method] Prepares a Proxy s Ext data Request object
    * @param request Ext.data.Request The request object
    * @returns Ext.data.Request The modified request object
    */
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var writeRecordId: js.UndefOr[Boolean] = js.undefined
}
object IWriter {
  
  inline def apply(): IWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriter]
  }
  
  extension [Self <: IWriter](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setGetRecordData(value: (/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation]) => js.Any): Self = StObject.set(x, "getRecordData", js.Any.fromFunction2(value))
    
    inline def setGetRecordDataUndefined: Self = StObject.set(x, "getRecordData", js.undefined)
    
    inline def setNameProperty(value: String): Self = StObject.set(x, "nameProperty", value.asInstanceOf[js.Any])
    
    inline def setNamePropertyUndefined: Self = StObject.set(x, "nameProperty", js.undefined)
    
    inline def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    inline def setWriteAllFields(value: Boolean): Self = StObject.set(x, "writeAllFields", value.asInstanceOf[js.Any])
    
    inline def setWriteAllFieldsUndefined: Self = StObject.set(x, "writeAllFields", js.undefined)
    
    inline def setWriteRecordId(value: Boolean): Self = StObject.set(x, "writeRecordId", value.asInstanceOf[js.Any])
    
    inline def setWriteRecordIdUndefined: Self = StObject.set(x, "writeRecordId", js.undefined)
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
