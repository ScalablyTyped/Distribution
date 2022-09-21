package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reader {
  
  trait IArray
    extends StObject
       with IJson
  object IArray {
    
    inline def apply(): IArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IArray]
    }
  }
  
  trait IJson
    extends StObject
       with typings.extjs.Ext.data.reader.IReader {
    
    /** [Property] (Object) */
    var jsonData: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var metaProperty: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var record: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useSimpleAccessors: js.UndefOr[Boolean] = js.undefined
  }
  object IJson {
    
    inline def apply(): IJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJson]
    }
    
    extension [Self <: IJson](x: Self) {
      
      inline def setJsonData(value: Any): Self = StObject.set(x, "jsonData", value.asInstanceOf[js.Any])
      
      inline def setJsonDataUndefined: Self = StObject.set(x, "jsonData", js.undefined)
      
      inline def setMetaProperty(value: String): Self = StObject.set(x, "metaProperty", value.asInstanceOf[js.Any])
      
      inline def setMetaPropertyUndefined: Self = StObject.set(x, "metaProperty", js.undefined)
      
      inline def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setUseSimpleAccessors(value: Boolean): Self = StObject.set(x, "useSimpleAccessors", value.asInstanceOf[js.Any])
      
      inline def setUseSimpleAccessorsUndefined: Self = StObject.set(x, "useSimpleAccessors", js.undefined)
    }
  }
  
  trait IReader
    extends StObject
       with IObservable {
    
    /** [Method] Takes a raw response object as passed to the read method and returns the useful data segment from it
      * @param response Object The response object
      * @returns Ext.data.ResultSet A ResultSet object
      */
    var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[Any], IResultSet]] = js.undefined
    
    /** [Config Option] (String) */
    var idProperty: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var implicitIncludes: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var messageProperty: js.UndefOr[String] = js.undefined
    
    /** [Property] (Object) */
    var metaData: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Object) */
    var rawData: js.UndefOr[Any] = js.undefined
    
    /** [Method] Reads the given response object
      * @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
      * @returns Ext.data.ResultSet The parsed or default ResultSet object
      */
    var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[Any], IResultSet]] = js.undefined
    
    /** [Method] Abstracts common functionality used by all Reader subclasses
      * @param data Object The raw data object
      * @returns Ext.data.ResultSet A ResultSet object
      */
    var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], IResultSet]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var readRecordsOnFailure: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var root: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var successProperty: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var totalProperty: js.UndefOr[String] = js.undefined
  }
  object IReader {
    
    inline def apply(): typings.extjs.Ext.data.reader.IReader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.data.reader.IReader]
    }
    
    extension [Self <: typings.extjs.Ext.data.reader.IReader](x: Self) {
      
      inline def setGetResponseData(value: /* response */ js.UndefOr[Any] => IResultSet): Self = StObject.set(x, "getResponseData", js.Any.fromFunction1(value))
      
      inline def setGetResponseDataUndefined: Self = StObject.set(x, "getResponseData", js.undefined)
      
      inline def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      inline def setImplicitIncludes(value: Boolean): Self = StObject.set(x, "implicitIncludes", value.asInstanceOf[js.Any])
      
      inline def setImplicitIncludesUndefined: Self = StObject.set(x, "implicitIncludes", js.undefined)
      
      inline def setMessageProperty(value: String): Self = StObject.set(x, "messageProperty", value.asInstanceOf[js.Any])
      
      inline def setMessagePropertyUndefined: Self = StObject.set(x, "messageProperty", js.undefined)
      
      inline def setMetaData(value: Any): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      inline def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
      
      inline def setRawData(value: Any): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
      
      inline def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
      
      inline def setRead(value: /* response */ js.UndefOr[Any] => IResultSet): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setReadRecords(value: /* data */ js.UndefOr[Any] => IResultSet): Self = StObject.set(x, "readRecords", js.Any.fromFunction1(value))
      
      inline def setReadRecordsOnFailure(value: Boolean): Self = StObject.set(x, "readRecordsOnFailure", value.asInstanceOf[js.Any])
      
      inline def setReadRecordsOnFailureUndefined: Self = StObject.set(x, "readRecordsOnFailure", js.undefined)
      
      inline def setReadRecordsUndefined: Self = StObject.set(x, "readRecords", js.undefined)
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSuccessProperty(value: String): Self = StObject.set(x, "successProperty", value.asInstanceOf[js.Any])
      
      inline def setSuccessPropertyUndefined: Self = StObject.set(x, "successProperty", js.undefined)
      
      inline def setTotalProperty(value: String): Self = StObject.set(x, "totalProperty", value.asInstanceOf[js.Any])
      
      inline def setTotalPropertyUndefined: Self = StObject.set(x, "totalProperty", js.undefined)
    }
  }
  
  trait IXml
    extends StObject
       with typings.extjs.Ext.data.reader.IReader {
    
    /** [Method] Normalizes the data object
      * @param data Object The raw data object
      * @returns Object The documentElement property of the data object if present, or the same object if not.
      */
    var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Config Option] (String) */
    var namespace: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var record: js.UndefOr[String] = js.undefined
    
    /** [Property] (Object) */
    var xmlData: js.UndefOr[Any] = js.undefined
  }
  object IXml {
    
    inline def apply(): IXml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXml]
    }
    
    extension [Self <: IXml](x: Self) {
      
      inline def setGetData(value: /* data */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setXmlData(value: Any): Self = StObject.set(x, "xmlData", value.asInstanceOf[js.Any])
      
      inline def setXmlDataUndefined: Self = StObject.set(x, "xmlData", js.undefined)
    }
  }
}
