package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSignaturesInformation extends js.Object {
  
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
  implicit class UserSignaturesInformationOps[Self <: UserSignaturesInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserSignaturesVarargs(value: UserSignature*): Self = this.set("userSignatures", js.Array(value :_*))
    
    @scala.inline
    def setUserSignatures(value: js.Array[UserSignature]): Self = this.set("userSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSignatures: Self = this.set("userSignatures", js.undefined)
  }
}
