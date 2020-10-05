package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Privileges extends js.Object {
  /**
    * Default false.
    */
  var allowServiceWorkers: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var bypassCSP: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var corsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var standard: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var supportFetchAPI: js.UndefOr[Boolean] = js.native
}

object Privileges {
  @scala.inline
  def apply(): Privileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privileges]
  }
  @scala.inline
  implicit class PrivilegesOps[Self <: Privileges] (val x: Self) extends AnyVal {
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
    def setAllowServiceWorkers(value: Boolean): Self = this.set("allowServiceWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowServiceWorkers: Self = this.set("allowServiceWorkers", js.undefined)
    @scala.inline
    def setBypassCSP(value: Boolean): Self = this.set("bypassCSP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassCSP: Self = this.set("bypassCSP", js.undefined)
    @scala.inline
    def setCorsEnabled(value: Boolean): Self = this.set("corsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorsEnabled: Self = this.set("corsEnabled", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setStandard(value: Boolean): Self = this.set("standard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
    @scala.inline
    def setSupportFetchAPI(value: Boolean): Self = this.set("supportFetchAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportFetchAPI: Self = this.set("supportFetchAPI", js.undefined)
  }
  
}

