package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ETags extends StObject {
  
  var eTags: js.UndefOr[js.Array[String]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var uploadKey: js.UndefOr[String] = js.undefined
}
object ETags {
  
  inline def apply(): ETags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ETags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ETags] (val x: Self) extends AnyVal {
    
    inline def setETags(value: js.Array[String]): Self = StObject.set(x, "eTags", value.asInstanceOf[js.Any])
    
    inline def setETagsUndefined: Self = StObject.set(x, "eTags", js.undefined)
    
    inline def setETagsVarargs(value: String*): Self = StObject.set(x, "eTags", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUploadKey(value: String): Self = StObject.set(x, "uploadKey", value.asInstanceOf[js.Any])
    
    inline def setUploadKeyUndefined: Self = StObject.set(x, "uploadKey", js.undefined)
  }
}
