package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.ContentEncoding
import typings.gapiClientStorage.anon.Delimiter
import typings.gapiClientStorage.anon.DestinationBucket
import typings.gapiClientStorage.anon.DestinationKmsKeyName
import typings.gapiClientStorage.anon.DestinationObject
import typings.gapiClientStorage.anon.IfGenerationNotMatch
import typings.gapiClientStorage.anon.Permissions
import typings.gapiClientStorage.anon.PredefinedAcl
import typings.gapiClientStorage.anon.Projection
import typings.gapiClientStorage.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: DestinationBucket): Request[Object]
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: DestinationObject): Request[Object]
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: IfGenerationNotMatch): Request[Unit]
  /** Retrieves an object or its metadata. */
  def get(request: Projection): Request[Object]
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: QuotaUser): Request[Policy]
  /** Stores a new object and metadata. */
  def insert(request: ContentEncoding): Request[Object]
  /** Retrieves a list of objects matching the criteria. */
  def list(request: Delimiter): Request[Objects]
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: PredefinedAcl): Request[Object]
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: DestinationKmsKeyName): Request[RewriteResponse]
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: QuotaUser): Request[Policy]
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: Permissions): Request[TestIamPermissionsResponse]
  /** Updates an object's metadata. */
  def update(request: PredefinedAcl): Request[Object]
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: Delimiter): Request[Channel]
}

object ObjectsResource {
  @scala.inline
  def apply(
    compose: DestinationBucket => Request[Object],
    copy: DestinationObject => Request[Object],
    delete: IfGenerationNotMatch => Request[Unit],
    get: Projection => Request[Object],
    getIamPolicy: QuotaUser => Request[Policy],
    insert: ContentEncoding => Request[Object],
    list: Delimiter => Request[Objects],
    patch: PredefinedAcl => Request[Object],
    rewrite: DestinationKmsKeyName => Request[RewriteResponse],
    setIamPolicy: QuotaUser => Request[Policy],
    testIamPermissions: Permissions => Request[TestIamPermissionsResponse],
    update: PredefinedAcl => Request[Object],
    watchAll: Delimiter => Request[Channel]
  ): ObjectsResource = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), rewrite = js.Any.fromFunction1(rewrite), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update), watchAll = js.Any.fromFunction1(watchAll))
    __obj.asInstanceOf[ObjectsResource]
  }
}

