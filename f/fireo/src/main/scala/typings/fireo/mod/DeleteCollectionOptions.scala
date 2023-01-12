package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectionOptions extends StObject {
  
  var child: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
}
object DeleteCollectionOptions {
  
  inline def apply(): DeleteCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCollectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCollectionOptions] (val x: Self) extends AnyVal {
    
    inline def setChild(value: Boolean): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
