package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonBackendBucket
import typings.gapiClientCompute.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendBucketsResource extends js.Object {
  /** Deletes the specified BackendBucket resource. */
  def delete(request: AnonBackendBucket): Request_[Operation]
  /** Returns the specified BackendBucket resource. Get a list of available backend buckets by making a list() request. */
  def get(request: AnonUserIp): Request_[BackendBucket]
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(request: AnonAlt): Request_[BackendBucketList]
  /**
    * Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: AnonBackendBucket): Request_[Operation]
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: AnonBackendBucket): Request_[Operation]
}

object BackendBucketsResource {
  @scala.inline
  def apply(
    delete: AnonBackendBucket => Request_[Operation],
    get: AnonUserIp => Request_[BackendBucket],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[BackendBucketList],
    patch: AnonBackendBucket => Request_[Operation],
    update: AnonBackendBucket => Request_[Operation]
  ): BackendBucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BackendBucketsResource]
  }
}

