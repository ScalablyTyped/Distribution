package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthChecksResource extends js.Object {
  /** Deletes the specified HealthCheck resource. */
  def delete(request: typings.gapiClientCompute.anon.HealthCheck): Request[Operation]
  /** Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request. */
  def get(request: FieldsHealthCheck): Request[HealthCheck]
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(request: Alt): Request[HealthCheckList]
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: typings.gapiClientCompute.anon.HealthCheck): Request[Operation]
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: typings.gapiClientCompute.anon.HealthCheck): Request[Operation]
}

object HealthChecksResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.HealthCheck => Request[Operation],
    get: FieldsHealthCheck => Request[HealthCheck],
    insert: AltFields => Request[Operation],
    list: Alt => Request[HealthCheckList],
    patch: typings.gapiClientCompute.anon.HealthCheck => Request[Operation],
    update: typings.gapiClientCompute.anon.HealthCheck => Request[Operation]
  ): HealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HealthChecksResource]
  }
}

