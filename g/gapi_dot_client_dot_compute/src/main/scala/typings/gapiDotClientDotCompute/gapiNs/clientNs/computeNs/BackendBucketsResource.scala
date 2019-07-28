package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltBackendBucket
import typings.gapiDotClientDotCompute.Anon_AltBackendBucketFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendBucketsResource extends js.Object {
  /** Deletes the specified BackendBucket resource. */
  def delete(request: Anon_AltBackendBucket): Request[Operation]
  /** Returns the specified BackendBucket resource. Get a list of available backend buckets by making a list() request. */
  def get(request: Anon_AltBackendBucketFields): Request[BackendBucket]
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(request: Anon_Alt): Request[BackendBucketList]
  /**
    * Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: Anon_AltBackendBucket): Request[Operation]
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: Anon_AltBackendBucket): Request[Operation]
}

object BackendBucketsResource {
  @scala.inline
  def apply(
    delete: Anon_AltBackendBucket => Request[Operation],
    get: Anon_AltBackendBucketFields => Request[BackendBucket],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[BackendBucketList],
    patch: Anon_AltBackendBucket => Request[Operation],
    update: Anon_AltBackendBucket => Request[Operation]
  ): BackendBucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BackendBucketsResource]
  }
}

