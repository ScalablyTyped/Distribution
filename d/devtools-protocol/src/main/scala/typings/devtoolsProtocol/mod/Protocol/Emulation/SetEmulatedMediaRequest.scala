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
  
  @scala.inline
  def apply(): SetEmulatedMediaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetEmulatedMediaRequest]
  }
  
  @scala.inline
  implicit class SetEmulatedMediaRequestMutableBuilder[Self <: SetEmulatedMediaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[MediaFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: MediaFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
