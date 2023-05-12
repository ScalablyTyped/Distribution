package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parts extends StObject {
  
  var firstParts: js.UndefOr[Double] = js.undefined
  
  var objectKey: String
  
  var parts: js.UndefOr[Double] = js.undefined
  
  var uploadKey: js.UndefOr[String] = js.undefined
}
object Parts {
  
  inline def apply(objectKey: String): Parts = {
    val __obj = js.Dynamic.literal(objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parts] (val x: Self) extends AnyVal {
    
    inline def setFirstParts(value: Double): Self = StObject.set(x, "firstParts", value.asInstanceOf[js.Any])
    
    inline def setFirstPartsUndefined: Self = StObject.set(x, "firstParts", js.undefined)
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setUploadKey(value: String): Self = StObject.set(x, "uploadKey", value.asInstanceOf[js.Any])
    
    inline def setUploadKeyUndefined: Self = StObject.set(x, "uploadKey", js.undefined)
  }
}
