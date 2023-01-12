package typings.firebaseAnalyticsCompat.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itemid
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var item_id: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
}
object Itemid {
  
  inline def apply(): Itemid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Itemid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Itemid] (val x: Self) extends AnyVal {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
    
    inline def setItem_idUndefined: Self = StObject.set(x, "item_id", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
