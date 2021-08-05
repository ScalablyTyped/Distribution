package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the given google.longrunning.Operation.
  */
trait SchemaOperationMetadataV1Beta extends StObject {
  
  var createVersionMetadata: js.UndefOr[SchemaCreateVersionMetadataV1Beta] = js.undefined
  
  /**
    * Time that this operation completed.@OutputOnly
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Ephemeral message that may change every time the operation is polled.
    * @OutputOnly
    */
  var ephemeralMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Time that this operation was created.@OutputOnly
    */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /**
    * API method that initiated this operation. Example:
    * google.appengine.v1beta.Versions.CreateVersion.@OutputOnly
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource that this operation is acting on. Example:
    * apps/myapp/services/default.@OutputOnly
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * User who requested this operation.@OutputOnly
    */
  var user: js.UndefOr[String] = js.undefined
  
  /**
    * Durable messages that persist on every operation poll. @OutputOnly
    */
  var warning: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaOperationMetadataV1Beta {
  
  inline def apply(): SchemaOperationMetadataV1Beta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadataV1Beta]
  }
  
  extension [Self <: SchemaOperationMetadataV1Beta](x: Self) {
    
    inline def setCreateVersionMetadata(value: SchemaCreateVersionMetadataV1Beta): Self = StObject.set(x, "createVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setCreateVersionMetadataUndefined: Self = StObject.set(x, "createVersionMetadata", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEphemeralMessage(value: String): Self = StObject.set(x, "ephemeralMessage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralMessageUndefined: Self = StObject.set(x, "ephemeralMessage", js.undefined)
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWarning(value: js.Array[String]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    inline def setWarningVarargs(value: String*): Self = StObject.set(x, "warning", js.Array(value :_*))
  }
}
