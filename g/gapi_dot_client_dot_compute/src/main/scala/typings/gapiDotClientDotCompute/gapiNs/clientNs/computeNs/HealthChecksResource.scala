package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsHealthCheck
import typings.gapiDotClientDotCompute.Anon_AltFieldsHealthCheckKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthChecksResource extends js.Object {
  /** Deletes the specified HealthCheck resource. */
  def delete(request: Anon_AltFieldsHealthCheck): Request[Operation]
  /** Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request. */
  def get(request: Anon_AltFieldsHealthCheckKey): Request[HealthCheck]
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(request: Anon_Alt): Request[HealthCheckList]
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: Anon_AltFieldsHealthCheck): Request[Operation]
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: Anon_AltFieldsHealthCheck): Request[Operation]
}

object HealthChecksResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsHealthCheck => Request[Operation],
    get: Anon_AltFieldsHealthCheckKey => Request[HealthCheck],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[HealthCheckList],
    patch: Anon_AltFieldsHealthCheck => Request[Operation],
    update: Anon_AltFieldsHealthCheck => Request[Operation]
  ): HealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HealthChecksResource]
  }
}

