package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import typings.googleCloudSpanner.protosMod.google.iam.v1.IGetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ISetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.Policy
import typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse
import typings.googleCloudSpanner.protosMod.google.longrunning.Operation
import typings.googleCloudSpanner.protosMod.google.protobuf.Empty
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.CreateInstanceCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.DeleteInstanceCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.GetIamPolicyCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.GetInstanceCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.GetInstanceConfigCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.ListInstancesCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.SetIamPolicyCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.TestIamPermissionsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstanceCallback
import typings.googleGax.mod.protobuf.rpc.Service
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an InstanceAdmin */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.InstanceAdmin")
@js.native
open class InstanceAdmin protected () extends Service {
  /**
    * Constructs a new InstanceAdmin service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls CreateInstance.
    * @param request CreateInstanceRequest message or plain object
    * @returns Promise
    */
  def createInstance(request: ICreateInstanceRequest): js.Promise[Operation] = js.native
  /**
    * Calls CreateInstance.
    * @param request CreateInstanceRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def createInstance(request: ICreateInstanceRequest, callback: CreateInstanceCallback): Unit = js.native
  
  /**
    * Calls DeleteInstance.
    * @param request DeleteInstanceRequest message or plain object
    * @returns Promise
    */
  def deleteInstance(request: IDeleteInstanceRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteInstance.
    * @param request DeleteInstanceRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteInstance(request: IDeleteInstanceRequest, callback: DeleteInstanceCallback): Unit = js.native
  
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
    * Calls GetInstance.
    * @param request GetInstanceRequest message or plain object
    * @returns Promise
    */
  def getInstance(request: IGetInstanceRequest): js.Promise[Instance] = js.native
  /**
    * Calls GetInstance.
    * @param request GetInstanceRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Instance
    */
  def getInstance(request: IGetInstanceRequest, callback: GetInstanceCallback): Unit = js.native
  
  /**
    * Calls GetInstanceConfig.
    * @param request GetInstanceConfigRequest message or plain object
    * @returns Promise
    */
  def getInstanceConfig(request: IGetInstanceConfigRequest): js.Promise[InstanceConfig] = js.native
  /**
    * Calls GetInstanceConfig.
    * @param request GetInstanceConfigRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and InstanceConfig
    */
  def getInstanceConfig(request: IGetInstanceConfigRequest, callback: GetInstanceConfigCallback): Unit = js.native
  
  /**
    * Calls ListInstanceConfigs.
    * @param request ListInstanceConfigsRequest message or plain object
    * @returns Promise
    */
  def listInstanceConfigs(request: IListInstanceConfigsRequest): js.Promise[ListInstanceConfigsResponse] = js.native
  /**
    * Calls ListInstanceConfigs.
    * @param request ListInstanceConfigsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListInstanceConfigsResponse
    */
  def listInstanceConfigs(request: IListInstanceConfigsRequest, callback: ListInstanceConfigsCallback): Unit = js.native
  
  /**
    * Calls ListInstances.
    * @param request ListInstancesRequest message or plain object
    * @returns Promise
    */
  def listInstances(request: IListInstancesRequest): js.Promise[ListInstancesResponse] = js.native
  /**
    * Calls ListInstances.
    * @param request ListInstancesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListInstancesResponse
    */
  def listInstances(request: IListInstancesRequest, callback: ListInstancesCallback): Unit = js.native
  
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
  
  /**
    * Calls UpdateInstance.
    * @param request UpdateInstanceRequest message or plain object
    * @returns Promise
    */
  def updateInstance(request: IUpdateInstanceRequest): js.Promise[Operation] = js.native
  /**
    * Calls UpdateInstance.
    * @param request UpdateInstanceRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def updateInstance(request: IUpdateInstanceRequest, callback: UpdateInstanceCallback): Unit = js.native
}
object InstanceAdmin {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.InstanceAdmin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new InstanceAdmin service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): InstanceAdmin = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[InstanceAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): InstanceAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[InstanceAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): InstanceAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[InstanceAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): InstanceAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[InstanceAdmin]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|createInstance}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type CreateInstanceCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|deleteInstance}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteInstanceCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|getIamPolicy}.
    * @param error Error, if any
    * @param [response] Policy
    */
  type GetIamPolicyCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Policy], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|getInstance}.
    * @param error Error, if any
    * @param [response] Instance
    */
  type GetInstanceCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Instance], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|getInstanceConfig}.
    * @param error Error, if any
    * @param [response] InstanceConfig
    */
  type GetInstanceConfigCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[InstanceConfig], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|listInstanceConfigs}.
    * @param error Error, if any
    * @param [response] ListInstanceConfigsResponse
    */
  type ListInstanceConfigsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[ListInstanceConfigsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|listInstances}.
    * @param error Error, if any
    * @param [response] ListInstancesResponse
    */
  type ListInstancesCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListInstancesResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|setIamPolicy}.
    * @param error Error, if any
    * @param [response] Policy
    */
  type SetIamPolicyCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Policy], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|testIamPermissions}.
    * @param error Error, if any
    * @param [response] TestIamPermissionsResponse
    */
  type TestIamPermissionsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[TestIamPermissionsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.admin.instance.v1.InstanceAdmin|updateInstance}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type UpdateInstanceCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
}
