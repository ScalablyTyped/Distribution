package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection

import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.DraftsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.HistoryCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.LabelsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.MessagesCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.SettingsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.ThreadsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Profile
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchRequest
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersCollection extends js.Object {
  
  var Drafts: js.UndefOr[DraftsCollection] = js.native
  
  var History: js.UndefOr[HistoryCollection] = js.native
  
  var Labels: js.UndefOr[LabelsCollection] = js.native
  
  var Messages: js.UndefOr[MessagesCollection] = js.native
  
  var Settings: js.UndefOr[SettingsCollection] = js.native
  
  var Threads: js.UndefOr[ThreadsCollection] = js.native
  
  // Gets the current user's Gmail profile.
  def getProfile(userId: String): Profile = js.native
  
  // Stop receiving push notifications for the given user mailbox.
  def stop(userId: String): Unit = js.native
  
  // Set up or update a push notification watch on the given user mailbox.
  def watch(resource: WatchRequest, userId: String): WatchResponse = js.native
}
object UsersCollection {
  
  @scala.inline
  def apply(
    getProfile: String => Profile,
    stop: String => Unit,
    watch: (WatchRequest, String) => WatchResponse
  ): UsersCollection = {
    val __obj = js.Dynamic.literal(getProfile = js.Any.fromFunction1(getProfile), stop = js.Any.fromFunction1(stop), watch = js.Any.fromFunction2(watch))
    __obj.asInstanceOf[UsersCollection]
  }
  
  @scala.inline
  implicit class UsersCollectionOps[Self <: UsersCollection] (val x: Self) extends AnyVal {
    
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
    def setGetProfile(value: String => Profile): Self = this.set("getProfile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: String => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWatch(value: (WatchRequest, String) => WatchResponse): Self = this.set("watch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrafts(value: DraftsCollection): Self = this.set("Drafts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrafts: Self = this.set("Drafts", js.undefined)
    
    @scala.inline
    def setHistory(value: HistoryCollection): Self = this.set("History", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("History", js.undefined)
    
    @scala.inline
    def setLabels(value: LabelsCollection): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    
    @scala.inline
    def setMessages(value: MessagesCollection): Self = this.set("Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
    
    @scala.inline
    def setSettings(value: SettingsCollection): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
    
    @scala.inline
    def setThreads(value: ThreadsCollection): Self = this.set("Threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreads: Self = this.set("Threads", js.undefined)
  }
}
