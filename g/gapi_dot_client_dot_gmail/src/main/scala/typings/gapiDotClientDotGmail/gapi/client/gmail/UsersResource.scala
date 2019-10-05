package typings.gapiDotClientDotGmail.gapi.client.gmail

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGmail.Anon_Alt
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
  def getProfile(request: Anon_Alt): Request[Profile]
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(request: Anon_Alt): Request[Unit]
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: Anon_Alt): Request[WatchResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    drafts: DraftsResource,
    getProfile: Anon_Alt => Request[Profile],
    history: HistoryResource,
    labels: LabelsResource,
    messages: MessagesResource,
    settings: SettingsResource,
    stop: Anon_Alt => Request[Unit],
    threads: ThreadsResource,
    watch: Anon_Alt => Request[WatchResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(drafts = drafts, getProfile = js.Any.fromFunction1(getProfile), history = history, labels = labels, messages = messages, settings = settings, stop = js.Any.fromFunction1(stop), threads = threads, watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[UsersResource]
  }
}

