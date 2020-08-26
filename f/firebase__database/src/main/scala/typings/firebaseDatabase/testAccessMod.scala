package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.Instantiable8
import typings.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.connectionMod.Connection
import typings.firebaseDatabase.persistentConnectionMod.PersistentConnection
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/test_access", JSImport.Namespace)
@js.native
object testAccessMod extends js.Object {
  @js.native
  class DataConnection protected () extends PersistentConnection {
    /**
      * @implements {ServerActions}
      * @param repoInfo_ Data about the namespace we are connecting to
      * @param applicationId_ The Firebase App ID for this project
      * @param onDataUpdate_ A callback for new data from the server
      */
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ js.Any, Unit],
      authTokenProvider_ : AuthTokenProvider
    ) = this()
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ js.Any, Unit],
      authTokenProvider_ : AuthTokenProvider,
      authOverride_ : js.Object
    ) = this()
  }
  
  val ConnectionTarget: Instantiable6[
    /* host */ String, 
    /* secure */ Boolean, 
    /* namespace */ String, 
    /* webSocketOnly */ Boolean, 
    /* persistenceKey */ js.UndefOr[String], 
    /* includeNamespaceInQueryParams */ js.UndefOr[Boolean], 
    RepoInfo
  ] = js.native
  val RealTimeConnection: Instantiable8[
    /* id */ String, 
    /* repoInfo_ */ RepoInfo, 
    /* applicationId_ */ js.UndefOr[String], 
    /* onMessage_ */ js.Function1[/* a */ js.Object, Unit], 
    /* onReady_ */ js.Function2[/* a */ Double, /* b */ String, Unit], 
    /* onDisconnect_ */ js.Function0[Unit], 
    /* onKill_ */ js.Function1[/* a */ String, Unit], 
    /* lastSessionId */ js.UndefOr[String], 
    Connection
  ] = js.native
  def forceRestClient(forceRestClient: Boolean): Unit = js.native
  def hijackHash(newHash: js.Function0[String]): js.Function0[Unit] = js.native
  def queryIdentifier(query: Query): String = js.native
  @js.native
  object DataConnection
    extends Instantiable6[
          /* repoInfo_ */ RepoInfo, 
          /* applicationId_ */ String, 
          /* onDataUpdate_ */ js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, Double | Null, Unit], 
          /* onConnectStatus_ */ js.Function1[/* a */ Boolean, Unit], 
          /* onServerInfoUpdate_ */ js.Function1[/* a */ js.Any, Unit], 
          /* authTokenProvider_ */ AuthTokenProvider, 
          PersistentConnection
        ]
       with Instantiable7[
          /* repoInfo_ */ RepoInfo, 
          /* applicationId_ */ String, 
          /* onDataUpdate_ */ js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit], 
          /* onConnectStatus_ */ js.Function1[/* a */ Boolean, Unit], 
          /* onServerInfoUpdate_ */ js.Function1[/* a */ js.Any, Unit], 
          /* authTokenProvider_ */ AuthTokenProvider, 
          /* authOverride_ */ js.Object, 
          PersistentConnection
        ] {
    /**
      * Counter for number of connections created. Mainly used for tagging in the logs
      */
    var nextConnectionId_ : js.Any = js.native
    var nextPersistentConnectionId_ : js.Any = js.native
    var warnOnListenWarnings_ : js.Any = js.native
  }
  
}

