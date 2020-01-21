package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsHttpHealthCheck
import typings.gapiClientCompute.AnonAltFieldsHttpHealthCheckKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: AnonAltFieldsHttpHealthCheck): Request_[Operation]
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: AnonAltFieldsHttpHealthCheckKey): Request_[HttpHealthCheck]
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HttpHealthCheckList]
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: AnonAltFieldsHttpHealthCheck): Request_[Operation]
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonAltFieldsHttpHealthCheck): Request_[Operation]
}

object HttpHealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsHttpHealthCheck => Request_[Operation],
    get: AnonAltFieldsHttpHealthCheckKey => Request_[HttpHealthCheck],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[HttpHealthCheckList],
    patch: AnonAltFieldsHttpHealthCheck => Request_[Operation],
    update: AnonAltFieldsHttpHealthCheck => Request_[Operation]
  ): HttpHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HttpHealthChecksResource]
  }
}

