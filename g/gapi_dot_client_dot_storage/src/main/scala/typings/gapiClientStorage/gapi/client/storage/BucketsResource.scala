package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.Fields
import typings.gapiClientStorage.anon.IfMetagenerationMatch
import typings.gapiClientStorage.anon.IfMetagenerationNotMatch
import typings.gapiClientStorage.anon.Key
import typings.gapiClientStorage.anon.MaxResults
import typings.gapiClientStorage.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: Fields): Request[Unit]
  /** Returns metadata for the specified bucket. */
  def get(request: IfMetagenerationMatch): Request[Bucket]
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: typings.gapiClientStorage.anon.Bucket): Request[Policy]
  /** Creates a new bucket. */
  def insert(request: Key): Request[Bucket]
  /** Retrieves a list of buckets for a given project. */
  def list(request: MaxResults): Request[Buckets]
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: IfMetagenerationNotMatch): Request[Bucket]
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: typings.gapiClientStorage.anon.Bucket): Request[Policy]
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: Oauthtoken): Request[TestIamPermissionsResponse]
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: IfMetagenerationNotMatch): Request[Bucket]
}

object BucketsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: IfMetagenerationMatch => Request[Bucket],
    getIamPolicy: typings.gapiClientStorage.anon.Bucket => Request[Policy],
    insert: Key => Request[Bucket],
    list: MaxResults => Request[Buckets],
    patch: IfMetagenerationNotMatch => Request[Bucket],
    setIamPolicy: typings.gapiClientStorage.anon.Bucket => Request[Policy],
    testIamPermissions: Oauthtoken => Request[TestIamPermissionsResponse],
    update: IfMetagenerationNotMatch => Request[Bucket]
  ): BucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BucketsResource]
  }
}

