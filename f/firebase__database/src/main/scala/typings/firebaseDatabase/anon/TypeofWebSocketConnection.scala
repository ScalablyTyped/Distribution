package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.firebaseDatabase.webSocketConnectionMod.WebSocketConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebSocketConnection
  extends Instantiable2[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      WebSocketConnection
    ]
     with Instantiable3[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      /* applicationId */ String, 
      WebSocketConnection
    ]
     with Instantiable4[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      js.UndefOr[/* applicationId */ String], 
      /* transportSessionId */ String, 
      WebSocketConnection
    ]
     with Instantiable5[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      js.UndefOr[/* applicationId */ String], 
      js.UndefOr[/* transportSessionId */ String], 
      /* lastSessionId */ String, 
      WebSocketConnection
    ] {
  
  /**
    * @param {RepoInfo} repoInfo The info for the websocket endpoint.
    * @param {string=} transportSessionId Optional transportSessionId if this is connecting to an existing transport
    *                                         session
    * @param {string=} lastSessionId Optional lastSessionId if there was a previous connection
    * @return {string} connection url
    * @private
    */
  var connectionURL_ : js.Any = js.native
  
  def forceDisallow(): Unit = js.native
  
  var forceDisallow_ : Boolean = js.native
  
  /**
    * Time to wait for the connection te become healthy before giving up.
    * @type {number}
    */
  var healthyTimeout: Double = js.native
  
  def isAvailable(): Boolean = js.native
  
  /**
    * Returns true if we previously failed to connect with this transport.
    * @return {boolean}
    */
  def previouslyFailed(): Boolean = js.native
  
  /**
    * Number of response before we consider the connection "healthy."
    * @type {number}
    */
  var responsesRequiredToBeHealthy: Double = js.native
}
