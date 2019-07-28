package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.DraftsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.HistoryCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.LabelsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.MessagesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.ThreadsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.Profile
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCollection extends js.Object {
  var Drafts: js.UndefOr[DraftsCollection] = js.undefined
  var History: js.UndefOr[HistoryCollection] = js.undefined
  var Labels: js.UndefOr[LabelsCollection] = js.undefined
  var Messages: js.UndefOr[MessagesCollection] = js.undefined
  var Settings: js.UndefOr[SettingsCollection] = js.undefined
  var Threads: js.UndefOr[ThreadsCollection] = js.undefined
  // Gets the current user's Gmail profile.
  def getProfile(userId: String): Profile
  // Stop receiving push notifications for the given user mailbox.
  def stop(userId: String): Unit
  // Set up or update a push notification watch on the given user mailbox.
  def watch(resource: WatchRequest, userId: String): WatchResponse
}

object UsersCollection {
  @scala.inline
  def apply(
    getProfile: String => Profile,
    stop: String => Unit,
    watch: (WatchRequest, String) => WatchResponse,
    Drafts: DraftsCollection = null,
    History: HistoryCollection = null,
    Labels: LabelsCollection = null,
    Messages: MessagesCollection = null,
    Settings: SettingsCollection = null,
    Threads: ThreadsCollection = null
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

