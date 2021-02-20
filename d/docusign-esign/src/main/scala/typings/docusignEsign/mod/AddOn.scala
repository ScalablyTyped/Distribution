package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOn extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var active: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var addOnId: js.UndefOr[String] = js.native
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var name: js.UndefOr[String] = js.native
}
object AddOn {
  
  @scala.inline
  def apply(): AddOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOn]
  }
  
  @scala.inline
  implicit class AddOnMutableBuilder[Self <: AddOn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAddOnId(value: String): Self = StObject.set(x, "addOnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnIdUndefined: Self = StObject.set(x, "addOnId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
