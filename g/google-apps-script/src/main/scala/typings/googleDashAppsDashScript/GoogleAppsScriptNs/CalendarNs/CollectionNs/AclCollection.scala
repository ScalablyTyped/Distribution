package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Acl
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclCollection extends js.Object {
  // Returns an access control rule.
  def get(calendarId: String, ruleId: String): AclRule = js.native
  // Returns an access control rule.
  def get(calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
  // Creates an access control rule.
  def insert(resource: AclRule, calendarId: String): AclRule = js.native
  // Creates an access control rule.
  def insert(resource: AclRule, calendarId: String, optionalArgs: js.Object): AclRule = js.native
  // Creates an access control rule.
  def insert(resource: AclRule, calendarId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
  // Returns the rules in the access control list for the calendar.
  def list(calendarId: String): Acl = js.native
  // Returns the rules in the access control list for the calendar.
  def list(calendarId: String, optionalArgs: js.Object): Acl = js.native
  // Returns the rules in the access control list for the calendar.
  def list(calendarId: String, optionalArgs: js.Object, headers: js.Object): Acl = js.native
  // Updates an access control rule. This method supports patch semantics.
  def patch(resource: AclRule, calendarId: String, ruleId: String): AclRule = js.native
  // Updates an access control rule. This method supports patch semantics.
  def patch(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object): AclRule = js.native
  // Updates an access control rule. This method supports patch semantics.
  def patch(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
  // Deletes an access control rule.
  def remove(calendarId: String, ruleId: String): Unit = js.native
  // Deletes an access control rule.
  def remove(calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
  // Updates an access control rule.
  def update(resource: AclRule, calendarId: String, ruleId: String): AclRule = js.native
  // Updates an access control rule.
  def update(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object): AclRule = js.native
  // Updates an access control rule.
  def update(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
  // Watch for changes to ACL resources.
  def watch(resource: Channel, calendarId: String): Channel = js.native
  // Watch for changes to ACL resources.
  def watch(resource: Channel, calendarId: String, optionalArgs: js.Object): Channel = js.native
  // Watch for changes to ACL resources.
  def watch(resource: Channel, calendarId: String, optionalArgs: js.Object, headers: js.Object): Channel = js.native
}

