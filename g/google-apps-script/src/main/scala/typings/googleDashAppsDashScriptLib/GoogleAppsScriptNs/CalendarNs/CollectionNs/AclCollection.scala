package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclCollection extends js.Object {
  // Returns an access control rule.
  def get(calendarId: java.lang.String, ruleId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Returns an access control rule.
  def get(
    calendarId: java.lang.String,
    ruleId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Creates an access control rule.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Creates an access control rule.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Creates an access control rule.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Returns the rules in the access control list for the calendar.
  def list(calendarId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Acl = js.native
  // Returns the rules in the access control list for the calendar.
  def list(calendarId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Acl = js.native
  // Returns the rules in the access control list for the calendar.
  def list(calendarId: java.lang.String, optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Acl = js.native
  // Updates an access control rule. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    ruleId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Updates an access control rule. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    ruleId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Updates an access control rule. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    ruleId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Deletes an access control rule.
  def remove(calendarId: java.lang.String, ruleId: java.lang.String): scala.Unit = js.native
  // Deletes an access control rule.
  def remove(
    calendarId: java.lang.String,
    ruleId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): scala.Unit = js.native
  // Updates an access control rule.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    ruleId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Updates an access control rule.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    ruleId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Updates an access control rule.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule,
    calendarId: java.lang.String,
    ruleId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule = js.native
  // Watch for changes to ACL resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
  // Watch for changes to ACL resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel,
    calendarId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
  // Watch for changes to ACL resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
}

