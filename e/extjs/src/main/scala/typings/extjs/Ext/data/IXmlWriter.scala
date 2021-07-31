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
  
  @scala.inline
  def apply(): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlWriter]
  }
  
  @scala.inline
  implicit class IXmlWriterMutableBuilder[Self <: IXmlWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDocumentRoot(value: String): Self = StObject.set(x, "defaultDocumentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDocumentRootUndefined: Self = StObject.set(x, "defaultDocumentRoot", js.undefined)
    
    @scala.inline
    def setDocumentRoot(value: String): Self = StObject.set(x, "documentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentRootUndefined: Self = StObject.set(x, "documentRoot", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
  }
}
