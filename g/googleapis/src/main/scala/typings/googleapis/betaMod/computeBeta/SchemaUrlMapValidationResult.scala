package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing the validation result for a UrlMap.
  */
trait SchemaUrlMapValidationResult extends StObject {
  
  var loadErrors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the given UrlMap can be successfully loaded. If false,
    * &#39;loadErrors&#39; indicates the reasons.
    */
  var loadSucceeded: js.UndefOr[Boolean] = js.undefined
  
  var testFailures: js.UndefOr[js.Array[SchemaTestFailure]] = js.undefined
  
  /**
    * If successfully loaded, this field indicates whether the test passed. If
    * false, &#39;testFailures&#39;s indicate the reason of failure.
    */
  var testPassed: js.UndefOr[Boolean] = js.undefined
}
object SchemaUrlMapValidationResult {
  
  inline def apply(): SchemaUrlMapValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapValidationResult]
  }
  
  extension [Self <: SchemaUrlMapValidationResult](x: Self) {
    
    inline def setLoadErrors(value: js.Array[String]): Self = StObject.set(x, "loadErrors", value.asInstanceOf[js.Any])
    
    inline def setLoadErrorsUndefined: Self = StObject.set(x, "loadErrors", js.undefined)
    
    inline def setLoadErrorsVarargs(value: String*): Self = StObject.set(x, "loadErrors", js.Array(value :_*))
    
    inline def setLoadSucceeded(value: Boolean): Self = StObject.set(x, "loadSucceeded", value.asInstanceOf[js.Any])
    
    inline def setLoadSucceededUndefined: Self = StObject.set(x, "loadSucceeded", js.undefined)
    
    inline def setTestFailures(value: js.Array[SchemaTestFailure]): Self = StObject.set(x, "testFailures", value.asInstanceOf[js.Any])
    
    inline def setTestFailuresUndefined: Self = StObject.set(x, "testFailures", js.undefined)
    
    inline def setTestFailuresVarargs(value: SchemaTestFailure*): Self = StObject.set(x, "testFailures", js.Array(value :_*))
    
    inline def setTestPassed(value: Boolean): Self = StObject.set(x, "testPassed", value.asInstanceOf[js.Any])
    
    inline def setTestPassedUndefined: Self = StObject.set(x, "testPassed", js.undefined)
  }
}
