package typings
package atGoogleDashCloudStorageLib.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/storage", "Storage")
@js.native
class Storage ()
  extends atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage {
  def this(options: atGoogleDashCloudStorageLib.buildSrcStorageMod.StorageOptions) = this()
}

@JSImport("@google-cloud/storage", "Storage")
@js.native
object Storage extends js.Object {
  /**
    * {@link Bucket} class.
    *
    * @name Storage.Bucket
    * @see Bucket
    * @type {Constructor}
    */
  var Bucket: org.scalablytyped.runtime.Instantiable3[
    /* storage */ atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage, 
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ atGoogleDashCloudStorageLib.buildSrcBucketMod.BucketOptions], 
    atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket
  ] = js.native
  /**
    * {@link Channel} class.
    *
    * @name Storage.Channel
    * @see Channel
    * @type {Constructor}
    */
  var Channel: org.scalablytyped.runtime.Instantiable3[
    /* storage */ atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage, 
    /* id */ java.lang.String, 
    /* resourceId */ java.lang.String, 
    atGoogleDashCloudStorageLib.buildSrcChannelMod.Channel
  ] = js.native
  /**
    * {@link File} class.
    *
    * @name Storage.File
    * @see File
    * @type {Constructor}
    */
  var File: org.scalablytyped.runtime.Instantiable3[
    /* bucket */ atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, 
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ atGoogleDashCloudStorageLib.buildSrcFileMod.FileOptions], 
    atGoogleDashCloudStorageLib.buildSrcFileMod.File
  ] = js.native
  /**
    * Cloud Storage uses access control lists (ACLs) to manage object and
    * bucket access. ACLs are the mechanism you use to share objects with other
    * users and allow other users to access your buckets and objects.
    *
    * This object provides constants to refer to the three permission levels that
    * can be granted to an entity:
    *
    *   - `gcs.acl.OWNER_ROLE` - ("OWNER")
    *   - `gcs.acl.READER_ROLE` - ("READER")
    *   - `gcs.acl.WRITER_ROLE` - ("WRITER")
    *
    * @see [About Access Control Lists]{@link https://cloud.google.com/storage/docs/access-control/lists}
    *
    * @name Storage.acl
    * @type {object}
    * @property {string} OWNER_ROLE
    * @property {string} READER_ROLE
    * @property {string} WRITER_ROLE
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const albums = storage.bucket('albums');
    *
    * //-
    * // Make all of the files currently in a bucket publicly readable.
    * //-
    * const options = {
    *   entity: 'allUsers',
    *   role: storage.acl.READER_ROLE
    * };
    *
    * albums.acl.add(options, function(err, aclObject) {});
    *
    * //-
    * // Make any new objects added to a bucket publicly readable.
    * //-
    * albums.acl.default.add(options, function(err, aclObject) {});
    *
    * //-
    * // Grant a user ownership permissions to a bucket.
    * //-
    * albums.acl.add({
    *   entity: 'user-useremail@example.com',
    *   role: storage.acl.OWNER_ROLE
    * }, function(err, aclObject) {});
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * albums.acl.add(options).then(function(data) {
    *   const aclObject = data[0];
    *   const apiResponse = data[1];
    * });
    */
  var acl: atGoogleDashCloudStorageLib.Anon_OWNERROLE = js.native
}

