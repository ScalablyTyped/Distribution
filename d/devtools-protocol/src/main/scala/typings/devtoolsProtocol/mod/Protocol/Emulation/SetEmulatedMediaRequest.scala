package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEmulatedMediaRequest extends StObject {
  
  /**
    * Media features to emulate.
    */
  var features: js.UndefOr[js.Array[MediaFeature]] = js.undefined
  
  /**
    * Media type to emulate. Empty string disables the override.
    */
  var media: js.UndefOr[String] = js.undefined
}
object SetEmulatedMediaRequest {
  
  inline def apply(): SetEmulatedMediaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetEmulatedMediaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetEmulatedMediaRequest] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[MediaFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: MediaFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
