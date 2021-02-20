package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of a Cloud Function backend.
  */
@js.native
trait SchemaBackendServiceCloudFunctionBackend extends StObject {
  
  /**
    * Required. A cloud function name. Special value ?*? represents all cloud
    * functions in the project.
    */
  var functionName: js.UndefOr[String] = js.native
  
  /**
    * Required. Project ID of the project hosting the cloud function.
    */
  var targetProject: js.UndefOr[String] = js.native
}
object SchemaBackendServiceCloudFunctionBackend {
  
  @scala.inline
  def apply(): SchemaBackendServiceCloudFunctionBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceCloudFunctionBackend]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceCloudFunctionBackendMutableBuilder[Self <: SchemaBackendServiceCloudFunctionBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    @scala.inline
    def setTargetProject(value: String): Self = StObject.set(x, "targetProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetProjectUndefined: Self = StObject.set(x, "targetProject", js.undefined)
  }
}
