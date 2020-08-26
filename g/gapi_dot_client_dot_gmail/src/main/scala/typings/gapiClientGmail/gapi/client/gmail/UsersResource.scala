package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  var drafts: DraftsResource = js.native
  var history: HistoryResource = js.native
  var labels: LabelsResource = js.native
  var messages: MessagesResource = js.native
  var settings: SettingsResource = js.native
  var threads: ThreadsResource = js.native
  /** Gets the current user's Gmail profile. */
  def getProfile(request: Alt): Request[Profile] = js.native
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(request: Alt): Request[Unit] = js.native
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: Alt): Request[WatchResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    drafts: DraftsResource,
    getProfile: Alt => Request[Profile],
    history: HistoryResource,
    labels: LabelsResource,
    messages: MessagesResource,
    settings: SettingsResource,
    stop: Alt => Request[Unit],
    threads: ThreadsResource,
    watch: Alt => Request[WatchResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(drafts = drafts.asInstanceOf[js.Any], getProfile = js.Any.fromFunction1(getProfile), history = history.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stop = js.Any.fromFunction1(stop), threads = threads.asInstanceOf[js.Any], watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
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
    def setDrafts(value: DraftsResource): Self = this.set("drafts", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetProfile(value: Alt => Request[Profile]): Self = this.set("getProfile", js.Any.fromFunction1(value))
    @scala.inline
    def setHistory(value: HistoryResource): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: LabelsResource): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessages(value: MessagesResource): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: SettingsResource): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: Alt => Request[Unit]): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def setThreads(value: ThreadsResource): Self = this.set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatch(value: Alt => Request[WatchResponse]): Self = this.set("watch", js.Any.fromFunction1(value))
  }
  
}

