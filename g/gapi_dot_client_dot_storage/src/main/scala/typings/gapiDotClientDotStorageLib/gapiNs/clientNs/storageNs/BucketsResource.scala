package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: gapiDotClientDotStorageLib.Anon_AltBucketFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns metadata for the specified bucket. */
  def get(request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsIfMetagenerationMatch): gapiDotClientLib.gapiNs.clientNs.Request[Bucket]
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: gapiDotClientDotStorageLib.Anon_AltBucket): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Creates a new bucket. */
  def insert(request: gapiDotClientDotStorageLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Bucket]
  /** Retrieves a list of buckets for a given project. */
  def list(request: gapiDotClientDotStorageLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Buckets]
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(
    request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch
  ): gapiDotClientLib.gapiNs.clientNs.Request[Bucket]
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: gapiDotClientDotStorageLib.Anon_AltBucket): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(
    request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsIfMetagenerationMatchIfMetagenerationNotMatch
  ): gapiDotClientLib.gapiNs.clientNs.Request[Bucket]
}

