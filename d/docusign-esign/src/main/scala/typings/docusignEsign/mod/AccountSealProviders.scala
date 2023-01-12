package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSealProviders extends StObject {
  
  /**
    * A list of electronic seals to apply to documents.
    */
  var seals: js.UndefOr[js.Array[SealIdentifier]] = js.undefined
}
object AccountSealProviders {
  
  inline def apply(): AccountSealProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSealProviders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSealProviders] (val x: Self) extends AnyVal {
    
    inline def setSeals(value: js.Array[SealIdentifier]): Self = StObject.set(x, "seals", value.asInstanceOf[js.Any])
    
    inline def setSealsUndefined: Self = StObject.set(x, "seals", js.undefined)
    
    inline def setSealsVarargs(value: SealIdentifier*): Self = StObject.set(x, "seals", js.Array(value*))
  }
}
