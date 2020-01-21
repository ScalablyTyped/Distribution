package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonAltBucket
import typings.gapiClientStorage.AnonAltBucketFields
import typings.gapiClientStorage.AnonAltBucketFieldsIfMetagenerationMatch
import typings.gapiClientStorage.AnonAltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch
import typings.gapiClientStorage.AnonAltBucketFieldsKey
import typings.gapiClientStorage.AnonAltFields
import typings.gapiClientStorage.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: AnonAltBucketFields): Request_[Unit]
  /** Returns metadata for the specified bucket. */
  def get(request: AnonAltBucketFieldsIfMetagenerationMatch): Request_[Bucket]
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: AnonAltBucket): Request_[Policy]
  /** Creates a new bucket. */
  def insert(request: AnonAltFields): Request_[Bucket]
  /** Retrieves a list of buckets for a given project. */
  def list(request: AnonAltFieldsKey): Request_[Buckets]
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: AnonAltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch): Request_[Bucket]
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: AnonAltBucket): Request_[Policy]
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonAltBucketFieldsKey): Request_[TestIamPermissionsResponse]
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: AnonAltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch): Request_[Bucket]
}

object BucketsResource {
  @scala.inline
  def apply(
    delete: AnonAltBucketFields => Request_[Unit],
    get: AnonAltBucketFieldsIfMetagenerationMatch => Request_[Bucket],
    getIamPolicy: AnonAltBucket => Request_[Policy],
    insert: AnonAltFields => Request_[Bucket],
    list: AnonAltFieldsKey => Request_[Buckets],
    patch: AnonAltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch => Request_[Bucket],
    setIamPolicy: AnonAltBucket => Request_[Policy],
    testIamPermissions: AnonAltBucketFieldsKey => Request_[TestIamPermissionsResponse],
    update: AnonAltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch => Request_[Bucket]
  ): BucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BucketsResource]
  }
}

