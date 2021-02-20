package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadata extends StObject {
  
  var location: DeveloperMetadataLocation = js.native
  
  var metadataId: Double = js.native
  
  var metadataKey: String = js.native
  
  var metadataValue: String = js.native
  
  var visibility: DeveloperMetadataVisibility = js.native
}
object DeveloperMetadata {
  
  @scala.inline
  def apply(
    location: DeveloperMetadataLocation,
    metadataId: Double,
    metadataKey: String,
    metadataValue: String,
    visibility: DeveloperMetadataVisibility
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], metadataId = metadataId.asInstanceOf[js.Any], metadataKey = metadataKey.asInstanceOf[js.Any], metadataValue = metadataValue.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadata]
  }
  
  @scala.inline
  implicit class DeveloperMetadataMutableBuilder[Self <: DeveloperMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: DeveloperMetadataLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataId(value: Double): Self = StObject.set(x, "metadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataKey(value: String): Self = StObject.set(x, "metadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataValue(value: String): Self = StObject.set(x, "metadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: DeveloperMetadataVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
