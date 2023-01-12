package typings.firebaseAnalyticsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eventcategory
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var event_category: js.UndefOr[String] = js.undefined
  
  var event_label: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var value: Double
}
object Eventcategory {
  
  inline def apply(name: String, value: Double): Eventcategory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventcategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eventcategory] (val x: Self) extends AnyVal {
    
    inline def setEvent_category(value: String): Self = StObject.set(x, "event_category", value.asInstanceOf[js.Any])
    
    inline def setEvent_categoryUndefined: Self = StObject.set(x, "event_category", js.undefined)
    
    inline def setEvent_label(value: String): Self = StObject.set(x, "event_label", value.asInstanceOf[js.Any])
    
    inline def setEvent_labelUndefined: Self = StObject.set(x, "event_label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
