package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkRecipientsUpdateResponse extends StObject {
  
  var signer: js.UndefOr[Signer] = js.undefined
}
object BulkRecipientsUpdateResponse {
  
  inline def apply(): BulkRecipientsUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientsUpdateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkRecipientsUpdateResponse] (val x: Self) extends AnyVal {
    
    inline def setSigner(value: Signer): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
  }
}
