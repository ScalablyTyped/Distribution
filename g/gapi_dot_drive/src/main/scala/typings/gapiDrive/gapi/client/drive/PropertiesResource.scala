package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.drive$property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesResource extends StObject {
  
  var etag: String = js.native
  
  var key: String = js.native
  
  var kind: drive$property = js.native
  
  var selfLink: String = js.native
  
  var value: String = js.native
  
  var visibility: String = js.native
}
object PropertiesResource {
  
  @scala.inline
  def apply(
    etag: String,
    key: String,
    kind: drive$property,
    selfLink: String,
    value: String,
    visibility: String
  ): PropertiesResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesResource]
  }
  
  @scala.inline
  implicit class PropertiesResourceMutableBuilder[Self <: PropertiesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: drive$property): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
