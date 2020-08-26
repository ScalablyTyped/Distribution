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

@js.native
trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Returns metadata for the specified bucket. */
  def get(request: IfMetagenerationMatch): Request[Bucket] = js.native
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: typings.gapiClientStorage.anon.Bucket): Request[Policy] = js.native
  /** Creates a new bucket. */
  def insert(request: Key): Request[Bucket] = js.native
  /** Retrieves a list of buckets for a given project. */
  def list(request: MaxResults): Request[Buckets] = js.native
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: IfMetagenerationNotMatch): Request[Bucket] = js.native
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: typings.gapiClientStorage.anon.Bucket): Request[Policy] = js.native
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: Oauthtoken): Request[TestIamPermissionsResponse] = js.native
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: IfMetagenerationNotMatch): Request[Bucket] = js.native
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
  @scala.inline
  implicit class BucketsResourceOps[Self <: BucketsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: IfMetagenerationMatch => Request[Bucket]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: typings.gapiClientStorage.anon.Bucket => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Bucket]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[Buckets]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: IfMetagenerationNotMatch => Request[Bucket]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: typings.gapiClientStorage.anon.Bucket => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Oauthtoken => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: IfMetagenerationNotMatch => Request[Bucket]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

