package typings.evernote.anon

import typings.evernote.mod.Types.LazyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationData extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var applicationData: js.UndefOr[LazyMap] = js.undefined
  
  var attachment: js.UndefOr[Boolean] = js.undefined
  
  var cameraMake: js.UndefOr[String] = js.undefined
  
  var cameraModel: js.UndefOr[String] = js.undefined
  
  var clientWillIndex: js.UndefOr[Boolean] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var recoType: js.UndefOr[String] = js.undefined
  
  var sourceURL: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object ApplicationData {
  
  inline def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  
  extension [Self <: ApplicationData](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setApplicationData(value: LazyMap): Self = StObject.set(x, "applicationData", value.asInstanceOf[js.Any])
    
    inline def setApplicationDataUndefined: Self = StObject.set(x, "applicationData", js.undefined)
    
    inline def setAttachment(value: Boolean): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setCameraMake(value: String): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
    
    inline def setCameraMakeUndefined: Self = StObject.set(x, "cameraMake", js.undefined)
    
    inline def setCameraModel(value: String): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
    
    inline def setCameraModelUndefined: Self = StObject.set(x, "cameraModel", js.undefined)
    
    inline def setClientWillIndex(value: Boolean): Self = StObject.set(x, "clientWillIndex", value.asInstanceOf[js.Any])
    
    inline def setClientWillIndexUndefined: Self = StObject.set(x, "clientWillIndex", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setRecoType(value: String): Self = StObject.set(x, "recoType", value.asInstanceOf[js.Any])
    
    inline def setRecoTypeUndefined: Self = StObject.set(x, "recoType", js.undefined)
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    inline def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
