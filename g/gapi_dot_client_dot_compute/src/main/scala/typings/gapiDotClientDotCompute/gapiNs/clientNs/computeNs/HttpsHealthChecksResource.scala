package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsHttpsHealthCheck
import typings.gapiDotClientDotCompute.Anon_AltFieldsHttpsHealthCheckKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsHealthChecksResource extends js.Object {
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(request: Anon_AltFieldsHttpsHealthCheck): Request[Operation]
  /** Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request. */
  def get(request: Anon_AltFieldsHttpsHealthCheckKey): Request[HttpsHealthCheck]
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(request: Anon_Alt): Request[HttpsHealthCheckList]
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: Anon_AltFieldsHttpsHealthCheck): Request[Operation]
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: Anon_AltFieldsHttpsHealthCheck): Request[Operation]
}

object HttpsHealthChecksResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsHttpsHealthCheck => Request[Operation],
    get: Anon_AltFieldsHttpsHealthCheckKey => Request[HttpsHealthCheck],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[HttpsHealthCheckList],
    patch: Anon_AltFieldsHttpsHealthCheck => Request[Operation],
    update: Anon_AltFieldsHttpsHealthCheck => Request[Operation]
  ): HttpsHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HttpsHealthChecksResource]
  }
}

