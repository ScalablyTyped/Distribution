package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileNotifierConfigurationInformation extends js.Object {
  
  var mobileNotifierConfigurations: js.UndefOr[js.Array[MobileNotifierConfiguration]] = js.native
}
object MobileNotifierConfigurationInformation {
  
  @scala.inline
  def apply(): MobileNotifierConfigurationInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileNotifierConfigurationInformation]
  }
  
  @scala.inline
  implicit class MobileNotifierConfigurationInformationOps[Self <: MobileNotifierConfigurationInformation] (val x: Self) extends AnyVal {
    
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
    def setMobileNotifierConfigurationsVarargs(value: MobileNotifierConfiguration*): Self = this.set("mobileNotifierConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setMobileNotifierConfigurations(value: js.Array[MobileNotifierConfiguration]): Self = this.set("mobileNotifierConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileNotifierConfigurations: Self = this.set("mobileNotifierConfigurations", js.undefined)
  }
}
