package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails extends StObject {
  
  /**
    * The version of the current config.
    */
  var currentConfigVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The latest error message.
    */
  var errorMsg: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the expected config.
    */
  var expectedConfigVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The extended status. Such as ExitCode, StartedAt, FinishedAt, etc.
    */
  var extendedStatus: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails](x: Self) {
    
    inline def setCurrentConfigVersion(value: String): Self = StObject.set(x, "currentConfigVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentConfigVersionNull: Self = StObject.set(x, "currentConfigVersion", null)
    
    inline def setCurrentConfigVersionUndefined: Self = StObject.set(x, "currentConfigVersion", js.undefined)
    
    inline def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
    
    inline def setErrorMsgNull: Self = StObject.set(x, "errorMsg", null)
    
    inline def setErrorMsgUndefined: Self = StObject.set(x, "errorMsg", js.undefined)
    
    inline def setExpectedConfigVersion(value: String): Self = StObject.set(x, "expectedConfigVersion", value.asInstanceOf[js.Any])
    
    inline def setExpectedConfigVersionNull: Self = StObject.set(x, "expectedConfigVersion", null)
    
    inline def setExpectedConfigVersionUndefined: Self = StObject.set(x, "expectedConfigVersion", js.undefined)
    
    inline def setExtendedStatus(value: StringDictionary[String]): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatusNull: Self = StObject.set(x, "extendedStatus", null)
    
    inline def setExtendedStatusUndefined: Self = StObject.set(x, "extendedStatus", js.undefined)
  }
}
