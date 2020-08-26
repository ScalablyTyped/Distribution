package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLogging.anon.Bearertoken
import typings.gapiClientLogging.anon.Key
import typings.gapiClientLogging.anon.Oauthtoken
import typings.gapiClientLogging.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinksResource extends js.Object {
  /**
    * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's
    * writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
    */
  def create(request: Key): Request[LogSink] = js.native
  /** Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted. */
  def delete(request: Oauthtoken): Request[js.Object] = js.native
  /** Gets a sink. */
  def get(request: Oauthtoken): Request[LogSink] = js.native
  /** Lists sinks. */
  def list(request: Bearertoken): Request[ListSinksResponse] = js.native
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def patch(request: Pp): Request[LogSink] = js.native
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def update(request: Pp): Request[LogSink] = js.native
}

object SinksResource {
  @scala.inline
  def apply(
    create: Key => Request[LogSink],
    delete: Oauthtoken => Request[js.Object],
    get: Oauthtoken => Request[LogSink],
    list: Bearertoken => Request[ListSinksResponse],
    patch: Pp => Request[LogSink],
    update: Pp => Request[LogSink]
  ): SinksResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SinksResource]
  }
  @scala.inline
  implicit class SinksResourceOps[Self <: SinksResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Key => Request[LogSink]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Oauthtoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Oauthtoken => Request[LogSink]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListSinksResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Pp => Request[LogSink]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Pp => Request[LogSink]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

