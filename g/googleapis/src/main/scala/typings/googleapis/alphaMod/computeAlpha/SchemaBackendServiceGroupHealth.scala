package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBackendServiceGroupHealth extends StObject {
  
  /**
    * Metadata defined as annotations on the network endpoint group.
    */
  var annotations: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Health state of the backend instances or endpoints in requested instance
    * or network endpoint group, determined based on configured health checks.
    */
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#backendServiceGroupHealth
    * for the health of backend services.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaBackendServiceGroupHealth {
  
  @scala.inline
  def apply(): SchemaBackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceGroupHealth]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceGroupHealthMutableBuilder[Self <: SchemaBackendServiceGroupHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: js.Array[SchemaHealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    @scala.inline
    def setHealthStatusVarargs(value: SchemaHealthStatus*): Self = StObject.set(x, "healthStatus", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
