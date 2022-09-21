package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMediaMountEvent extends StObject {
  
  /**
    * Mount point.
    */
  var mountPoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Volume label. Redacted to empty string on organization-owned managed profile devices.
    */
  var volumeLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaMediaMountEvent {
  
  inline def apply(): SchemaMediaMountEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMediaMountEvent]
  }
  
  extension [Self <: SchemaMediaMountEvent](x: Self) {
    
    inline def setMountPoint(value: String): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
    
    inline def setMountPointNull: Self = StObject.set(x, "mountPoint", null)
    
    inline def setMountPointUndefined: Self = StObject.set(x, "mountPoint", js.undefined)
    
    inline def setVolumeLabel(value: String): Self = StObject.set(x, "volumeLabel", value.asInstanceOf[js.Any])
    
    inline def setVolumeLabelNull: Self = StObject.set(x, "volumeLabel", null)
    
    inline def setVolumeLabelUndefined: Self = StObject.set(x, "volumeLabel", js.undefined)
  }
}
