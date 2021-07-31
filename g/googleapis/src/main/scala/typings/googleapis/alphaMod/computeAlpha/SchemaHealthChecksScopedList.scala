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
  
  @scala.inline
  def apply(): SchemaHealthChecksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthChecksScopedList]
  }
  
  @scala.inline
  implicit class SchemaHealthChecksScopedListMutableBuilder[Self <: SchemaHealthChecksScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthChecks(value: js.Array[SchemaHealthCheck]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: SchemaHealthCheck*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
