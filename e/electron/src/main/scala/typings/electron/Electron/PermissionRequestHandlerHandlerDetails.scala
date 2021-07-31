package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRequestHandlerHandlerDetails extends StObject {
  
  /**
    * The url of the `openExternal` request.
    */
  var externalURL: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean
  
  /**
    * The types of media access being requested, elements can be `video` or `audio`
    */
  var mediaTypes: js.UndefOr[js.Array[video | audio]] = js.undefined
  
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String
}
object PermissionRequestHandlerHandlerDetails {
  
  @scala.inline
  def apply(isMainFrame: Boolean, requestingUrl: String): PermissionRequestHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequestHandlerHandlerDetails]
  }
  
  @scala.inline
  implicit class PermissionRequestHandlerHandlerDetailsMutableBuilder[Self <: PermissionRequestHandlerHandlerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalURL(value: String): Self = StObject.set(x, "externalURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalURLUndefined: Self = StObject.set(x, "externalURL", js.undefined)
    
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = StObject.set(x, "isMainFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypes(value: js.Array[video | audio]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
    
    @scala.inline
    def setMediaTypesVarargs(value: (video | audio)*): Self = StObject.set(x, "mediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setRequestingUrl(value: String): Self = StObject.set(x, "requestingUrl", value.asInstanceOf[js.Any])
  }
}
