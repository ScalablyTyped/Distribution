package typings.googleCloudPubsub.srcIamMod

import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.srcPubsubMod.PubSub
import typings.googleCloudPubsub.srcPubsubMod.RequestCallback
import typings.googleCloudPubsub.srcPubsubMod.RequestConfig
import typings.googleGax.gaxMod.CallOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/iam", "IAM")
@js.native
class IAM protected () extends js.Object {
  def this(pubsub: PubSub, id: String) = this()
  var Promise: js.UndefOr[PromiseConstructor] = js.native
  var id: String = js.native
  var pubsub: PubSub = js.native
  @JSName("request")
  var request_Original: FnCall = js.native
  def getPolicy(): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(callback: GetPolicyCallback): Unit = js.native
  def getPolicy(gaxOpts: CallOptions): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(gaxOpts: CallOptions, callback: GetPolicyCallback): Unit = js.native
  def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
  def setPolicy(policy: Policy): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(policy: Policy, callback: SetPolicyCallback): Unit = js.native
  def setPolicy(policy: Policy, gaxOpts: CallOptions): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(policy: Policy, gaxOpts: CallOptions, callback: SetPolicyCallback): Unit = js.native
  def testPermissions(permissions: String): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: String, callback: TestIamPermissionsCallback): Unit = js.native
  def testPermissions(permissions: String, gaxOpts: CallOptions): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: String, gaxOpts: CallOptions, callback: TestIamPermissionsCallback): Unit = js.native
  def testPermissions(permissions: js.Array[String]): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: js.Array[String], callback: TestIamPermissionsCallback): Unit = js.native
  def testPermissions(permissions: js.Array[String], gaxOpts: CallOptions): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: js.Array[String], gaxOpts: CallOptions, callback: TestIamPermissionsCallback): Unit = js.native
}

