package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A full or valid partial URL to a health check. For example, the following
  * are valid URLs:   -
  * https://www.googleapis.com/compute/beta/projects/project-id/global/httpHealthChecks/health-check
  * - projects/project-id/global/httpHealthChecks/health-check  -
  * global/httpHealthChecks/health-check
  */
trait SchemaHealthCheckReference extends StObject {
  
  var healthCheck: js.UndefOr[String] = js.undefined
}
object SchemaHealthCheckReference {
  
  @scala.inline
  def apply(): SchemaHealthCheckReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckReference]
  }
  
  @scala.inline
  implicit class SchemaHealthCheckReferenceMutableBuilder[Self <: SchemaHealthCheckReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
