package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryReadingpositionsSetposition
  extends StObject
     with StandardParameters {
  
  /**
    * Action that caused this reading position to be set.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Volume content version for which this reading position applies.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Random persistent device cookie optional on set position.
    */
  var deviceCookie: js.UndefOr[String] = js.undefined
  
  /**
    * Position string for the new volume reading position.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 UTC format timestamp associated with this reading position.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * ID of volume for which to update the reading position.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMylibraryReadingpositionsSetposition {
  
  inline def apply(): ParamsResourceMylibraryReadingpositionsSetposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryReadingpositionsSetposition]
  }
  
  extension [Self <: ParamsResourceMylibraryReadingpositionsSetposition](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setDeviceCookie(value: String): Self = StObject.set(x, "deviceCookie", value.asInstanceOf[js.Any])
    
    inline def setDeviceCookieUndefined: Self = StObject.set(x, "deviceCookie", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
