package typings.googleGax.iamServiceMod.google.iam.v1

import typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy.GetIamPolicyCallback
import typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy.SetIamPolicyCallback
import typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy.TestIamPermissionsCallback
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a IAMPolicy */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.IAMPolicy")
@js.native
class IAMPolicy protected () extends Service {
  /**
    * Constructs a new IAMPolicy service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  
  /**
    * Calls GetIamPolicy.
    * @param request GetIamPolicyRequest message or plain object
    * @returns Promise
    */
  def getIamPolicy(request: IGetIamPolicyRequest): js.Promise[Policy] = js.native
  /**
    * Calls GetIamPolicy.
    * @param request GetIamPolicyRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Policy
    */
  def getIamPolicy(request: IGetIamPolicyRequest, callback: GetIamPolicyCallback): Unit = js.native
  
  /**
    * Calls SetIamPolicy.
    * @param request SetIamPolicyRequest message or plain object
    * @returns Promise
    */
  def setIamPolicy(request: ISetIamPolicyRequest): js.Promise[Policy] = js.native
  /**
    * Calls SetIamPolicy.
    * @param request SetIamPolicyRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Policy
    */
  def setIamPolicy(request: ISetIamPolicyRequest, callback: SetIamPolicyCallback): Unit = js.native
  
  /**
    * Calls TestIamPermissions.
    * @param request TestIamPermissionsRequest message or plain object
    * @returns Promise
    */
  def testIamPermissions(request: ITestIamPermissionsRequest): js.Promise[TestIamPermissionsResponse] = js.native
  /**
    * Calls TestIamPermissions.
    * @param request TestIamPermissionsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and TestIamPermissionsResponse
    */
  def testIamPermissions(request: ITestIamPermissionsRequest, callback: TestIamPermissionsCallback): Unit = js.native
}
object IAMPolicy {
  
  /**
    * Creates new IAMPolicy service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.IAMPolicy.create")
  @js.native
  def create(rpcImpl: RPCImpl): IAMPolicy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.IAMPolicy.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): IAMPolicy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.IAMPolicy.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): IAMPolicy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.IAMPolicy.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): IAMPolicy = js.native
  
  /**
    * Callback as used by {@link google.iam.v1.IAMPolicy#getIamPolicy}.
    * @param error Error, if any
    * @param [response] Policy
    */
  type GetIamPolicyCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Policy], Unit]
  
  /**
    * Callback as used by {@link google.iam.v1.IAMPolicy#setIamPolicy}.
    * @param error Error, if any
    * @param [response] Policy
    */
  type SetIamPolicyCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Policy], Unit]
  
  /**
    * Callback as used by {@link google.iam.v1.IAMPolicy#testIamPermissions}.
    * @param error Error, if any
    * @param [response] TestIamPermissionsResponse
    */
  type TestIamPermissionsCallback = js.Function2[
    /* error */ Error | Null, 
    /* response */ js.UndefOr[TestIamPermissionsResponse], 
    Unit
  ]
}
