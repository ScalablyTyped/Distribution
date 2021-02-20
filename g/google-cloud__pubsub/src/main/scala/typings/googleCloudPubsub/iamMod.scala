package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.pubsubMod.PubSub
import typings.googleCloudPubsub.pubsubMod.RequestCallback
import typings.googleCloudPubsub.pubsubMod.RequestConfig
import typings.googleCloudPubsub.pubsubMod.ResourceCallback
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.iamServiceMod.google.iam.v1.IBinding
import typings.googleGax.iamServiceMod.google.iam.v1.ITestIamPermissionsResponse
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamMod {
  
  @JSImport("@google-cloud/pubsub/build/src/iam", "IAM")
  @js.native
  class IAM protected () extends StObject {
    def this(pubsub: PubSub, id: String) = this()
    
    def getPolicy(): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(callback: GetPolicyCallback): Unit = js.native
    def getPolicy(gaxOpts: CallOptions): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(gaxOpts: CallOptions, callback: GetPolicyCallback): Unit = js.native
    
    var id: String = js.native
    
    var pubsub: PubSub = js.native
    
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    @JSName("request")
    var request_Original: FnCall = js.native
    
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
  
  /* Inlined {  etag :string | node.Buffer | undefined} & @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.Omit<google-gax.google-gax.IamProtos.google.iam.v1.IPolicy, 'etag'> */
  @js.native
  trait Policy extends StObject {
    
    var bindings: js.UndefOr[js.Array[IBinding] | Null] = js.native
    
    var etag: js.UndefOr[String | Buffer] = js.native
    
    var version: js.UndefOr[Double | Null] = js.native
  }
  object Policy {
    
    @scala.inline
    def apply(): Policy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Policy]
    }
    
    @scala.inline
    implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: js.Array[IBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingsNull: Self = StObject.set(x, "bindings", null)
      
      @scala.inline
      def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      @scala.inline
      def setBindingsVarargs(value: IBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
      
      @scala.inline
      def setEtag(value: String | Buffer): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionNull: Self = StObject.set(x, "version", null)
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type SetPolicyCallback = RequestCallback[Policy, Unit]
  
  type SetPolicyResponse = js.Array[Policy]
  
  type TestIamPermissionsCallback = ResourceCallback[IamPermissionsMap, ITestIamPermissionsResponse]
  
  type TestIamPermissionsResponse = js.Tuple2[IamPermissionsMap, ITestIamPermissionsResponse]
}
