package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSeals extends StObject {
  
  /**
    * A list of electronic seals to apply to documents.
    */
  var seals: js.UndefOr[js.Array[SealIdentifier]] = js.undefined
}
object AccountSeals {
  
  inline def apply(): AccountSeals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSeals]
  }
  
  extension [Self <: AccountSeals](x: Self) {
    
    inline def setSeals(value: js.Array[SealIdentifier]): Self = StObject.set(x, "seals", value.asInstanceOf[js.Any])
    
    inline def setSealsUndefined: Self = StObject.set(x, "seals", js.undefined)
    
    inline def setSealsVarargs(value: SealIdentifier*): Self = StObject.set(x, "seals", js.Array(value*))
  }
}
