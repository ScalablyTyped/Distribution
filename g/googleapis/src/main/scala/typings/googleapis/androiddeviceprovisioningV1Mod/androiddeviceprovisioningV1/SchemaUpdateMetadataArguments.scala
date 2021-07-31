package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies metdata updates to one device.
  */
trait SchemaUpdateMetadataArguments extends StObject {
  
  /**
    * Device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Device identifier.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
  
  /**
    * Required. The metadata to update.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.undefined
}
object SchemaUpdateMetadataArguments {
  
  @scala.inline
  def apply(): SchemaUpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateMetadataArguments]
  }
  
  @scala.inline
  implicit class SchemaUpdateMetadataArgumentsMutableBuilder[Self <: SchemaUpdateMetadataArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: SchemaDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
  }
}
