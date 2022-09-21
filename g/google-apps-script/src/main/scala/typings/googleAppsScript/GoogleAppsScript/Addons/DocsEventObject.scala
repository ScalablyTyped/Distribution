package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Event object with information on user's document and its contents
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#docs_event_object
  */
trait DocsEventObject extends StObject {
  
  var addonHasFileScopePermission: Boolean
  
  var id: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DocsEventObject {
  
  inline def apply(addonHasFileScopePermission: Boolean): DocsEventObject = {
    val __obj = js.Dynamic.literal(addonHasFileScopePermission = addonHasFileScopePermission.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocsEventObject]
  }
  
  extension [Self <: DocsEventObject](x: Self) {
    
    inline def setAddonHasFileScopePermission(value: Boolean): Self = StObject.set(x, "addonHasFileScopePermission", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
