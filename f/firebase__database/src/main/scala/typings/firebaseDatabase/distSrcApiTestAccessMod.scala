package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable10
import org.scalablytyped.runtime.Instantiable7
import typings.firebaseDatabase.distSrcCoreAppCheckTokenProviderMod.AppCheckTokenProvider
import typings.firebaseDatabase.distSrcCoreAuthTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.distSrcCorePersistentConnectionMod.PersistentConnection
import typings.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
import typings.firebaseDatabase.distSrcRealtimeConnectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiTestAccessMod {
  
  @JSImport("@firebase/database/dist/src/api/test_access", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/database/dist/src/api/test_access", "ConnectionTarget")
  @js.native
  open class ConnectionTarget protected () extends RepoInfo {
    /**
      * @param host - Hostname portion of the url for the repo
      * @param secure - Whether or not this repo is accessed over ssl
      * @param namespace - The namespace represented by the repo
      * @param webSocketOnly - Whether to prefer websockets over all other transports (used by Nest).
      * @param nodeAdmin - Whether this instance uses Admin SDK credentials
      * @param persistenceKey - Override the default session persistence storage key
      */
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean) = this()
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean, nodeAdmin: Boolean) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: String
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Boolean
    ) = this()
  }
  @JSImport("@firebase/database/dist/src/api/test_access", "ConnectionTarget")
  @js.native
  val ConnectionTarget: Instantiable7[
    /* host */ String, 
    /* secure */ Boolean, 
    /* namespace */ String, 
    /* webSocketOnly */ Boolean, 
    /* nodeAdmin */ js.UndefOr[Boolean], 
    /* persistenceKey */ js.UndefOr[String], 
    /* includeNamespaceInQueryParams */ js.UndefOr[Boolean], 
    RepoInfo
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection")
  @js.native
  open class DataConnection protected () extends PersistentConnection {
    /**
      * @param repoInfo_ - Data about the namespace we are connecting to
      * @param applicationId_ - The Firebase App ID for this project
      * @param onDataUpdate_ - A callback for new data from the server
      */
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ Any, Unit],
      authTokenProvider_ : AuthTokenProvider,
      appCheckTokenProvider_ : AppCheckTokenProvider
    ) = this()
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ Any, Unit],
      authTokenProvider_ : AuthTokenProvider,
      appCheckTokenProvider_ : AppCheckTokenProvider,
      authOverride_ : js.Object
    ) = this()
  }
  object DataConnection {
    
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Counter for number of connections created. Mainly used for tagging in the logs
      */
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection.nextConnectionId_")
    @js.native
    def nextConnectionId: Any = js.native
    
    inline def nextConnectionId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection.nextPersistentConnectionId_")
    @js.native
    def nextPersistentConnectionId: Any = js.native
    
    inline def nextPersistentConnectionId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextPersistentConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection.warnOnListenWarnings_")
    @js.native
    def warnOnListenWarnings: Any = js.native
    
    inline def warnOnListenWarnings_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warnOnListenWarnings_")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/database/dist/src/api/test_access", "RealTimeConnection")
  @js.native
  open class RealTimeConnection protected () extends Connection {
    /**
      * @param id - an id for this connection
      * @param repoInfo_ - the info for the endpoint to connect to
      * @param applicationId_ - the Firebase App ID for this project
      * @param appCheckToken_ - The App Check Token for this device.
      * @param authToken_ - The auth token for this session.
      * @param onMessage_ - the callback to be triggered when a server-push message arrives
      * @param onReady_ - the callback to be triggered when this connection is ready to send messages.
      * @param onDisconnect_ - the callback to be triggered when a connection was lost
      * @param onKill_ - the callback to be triggered when this connection has permanently shut down.
      * @param lastSessionId - last session id in persistent connection. is used to clean up old session in real-time server
      */
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : String,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : String,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : Unit,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : Unit,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : String,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : String,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : Unit,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : Unit,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : String,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : String,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : Unit,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      appCheckToken_ : Unit,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : String,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : String,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : Unit,
      authToken_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      appCheckToken_ : Unit,
      authToken_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
  }
  @JSImport("@firebase/database/dist/src/api/test_access", "RealTimeConnection")
  @js.native
  val RealTimeConnection: Instantiable10[
    /* id */ String, 
    /* repoInfo_ */ RepoInfo, 
    /* applicationId_ */ js.UndefOr[String], 
    /* appCheckToken_ */ js.UndefOr[String], 
    /* authToken_ */ js.UndefOr[String], 
    /* onMessage_ */ js.Function1[/* a */ js.Object, Unit], 
    /* onReady_ */ js.Function2[/* a */ Double, /* b */ String, Unit], 
    /* onDisconnect_ */ js.Function0[Unit], 
    /* onKill_ */ js.Function1[/* a */ String, Unit], 
    /* lastSessionId */ js.UndefOr[String], 
    Connection
  ] = js.native
  
  inline def forceRestClient(forceRestClient: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceRestClient")(forceRestClient.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hijackHash(newHash: js.Function0[String]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hijackHash")(newHash.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
