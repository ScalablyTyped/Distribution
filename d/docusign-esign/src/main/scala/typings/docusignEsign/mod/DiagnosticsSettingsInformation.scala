package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticsSettingsInformation extends js.Object {
  
  /**
    * Specifies the maximum number of API requests to log.
    */
  var apiRequestLogMaxEntries: js.UndefOr[String] = js.native
  
  /**
    * Indicates the remaining number of API requests that can be logged.
    */
  var apiRequestLogRemainingEntries: js.UndefOr[String] = js.native
  
  /**
    *  When set to **true**, enables API request logging for the user.
    */
  var apiRequestLogging: js.UndefOr[String] = js.native
}
object DiagnosticsSettingsInformation {
  
  @scala.inline
  def apply(): DiagnosticsSettingsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticsSettingsInformation]
  }
  
  @scala.inline
  implicit class DiagnosticsSettingsInformationOps[Self <: DiagnosticsSettingsInformation] (val x: Self) extends AnyVal {
    
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
    def setApiRequestLogMaxEntries(value: String): Self = this.set("apiRequestLogMaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiRequestLogMaxEntries: Self = this.set("apiRequestLogMaxEntries", js.undefined)
    
    @scala.inline
    def setApiRequestLogRemainingEntries(value: String): Self = this.set("apiRequestLogRemainingEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiRequestLogRemainingEntries: Self = this.set("apiRequestLogRemainingEntries", js.undefined)
    
    @scala.inline
    def setApiRequestLogging(value: String): Self = this.set("apiRequestLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiRequestLogging: Self = this.set("apiRequestLogging", js.undefined)
  }
}
