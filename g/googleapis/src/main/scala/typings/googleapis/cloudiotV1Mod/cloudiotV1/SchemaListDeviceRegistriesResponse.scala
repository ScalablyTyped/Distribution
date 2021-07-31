package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for `ListDeviceRegistries`.
  */
trait SchemaListDeviceRegistriesResponse extends StObject {
  
  /**
    * The registries that matched the query.
    */
  var deviceRegistries: js.UndefOr[js.Array[SchemaDeviceRegistry]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDeviceRegistriesResponse {
  
  @scala.inline
  def apply(): SchemaListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceRegistriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDeviceRegistriesResponseMutableBuilder[Self <: SchemaListDeviceRegistriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceRegistries(value: js.Array[SchemaDeviceRegistry]): Self = StObject.set(x, "deviceRegistries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRegistriesUndefined: Self = StObject.set(x, "deviceRegistries", js.undefined)
    
    @scala.inline
    def setDeviceRegistriesVarargs(value: SchemaDeviceRegistry*): Self = StObject.set(x, "deviceRegistries", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
