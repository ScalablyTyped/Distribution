package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.anon.Etag
import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.buildSrcPubsubMod.Omit
import typings.googleCloudPubsub.buildSrcPubsubMod.PubSub
import typings.googleCloudPubsub.buildSrcPubsubMod.RequestCallback
import typings.googleCloudPubsub.buildSrcPubsubMod.RequestConfig
import typings.googleCloudPubsub.buildSrcPubsubMod.ResourceCallback
import typings.googleCloudPubsub.googleCloudPubsubStrings.etag
import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcIamMod {
  
  @JSImport("@google-cloud/pubsub/build/src/iam", "IAM")
  @js.native
  open class IAM protected () extends StObject {
    def this(pubsub: PubSub, id: String) = this()
    
    /**
      * @typedef {array} GetPolicyResponse
      * @property {object} 0 The policy.
      */
    /**
      * @callback GetPolicyCallback
      * @param {?Error} err Request error, if any.
      * @param {object} acl The policy.
      */
    /**
      * Get the IAM policy
      *
      * @param {object} [gaxOptions] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {GetPolicyCallback} [callback] Callback function.
      * @returns {Promise<GetPolicyResponse>}
      *
      * @see [Topics: getIamPolicy API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics/getIamPolicy}
      * @see [Subscriptions: getIamPolicy API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/getIamPolicy}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * topic.iam.getPolicy(function(err, policy, apiResponse) {});
      *
      * subscription.iam.getPolicy(function(err, policy, apiResponse) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.iam.getPolicy().then(function(data) {
      *   const policy = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def getPolicy(): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(callback: GetPolicyCallback): Unit = js.native
    def getPolicy(gaxOpts: CallOptions): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(gaxOpts: CallOptions, callback: GetPolicyCallback): Unit = js.native
    
    var id: String = js.native
    
    var pubsub: PubSub = js.native
    
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    @JSName("request")
    var request_Original: FnCall = js.native
    
    /**
      * @typedef {array} SetPolicyResponse
      * @property {object} 0 The policy.
      */
    /**
      * @callback SetPolicyCallback
      * @param {?Error} err Request error, if any.
      * @param {object} acl The policy.
      */
    /**
      * Set the IAM policy
      *
      * @throws {Error} If no policy is provided.
      *
      * @param {object} policy The [policy](https://cloud.google.com/pubsub/docs/reference/rest/v1/Policy).
      * @param {array} [policy.bindings] Bindings associate members with roles.
      * @param {Array<object>} [policy.rules] Rules to be applied to the policy.
      * @param {string} [policy.etag] Etags are used to perform a read-modify-write.
      * @param {object} [gaxOptions] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {SetPolicyCallback} callback Callback function.
      * @returns {Promise<SetPolicyResponse>}
      *
      * @see [Topics: setIamPolicy API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics/setIamPolicy}
      * @see [Subscriptions: setIamPolicy API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/setIamPolicy}
      * @see [Policy]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/Policy}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * const myPolicy = {
      *   bindings: [
      *     {
      *       role: 'roles/pubsub.subscriber',
      *       members:
      * ['serviceAccount:myotherproject@appspot.gserviceaccount.com']
      *     }
      *   ]
      * };
      *
      * topic.iam.setPolicy(myPolicy, function(err, policy, apiResponse) {});
      *
      * subscription.iam.setPolicy(myPolicy, function(err, policy, apiResponse)
      * {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.iam.setPolicy(myPolicy).then(function(data) {
      *   const policy = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def setPolicy(policy: Policy): js.Promise[SetPolicyResponse] = js.native
    def setPolicy(policy: Policy, callback: SetPolicyCallback): Unit = js.native
    def setPolicy(policy: Policy, gaxOpts: CallOptions): js.Promise[SetPolicyResponse] = js.native
    def setPolicy(policy: Policy, gaxOpts: CallOptions, callback: SetPolicyCallback): Unit = js.native
    
    /**
      * @callback TestIamPermissionsCallback
      * @param {?Error} err Request error, if any.
      * @param {TestIamPermissionsAPIResponse} permissions A subset of permissions that the caller is allowed.
      * @param {PermissionsResponse} apiResponse The full API response.
      */
    /**
      * @typedef {array} TestIamPermissionsResponse
      * @property {object[]} 0 A subset of permissions that the caller is allowed.
      * @property {PermissionsResponse} 1 The full API response.
      */
    /**
      * @typedef {string[]} PermissionsResponse
      * A subset of TestPermissionsRequest.permissions that the caller is allowed.
      * @see https://cloud.google.com/pubsub/docs/reference/rpc/google.iam.v1#google.iam.v1.TestIamPermissionsRequest
      */
    /**
      * Test a set of permissions for a resource.
      *
      * Permissions with wildcards such as `*` or `storage.*` are not allowed.
      *
      * @throws {Error} If permissions are not provided.
      *
      * @param {string|string[]} permissions The permission(s) to test for.
      * @param {object} [gaxOptions] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {TestIamPermissionsCallback} [callback] Callback function.
      * @returns {Promise<TestIamPermissionsResponse>}
      *
      * @see [Topics: testIamPermissions API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics/testIamPermissions}
      * @see [Subscriptions: testIamPermissions API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/testIamPermissions}
      * @see [Permissions Reference]{@link https://cloud.google.com/pubsub/access_control#permissions}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * //-
      * // Test a single permission.
      * //-
      * const test = 'pubsub.topics.update';
      *
      * topic.iam.testPermissions(test, function(err, permissions, apiResponse) {
      *   console.log(permissions);
      *   // {
      *   //   "pubsub.topics.update": true
      *   // }
      * });
      *
      * //-
      * // Test several permissions at once.
      * //-
      * const tests = [
      *   'pubsub.subscriptions.consume',
      *   'pubsub.subscriptions.update'
      * ];
      *
      * subscription.iam.testPermissions(tests, function(err, permissions) {
      *   console.log(permissions);
      *   // {
      *   //   "pubsub.subscriptions.consume": true,
      *   //   "pubsub.subscriptions.update": false
      *   // }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.iam.testPermissions(test).then(function(data) {
      *   const permissions = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
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
  
  type Policy = Etag & (Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IamProtos.google.iam.v1.IPolicy */ Any, 
    etag
  ])
  
  type SetPolicyCallback = RequestCallback[Policy, Unit]
  
  type SetPolicyResponse = js.Array[Policy]
  
  type TestIamPermissionsCallback = ResourceCallback[
    IamPermissionsMap, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IamProtos.google.iam.v1.ITestIamPermissionsResponse */ Any
  ]
  
  type TestIamPermissionsResponse = js.Tuple2[
    IamPermissionsMap, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IamProtos.google.iam.v1.ITestIamPermissionsResponse */ Any
  ]
}
