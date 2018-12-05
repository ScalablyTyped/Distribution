package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow", "v2")
@js.native
object v2Ns extends js.Object {
  @js.native
  class AgentsClient () extends js.Object {
    def this(options: dialogflowLib.dialogflowMod.ClientOptions) = this()
    var port: scala.Double = js.native
    var scopes: js.Array[java.lang.String] = js.native
    var servicePath: java.lang.String = js.native
    def exportAgent(request: dialogflowLib.dialogflowMod.ExportAgentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def exportAgent(
      request: dialogflowLib.dialogflowMod.ExportAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def exportAgent(
      request: dialogflowLib.dialogflowMod.ExportAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions,
      cb: js.Function2[
          /* err */ stdLib.Error, 
          /* operation */ dialogflowLib.dialogflowMod.gaxNs.Operation, 
          scala.Unit
        ]
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def getAgent(request: dialogflowLib.dialogflowMod.GetAgentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Agent]] = js.native
    def getAgent(
      request: dialogflowLib.dialogflowMod.GetAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Agent]] = js.native
    def getAgent(
      request: dialogflowLib.dialogflowMod.GetAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions,
      cb: js.Function2[/* err */ stdLib.Error, /* agent */ dialogflowLib.dialogflowMod.Agent, scala.Unit]
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Agent]] = js.native
    def getProjectId(): scala.Unit = js.native
    def getProjectId(callback: js.Function2[/* error */ stdLib.Error, /* id */ java.lang.String, java.lang.String]): scala.Unit = js.native
    @JSName("getProjectId")
    def getProjectId_Promise(): stdLib.Promise[java.lang.String] = js.native
    def importAgent(request: dialogflowLib.dialogflowMod.ImportAgentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def importAgent(
      request: dialogflowLib.dialogflowMod.ImportAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def importAgent(
      request: dialogflowLib.dialogflowMod.ImportAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions,
      cb: js.Function2[
          /* err */ stdLib.Error, 
          /* operation */ dialogflowLib.dialogflowMod.gaxNs.Operation, 
          scala.Unit
        ]
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def restoreAgent(request: dialogflowLib.dialogflowMod.RestoreAgentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def restoreAgent(
      request: dialogflowLib.dialogflowMod.RestoreAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def restoreAgent(
      request: dialogflowLib.dialogflowMod.RestoreAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions,
      cb: js.Function2[
          /* err */ stdLib.Error, 
          /* operation */ dialogflowLib.dialogflowMod.gaxNs.Operation, 
          scala.Unit
        ]
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def searchAgents(request: dialogflowLib.dialogflowMod.SearchAgentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Agent]] = js.native
    def searchAgents(
      request: dialogflowLib.dialogflowMod.SearchAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Agent]] = js.native
    def searchAgents(
      request: dialogflowLib.dialogflowMod.SearchAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions,
      cb: js.Function4[
          /* err */ stdLib.Error, 
          /* agents */ js.Array[dialogflowLib.dialogflowMod.Agent], 
          /* arg3 */ js.Any, 
          /* response */ js.Any, 
          scala.Unit
        ]
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Agent]] = js.native
    def searchAgentsStream(request: dialogflowLib.dialogflowMod.SearchAgentRequest): js.Any = js.native
    def searchAgentsStream(
      request: dialogflowLib.dialogflowMod.SearchAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): js.Any = js.native
    def trainAgent(request: dialogflowLib.dialogflowMod.TrainAgentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def trainAgent(
      request: dialogflowLib.dialogflowMod.TrainAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
    def trainAgent(
      request: dialogflowLib.dialogflowMod.TrainAgentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions,
      cb: js.Function2[
          /* err */ stdLib.Error, 
          /* operation */ dialogflowLib.dialogflowMod.gaxNs.Operation, 
          scala.Unit
        ]
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.gaxNs.Operation]] = js.native
  }
  
  @js.native
  class ContextsClient () extends js.Object {
    def this(options: dialogflowLib.dialogflowMod.ClientOptions) = this()
    var port: scala.Double = js.native
    var scopes: js.Array[java.lang.String] = js.native
    var servicePath: java.lang.String = js.native
    def contextPath(project: java.lang.String, session: java.lang.String, context: java.lang.String): java.lang.String = js.native
    def createContext(request: dialogflowLib.dialogflowMod.CreateContextReqeust): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Context]] = js.native
    def createContext(
      request: dialogflowLib.dialogflowMod.CreateContextReqeust,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Context]] = js.native
    def deleteAllContexts(request: dialogflowLib.dialogflowMod.DeleteAllContextsRequest): stdLib.Promise[scala.Unit] = js.native
    def deleteAllContexts(
      request: dialogflowLib.dialogflowMod.DeleteAllContextsRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[scala.Unit] = js.native
    def deleteContext(request: dialogflowLib.dialogflowMod.DeleteContextRequest): stdLib.Promise[scala.Unit] = js.native
    def deleteContext(
      request: dialogflowLib.dialogflowMod.DeleteContextRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[scala.Unit] = js.native
    def getContext(request: dialogflowLib.dialogflowMod.GetContextRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Context]] = js.native
    def getContext(
      request: dialogflowLib.dialogflowMod.GetContextRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Context]] = js.native
    def getProjectId(): scala.Unit = js.native
    def getProjectId(callback: js.Function2[/* error */ stdLib.Error, /* id */ java.lang.String, java.lang.String]): scala.Unit = js.native
    @JSName("getProjectId")
    def getProjectId_Promise(): stdLib.Promise[java.lang.String] = js.native
    def listContexts(request: dialogflowLib.dialogflowMod.ListContextsRequest): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.Context]]] = js.native
    def listContexts(
      request: dialogflowLib.dialogflowMod.ListContextsRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.Context]]] = js.native
    def listContextsStream(request: dialogflowLib.dialogflowMod.ListContextsRequest): js.Any = js.native
    def listContextsStream(
      request: dialogflowLib.dialogflowMod.ListContextsRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): js.Any = js.native
    def matchContextFromContextName(name: java.lang.String): java.lang.String = js.native
    def matchProjectFromContextName(name: java.lang.String): java.lang.String = js.native
    def matchProjectFromSessionName(name: java.lang.String): java.lang.String = js.native
    def matchSessionFromContextName(name: java.lang.String): java.lang.String = js.native
    def matchSessionFromSessionName(name: java.lang.String): java.lang.String = js.native
    def sessionPath(project: java.lang.String, session: java.lang.String): java.lang.String = js.native
    def updateContext(request: dialogflowLib.dialogflowMod.UpdateContextRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Context]] = js.native
    def updateContext(
      request: dialogflowLib.dialogflowMod.UpdateContextRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Context]] = js.native
  }
  
  @js.native
  class EntityTypesClient () extends js.Object {
    def this(options: dialogflowLib.dialogflowMod.ClientOptions) = this()
    var port: scala.Double = js.native
    var scopes: js.Array[java.lang.String] = js.native
    var servicePath: java.lang.String = js.native
    def createEntityType(request: dialogflowLib.dialogflowMod.CreateEntityTypeRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.EntityType]] = js.native
    def createEntityType(
      request: dialogflowLib.dialogflowMod.CreateEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.EntityType]] = js.native
    def deleteEntityType(request: dialogflowLib.dialogflowMod.DeleteEntityTypeRequest): stdLib.Promise[scala.Unit] = js.native
    def deleteEntityType(
      request: dialogflowLib.dialogflowMod.DeleteEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[scala.Unit] = js.native
    def entityTypePath(project: java.lang.String, entityType: java.lang.String): java.lang.String = js.native
    def getEntityType(request: dialogflowLib.dialogflowMod.GetEntityTypeRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.EntityType]] = js.native
    def getEntityType(
      request: dialogflowLib.dialogflowMod.GetEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.EntityType]] = js.native
    def getProjectId(): scala.Unit = js.native
    def getProjectId(callback: js.Function2[/* error */ stdLib.Error, /* id */ java.lang.String, java.lang.String]): scala.Unit = js.native
    @JSName("getProjectId")
    def getProjectId_Promise(): stdLib.Promise[java.lang.String] = js.native
    def listEntityTypes(request: dialogflowLib.dialogflowMod.ListEntityTypesRequest): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.EntityType]]] = js.native
    def listEntityTypes(
      request: dialogflowLib.dialogflowMod.ListEntityTypesRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.EntityType]]] = js.native
    def listEntityTypesStream(request: dialogflowLib.dialogflowMod.ListEntityTypesRequest): js.Any = js.native
    def listEntityTypesStream(
      request: dialogflowLib.dialogflowMod.ListEntityTypesRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): js.Any = js.native
    def matchEntityTypeFromEntityTypeName(entityTypeName: java.lang.String): java.lang.String = js.native
    def matchProjectFromEntityTypeName(entityTypeName: java.lang.String): java.lang.String = js.native
    def matchProjectFromProjectAgentName(entityTypeName: java.lang.String): java.lang.String = js.native
    // TODO: add batch style calls
    // batchUpdateEntityTypes
    // batchDeleteEntityTypes
    // batchCreateEntities
    // batchUpdateEntities
    // batchDeleteEntities
    def projectAgentPath(project: java.lang.String): java.lang.String = js.native
    def updateEntityType(request: dialogflowLib.dialogflowMod.UpdateEntityTypeRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.EntityType]] = js.native
    def updateEntityType(
      request: dialogflowLib.dialogflowMod.UpdateEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.EntityType]] = js.native
  }
  
  @js.native
  class IntentsClient () extends js.Object {
    def this(options: dialogflowLib.dialogflowMod.ClientOptions) = this()
    var port: scala.Double = js.native
    var scopes: js.Array[java.lang.String] = js.native
    var servicePath: java.lang.String = js.native
    def agentPath(project: java.lang.String, agent: java.lang.String): java.lang.String = js.native
    def createIntent(request: dialogflowLib.dialogflowMod.CreateIntentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Intent]] = js.native
    def createIntent(
      request: dialogflowLib.dialogflowMod.CreateIntentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Intent]] = js.native
    def deleteIntent(request: dialogflowLib.dialogflowMod.DeleteIntentRequest): stdLib.Promise[scala.Unit] = js.native
    def deleteIntent(
      request: dialogflowLib.dialogflowMod.DeleteIntentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[scala.Unit] = js.native
    def getIntent(request: dialogflowLib.dialogflowMod.GetIntentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Intent]] = js.native
    def getIntent(
      request: dialogflowLib.dialogflowMod.GetIntentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Intent]] = js.native
    def getProjectId(): scala.Unit = js.native
    def getProjectId(callback: js.Function2[/* error */ stdLib.Error, /* id */ java.lang.String, java.lang.String]): scala.Unit = js.native
    @JSName("getProjectId")
    def getProjectId_Promise(): stdLib.Promise[java.lang.String] = js.native
    def intentPath(project: java.lang.String, intent: java.lang.String): java.lang.String = js.native
    def listIntents(request: dialogflowLib.dialogflowMod.ListIntentsRequest): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.Intent]]] = js.native
    def listIntents(
      request: dialogflowLib.dialogflowMod.ListIntentsRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.Intent]]] = js.native
    def matchAgentFromAgentName(agentName: java.lang.String): java.lang.String = js.native
    def matchIntentFromIntentName(intentName: java.lang.String): java.lang.String = js.native
    def matchProjectFromAgentName(agentName: java.lang.String): java.lang.String = js.native
    def matchProjectFromIntentName(intentName: java.lang.String): java.lang.String = js.native
    def matchProjectFromProjectAgentName(projectAgentName: java.lang.String): java.lang.String = js.native
    // TODO: add batch style calls
    // batchUpdateIntents(request: BatchUpdateIntentsRequest): void;
    // batchDeleteIntents(request: BatchDeleteIntentsRequest): void;
    def projectAgentPath(project: java.lang.String): java.lang.String = js.native
    def updateIntent(request: dialogflowLib.dialogflowMod.UpdateIntentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Intent]] = js.native
    def updateIntent(
      request: dialogflowLib.dialogflowMod.UpdateIntentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.Intent]] = js.native
  }
  
  @js.native
  class SessionEntityTypesClient () extends js.Object {
    def this(options: dialogflowLib.dialogflowMod.ClientOptions) = this()
    var port: scala.Double = js.native
    var scopes: js.Array[java.lang.String] = js.native
    var servicePath: java.lang.String = js.native
    def createSessionEntityType(request: dialogflowLib.dialogflowMod.CreateSessionEntityTypeRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]] = js.native
    def createSessionEntityType(
      request: dialogflowLib.dialogflowMod.CreateSessionEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]] = js.native
    def deleteSessionEntityType(request: dialogflowLib.dialogflowMod.DeleteSessionEntityTypeRequest): stdLib.Promise[scala.Unit] = js.native
    def deleteSessionEntityType(
      request: dialogflowLib.dialogflowMod.DeleteSessionEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[scala.Unit] = js.native
    def getProjectId(): scala.Unit = js.native
    def getProjectId(callback: js.Function2[/* error */ stdLib.Error, /* id */ java.lang.String, java.lang.String]): scala.Unit = js.native
    @JSName("getProjectId")
    def getProjectId_Promise(): stdLib.Promise[java.lang.String] = js.native
    def getSessionEntityType(request: dialogflowLib.dialogflowMod.GetSessionEntityTypeRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]] = js.native
    def getSessionEntityType(
      request: dialogflowLib.dialogflowMod.GetSessionEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]] = js.native
    // TODO: add streaming calls
    def listSessionEntityTypes(request: dialogflowLib.dialogflowMod.ListSessionEntityTypesRequest): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]]] = js.native
    // TODO: add streaming calls
    def listSessionEntityTypes(
      request: dialogflowLib.dialogflowMod.ListSessionEntityTypesRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]]] = js.native
    def updateSessionEntityType(request: dialogflowLib.dialogflowMod.UpdateSessionEntityTypeRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]] = js.native
    def updateSessionEntityType(
      request: dialogflowLib.dialogflowMod.UpdateSessionEntityTypeRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.SessionEntityType]] = js.native
  }
  
  @js.native
  class SessionsClient () extends js.Object {
    def this(options: dialogflowLib.dialogflowMod.ClientOptions) = this()
    var port: scala.Double = js.native
    var scopes: js.Array[java.lang.String] = js.native
    var servicePath: java.lang.String = js.native
    def detectIntent(request: dialogflowLib.dialogflowMod.DetectIntentRequest): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.DetectIntentResponse]] = js.native
    def detectIntent(
      request: dialogflowLib.dialogflowMod.DetectIntentRequest,
      options: dialogflowLib.dialogflowMod.gaxNs.CallOptions
    ): stdLib.Promise[js.Array[dialogflowLib.dialogflowMod.DetectIntentResponse]] = js.native
    def getProjectId(): scala.Unit = js.native
    def getProjectId(callback: js.Function2[/* error */ stdLib.Error, /* id */ java.lang.String, java.lang.String]): scala.Unit = js.native
    @JSName("getProjectId")
    def getProjectId_Promise(): stdLib.Promise[java.lang.String] = js.native
    def sessionPath(projectId: java.lang.String, sessionId: java.lang.String): java.lang.String = js.native
    def streamingDetectIntent(): stdLib.Promise[_] = js.native
    def streamingDetectIntent(options: dialogflowLib.dialogflowMod.gaxNs.CallOptions): stdLib.Promise[_] = js.native
  }
  
}

