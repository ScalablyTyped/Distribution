package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlusCode extends StObject {
  
  /**
    * A plus code with a 1/8000th of a degree by 1/8000th of a degree area
    * where the first four characters (the area code) are dropped and replaced
    * with a locality description. For example, &quot;9G8F+5W Zurich,
    * Switzerland&quot;.
    */
  var compoundCode: String | Null
  
  /**
    * A plus code with a 1/8000th of a degree by 1/8000th of a degree area. For
    * example, &quot;8FVC9G8F+5W&quot;.
    */
  var globalCode: String | Null
}
object PlusCode {
  
  inline def apply(): PlusCode = {
    val __obj = js.Dynamic.literal(compoundCode = null, globalCode = null)
    __obj.asInstanceOf[PlusCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusCode] (val x: Self) extends AnyVal {
    
    inline def setCompoundCode(value: String): Self = StObject.set(x, "compoundCode", value.asInstanceOf[js.Any])
    
    inline def setCompoundCodeNull: Self = StObject.set(x, "compoundCode", null)
    
    inline def setGlobalCode(value: String): Self = StObject.set(x, "globalCode", value.asInstanceOf[js.Any])
    
    inline def setGlobalCodeNull: Self = StObject.set(x, "globalCode", null)
  }
}
