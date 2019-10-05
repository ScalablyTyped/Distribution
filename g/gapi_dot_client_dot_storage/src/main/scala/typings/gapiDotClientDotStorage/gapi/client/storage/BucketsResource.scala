package typings.gapiDotClientDotStorage.gapi.client.storage

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotStorage.Anon_AltBucket
import typings.gapiDotClientDotStorage.Anon_AltBucketFields
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsIfMetagenerationMatch
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsKey
import typings.gapiDotClientDotStorage.Anon_AltFields
import typings.gapiDotClientDotStorage.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: Anon_AltBucketFields): Request[Unit]
  /** Returns metadata for the specified bucket. */
  def get(request: Anon_AltBucketFieldsIfMetagenerationMatch): Request[Bucket]
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: Anon_AltBucket): Request[Policy]
  /** Creates a new bucket. */
  def insert(request: Anon_AltFields): Request[Bucket]
  /** Retrieves a list of buckets for a given project. */
  def list(request: Anon_AltFieldsKey): Request[Buckets]
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: Anon_AltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch): Request[Bucket]
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: Anon_AltBucket): Request[Policy]
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: Anon_AltBucketFieldsKey): Request[TestIamPermissionsResponse]
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: Anon_AltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch): Request[Bucket]
}

object BucketsResource {
  @scala.inline
  def apply(
    delete: Anon_AltBucketFields => Request[Unit],
    get: Anon_AltBucketFieldsIfMetagenerationMatch => Request[Bucket],
    getIamPolicy: Anon_AltBucket => Request[Policy],
    insert: Anon_AltFields => Request[Bucket],
    list: Anon_AltFieldsKey => Request[Buckets],
    patch: Anon_AltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch => Request[Bucket],
    setIamPolicy: Anon_AltBucket => Request[Policy],
    testIamPermissions: Anon_AltBucketFieldsKey => Request[TestIamPermissionsResponse],
    update: Anon_AltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch => Request[Bucket]
  ): BucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BucketsResource]
  }
}

