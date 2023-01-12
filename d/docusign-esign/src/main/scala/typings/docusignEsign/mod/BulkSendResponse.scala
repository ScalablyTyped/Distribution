package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSendResponse extends StObject {
  
  /**
    * A batch identifier that you can use to get the status of the batch.
    */
  var batchId: js.UndefOr[String] = js.undefined
  
  /**
    * The GUID of the envelope or template that was sent.
    */
  var envelopeOrTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable object that describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of errors that occurred. This information is intended to be parsed by machine.
    */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
}
object BulkSendResponse {
  
  inline def apply(): BulkSendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkSendResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setEnvelopeOrTemplateId(value: String): Self = StObject.set(x, "envelopeOrTemplateId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeOrTemplateIdUndefined: Self = StObject.set(x, "envelopeOrTemplateId", js.undefined)
    
    inline def setErrorDetails(value: js.Array[String]): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setErrorDetailsVarargs(value: String*): Self = StObject.set(x, "errorDetails", js.Array(value*))
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
