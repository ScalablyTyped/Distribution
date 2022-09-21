package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDockTileRequest extends StObject {
  
  var badgeLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Png encoded image. (Encoded as a base64 string when passed over JSON)
    */
  var image: js.UndefOr[String] = js.undefined
}
object SetDockTileRequest {
  
  inline def apply(): SetDockTileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDockTileRequest]
  }
  
  extension [Self <: SetDockTileRequest](x: Self) {
    
    inline def setBadgeLabel(value: String): Self = StObject.set(x, "badgeLabel", value.asInstanceOf[js.Any])
    
    inline def setBadgeLabelUndefined: Self = StObject.set(x, "badgeLabel", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
