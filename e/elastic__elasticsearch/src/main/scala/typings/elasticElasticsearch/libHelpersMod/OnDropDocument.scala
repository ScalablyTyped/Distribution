package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.ErrorCause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDropDocument[TDocument] extends StObject {
  
  var document: TDocument
  
  var error: ErrorCause | Null
  
  var operation: Action
  
  var retried: Boolean
  
  var status: Double
}
object OnDropDocument {
  
  inline def apply[TDocument](document: TDocument, operation: Action, retried: Boolean, status: Double): OnDropDocument[TDocument] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[OnDropDocument[TDocument]]
  }
  
  extension [Self <: OnDropDocument[?], TDocument](x: Self & OnDropDocument[TDocument]) {
    
    inline def setDocument(value: TDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setOperation(value: Action): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setRetried(value: Boolean): Self = StObject.set(x, "retried", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
