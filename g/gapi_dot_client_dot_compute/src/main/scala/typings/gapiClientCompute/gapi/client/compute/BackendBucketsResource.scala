package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendBucketsResource extends js.Object {
  /** Deletes the specified BackendBucket resource. */
  def delete(request: typings.gapiClientCompute.anon.BackendBucket): Request[Operation]
  /** Returns the specified BackendBucket resource. Get a list of available backend buckets by making a list() request. */
  def get(request: UserIp): Request[BackendBucket]
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(request: Alt): Request[BackendBucketList]
  /**
    * Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: typings.gapiClientCompute.anon.BackendBucket): Request[Operation]
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: typings.gapiClientCompute.anon.BackendBucket): Request[Operation]
}

object BackendBucketsResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.BackendBucket => Request[Operation],
    get: UserIp => Request[BackendBucket],
    insert: AltFields => Request[Operation],
    list: Alt => Request[BackendBucketList],
    patch: typings.gapiClientCompute.anon.BackendBucket => Request[Operation],
    update: typings.gapiClientCompute.anon.BackendBucket => Request[Operation]
  ): BackendBucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BackendBucketsResource]
  }
}

