package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkRecipientSignatureProvider extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies the value of the tab.
    */
  var value: js.UndefOr[String] = js.native
}
object BulkRecipientSignatureProvider {
  
  @scala.inline
  def apply(): BulkRecipientSignatureProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientSignatureProvider]
  }
  
  @scala.inline
  implicit class BulkRecipientSignatureProviderMutableBuilder[Self <: BulkRecipientSignatureProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
