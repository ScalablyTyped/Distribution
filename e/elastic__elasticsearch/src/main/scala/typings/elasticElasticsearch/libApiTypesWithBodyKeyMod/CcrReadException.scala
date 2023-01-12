package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrReadException extends StObject {
  
  var exception: ErrorCause
  
  var from_seq_no: SequenceNumber
  
  var retries: integer
}
object CcrReadException {
  
  inline def apply(exception: ErrorCause, from_seq_no: SequenceNumber, retries: integer): CcrReadException = {
    val __obj = js.Dynamic.literal(exception = exception.asInstanceOf[js.Any], from_seq_no = from_seq_no.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrReadException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrReadException] (val x: Self) extends AnyVal {
    
    inline def setException(value: ErrorCause): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setFrom_seq_no(value: SequenceNumber): Self = StObject.set(x, "from_seq_no", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: integer): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
  }
}
