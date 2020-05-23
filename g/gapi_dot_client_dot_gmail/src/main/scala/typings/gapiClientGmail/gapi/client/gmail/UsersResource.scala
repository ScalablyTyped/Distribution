package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  var drafts: DraftsResource
  var history: HistoryResource
  var labels: LabelsResource
  var messages: MessagesResource
  var settings: SettingsResource
  var threads: ThreadsResource
  /** Gets the current user's Gmail profile. */
  def getProfile(request: Alt): Request[Profile]
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(request: Alt): Request[Unit]
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: Alt): Request[WatchResponse]
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
}

