package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLogging.AnonAccesstokenAltBearertoken
import typings.gapiClientLogging.AnonAccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiClientLogging.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import typings.gapiClientLogging.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinksResource extends js.Object {
  /**
    * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's
    * writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
    */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[LogSink]
  /** Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted. */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request_[js.Object]
  /** Gets a sink. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request_[LogSink]
  /** Lists sinks. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListSinksResponse]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[LogSink]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def update(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[LogSink]
}

object SinksResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[LogSink],
    delete: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request_[LogSink],
    list: AnonAccesstokenAltBearertoken => Request_[ListSinksResponse],
    patch: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[LogSink],
    update: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[LogSink]
  ): SinksResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SinksResource]
  }
}

