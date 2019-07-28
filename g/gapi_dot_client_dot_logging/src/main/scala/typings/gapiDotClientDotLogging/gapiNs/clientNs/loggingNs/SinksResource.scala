package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinksResource extends js.Object {
  /**
    * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's
    * writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
    */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[LogSink]
  /** Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted. */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[js.Object]
  /** Gets a sink. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[LogSink]
  /** Lists sinks. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListSinksResponse]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[LogSink]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def update(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[LogSink]
}

object SinksResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[LogSink],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[LogSink],
    list: Anon_AccesstokenAltBearertoken => Request[ListSinksResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[LogSink],
    update: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[LogSink]
  ): SinksResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SinksResource]
  }
}

