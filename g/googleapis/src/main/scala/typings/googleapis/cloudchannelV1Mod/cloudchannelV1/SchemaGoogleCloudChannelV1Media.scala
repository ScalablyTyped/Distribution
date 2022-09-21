package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Media extends StObject {
  
  /**
    * URL of the media.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the media.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the media.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1Media {
  
  inline def apply(): SchemaGoogleCloudChannelV1Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Media]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Media](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
