package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthChecksScopedList extends StObject {
  
  /**
    * A list of HealthChecks contained in this scope.
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheck]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaHealthChecksScopedList {
  
  inline def apply(): SchemaHealthChecksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthChecksScopedList]
  }
  
  extension [Self <: SchemaHealthChecksScopedList](x: Self) {
    
    inline def setHealthChecks(value: js.Array[SchemaHealthCheck]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    inline def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    inline def setHealthChecksVarargs(value: SchemaHealthCheck*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
