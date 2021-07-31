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
  
  @scala.inline
  def apply(): IValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValidationError]
  }
  
  @scala.inline
  implicit class IValidationErrorMutableBuilder[Self <: IValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setSeverity(
      value: Severity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.ValidationError.Severity * / any */ String)
    ): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
