package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticsSettingsInformation extends StObject {
  
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
  implicit class DiagnosticsSettingsInformationMutableBuilder[Self <: DiagnosticsSettingsInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiRequestLogMaxEntries(value: String): Self = StObject.set(x, "apiRequestLogMaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestLogMaxEntriesUndefined: Self = StObject.set(x, "apiRequestLogMaxEntries", js.undefined)
    
    @scala.inline
    def setApiRequestLogRemainingEntries(value: String): Self = StObject.set(x, "apiRequestLogRemainingEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestLogRemainingEntriesUndefined: Self = StObject.set(x, "apiRequestLogRemainingEntries", js.undefined)
    
    @scala.inline
    def setApiRequestLogging(value: String): Self = StObject.set(x, "apiRequestLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestLoggingUndefined: Self = StObject.set(x, "apiRequestLogging", js.undefined)
  }
}
