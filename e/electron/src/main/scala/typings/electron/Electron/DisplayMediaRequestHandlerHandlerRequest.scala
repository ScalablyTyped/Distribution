package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMediaRequestHandlerHandlerRequest extends StObject {
  
  /**
    * true if the web content requested an audio stream.
    */
  var audioRequested: Boolean
  
  /**
    * Frame that is requesting access to media.
    */
  var frame: WebFrameMain_
  
  /**
    * Origin of the page making the request.
    */
  var securityOrigin: String
  
  /**
    * Whether a user gesture was active when this request was triggered.
    */
  var userGesture: Boolean
  
  /**
    * true if the web content requested a video stream.
    */
  var videoRequested: Boolean
}
object DisplayMediaRequestHandlerHandlerRequest {
  
  inline def apply(
    audioRequested: Boolean,
    frame: WebFrameMain_,
    securityOrigin: String,
    userGesture: Boolean,
    videoRequested: Boolean
  ): DisplayMediaRequestHandlerHandlerRequest = {
    val __obj = js.Dynamic.literal(audioRequested = audioRequested.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], userGesture = userGesture.asInstanceOf[js.Any], videoRequested = videoRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMediaRequestHandlerHandlerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayMediaRequestHandlerHandlerRequest] (val x: Self) extends AnyVal {
    
    inline def setAudioRequested(value: Boolean): Self = StObject.set(x, "audioRequested", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setUserGesture(value: Boolean): Self = StObject.set(x, "userGesture", value.asInstanceOf[js.Any])
    
    inline def setVideoRequested(value: Boolean): Self = StObject.set(x, "videoRequested", value.asInstanceOf[js.Any])
  }
}
