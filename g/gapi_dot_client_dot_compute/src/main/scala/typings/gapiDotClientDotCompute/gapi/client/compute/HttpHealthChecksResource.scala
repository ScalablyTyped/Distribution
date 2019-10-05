package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsHttpHealthCheck
import typings.gapiDotClientDotCompute.Anon_AltFieldsHttpHealthCheckKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: Anon_AltFieldsHttpHealthCheck): Request[Operation]
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: Anon_AltFieldsHttpHealthCheckKey): Request[HttpHealthCheck]
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: Anon_Alt): Request[HttpHealthCheckList]
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: Anon_AltFieldsHttpHealthCheck): Request[Operation]
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: Anon_AltFieldsHttpHealthCheck): Request[Operation]
}

object HttpHealthChecksResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsHttpHealthCheck => Request[Operation],
    get: Anon_AltFieldsHttpHealthCheckKey => Request[HttpHealthCheck],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[HttpHealthCheckList],
    patch: Anon_AltFieldsHttpHealthCheck => Request[Operation],
    update: Anon_AltFieldsHttpHealthCheck => Request[Operation]
  ): HttpHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HttpHealthChecksResource]
  }
}

