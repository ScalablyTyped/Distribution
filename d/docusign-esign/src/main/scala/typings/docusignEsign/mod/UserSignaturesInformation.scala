package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSignaturesInformation extends StObject {
  
  /**
    * An array of  `userSignature` objects.
    */
  var userSignatures: js.UndefOr[js.Array[UserSignature]] = js.undefined
}
object UserSignaturesInformation {
  
  inline def apply(): UserSignaturesInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignaturesInformation]
  }
  
  extension [Self <: UserSignaturesInformation](x: Self) {
    
    inline def setUserSignatures(value: js.Array[UserSignature]): Self = StObject.set(x, "userSignatures", value.asInstanceOf[js.Any])
    
    inline def setUserSignaturesUndefined: Self = StObject.set(x, "userSignatures", js.undefined)
    
    inline def setUserSignaturesVarargs(value: UserSignature*): Self = StObject.set(x, "userSignatures", js.Array(value :_*))
  }
}
