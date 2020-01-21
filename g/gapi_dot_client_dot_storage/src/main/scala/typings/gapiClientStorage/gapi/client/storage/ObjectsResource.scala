package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonAltBucketContentEncoding
import typings.gapiClientStorage.AnonAltBucketDelimiter
import typings.gapiClientStorage.AnonAltBucketFieldsGeneration
import typings.gapiClientStorage.AnonAltBucketFieldsGenerationIfGenerationMatch
import typings.gapiClientStorage.AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatch
import typings.gapiClientStorage.AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch
import typings.gapiClientStorage.AnonAltBucketFieldsGenerationKey
import typings.gapiClientStorage.AnonAltDestinationBucket
import typings.gapiClientStorage.AnonAltDestinationBucketDestinationKmsKeyName
import typings.gapiClientStorage.AnonAltDestinationBucketDestinationObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: AnonAltDestinationBucket): Request_[Object]
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: AnonAltDestinationBucketDestinationObject): Request_[Object]
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: AnonAltBucketFieldsGenerationIfGenerationMatch): Request_[Unit]
  /** Retrieves an object or its metadata. */
  def get(request: AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatch): Request_[Object]
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: AnonAltBucketFieldsGeneration): Request_[Policy]
  /** Stores a new object and metadata. */
  def insert(request: AnonAltBucketContentEncoding): Request_[Object]
  /** Retrieves a list of objects matching the criteria. */
  def list(request: AnonAltBucketDelimiter): Request_[Objects]
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch): Request_[Object]
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: AnonAltDestinationBucketDestinationKmsKeyName): Request_[RewriteResponse]
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: AnonAltBucketFieldsGeneration): Request_[Policy]
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonAltBucketFieldsGenerationKey): Request_[TestIamPermissionsResponse]
  /** Updates an object's metadata. */
  def update(request: AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch): Request_[Object]
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: AnonAltBucketDelimiter): Request_[Channel]
}

object ObjectsResource {
  @scala.inline
  def apply(
    compose: AnonAltDestinationBucket => Request_[Object],
    copy: AnonAltDestinationBucketDestinationObject => Request_[Object],
    delete: AnonAltBucketFieldsGenerationIfGenerationMatch => Request_[Unit],
    get: AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatch => Request_[Object],
    getIamPolicy: AnonAltBucketFieldsGeneration => Request_[Policy],
    insert: AnonAltBucketContentEncoding => Request_[Object],
    list: AnonAltBucketDelimiter => Request_[Objects],
    patch: AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch => Request_[Object],
    rewrite: AnonAltDestinationBucketDestinationKmsKeyName => Request_[RewriteResponse],
    setIamPolicy: AnonAltBucketFieldsGeneration => Request_[Policy],
    testIamPermissions: AnonAltBucketFieldsGenerationKey => Request_[TestIamPermissionsResponse],
    update: AnonAltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch => Request_[Object],
    watchAll: AnonAltBucketDelimiter => Request_[Channel]
  ): ObjectsResource = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), rewrite = js.Any.fromFunction1(rewrite), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update), watchAll = js.Any.fromFunction1(watchAll))
  
    __obj.asInstanceOf[ObjectsResource]
  }
}

