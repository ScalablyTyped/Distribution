package typings.googleCloudStorage.iamMod

import typings.googleCloudStorage.bucketMod.Bucket
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
  def this(bucket: Bucket) = this()
  var request_ : js.Any = js.native
  var resourceId_ : js.Any = js.native
  def getPolicy(): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(callback: GetPolicyCallback): Unit = js.native
  def getPolicy(options: GetPolicyOptions): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(options: GetPolicyOptions, callback: GetPolicyCallback): Unit = js.native
  def setPolicy(policy: Policy): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(policy: Policy, callback: SetPolicyCallback): Unit = js.native
  def setPolicy(policy: Policy, options: SetPolicyOptions): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(policy: Policy, options: SetPolicyOptions, callback: SetPolicyCallback): Unit = js.native
  def testPermissions(permissions: String): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: String, callback: TestIamPermissionsCallback): Unit = js.native
  def testPermissions(permissions: String, options: TestIamPermissionsOptions): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: String, options: TestIamPermissionsOptions, callback: TestIamPermissionsCallback): Unit = js.native
  def testPermissions(permissions: js.Array[String]): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: js.Array[String], callback: TestIamPermissionsCallback): Unit = js.native
  def testPermissions(permissions: js.Array[String], options: TestIamPermissionsOptions): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(
    permissions: js.Array[String],
    options: TestIamPermissionsOptions,
    callback: TestIamPermissionsCallback
  ): Unit = js.native
}

