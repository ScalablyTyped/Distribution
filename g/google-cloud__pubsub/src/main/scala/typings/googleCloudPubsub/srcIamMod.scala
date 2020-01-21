package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.googleCloudPubsubStrings.etag
import typings.googleCloudPubsub.iamMod.google.iam.v1.IPolicy
import typings.googleCloudPubsub.iamMod.google.iam.v1.ITestIamPermissionsResponse
import typings.googleCloudPubsub.srcPubsubMod.Omit
import typings.googleCloudPubsub.srcPubsubMod.PubSub
import typings.googleCloudPubsub.srcPubsubMod.RequestCallback
import typings.googleCloudPubsub.srcPubsubMod.RequestConfig
import typings.googleCloudPubsub.srcPubsubMod.ResourceCallback
import typings.googleGax.gaxMod.CallOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/iam", JSImport.Namespace)
@js.native
object srcIamMod extends js.Object {
  @js.native
  class IAM protected () extends js.Object {
    def this(pubsub: PubSub, id: String) = this()
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    var id: String = js.native
    var pubsub: PubSub = js.native
    @JSName("request")
    var request_Original: FnCallback = js.native
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
  
  type GetPolicyCallback = RequestCallback[Policy, Unit]
  type GetPolicyResponse = js.Array[Policy]
  type IamPermissionsMap = StringDictionary[Boolean]
  type Policy = AnonEtag with (Omit[IPolicy, etag])
  type SetPolicyCallback = RequestCallback[Policy, Unit]
  type SetPolicyResponse = js.Array[Policy]
  type TestIamPermissionsCallback = ResourceCallback[IamPermissionsMap, ITestIamPermissionsResponse]
  type TestIamPermissionsResponse = js.Tuple2[IamPermissionsMap, ITestIamPermissionsResponse]
}

