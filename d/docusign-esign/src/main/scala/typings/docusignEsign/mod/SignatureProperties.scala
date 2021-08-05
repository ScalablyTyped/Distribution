package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureProperties extends StObject {
  
  /**
    * Specifies the preferred handler that should be used to validate the signature.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the format of the data that the stream contains.
    */
  var subFilter: js.UndefOr[String] = js.undefined
}
object SignatureProperties {
  
  inline def apply(): SignatureProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureProperties]
  }
  
  extension [Self <: SignatureProperties](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setSubFilter(value: String): Self = StObject.set(x, "subFilter", value.asInstanceOf[js.Any])
    
    inline def setSubFilterUndefined: Self = StObject.set(x, "subFilter", js.undefined)
  }
}
