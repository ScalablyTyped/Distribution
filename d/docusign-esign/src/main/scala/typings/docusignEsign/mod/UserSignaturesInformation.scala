package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSignaturesInformation extends StObject {
  
  /**
    * An array of  `userSignature` objects.
    */
  var userSignatures: js.UndefOr[js.Array[UserSignature]] = js.native
}
object UserSignaturesInformation {
  
  @scala.inline
  def apply(): UserSignaturesInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignaturesInformation]
  }
  
  @scala.inline
  implicit class UserSignaturesInformationMutableBuilder[Self <: UserSignaturesInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserSignatures(value: js.Array[UserSignature]): Self = StObject.set(x, "userSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSignaturesUndefined: Self = StObject.set(x, "userSignatures", js.undefined)
    
    @scala.inline
    def setUserSignaturesVarargs(value: UserSignature*): Self = StObject.set(x, "userSignatures", js.Array(value :_*))
  }
}
