package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This resource represents a long-running operation that is the result of a
  * network API call.
  */
trait SchemaOperation extends StObject {
  
  /**
    * If the value is `false`, it means the operation is still in progress. If
    * `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field will always be not set if the operation is created by
    * `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`. In this case,
    * error information for each device is set in
    * `response.perDeviceStatus.result.status`.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * This field will contain a `DevicesLongRunningOperationMetadata` object if
    * the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The server-assigned name, which is only unique within the same service
    * that originally returns it. If you use the default HTTP mapping, the
    * `name` should have the format of `operations/some/unique/name`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This field will contain a `DevicesLongRunningOperationResponse` object if
    * the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaOperation {
  
  inline def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  extension [Self <: SchemaOperation](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResponse(value: StringDictionary[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
