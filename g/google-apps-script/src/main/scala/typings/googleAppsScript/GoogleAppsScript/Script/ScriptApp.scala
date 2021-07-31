package typings.googleAppsScript.GoogleAppsScript.Script

import typings.googleAppsScript.GoogleAppsScript.Document.Document
import typings.googleAppsScript.GoogleAppsScript.Forms.Form
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and manipulate script publishing and triggers. This class allows users to create script
  * triggers and control publishing the script as a service.
  */
@js.native
trait ScriptApp extends StObject {
  
  var AuthMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthMode */ js.Any = js.native
  
  var AuthorizationStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthorizationStatus */ js.Any = js.native
  
  var EventType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventType */ js.Any = js.native
  
  var InstallationSource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InstallationSource */ js.Any = js.native
  
  var TriggerSource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TriggerSource */ js.Any = js.native
  
  var WeekDay: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Weekday */ js.Any = js.native
  
  def deleteTrigger(trigger: Trigger): Unit = js.native
  
  def getAuthorizationInfo(authMode: AuthMode): AuthorizationInfo = js.native
  
  def getIdentityToken(): String = js.native
  
  def getInstallationSource(): InstallationSource = js.native
  
  def getOAuthToken(): String = js.native
  
  /** @deprecated DO NOT USE */ def getProjectKey(): String = js.native
  
  def getProjectTriggers(): js.Array[Trigger] = js.native
  
  def getScriptId(): String = js.native
  
  /** @deprecated DO NOT USE */ def getScriptTriggers(): js.Array[Trigger] = js.native
  
  def getService(): Service = js.native
  
  def getUserTriggers(document: Document): js.Array[Trigger] = js.native
  def getUserTriggers(form: Form): js.Array[Trigger] = js.native
  def getUserTriggers(spreadsheet: Spreadsheet): js.Array[Trigger] = js.native
  
  def invalidateAuth(): Unit = js.native
  
  def newStateToken(): StateTokenBuilder = js.native
  
  def newTrigger(functionName: String): TriggerBuilder = js.native
}
