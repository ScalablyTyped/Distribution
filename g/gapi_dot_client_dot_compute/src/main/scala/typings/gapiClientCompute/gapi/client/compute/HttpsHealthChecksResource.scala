package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsHttpsHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsHealthChecksResource extends js.Object {
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(request: typings.gapiClientCompute.anon.HttpsHealthCheck): Request[Operation]
  /** Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request. */
  def get(request: FieldsHttpsHealthCheck): Request[HttpsHealthCheck]
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(request: Alt): Request[HttpsHealthCheckList]
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: typings.gapiClientCompute.anon.HttpsHealthCheck): Request[Operation]
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: typings.gapiClientCompute.anon.HttpsHealthCheck): Request[Operation]
}

object HttpsHealthChecksResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation],
    get: FieldsHttpsHealthCheck => Request[HttpsHealthCheck],
    insert: AltFields => Request[Operation],
    list: Alt => Request[HttpsHealthCheckList],
    patch: typings.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation],
    update: typings.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation]
  ): HttpsHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HttpsHealthChecksResource]
  }
}

