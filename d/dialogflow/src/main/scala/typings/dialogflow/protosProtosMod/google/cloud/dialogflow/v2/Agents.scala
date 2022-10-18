package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.DeleteAgentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.ExportAgentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.GetAgentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.ImportAgentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.RestoreAgentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.SearchAgentsCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.SetAgentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agents.TrainAgentCallback
import typings.dialogflow.protosProtosMod.google.longrunning.Operation
import typings.dialogflow.protosProtosMod.google.protobuf.Empty
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Agents */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Agents")
@js.native
open class Agents protected () extends Service {
  /**
    * Constructs a new Agents service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls DeleteAgent.
    * @param request DeleteAgentRequest message or plain object
    * @returns Promise
    */
  def deleteAgent(request: IDeleteAgentRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteAgent.
    * @param request DeleteAgentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteAgent(request: IDeleteAgentRequest, callback: DeleteAgentCallback): Unit = js.native
  
  /**
    * Calls ExportAgent.
    * @param request ExportAgentRequest message or plain object
    * @returns Promise
    */
  def exportAgent(request: IExportAgentRequest): js.Promise[Operation] = js.native
  /**
    * Calls ExportAgent.
    * @param request ExportAgentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def exportAgent(request: IExportAgentRequest, callback: ExportAgentCallback): Unit = js.native
  
  /**
    * Calls GetAgent.
    * @param request GetAgentRequest message or plain object
    * @returns Promise
    */
  def getAgent(request: IGetAgentRequest): js.Promise[Agent] = js.native
  /**
    * Calls GetAgent.
    * @param request GetAgentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Agent
    */
  def getAgent(request: IGetAgentRequest, callback: GetAgentCallback): Unit = js.native
  
  /**
    * Calls ImportAgent.
    * @param request ImportAgentRequest message or plain object
    * @returns Promise
    */
  def importAgent(request: IImportAgentRequest): js.Promise[Operation] = js.native
  /**
    * Calls ImportAgent.
    * @param request ImportAgentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def importAgent(request: IImportAgentRequest, callback: ImportAgentCallback): Unit = js.native
  
  /**
    * Calls RestoreAgent.
    * @param request RestoreAgentRequest message or plain object
    * @returns Promise
    */
  def restoreAgent(request: IRestoreAgentRequest): js.Promise[Operation] = js.native
  /**
    * Calls RestoreAgent.
    * @param request RestoreAgentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def restoreAgent(request: IRestoreAgentRequest, callback: RestoreAgentCallback): Unit = js.native
  
  /**
    * Calls SearchAgents.
    * @param request SearchAgentsRequest message or plain object
    * @returns Promise
    */
  def searchAgents(request: ISearchAgentsRequest): js.Promise[SearchAgentsResponse] = js.native
  /**
    * Calls SearchAgents.
    * @param request SearchAgentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and SearchAgentsResponse
    */
  def searchAgents(request: ISearchAgentsRequest, callback: SearchAgentsCallback): Unit = js.native
  
  /**
    * Calls SetAgent.
    * @param request SetAgentRequest message or plain object
    * @returns Promise
    */
  def setAgent(request: ISetAgentRequest): js.Promise[Agent] = js.native
  /**
    * Calls SetAgent.
    * @param request SetAgentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Agent
    */
  def setAgent(request: ISetAgentRequest, callback: SetAgentCallback): Unit = js.native
  
  /**
    * Calls TrainAgent.
    * @param request TrainAgentRequest message or plain object
    * @returns Promise
    */
  def trainAgent(request: ITrainAgentRequest): js.Promise[Operation] = js.native
  /**
    * Calls TrainAgent.
    * @param request TrainAgentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def trainAgent(request: ITrainAgentRequest, callback: TrainAgentCallback): Unit = js.native
}
object Agents {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Agents")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new Agents service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): Agents = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Agents]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Agents = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Agents]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Agents = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Agents]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Agents = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Agents]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#deleteAgent}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteAgentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#exportAgent}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type ExportAgentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#getAgent}.
    * @param error Error, if any
    * @param [response] Agent
    */
  type GetAgentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Agent], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#importAgent}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type ImportAgentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#restoreAgent}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type RestoreAgentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#searchAgents}.
    * @param error Error, if any
    * @param [response] SearchAgentsResponse
    */
  type SearchAgentsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[SearchAgentsResponse], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#setAgent}.
    * @param error Error, if any
    * @param [response] Agent
    */
  type SetAgentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Agent], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Agents#trainAgent}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type TrainAgentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
}
