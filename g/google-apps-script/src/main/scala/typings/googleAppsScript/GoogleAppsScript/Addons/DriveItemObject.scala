package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Object with information on Drive items
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#drive_item
  */
trait DriveItemObject extends StObject {
  
  var addonHasFileScopePermission: Boolean
  
  var iconUrl: String
  
  var id: String
  
  var mimeType: String
  
  var title: String
}
object DriveItemObject {
  
  inline def apply(addonHasFileScopePermission: Boolean, iconUrl: String, id: String, mimeType: String, title: String): DriveItemObject = {
    val __obj = js.Dynamic.literal(addonHasFileScopePermission = addonHasFileScopePermission.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveItemObject]
  }
  
  extension [Self <: DriveItemObject](x: Self) {
    
    inline def setAddonHasFileScopePermission(value: Boolean): Self = StObject.set(x, "addonHasFileScopePermission", value.asInstanceOf[js.Any])
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
