package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a request to list devices for a given enterprise.
  */
trait SchemaListDevicesResponse extends StObject {
  
  /**
    * The list of devices.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.undefined
  
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDevicesResponse {
  
  @scala.inline
  def apply(): SchemaListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDevicesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDevicesResponseMutableBuilder[Self <: SchemaListDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[SchemaDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: SchemaDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
