package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCollection extends js.Object {
  var Drafts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.DraftsCollection
  ] = js.undefined
  var History: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.HistoryCollection
  ] = js.undefined
  var Labels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.LabelsCollection
  ] = js.undefined
  var Messages: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.MessagesCollection
  ] = js.undefined
  var Settings: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsCollection
  ] = js.undefined
  var Threads: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.ThreadsCollection
  ] = js.undefined
  // Gets the current user's Gmail profile.
  def getProfile(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Profile
  // Stop receiving push notifications for the given user mailbox.
  def stop(userId: java.lang.String): scala.Unit
  // Set up or update a push notification watch on the given user mailbox.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.WatchRequest,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.WatchResponse
}

object UsersCollection {
  @scala.inline
  def apply(
    getProfile: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Profile,
    stop: java.lang.String => scala.Unit,
    watch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.WatchRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.WatchResponse,
    Drafts: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.DraftsCollection = null,
    History: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.HistoryCollection = null,
    Labels: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.LabelsCollection = null,
    Messages: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.MessagesCollection = null,
    Settings: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsCollection = null,
    Threads: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.ThreadsCollection = null
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

