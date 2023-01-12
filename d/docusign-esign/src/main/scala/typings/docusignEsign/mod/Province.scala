package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Province extends StObject {
  
  var isoCode: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object Province {
  
  inline def apply(): Province = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Province]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Province] (val x: Self) extends AnyVal {
    
    inline def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
    
    inline def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
