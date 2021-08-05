package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryBookshelvesMovevolume
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of bookshelf with the volume.
    */
  var shelf: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * ID of volume to move.
    */
  var volumeId: js.UndefOr[String] = js.undefined
  
  /**
    * Position on shelf to move the item (0 puts the item before the current
    * first item, 1 puts it between the first and the second and so on.)
    */
  var volumePosition: js.UndefOr[Double] = js.undefined
}
object ParamsResourceMylibraryBookshelvesMovevolume {
  
  inline def apply(): ParamsResourceMylibraryBookshelvesMovevolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryBookshelvesMovevolume]
  }
  
  extension [Self <: ParamsResourceMylibraryBookshelvesMovevolume](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setShelf(value: String): Self = StObject.set(x, "shelf", value.asInstanceOf[js.Any])
    
    inline def setShelfUndefined: Self = StObject.set(x, "shelf", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
    
    inline def setVolumePosition(value: Double): Self = StObject.set(x, "volumePosition", value.asInstanceOf[js.Any])
    
    inline def setVolumePositionUndefined: Self = StObject.set(x, "volumePosition", js.undefined)
  }
}
