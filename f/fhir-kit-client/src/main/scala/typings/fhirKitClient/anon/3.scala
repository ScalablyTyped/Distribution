package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.searchset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var `type`: searchset
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("searchset")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setType(value: searchset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
