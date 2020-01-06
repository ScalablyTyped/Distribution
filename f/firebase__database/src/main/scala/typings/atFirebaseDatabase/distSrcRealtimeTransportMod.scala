package typings.atFirebaseDatabase

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.atFirebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/realtime/Transport", JSImport.Namespace)
@js.native
object distSrcRealtimeTransportMod extends js.Object {
  @js.native
  abstract class Transport protected () extends js.Object {
    /**
      *
      * @param {string} connId An identifier for this connection, used for logging
      * @param {RepoInfo} repoInfo The info for the endpoint to send data to.
      * @param {string=} transportSessionId Optional transportSessionId if this is connecting to an existing transport session
      * @param {string=} lastSessionId Optional lastSessionId if there was a previous connection
      * @interface
      */
    def this(connId: String, repoInfo: RepoInfo) = this()
    def this(connId: String, repoInfo: RepoInfo, transportSessionId: String) = this()
    def this(connId: String, repoInfo: RepoInfo, transportSessionId: String, lastSessionId: String) = this()
    /**
      * Bytes received since connection started.
      * @type {number}
      */
    var bytesReceived: Double = js.native
    /**
      * Bytes sent since connection started.
      * @type {number}
      */
    var bytesSent: Double = js.native
    /**
      * An identifier for this connection, used for logging
      * @type {string}
      */
    var connId: String = js.native
    def close(): Unit = js.native
    def markConnectionHealthy(): Unit = js.native
    /**
      * @param {function(Object)} onMessage Callback when messages arrive
      * @param {function()} onDisconnect Callback with connection lost.
      */
    def open(
      onMessage: js.Function1[/* a */ js.Object, Unit],
      onDisconnect: js.Function1[/* a */ js.UndefOr[Boolean], Unit]
    ): Unit = js.native
    /**
      * @param {!Object} data The JSON data to transmit
      */
    def send(data: js.Object): Unit = js.native
    def start(): Unit = js.native
  }
  
  @js.native
  trait TransportConstructor
    extends Instantiable2[
          /* connId */ String, 
          (/* RepoInfo */ js.Any) | (/* repoInfo */ RepoInfo), 
          js.Any | Transport
        ]
       with Instantiable3[
          /* connId */ String, 
          (/* RepoInfo */ js.Any) | (/* repoInfo */ RepoInfo), 
          /* transportSessionId */ String, 
          js.Any | Transport
        ]
       with Instantiable4[
          /* connId */ String, 
          (/* RepoInfo */ js.Any) | (/* repoInfo */ RepoInfo), 
          /* transportSessionId */ String, 
          /* lastSessionId */ String, 
          js.Any | Transport
        ] {
    var healthyTimeout: js.UndefOr[Double] = js.native
    var responsesRequiredToBeHealthy: js.UndefOr[Double] = js.native
    def isAvailable(): Boolean = js.native
  }
  
}

