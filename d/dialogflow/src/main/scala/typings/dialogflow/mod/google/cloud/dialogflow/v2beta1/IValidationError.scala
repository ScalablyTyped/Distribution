package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ValidationError. */
trait IValidationError extends StObject {
  
  /** ValidationError entries */
  var entries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ValidationError errorMessage */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /** ValidationError severity */
  var severity: js.UndefOr[
    Severity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.ValidationError.Severity * / any */ String) | Null
  ] = js.undefined
}
object IValidationError {
  
  inline def apply(): IValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValidationError]
  }
  
  extension [Self <: IValidationError](x: Self) {
    
    inline def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setSeverity(
      value: Severity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.ValidationError.Severity * / any */ String)
    ): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
