package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagKey extends StObject {
  
  var tagKey: js.UndefOr[String] = js.undefined
  
  var tagValue: js.UndefOr[String] = js.undefined
}
object TagKey {
  
  inline def apply(): TagKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKey]
  }
  
  extension [Self <: TagKey](x: Self) {
    
    inline def setTagKey(value: String): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
    
    inline def setTagValue(value: String): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
  }
}
