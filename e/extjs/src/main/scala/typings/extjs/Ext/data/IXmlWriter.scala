package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlWriter
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
object IXmlWriter {
  
  inline def apply(): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlWriter]
  }
  
  extension [Self <: IXmlWriter](x: Self) {
    
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
