package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectType extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var objectType: js.UndefOr[String] = js.undefined
  
  var originalContent: js.UndefOr[String] = js.undefined
}
object ObjectType {
  
  inline def apply(): ObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectType]
  }
  
  extension [Self <: ObjectType](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOriginalContent(value: String): Self = StObject.set(x, "originalContent", value.asInstanceOf[js.Any])
    
    inline def setOriginalContentUndefined: Self = StObject.set(x, "originalContent", js.undefined)
  }
}
