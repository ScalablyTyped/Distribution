package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information associated with the response to the operation. */
trait IRequestCallbackOptions extends StObject {
  
  /** Comma delimited string containing the collection's current quota metrics (storage, number of stored procedure, triggers and UDFs) after completion of the operation. */
  var currentCollectionSizeInMB: String
  
  /** Comma delimited string containing the collection's maximum quota metrics (storage, number of stored procedure, triggers and UDFs). */
  var maxCollectionSizeInMB: String
  
  /** Set to true if the requested resource has not been modified compared to the provided ETag in the ifNoneMatch parameter for a read request. */
  var notModified: Boolean
}
object IRequestCallbackOptions {
  
  inline def apply(currentCollectionSizeInMB: String, maxCollectionSizeInMB: String, notModified: Boolean): IRequestCallbackOptions = {
    val __obj = js.Dynamic.literal(currentCollectionSizeInMB = currentCollectionSizeInMB.asInstanceOf[js.Any], maxCollectionSizeInMB = maxCollectionSizeInMB.asInstanceOf[js.Any], notModified = notModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestCallbackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRequestCallbackOptions] (val x: Self) extends AnyVal {
    
    inline def setCurrentCollectionSizeInMB(value: String): Self = StObject.set(x, "currentCollectionSizeInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxCollectionSizeInMB(value: String): Self = StObject.set(x, "maxCollectionSizeInMB", value.asInstanceOf[js.Any])
    
    inline def setNotModified(value: Boolean): Self = StObject.set(x, "notModified", value.asInstanceOf[js.Any])
  }
}
