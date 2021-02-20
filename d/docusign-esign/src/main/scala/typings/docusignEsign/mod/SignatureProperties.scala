package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureProperties extends StObject {
  
  /**
    * Specifies the preferred handler that should be used to validate the signature.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Indicates the format of the data that the stream contains.
    */
  var subFilter: js.UndefOr[String] = js.native
}
object SignatureProperties {
  
  @scala.inline
  def apply(): SignatureProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureProperties]
  }
  
  @scala.inline
  implicit class SignaturePropertiesMutableBuilder[Self <: SignatureProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setSubFilter(value: String): Self = StObject.set(x, "subFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFilterUndefined: Self = StObject.set(x, "subFilter", js.undefined)
  }
}
