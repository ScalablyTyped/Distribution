package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.unknown_
import typings.electron.electronStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionCheckHandlerHandlerDetails extends StObject {
  
  /**
    * The origin of the frame embedding the frame that made the permission check.
    * Only set for cross-origin sub frames making permission checks.
    */
  var embeddingOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean
  
  /**
    * The type of media access being requested, can be `video`, `audio` or `unknown`
    */
  var mediaType: js.UndefOr[video | audio | unknown_] = js.undefined
  
  /**
    * The last URL the requesting frame loaded.  This is not provided for cross-origin
    * sub frames making permission checks.
    */
  var requestingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The security origin of the `media` check.
    */
  var securityOrigin: js.UndefOr[String] = js.undefined
}
object PermissionCheckHandlerHandlerDetails {
  
  inline def apply(isMainFrame: Boolean): PermissionCheckHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionCheckHandlerHandlerDetails]
  }
  
  extension [Self <: PermissionCheckHandlerHandlerDetails](x: Self) {
    
    inline def setEmbeddingOrigin(value: String): Self = StObject.set(x, "embeddingOrigin", value.asInstanceOf[js.Any])
    
    inline def setEmbeddingOriginUndefined: Self = StObject.set(x, "embeddingOrigin", js.undefined)
    
    inline def setIsMainFrame(value: Boolean): Self = StObject.set(x, "isMainFrame", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: video | audio | unknown_): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setRequestingUrl(value: String): Self = StObject.set(x, "requestingUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestingUrlUndefined: Self = StObject.set(x, "requestingUrl", js.undefined)
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setSecurityOriginUndefined: Self = StObject.set(x, "securityOrigin", js.undefined)
  }
}
