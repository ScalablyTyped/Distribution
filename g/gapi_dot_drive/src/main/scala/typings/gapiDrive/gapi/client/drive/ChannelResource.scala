package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.apiNumbersignchannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelResource extends StObject {
  
  var expiration: Double = js.native
  
  var id: String = js.native
  
  var kind: apiNumbersignchannel = js.native
  
  var resourceId: String = js.native
  
  var resourceUri: String = js.native
  
  var token: String = js.native
}
object ChannelResource {
  
  @scala.inline
  def apply(
    expiration: Double,
    id: String,
    kind: apiNumbersignchannel,
    resourceId: String,
    resourceUri: String,
    token: String
  ): ChannelResource = {
    val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelResource]
  }
  
  @scala.inline
  implicit class ChannelResourceMutableBuilder[Self <: ChannelResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: apiNumbersignchannel): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
