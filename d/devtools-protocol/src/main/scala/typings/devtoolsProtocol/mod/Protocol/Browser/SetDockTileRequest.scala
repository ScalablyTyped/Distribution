package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDockTileRequest extends StObject {
  
  var badgeLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Png encoded image.
    */
  var image: js.UndefOr[String] = js.undefined
}
object SetDockTileRequest {
  
  @scala.inline
  def apply(): SetDockTileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDockTileRequest]
  }
  
  @scala.inline
  implicit class SetDockTileRequestMutableBuilder[Self <: SetDockTileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadgeLabel(value: String): Self = StObject.set(x, "badgeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeLabelUndefined: Self = StObject.set(x, "badgeLabel", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
