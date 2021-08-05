package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of a Cloud Function backend.
  */
trait SchemaBackendServiceCloudFunctionBackend extends StObject {
  
  /**
    * Required. A cloud function name. Special value ?*? represents all cloud
    * functions in the project.
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project ID of the project hosting the cloud function.
    */
  var targetProject: js.UndefOr[String] = js.undefined
}
object SchemaBackendServiceCloudFunctionBackend {
  
  inline def apply(): SchemaBackendServiceCloudFunctionBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceCloudFunctionBackend]
  }
  
  extension [Self <: SchemaBackendServiceCloudFunctionBackend](x: Self) {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setTargetProject(value: String): Self = StObject.set(x, "targetProject", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectUndefined: Self = StObject.set(x, "targetProject", js.undefined)
  }
}
