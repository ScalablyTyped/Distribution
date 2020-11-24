package typings.dwt.webTwainIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseDetailItem extends js.Object {
  
  val Browser: String = js.native
  
  val EnumLicenseType: String = js.native
  
  val ExpireDate: String = js.native
  
  val LicenseType: String = js.native
  
  val OS: String = js.native
  
  val Trial: String = js.native
  
  val Version: String = js.native
}
object LicenseDetailItem {
  
  @scala.inline
  def apply(
    Browser: String,
    EnumLicenseType: String,
    ExpireDate: String,
    LicenseType: String,
    OS: String,
    Trial: String,
    Version: String
  ): LicenseDetailItem = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], EnumLicenseType = EnumLicenseType.asInstanceOf[js.Any], ExpireDate = ExpireDate.asInstanceOf[js.Any], LicenseType = LicenseType.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], Trial = Trial.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseDetailItem]
  }
  
  @scala.inline
  implicit class LicenseDetailItemOps[Self <: LicenseDetailItem] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: String): Self = this.set("Browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumLicenseType(value: String): Self = this.set("EnumLicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireDate(value: String): Self = this.set("ExpireDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseType(value: String): Self = this.set("LicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOS(value: String): Self = this.set("OS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrial(value: String): Self = this.set("Trial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
