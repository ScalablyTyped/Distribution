package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonFieldsHttpHealthCheck
import typings.gapiClientCompute.AnonHttpHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: AnonHttpHealthCheck): Request_[Operation]
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: AnonFieldsHttpHealthCheck): Request_[HttpHealthCheck]
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HttpHealthCheckList]
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: AnonHttpHealthCheck): Request_[Operation]
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHttpHealthCheck): Request_[Operation]
}

object HttpHealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHttpHealthCheck => Request_[Operation],
    get: AnonFieldsHttpHealthCheck => Request_[HttpHealthCheck],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[HttpHealthCheckList],
    patch: AnonHttpHealthCheck => Request_[Operation],
    update: AnonHttpHealthCheck => Request_[Operation]
  ): HttpHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HttpHealthChecksResource]
  }
}

