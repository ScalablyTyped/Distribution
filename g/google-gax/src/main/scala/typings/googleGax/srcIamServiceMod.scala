package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.ProjectIdCallback
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.fallbackMod.GrpcClient
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest
import typings.googleGax.iamServiceMod.google.iam.v1.Policy
import typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest
import typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest
import typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIamServiceMod {
  
  @JSImport("google-gax/build/src/iamService", "IamClient")
  @js.native
  class IamClient protected () extends StObject {
    def this(gaxGrpc: GrpcClient, options: ClientOptions) = this()
    def this(gaxGrpc: typings.googleGax.grpcMod.GrpcClient, options: ClientOptions) = this()
    
    var _defaults: js.Any = js.native
    
    var _gaxGrpc: js.Any = js.native
    
    var _opts: js.Any = js.native
    
    var _protos: js.Any = js.native
    
    var _terminated: js.Any = js.native
    
    var auth: js.UndefOr[GoogleAuth | OAuth2Client] = js.native
    
    /**
      * Terminate the GRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      */
    def close(): js.Promise[Unit] = js.native
    
    var descriptors: Descriptors = js.native
    
    var gaxGrpc: typings.googleGax.grpcMod.GrpcClient | GrpcClient = js.native
    
    def getIamPolicy(request: GetIamPolicyRequest): Unit = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]],
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(request: GetIamPolicyRequest, options: CallOptions): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    @JSName("getIamPolicy")
    def getIamPolicy_Promise(request: GetIamPolicyRequest): js.Promise[Policy] = js.native
    @JSName("getIamPolicy")
    def getIamPolicy_Promise(
      request: GetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    @JSName("getIamPolicy")
    def getIamPolicy_Promise(
      request: GetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    
    /**
      * Get the project ID used by this class.
      * @param {function(Error, string)} callback - the callback to be called with
      *   the current project Id.
      */
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: ProjectIdCallback): Unit = js.native
    
    var iamPolicyStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Initialize the client.
      * Performs asynchronous operations (such as authentication) and prepares the client.
      * This function will be called automatically when any class method is called for the
      * first time, but if you need to initialize it before calling an actual method,
      * feel free to call initialize() directly.
      *
      * You can await on this method if you want to make sure the client is initialized.
      *
      * @returns {Promise} A promise that resolves to an authenticated service stub.
      */
    def initialize(): js.Promise[StringDictionary[js.Function]] = js.native
    
    var innerApiCalls: StringDictionary[js.Function] = js.native
    
    def setIamPolicy(request: SetIamPolicyRequest): Unit = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]],
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(request: SetIamPolicyRequest, options: CallOptions): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    @JSName("setIamPolicy")
    def setIamPolicy_Promise(request: SetIamPolicyRequest): js.Promise[Policy] = js.native
    @JSName("setIamPolicy")
    def setIamPolicy_Promise(
      request: SetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    @JSName("setIamPolicy")
    def setIamPolicy_Promise(
      request: SetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    
    def testIamPermissions(request: TestIamPermissionsRequest): Unit = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ],
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(request: TestIamPermissionsRequest, options: CallOptions): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: CallOptions,
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    @JSName("testIamPermissions")
    def testIamPermissions_Promise(request: TestIamPermissionsRequest): js.Promise[TestIamPermissionsResponse] = js.native
    @JSName("testIamPermissions")
    def testIamPermissions_Promise(
      request: TestIamPermissionsRequest,
      options: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    @JSName("testIamPermissions")
    def testIamPermissions_Promise(
      request: TestIamPermissionsRequest,
      options: CallOptions,
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
  }
}
