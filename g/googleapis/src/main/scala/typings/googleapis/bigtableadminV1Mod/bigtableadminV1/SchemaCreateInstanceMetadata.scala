package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for the Operation returned by CreateInstance.
  */
trait SchemaCreateInstanceMetadata extends StObject {
  
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.undefined
  
  /**
    * The request that prompted the initiation of this CreateInstance
    * operation.
    */
  var originalRequest: js.UndefOr[SchemaCreateInstanceRequest] = js.undefined
  
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.undefined
}
object SchemaCreateInstanceMetadata {
  
  @scala.inline
  def apply(): SchemaCreateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceMetadata]
  }
  
  @scala.inline
  implicit class SchemaCreateInstanceMetadataMutableBuilder[Self <: SchemaCreateInstanceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    @scala.inline
    def setOriginalRequest(value: SchemaCreateInstanceRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    @scala.inline
    def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
