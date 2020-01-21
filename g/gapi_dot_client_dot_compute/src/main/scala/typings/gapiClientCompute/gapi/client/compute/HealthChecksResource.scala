package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsHealthCheck
import typings.gapiClientCompute.AnonAltFieldsHealthCheckKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthChecksResource extends js.Object {
  /** Deletes the specified HealthCheck resource. */
  def delete(request: AnonAltFieldsHealthCheck): Request_[Operation]
  /** Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request. */
  def get(request: AnonAltFieldsHealthCheckKey): Request_[HealthCheck]
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HealthCheckList]
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: AnonAltFieldsHealthCheck): Request_[Operation]
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonAltFieldsHealthCheck): Request_[Operation]
}

object HealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsHealthCheck => Request_[Operation],
    get: AnonAltFieldsHealthCheckKey => Request_[HealthCheck],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[HealthCheckList],
    patch: AnonAltFieldsHealthCheck => Request_[Operation],
    update: AnonAltFieldsHealthCheck => Request_[Operation]
  ): HealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HealthChecksResource]
  }
}

