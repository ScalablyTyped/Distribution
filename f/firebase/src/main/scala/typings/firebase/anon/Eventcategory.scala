package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eventcategory
  extends /* key */ StringDictionary[js.Any] {
  
  var event_category: js.UndefOr[String] = js.native
  
  var event_label: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var value: Double = js.native
}
object Eventcategory {
  
  @scala.inline
  def apply(name: String, value: Double): Eventcategory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventcategory]
  }
  
  @scala.inline
  implicit class EventcategoryMutableBuilder[Self <: Eventcategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent_category(value: String): Self = StObject.set(x, "event_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_categoryUndefined: Self = StObject.set(x, "event_category", js.undefined)
    
    @scala.inline
    def setEvent_label(value: String): Self = StObject.set(x, "event_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_labelUndefined: Self = StObject.set(x, "event_label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
