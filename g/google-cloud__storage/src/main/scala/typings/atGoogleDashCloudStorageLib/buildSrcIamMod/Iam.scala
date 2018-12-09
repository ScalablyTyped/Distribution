package typings
package atGoogleDashCloudStorageLib.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Get and set IAM policies for your Cloud Storage bucket.
 *
 * @see [Cloud Storage IAM Management](https://cloud.google.com/storage/docs/access-control/iam#short_title_iam_management)
 * @see [Granting, Changing, and Revoking Access](https://cloud.google.com/iam/docs/granting-changing-revoking-access)
 * @see [IAM Roles](https://cloud.google.com/iam/docs/understanding-roles)
 *
 * @constructor Iam
 * @mixin
 *
 * @param {Bucket} bucket The parent instance.
 * @example
 * const {Storage} = require('@google-cloud/storage');
 * const storage = new Storage();
 * const bucket = storage.bucket('my-bucket');
 * // bucket.iam
 */
@JSImport("@google-cloud/storage/build/src/iam", "Iam")
@js.native
class Iam protected () extends js.Object {
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket) = this()
  var `request_`: js.Any = js.native
  var `resourceId_`: js.Any = js.native
  /**
       * Get the IAM policy.
       *
       * @param {GetPolicyRequest} [options] Request options.
       * @param {GetPolicyCallback} [callback] Callback function.
       * @returns {Promise<GetPolicyResponse>}
       *
       * @see [Buckets: setIamPolicy API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/getIamPolicy}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       * bucket.iam.getPolicy(function(err, policy, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.getPolicy().then(function(data) {
       *   const policy = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/iam.js</caption>
       * region_tag:storage_view_bucket_iam_members
       * Example of retrieving a bucket's IAM policy:
       */
  def getPolicy(): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(callback: GetPolicyCallback): scala.Unit = js.native
  /**
       * Get the IAM policy.
       *
       * @param {GetPolicyRequest} [options] Request options.
       * @param {GetPolicyCallback} [callback] Callback function.
       * @returns {Promise<GetPolicyResponse>}
       *
       * @see [Buckets: setIamPolicy API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/getIamPolicy}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       * bucket.iam.getPolicy(function(err, policy, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.getPolicy().then(function(data) {
       *   const policy = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/iam.js</caption>
       * region_tag:storage_view_bucket_iam_members
       * Example of retrieving a bucket's IAM policy:
       */
  def getPolicy(options: GetPolicyOptions): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(options: GetPolicyOptions, callback: GetPolicyCallback): scala.Unit = js.native
  /**
       * Set the IAM policy.
       *
       * @throws {Error} If no policy is provided.
       *
       * @param {Policy} policy The policy.
       * @param {SetPolicyOptions} [options] Configuration opbject.
       * @param {SetPolicyCallback} callback Callback function.
       * @returns {Promise<SetPolicyResponse>}
       *
       * @see [Buckets: setIamPolicy API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/setIamPolicy}
       * @see [IAM Roles](https://cloud.google.com/iam/docs/understanding-roles)
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * const myPolicy = {
       *   bindings: [
       *     {
       *       role: 'roles/storage.admin',
       *       members:
       * ['serviceAccount:myotherproject@appspot.gserviceaccount.com']
       *     }
       *   ]
       * };
       *
       * bucket.iam.setPolicy(myPolicy, function(err, policy, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.setPolicy(myPolicy).then(function(data) {
       *   const policy = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/iam.js</caption>
       * region_tag:storage_add_bucket_iam_member
       * Example of adding to a bucket's IAM policy:
       *
       * @example <caption>include:samples/iam.js</caption>
       * region_tag:storage_remove_bucket_iam_member
       * Example of removing from a bucket's IAM policy:
       */
  def setPolicy(policy: Policy): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(policy: Policy, callback: SetPolicyCallback): scala.Unit = js.native
  /**
       * Set the IAM policy.
       *
       * @throws {Error} If no policy is provided.
       *
       * @param {Policy} policy The policy.
       * @param {SetPolicyOptions} [options] Configuration opbject.
       * @param {SetPolicyCallback} callback Callback function.
       * @returns {Promise<SetPolicyResponse>}
       *
       * @see [Buckets: setIamPolicy API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/setIamPolicy}
       * @see [IAM Roles](https://cloud.google.com/iam/docs/understanding-roles)
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * const myPolicy = {
       *   bindings: [
       *     {
       *       role: 'roles/storage.admin',
       *       members:
       * ['serviceAccount:myotherproject@appspot.gserviceaccount.com']
       *     }
       *   ]
       * };
       *
       * bucket.iam.setPolicy(myPolicy, function(err, policy, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.setPolicy(myPolicy).then(function(data) {
       *   const policy = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/iam.js</caption>
       * region_tag:storage_add_bucket_iam_member
       * Example of adding to a bucket's IAM policy:
       *
       * @example <caption>include:samples/iam.js</caption>
       * region_tag:storage_remove_bucket_iam_member
       * Example of removing from a bucket's IAM policy:
       */
  def setPolicy(policy: Policy, options: SetPolicyOptions): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(policy: Policy, options: SetPolicyOptions, callback: SetPolicyCallback): scala.Unit = js.native
  /**
       * Test a set of permissions for a resource.
       *
       * @throws {Error} If permissions are not provided.
       *
       * @param {string|string[]} permissions The permission(s) to test for.
       * @param {TestIamPermissionsOptions} [options] Configuration object.
       * @param {TestIamPermissionsCallback} [callback] Callback function.
       * @returns {Promise<TestIamPermissionsResponse>}
       *
       * @see [Buckets: testIamPermissions API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/testIamPermissions}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * //-
       * // Test a single permission.
       * //-
       * const test = 'storage.buckets.delete';
       *
       * bucket.iam.testPermissions(test, function(err, permissions, apiResponse) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": true
       *   // }
       * });
       *
       * //-
       * // Test several permissions at once.
       * //-
       * const tests = [
       *   'storage.buckets.delete',
       *   'storage.buckets.get'
       * ];
       *
       * bucket.iam.testPermissions(tests, function(err, permissions) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": false,
       *   //   "storage.buckets.get": true
       *   // }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.testPermissions(test).then(function(data) {
       *   const permissions = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def testPermissions(permissions: java.lang.String): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: java.lang.String, callback: TestIamPermissionsCallback): scala.Unit = js.native
  /**
       * Test a set of permissions for a resource.
       *
       * @throws {Error} If permissions are not provided.
       *
       * @param {string|string[]} permissions The permission(s) to test for.
       * @param {TestIamPermissionsOptions} [options] Configuration object.
       * @param {TestIamPermissionsCallback} [callback] Callback function.
       * @returns {Promise<TestIamPermissionsResponse>}
       *
       * @see [Buckets: testIamPermissions API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/testIamPermissions}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * //-
       * // Test a single permission.
       * //-
       * const test = 'storage.buckets.delete';
       *
       * bucket.iam.testPermissions(test, function(err, permissions, apiResponse) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": true
       *   // }
       * });
       *
       * //-
       * // Test several permissions at once.
       * //-
       * const tests = [
       *   'storage.buckets.delete',
       *   'storage.buckets.get'
       * ];
       *
       * bucket.iam.testPermissions(tests, function(err, permissions) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": false,
       *   //   "storage.buckets.get": true
       *   // }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.testPermissions(test).then(function(data) {
       *   const permissions = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def testPermissions(permissions: java.lang.String, options: TestIamPermissionsOptions): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(
    permissions: java.lang.String,
    options: TestIamPermissionsOptions,
    callback: TestIamPermissionsCallback
  ): scala.Unit = js.native
  /**
       * Test a set of permissions for a resource.
       *
       * @throws {Error} If permissions are not provided.
       *
       * @param {string|string[]} permissions The permission(s) to test for.
       * @param {TestIamPermissionsOptions} [options] Configuration object.
       * @param {TestIamPermissionsCallback} [callback] Callback function.
       * @returns {Promise<TestIamPermissionsResponse>}
       *
       * @see [Buckets: testIamPermissions API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/testIamPermissions}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * //-
       * // Test a single permission.
       * //-
       * const test = 'storage.buckets.delete';
       *
       * bucket.iam.testPermissions(test, function(err, permissions, apiResponse) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": true
       *   // }
       * });
       *
       * //-
       * // Test several permissions at once.
       * //-
       * const tests = [
       *   'storage.buckets.delete',
       *   'storage.buckets.get'
       * ];
       *
       * bucket.iam.testPermissions(tests, function(err, permissions) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": false,
       *   //   "storage.buckets.get": true
       *   // }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.testPermissions(test).then(function(data) {
       *   const permissions = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def testPermissions(permissions: js.Array[java.lang.String]): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: js.Array[java.lang.String], callback: TestIamPermissionsCallback): scala.Unit = js.native
  /**
       * Test a set of permissions for a resource.
       *
       * @throws {Error} If permissions are not provided.
       *
       * @param {string|string[]} permissions The permission(s) to test for.
       * @param {TestIamPermissionsOptions} [options] Configuration object.
       * @param {TestIamPermissionsCallback} [callback] Callback function.
       * @returns {Promise<TestIamPermissionsResponse>}
       *
       * @see [Buckets: testIamPermissions API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/testIamPermissions}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * //-
       * // Test a single permission.
       * //-
       * const test = 'storage.buckets.delete';
       *
       * bucket.iam.testPermissions(test, function(err, permissions, apiResponse) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": true
       *   // }
       * });
       *
       * //-
       * // Test several permissions at once.
       * //-
       * const tests = [
       *   'storage.buckets.delete',
       *   'storage.buckets.get'
       * ];
       *
       * bucket.iam.testPermissions(tests, function(err, permissions) {
       *   console.log(permissions);
       *   // {
       *   //   "storage.buckets.delete": false,
       *   //   "storage.buckets.get": true
       *   // }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.iam.testPermissions(test).then(function(data) {
       *   const permissions = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def testPermissions(permissions: js.Array[java.lang.String], options: TestIamPermissionsOptions): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(
    permissions: js.Array[java.lang.String],
    options: TestIamPermissionsOptions,
    callback: TestIamPermissionsCallback
  ): scala.Unit = js.native
}

