package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writer {
  
  trait IJson
    extends StObject
       with typings.extjs.Ext.data.writer.IWriter {
    
    /** [Config Option] (Boolean) */
    var allowSingle: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var encode: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var expandData: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
      * @param data Object
      */
    var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var root: js.UndefOr[String] = js.undefined
  }
  object IJson {
    
    inline def apply(): IJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJson] (val x: Self) extends AnyVal {
      
      inline def setAllowSingle(value: Boolean): Self = StObject.set(x, "allowSingle", value.asInstanceOf[js.Any])
      
      inline def setAllowSingleUndefined: Self = StObject.set(x, "allowSingle", js.undefined)
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpandData(value: Boolean): Self = StObject.set(x, "expandData", value.asInstanceOf[js.Any])
      
      inline def setExpandDataUndefined: Self = StObject.set(x, "expandData", js.undefined)
      
      inline def setGetExpandedData(value: /* data */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getExpandedData", js.Any.fromFunction1(value))
      
      inline def setGetExpandedDataUndefined: Self = StObject.set(x, "getExpandedData", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
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
        js.Function2[/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation], Any]
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
    
    inline def apply(): typings.extjs.Ext.data.writer.IWriter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.data.writer.IWriter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.extjs.Ext.data.writer.IWriter] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setGetRecordData(value: (/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation]) => Any): Self = StObject.set(x, "getRecordData", js.Any.fromFunction2(value))
      
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
  
  trait IXml
    extends StObject
       with typings.extjs.Ext.data.writer.IWriter {
    
    /** [Config Option] (String) */
    var defaultDocumentRoot: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var documentRoot: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var header: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var record: js.UndefOr[String] = js.undefined
  }
  object IXml {
    
    inline def apply(): IXml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXml]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXml] (val x: Self) extends AnyVal {
      
      inline def setDefaultDocumentRoot(value: String): Self = StObject.set(x, "defaultDocumentRoot", value.asInstanceOf[js.Any])
      
      inline def setDefaultDocumentRootUndefined: Self = StObject.set(x, "defaultDocumentRoot", js.undefined)
      
      inline def setDocumentRoot(value: String): Self = StObject.set(x, "documentRoot", value.asInstanceOf[js.Any])
      
      inline def setDocumentRootUndefined: Self = StObject.set(x, "documentRoot", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    }
  }
}
