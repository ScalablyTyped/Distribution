package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Cloud Storage uses access control lists (ACLs) to manage object and
 * bucket access. ACLs are the mechanism you use to share objects with other
 * users and allow other users to access your buckets and objects.
 *
 * An ACL consists of one or more entries, where each entry grants permissions
 * to an entity. Permissions define the actions that can be performed against an
 * object or bucket (for example, `READ` or `WRITE`); the entity defines who the
 * permission applies to (for example, a specific user or group of users).
 *
 * Where an `entity` value is accepted, we follow the format the Cloud Storage
 * API expects.
 *
 * Refer to
 * https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls
 * for the most up-to-date values.
 *
 *   - `user-userId`
 *   - `user-email`
 *   - `group-groupId`
 *   - `group-email`
 *   - `domain-domain`
 *   - `project-team-projectId`
 *   - `allUsers`
 *   - `allAuthenticatedUsers`
 *
 * Examples:
 *
 *   - The user "liz@example.com" would be `user-liz@example.com`.
 *   - The group "example@googlegroups.com" would be
 *     `group-example@googlegroups.com`.
 *   - To refer to all members of the Google Apps for Business domain
 *     "example.com", the entity would be `domain-example.com`.
 *
 * For more detailed information, see
 * [About Access Control Lists](http://goo.gl/6qBBPO).
 *
 * @constructor Acl
 * @mixin
 * @param {object} options Configuration options.
 */
@JSImport("@google-cloud/storage/build/src/acl", "Acl")
@js.native
class Acl protected () extends AclRoleAccessorMethods {
  def this(options: AclOptions) = this()
  var default: Acl = js.native
  var pathPrefix: java.lang.String = js.native
  var `request_`: js.Any = js.native
  /**
       * @typedef {array} AddAclResponse
       * @property {object} 0 The Acl Objects.
       * @property {object} 1 The full API response.
       */
  /**
       * @callback AddAclCallback
       * @param {?Error} err Request error, if any.
       * @param {object} acl The Acl Objects.
       * @param {object} apiResponse The full API response.
       */
  /**
       * Add access controls on a {@link Bucket} or {@link File}.
       *
       * @see [BucketAccessControls: insert API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls/insert}
       * @see [ObjectAccessControls: insert API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls/insert}
       *
       * @param {object} options Configuration options.
       * @param {string} options.entity Whose permissions will be added.
       * @param {string} options.role Permissions allowed for the defined entity.
       *     See {@link https://cloud.google.com/storage/docs/access-control Access
       * Control}.
       * @param {number} [options.generation] **File Objects Only** Select a specific
       *     revision of this file (as opposed to the latest version, the default).
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {AddAclCallback} [callback] Callback function.
       * @returns {Promise<AddAclResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const myBucket = storage.bucket('my-bucket');
       * const myFile = myBucket.file('my-file');
       *
       * const options = {
       *   entity: 'user-useremail@example.com',
       *   role: gcs.acl.OWNER_ROLE
       * };
       *
       * myBucket.acl.add(options, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // For file ACL operations, you can also specify a `generation` property.
       * // Here is how you would grant ownership permissions to a user on a
       * specific
       * // revision of a file.
       * //-
       * myFile.acl.add({
       *   entity: 'user-useremail@example.com',
       *   role: gcs.acl.OWNER_ROLE,
       *   generation: 1
       * }, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * myBucket.acl.add(options).then(function(data) {
       *   const aclObject = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_add_file_owner
       * Example of adding an owner to a file:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_add_bucket_owner
       * Example of adding an owner to a bucket:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_add_bucket_default_owner
       * Example of adding a default owner to a bucket:
       */
  def add(options: AddAclOptions): stdLib.Promise[AddAclResponse] = js.native
  def add(options: AddAclOptions, callback: AddAclCallback): scala.Unit = js.native
  /**
       * @typedef {array} RemoveAclResponse
       * @property {object} 0 The full API response.
       */
  /**
       * @callback RemoveAclCallback
       * @param {?Error} err Request error, if any.
       * @param {object} apiResponse The full API response.
       */
  /**
       * Delete access controls on a {@link Bucket} or {@link File}.
       *
       * @see [BucketAccessControls: delete API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls/delete}
       * @see [ObjectAccessControls: delete API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls/delete}
       *
       * @param {object} options Configuration object.
       * @param {string} options.entity Whose permissions will be revoked.
       * @param {int} [options.generation] **File Objects Only** Select a specific
       *     revision of this file (as opposed to the latest version, the default).
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {RemoveAclCallback} callback The callback function.
       * @returns {Promise<RemoveAclResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const myBucket = storage.bucket('my-bucket');
       * const myFile = myBucket.file('my-file');
       *
       * myBucket.acl.delete({
       *   entity: 'user-useremail@example.com'
       * }, function(err, apiResponse) {});
       *
       * //-
       * // For file ACL operations, you can also specify a `generation` property.
       * //-
       * myFile.acl.delete({
       *   entity: 'user-useremail@example.com',
       *   generation: 1
       * }, function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * myFile.acl.delete().then(function(data) {
       *   const apiResponse = data[0];
       * });
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_remove_bucket_owner
       * Example of removing an owner from a bucket:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_remove_bucket_default_owner
       * Example of removing a default owner from a bucket:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_remove_file_owner
       * Example of removing an owner from a bucket:
       */
  def delete(options: RemoveAclOptions): stdLib.Promise[RemoveAclResponse] = js.native
  def delete(options: RemoveAclOptions, callback: RemoveAclCallback): scala.Unit = js.native
  /**
       * @typedef {array} GetAclResponse
       * @property {object|object[]} 0 Single or array of Acl Objects.
       * @property {object} 1 The full API response.
       */
  /**
       * @callback GetAclCallback
       * @param {?Error} err Request error, if any.
       * @param {object|object[]} acl Single or array of Acl Objects.
       * @param {object} apiResponse The full API response.
       */
  /**
       * Get access controls on a {@link Bucket} or {@link File}. If
       * an entity is omitted, you will receive an array of all applicable access
       * controls.
       *
       * @see [BucketAccessControls: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls/get}
       * @see [ObjectAccessControls: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls/get}
       *
       * @param {object|function} [options] Configuration options. If you want to
       *     receive a list of all access controls, pass the callback function as
       * the only argument.
       * @param {string} [options.entity] Whose permissions will be fetched.
       * @param {number} [options.generation] **File Objects Only** Select a specific
       *     revision of this file (as opposed to the latest version, the default).
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {GetAclCallback} [callback] Callback function.
       * @returns {Promise<GetAclResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const myBucket = storage.bucket('my-bucket');
       * const myFile = myBucket.file('my-file');
       *
       * myBucket.acl.get({
       *   entity: 'user-useremail@example.com'
       * }, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // Get all access controls.
       * //-
       * myBucket.acl.get(function(err, aclObjects, apiResponse) {
       *   // aclObjects = [
       *   //   {
       *   //     entity: 'user-useremail@example.com',
       *   //     role: 'owner'
       *   //   }
       *   // ]
       * });
       *
       * //-
       * // For file ACL operations, you can also specify a `generation` property.
       * //-
       * myFile.acl.get({
       *   entity: 'user-useremail@example.com',
       *   generation: 1
       * }, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * myBucket.acl.get().then(function(data) {
       *   const aclObject = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_file_acl
       * Example of printing a file's ACL:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_file_acl_for_user
       * Example of printing a file's ACL for a specific user:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_bucket_acl
       * Example of printing a bucket's ACL:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_bucket_acl_for_user
       * Example of printing a bucket's ACL for a specific user:
       */
  def get(): stdLib.Promise[GetAclResponse] = js.native
  def get(callback: GetAclCallback): scala.Unit = js.native
  /**
       * @typedef {array} GetAclResponse
       * @property {object|object[]} 0 Single or array of Acl Objects.
       * @property {object} 1 The full API response.
       */
  /**
       * @callback GetAclCallback
       * @param {?Error} err Request error, if any.
       * @param {object|object[]} acl Single or array of Acl Objects.
       * @param {object} apiResponse The full API response.
       */
  /**
       * Get access controls on a {@link Bucket} or {@link File}. If
       * an entity is omitted, you will receive an array of all applicable access
       * controls.
       *
       * @see [BucketAccessControls: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls/get}
       * @see [ObjectAccessControls: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls/get}
       *
       * @param {object|function} [options] Configuration options. If you want to
       *     receive a list of all access controls, pass the callback function as
       * the only argument.
       * @param {string} [options.entity] Whose permissions will be fetched.
       * @param {number} [options.generation] **File Objects Only** Select a specific
       *     revision of this file (as opposed to the latest version, the default).
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {GetAclCallback} [callback] Callback function.
       * @returns {Promise<GetAclResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const myBucket = storage.bucket('my-bucket');
       * const myFile = myBucket.file('my-file');
       *
       * myBucket.acl.get({
       *   entity: 'user-useremail@example.com'
       * }, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // Get all access controls.
       * //-
       * myBucket.acl.get(function(err, aclObjects, apiResponse) {
       *   // aclObjects = [
       *   //   {
       *   //     entity: 'user-useremail@example.com',
       *   //     role: 'owner'
       *   //   }
       *   // ]
       * });
       *
       * //-
       * // For file ACL operations, you can also specify a `generation` property.
       * //-
       * myFile.acl.get({
       *   entity: 'user-useremail@example.com',
       *   generation: 1
       * }, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * myBucket.acl.get().then(function(data) {
       *   const aclObject = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_file_acl
       * Example of printing a file's ACL:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_file_acl_for_user
       * Example of printing a file's ACL for a specific user:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_bucket_acl
       * Example of printing a bucket's ACL:
       *
       * @example <caption>include:samples/acl.js</caption>
       * region_tag:storage_print_bucket_acl_for_user
       * Example of printing a bucket's ACL for a specific user:
       */
  def get(options: GetAclOptions): stdLib.Promise[GetAclResponse] = js.native
  def get(options: GetAclOptions, callback: GetAclCallback): scala.Unit = js.native
  /**
       * Transform API responses to a consistent object format.
       *
       * @private
       */
  def `makeAclObject_`(accessControlObject: AccessControlObject): AccessControlObject = js.native
  /**
       * Patch requests up to the bucket's request object.
       *
       * @private
       *
       * @param {string} method Action.
       * @param {string} path Request path.
       * @param {*} query Request query object.
       * @param {*} body Request body contents.
       * @param {function} callback Callback function.
       */
  def request(
    reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback
  ): scala.Unit = js.native
  /**
       * @typedef {array} UpdateAclResponse
       * @property {object} 0 The updated Acl Objects.
       * @property {object} 1 The full API response.
       */
  /**
       * @callback UpdateAclCallback
       * @param {?Error} err Request error, if any.
       * @param {object} acl The updated Acl Objects.
       * @param {object} apiResponse The full API response.
       */
  /**
       * Update access controls on a {@link Bucket} or {@link File}.
       *
       * @see [BucketAccessControls: update API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls/update}
       * @see [ObjectAccessControls: update API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls/update}
       *
       * @param {object} options Configuration options.
       * @param {string} options.entity Whose permissions will be updated.
       * @param {string} options.role Permissions allowed for the defined entity.
       *     See {@link Storage.acl}.
       * @param {number} [options.generation] **File Objects Only** Select a specific
       *     revision of this file (as opposed to the latest version, the default).
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {UpdateAclCallback} [callback] Callback function.
       * @returns {Promise<UpdateAclResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const myBucket = storage.bucket('my-bucket');
       * const myFile = myBucket.file('my-file');
       *
       * const options = {
       *   entity: 'user-useremail@example.com',
       *   role: gcs.acl.WRITER_ROLE
       * };
       *
       * myBucket.acl.update(options, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // For file ACL operations, you can also specify a `generation` property.
       * //-
       * myFile.acl.update({
       *   entity: 'user-useremail@example.com',
       *   role: gcs.acl.WRITER_ROLE,
       *   generation: 1
       * }, function(err, aclObject, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * myFile.acl.update(options).then(function(data) {
       *   const aclObject = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def update(options: UpdateAclOptions): stdLib.Promise[UpdateAclResponse] = js.native
  def update(options: UpdateAclOptions, callback: UpdateAclCallback): scala.Unit = js.native
}

