package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the given google.longrunning.Operation.
  */
@js.native
trait SchemaOperationMetadataV1 extends StObject {
  
  var createVersionMetadata: js.UndefOr[SchemaCreateVersionMetadataV1] = js.native
  
  /**
    * Time that this operation completed.@OutputOnly
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Ephemeral message that may change every time the operation is polled.
    * @OutputOnly
    */
  var ephemeralMessage: js.UndefOr[String] = js.native
  
  /**
    * Time that this operation was created.@OutputOnly
    */
  var insertTime: js.UndefOr[String] = js.native
  
  /**
    * API method that initiated this operation. Example:
    * google.appengine.v1.Versions.CreateVersion.@OutputOnly
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource that this operation is acting on. Example:
    * apps/myapp/services/default.@OutputOnly
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * User who requested this operation.@OutputOnly
    */
  var user: js.UndefOr[String] = js.native
  
  /**
    * Durable messages that persist on every operation poll. @OutputOnly
    */
  var warning: js.UndefOr[js.Array[String]] = js.native
}
object SchemaOperationMetadataV1 {
  
  @scala.inline
  def apply(): SchemaOperationMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadataV1]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataV1MutableBuilder[Self <: SchemaOperationMetadataV1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateVersionMetadata(value: SchemaCreateVersionMetadataV1): Self = StObject.set(x, "createVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVersionMetadataUndefined: Self = StObject.set(x, "createVersionMetadata", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEphemeralMessage(value: String): Self = StObject.set(x, "ephemeralMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEphemeralMessageUndefined: Self = StObject.set(x, "ephemeralMessage", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setWarning(value: js.Array[String]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: String*): Self = StObject.set(x, "warning", js.Array(value :_*))
  }
}
