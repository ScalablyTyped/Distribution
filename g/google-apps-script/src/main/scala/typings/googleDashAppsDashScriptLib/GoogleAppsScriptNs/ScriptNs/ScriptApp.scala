package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptApp extends js.Object {
  var AuthMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthMode */ js.Any = js.native
  var AuthorizationStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthorizationStatus */ js.Any = js.native
  var EventType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventType */ js.Any = js.native
  var InstallationSource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InstallationSource */ js.Any = js.native
  var TriggerSource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TriggerSource */ js.Any = js.native
  var WeekDay: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Weekday */ js.Any = js.native
  def deleteTrigger(trigger: Trigger): scala.Unit = js.native
  def getAuthorizationInfo(authMode: AuthMode): AuthorizationInfo = js.native
  def getInstallationSource(): InstallationSource = js.native
  def getOAuthToken(): java.lang.String = js.native
  def getProjectKey(): java.lang.String = js.native
  def getProjectTriggers(): js.Array[Trigger] = js.native
  def getScriptId(): java.lang.String = js.native
  def getScriptTriggers(): js.Array[Trigger] = js.native
  def getService(): Service = js.native
  def getUserTriggers(document: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.Document): js.Array[Trigger] = js.native
  def getUserTriggers(form: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Form): js.Array[Trigger] = js.native
  def getUserTriggers(spreadsheet: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet): js.Array[Trigger] = js.native
  def invalidateAuth(): scala.Unit = js.native
  def newStateToken(): StateTokenBuilder = js.native
  def newTrigger(functionName: java.lang.String): TriggerBuilder = js.native
}

