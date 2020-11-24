package typings.devcert.mod

import typings.devcert.userInterfaceMod.UserInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Return the CA certificate data? */
  var getCaBuffer: js.UndefOr[Boolean] = js.native
  
  /** Return the path to the CA certificate? */
  var getCaPath: js.UndefOr[Boolean] = js.native
  
  /** If `certutil` is not installed already (for updating nss databases; e.g. firefox), do not attempt to install it */
  var skipCertutilInstall: js.UndefOr[Boolean] = js.native
  
  /** Do not update your systems host file with the domain name of the certificate */
  var skipHostsFile: js.UndefOr[Boolean] = js.native
  
  /** User interface hooks */
  var ui: js.UndefOr[UserInterface] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setGetCaBuffer(value: Boolean): Self = this.set("getCaBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCaBuffer: Self = this.set("getCaBuffer", js.undefined)
    
    @scala.inline
    def setGetCaPath(value: Boolean): Self = this.set("getCaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCaPath: Self = this.set("getCaPath", js.undefined)
    
    @scala.inline
    def setSkipCertutilInstall(value: Boolean): Self = this.set("skipCertutilInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipCertutilInstall: Self = this.set("skipCertutilInstall", js.undefined)
    
    @scala.inline
    def setSkipHostsFile(value: Boolean): Self = this.set("skipHostsFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipHostsFile: Self = this.set("skipHostsFile", js.undefined)
    
    @scala.inline
    def setUi(value: UserInterface): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
}
