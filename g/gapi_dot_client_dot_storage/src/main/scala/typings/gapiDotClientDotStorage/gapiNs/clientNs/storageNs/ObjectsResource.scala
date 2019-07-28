package typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotStorage.Anon_AltBucketContentEncoding
import typings.gapiDotClientDotStorage.Anon_AltBucketDelimiter
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsGeneration
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsGenerationIfGenerationMatch
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatch
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsGenerationKey
import typings.gapiDotClientDotStorage.Anon_AltDestinationBucket
import typings.gapiDotClientDotStorage.Anon_AltDestinationBucketDestinationKmsKeyName
import typings.gapiDotClientDotStorage.Anon_AltDestinationBucketDestinationObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: Anon_AltDestinationBucket): Request[Object]
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: Anon_AltDestinationBucketDestinationObject): Request[Object]
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: Anon_AltBucketFieldsGenerationIfGenerationMatch): Request[Unit]
  /** Retrieves an object or its metadata. */
  def get(request: Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatch): Request[Object]
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: Anon_AltBucketFieldsGeneration): Request[Policy]
  /** Stores a new object and metadata. */
  def insert(request: Anon_AltBucketContentEncoding): Request[Object]
  /** Retrieves a list of objects matching the criteria. */
  def list(request: Anon_AltBucketDelimiter): Request[Objects]
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch): Request[Object]
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: Anon_AltDestinationBucketDestinationKmsKeyName): Request[RewriteResponse]
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: Anon_AltBucketFieldsGeneration): Request[Policy]
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: Anon_AltBucketFieldsGenerationKey): Request[TestIamPermissionsResponse]
  /** Updates an object's metadata. */
  def update(request: Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch): Request[Object]
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: Anon_AltBucketDelimiter): Request[Channel]
}

object ObjectsResource {
  @scala.inline
  def apply(
    compose: Anon_AltDestinationBucket => Request[Object],
    copy: Anon_AltDestinationBucketDestinationObject => Request[Object],
    delete: Anon_AltBucketFieldsGenerationIfGenerationMatch => Request[Unit],
    get: Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatch => Request[Object],
    getIamPolicy: Anon_AltBucketFieldsGeneration => Request[Policy],
    insert: Anon_AltBucketContentEncoding => Request[Object],
    list: Anon_AltBucketDelimiter => Request[Objects],
    patch: Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch => Request[Object],
    rewrite: Anon_AltDestinationBucketDestinationKmsKeyName => Request[RewriteResponse],
    setIamPolicy: Anon_AltBucketFieldsGeneration => Request[Policy],
    testIamPermissions: Anon_AltBucketFieldsGenerationKey => Request[TestIamPermissionsResponse],
    update: Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch => Request[Object],
    watchAll: Anon_AltBucketDelimiter => Request[Channel]
  ): ObjectsResource = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), rewrite = js.Any.fromFunction1(rewrite), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update), watchAll = js.Any.fromFunction1(watchAll))
  
    __obj.asInstanceOf[ObjectsResource]
  }
}

