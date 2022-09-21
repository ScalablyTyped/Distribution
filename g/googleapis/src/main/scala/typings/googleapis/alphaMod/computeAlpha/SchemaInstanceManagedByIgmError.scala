package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceManagedByIgmError extends StObject {
  
  /**
    * [Output Only] Contents of the error.
    */
  var error: js.UndefOr[SchemaInstanceManagedByIgmErrorManagedInstanceError] = js.undefined
  
  /**
    * [Output Only] Details of the instance action that triggered this error. May be null, if the error was not caused by an action on an instance. This field is optional.
    */
  var instanceActionDetails: js.UndefOr[SchemaInstanceManagedByIgmErrorInstanceActionDetails] = js.undefined
  
  /**
    * [Output Only] The time that this error occurred. This value is in RFC3339 text format.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceManagedByIgmError {
  
  inline def apply(): SchemaInstanceManagedByIgmError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceManagedByIgmError]
  }
  
  extension [Self <: SchemaInstanceManagedByIgmError](x: Self) {
    
    inline def setError(value: SchemaInstanceManagedByIgmErrorManagedInstanceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInstanceActionDetails(value: SchemaInstanceManagedByIgmErrorInstanceActionDetails): Self = StObject.set(x, "instanceActionDetails", value.asInstanceOf[js.Any])
    
    inline def setInstanceActionDetailsUndefined: Self = StObject.set(x, "instanceActionDetails", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
