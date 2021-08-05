package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeUrl extends StObject {
  
  var badgeUrl: js.UndefOr[String] = js.undefined
  
  var categoryId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object BadgeUrl {
  
  inline def apply(): BadgeUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeUrl]
  }
  
  extension [Self <: BadgeUrl](x: Self) {
    
    inline def setBadgeUrl(value: String): Self = StObject.set(x, "badgeUrl", value.asInstanceOf[js.Any])
    
    inline def setBadgeUrlUndefined: Self = StObject.set(x, "badgeUrl", js.undefined)
    
    inline def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
