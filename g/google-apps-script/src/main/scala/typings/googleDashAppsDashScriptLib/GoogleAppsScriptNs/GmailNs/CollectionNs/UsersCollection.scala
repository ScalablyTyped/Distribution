package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCollection extends js.Object {
  var Drafts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.DraftsCollection
  ] = js.undefined
  var History: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.HistoryCollection
  ] = js.undefined
  var Labels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.LabelsCollection
  ] = js.undefined
  var Messages: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.MessagesCollection
  ] = js.undefined
  var Settings: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsCollection
  ] = js.undefined
  var Threads: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.ThreadsCollection
  ] = js.undefined
  // Gets the current user's Gmail profile.
  def getProfile(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Profile
  // Stop receiving push notifications for the given user mailbox.
  def stop(userId: java.lang.String): scala.Unit
  // Set up or update a push notification watch on the given user mailbox.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchRequest,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchResponse
}

object UsersCollection {
  @scala.inline
  def apply(
    getProfile: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Profile,
    stop: java.lang.String => scala.Unit,
    watch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchResponse,
    Drafts: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.DraftsCollection = null,
    History: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.HistoryCollection = null,
    Labels: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.LabelsCollection = null,
    Messages: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.MessagesCollection = null,
    Settings: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsCollection = null,
    Threads: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.ThreadsCollection = null
  ): UsersCollection = {
    val __obj = js.Dynamic.literal(getProfile = js.Any.fromFunction1(getProfile), stop = js.Any.fromFunction1(stop), watch = js.Any.fromFunction2(watch))
    if (Drafts != null) __obj.updateDynamic("Drafts")(Drafts)
    if (History != null) __obj.updateDynamic("History")(History)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    if (Threads != null) __obj.updateDynamic("Threads")(Threads)
    __obj.asInstanceOf[UsersCollection]
  }
}

