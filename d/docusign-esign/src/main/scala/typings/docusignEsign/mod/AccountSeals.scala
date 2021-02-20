package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSeals extends StObject {
  
  /**
    * A list of electronic seals to apply to documents.
    */
  var seals: js.UndefOr[js.Array[SealIdentifier]] = js.native
}
object AccountSeals {
  
  @scala.inline
  def apply(): AccountSeals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSeals]
  }
  
  @scala.inline
  implicit class AccountSealsMutableBuilder[Self <: AccountSeals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeals(value: js.Array[SealIdentifier]): Self = StObject.set(x, "seals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealsUndefined: Self = StObject.set(x, "seals", js.undefined)
    
    @scala.inline
    def setSealsVarargs(value: SealIdentifier*): Self = StObject.set(x, "seals", js.Array(value :_*))
  }
}
