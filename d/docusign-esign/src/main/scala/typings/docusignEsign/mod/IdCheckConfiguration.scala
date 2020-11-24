package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdCheckConfiguration extends js.Object {
  
  /**
    * A list of ID check security steps, each specifying an authorization type.
    */
  var authSteps: js.UndefOr[js.Array[IdCheckSecurityStep]] = js.native
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * The name of the signature.
    */
  var name: js.UndefOr[String] = js.native
}
object IdCheckConfiguration {
  
  @scala.inline
  def apply(): IdCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckConfiguration]
  }
  
  @scala.inline
  implicit class IdCheckConfigurationOps[Self <: IdCheckConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAuthStepsVarargs(value: IdCheckSecurityStep*): Self = this.set("authSteps", js.Array(value :_*))
    
    @scala.inline
    def setAuthSteps(value: js.Array[IdCheckSecurityStep]): Self = this.set("authSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSteps: Self = this.set("authSteps", js.undefined)
    
    @scala.inline
    def setIsDefault(value: String): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
