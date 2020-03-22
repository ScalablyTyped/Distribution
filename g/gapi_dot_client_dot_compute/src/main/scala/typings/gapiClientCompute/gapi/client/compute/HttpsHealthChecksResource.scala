package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonFieldsHttpsHealthCheck
import typings.gapiClientCompute.AnonHttpsHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsHealthChecksResource extends js.Object {
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(request: AnonHttpsHealthCheck): Request_[Operation]
  /** Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request. */
  def get(request: AnonFieldsHttpsHealthCheck): Request_[HttpsHealthCheck]
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HttpsHealthCheckList]
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: AnonHttpsHealthCheck): Request_[Operation]
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHttpsHealthCheck): Request_[Operation]
}

object HttpsHealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHttpsHealthCheck => Request_[Operation],
    get: AnonFieldsHttpsHealthCheck => Request_[HttpsHealthCheck],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[HttpsHealthCheckList],
    patch: AnonHttpsHealthCheck => Request_[Operation],
    update: AnonHttpsHealthCheck => Request_[Operation]
  ): HttpsHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HttpsHealthChecksResource]
  }
}

