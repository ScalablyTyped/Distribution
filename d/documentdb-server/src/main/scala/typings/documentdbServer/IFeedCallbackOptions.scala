package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information associated with the response to the operation. */
trait IFeedCallbackOptions extends StObject {
  
  /** Opaque token for continuing the read feed or query. */
  var continuation: String
  
  /** Comma delimited string containing the collection's current quota metrics (storage, number of stored procedure, triggers and UDFs) after completion of the operation. */
  var currentCollectionSizeInMB: String
  
  /** Comma delimited string containing the collection's maximum quota metrics (storage, number of stored procedure, triggers and UDFs). */
  var maxCollectionSizeInMB: String
}
object IFeedCallbackOptions {
  
  inline def apply(continuation: String, currentCollectionSizeInMB: String, maxCollectionSizeInMB: String): IFeedCallbackOptions = {
    val __obj = js.Dynamic.literal(continuation = continuation.asInstanceOf[js.Any], currentCollectionSizeInMB = currentCollectionSizeInMB.asInstanceOf[js.Any], maxCollectionSizeInMB = maxCollectionSizeInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFeedCallbackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFeedCallbackOptions] (val x: Self) extends AnyVal {
    
    inline def setContinuation(value: String): Self = StObject.set(x, "continuation", value.asInstanceOf[js.Any])
    
    inline def setCurrentCollectionSizeInMB(value: String): Self = StObject.set(x, "currentCollectionSizeInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxCollectionSizeInMB(value: String): Self = StObject.set(x, "maxCollectionSizeInMB", value.asInstanceOf[js.Any])
  }
}
