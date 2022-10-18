package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import typings.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcRealtimeTransportMod {
  
  /* note: abstract class */ @JSImport("@firebase/database/dist/node-esm/src/realtime/Transport", "Transport")
  @js.native
  open class Transport protected () extends StObject {
    /**
      * @param connId - An identifier for this connection, used for logging
      * @param repoInfo - The info for the endpoint to send data to.
      * @param transportSessionId - Optional transportSessionId if this is connecting to an existing transport session
      * @param lastSessionId - Optional lastSessionId if there was a previous connection
      * @interface
      */
    def this(connId: String, repoInfo: RepoInfo) = this()
    def this(connId: String, repoInfo: RepoInfo, transportSessionId: String) = this()
    def this(connId: String, repoInfo: RepoInfo, transportSessionId: String, lastSessionId: String) = this()
    def this(connId: String, repoInfo: RepoInfo, transportSessionId: Unit, lastSessionId: String) = this()
    
    /**
      * Bytes received since connection started.
      */
    var bytesReceived: Double = js.native
    
    /**
      * Bytes sent since connection started.
      */
    var bytesSent: Double = js.native
    
    def close(): Unit = js.native
    
    /**
      * An identifier for this connection, used for logging
      */
    var connId: String = js.native
    
    def markConnectionHealthy(): Unit = js.native
    
    /**
      * @param onMessage - Callback when messages arrive
      * @param onDisconnect - Callback with connection lost.
      */
    def open(
      onMessage: js.Function1[/* a */ js.Object, Unit],
      onDisconnect: js.Function1[/* a */ js.UndefOr[Boolean], Unit]
    ): Unit = js.native
    
    /**
      * @param data - The JSON data to transmit
      */
    def send(data: js.Object): Unit = js.native
    
    def start(): Unit = js.native
  }
  
  @js.native
  trait TransportConstructor
    extends StObject
       with Instantiable2[/* connId */ String, /* repoInfo */ RepoInfo, Transport]
       with Instantiable3[/* connId */ String, /* repoInfo */ RepoInfo, /* applicationId */ String, Transport]
       with Instantiable4[
          /* connId */ String, 
          /* repoInfo */ RepoInfo, 
          (/* applicationId */ String) | (/* applicationId */ Unit), 
          /* appCheckToken */ String, 
          Transport
        ]
       with Instantiable5[
          /* connId */ String, 
          /* repoInfo */ RepoInfo, 
          (/* applicationId */ String) | (/* applicationId */ Unit), 
          (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
          /* authToken */ String, 
          Transport
        ]
       with Instantiable6[
          /* connId */ String, 
          /* repoInfo */ RepoInfo, 
          (/* applicationId */ String) | (/* applicationId */ Unit), 
          (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
          (/* authToken */ String) | (/* authToken */ Unit), 
          /* transportSessionId */ String, 
          Transport
        ]
       with Instantiable7[
          /* connId */ String, 
          /* repoInfo */ RepoInfo, 
          (/* applicationId */ String) | (/* applicationId */ Unit), 
          (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
          (/* authToken */ String) | (/* authToken */ Unit), 
          (/* transportSessionId */ String) | (/* transportSessionId */ Unit), 
          /* lastSessionId */ String, 
          Transport
        ] {
    
    var healthyTimeout: js.UndefOr[Double] = js.native
    
    def isAvailable(): Boolean = js.native
    
    var responsesRequiredToBeHealthy: js.UndefOr[Double] = js.native
  }
}
