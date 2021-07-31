package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typings.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var display: js.UndefOr[GadgetDisplayMode] = js.undefined
  
  var height: js.UndefOr[integer] = js.undefined
  
  var iconLink: String
  
  var link: String
  
  def preferences(key: String): String
  
  var title: String
  
  var `type`: String
  
  var width: js.UndefOr[integer] = js.undefined
}
object Height {
  
  @scala.inline
  def apply(iconLink: String, link: String, preferences: String => String, title: String, `type`: String): Height = {
    val __obj = js.Dynamic.literal(iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], preferences = js.Any.fromFunction1(preferences), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: GadgetDisplayMode): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferences(value: String => String): Self = StObject.set(x, "preferences", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
