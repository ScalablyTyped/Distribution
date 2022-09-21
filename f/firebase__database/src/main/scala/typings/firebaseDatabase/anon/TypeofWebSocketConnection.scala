package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import typings.firebaseDatabase.webSocketConnectionMod.WebSocketConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebSocketConnection
  extends StObject
     with Instantiable2[
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
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      /* appCheckToken */ String, 
      WebSocketConnection
    ]
     with Instantiable5[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
      /* authToken */ String, 
      WebSocketConnection
    ]
     with Instantiable6[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
      (/* authToken */ String) | (/* authToken */ Unit), 
      /* transportSessionId */ String, 
      WebSocketConnection
    ]
     with Instantiable7[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
      (/* authToken */ String) | (/* authToken */ Unit), 
      (/* transportSessionId */ String) | (/* transportSessionId */ Unit), 
      /* lastSessionId */ String, 
      WebSocketConnection
    ] {
  
  /**
    * @param repoInfo - The info for the websocket endpoint.
    * @param transportSessionId - Optional transportSessionId if this is connecting to an existing transport
    *                                         session
    * @param lastSessionId - Optional lastSessionId if there was a previous connection
    * @returns connection url
    */
  /* private */ var connectionURL_ : Any = js.native
  
  def forceDisallow(): Unit = js.native
  
  var forceDisallow_ : Boolean = js.native
  
  /**
    * Time to wait for the connection te become healthy before giving up.
    */
  var healthyTimeout: Double = js.native
  
  def isAvailable(): Boolean = js.native
  
  /**
    * Returns true if we previously failed to connect with this transport.
    */
  def previouslyFailed(): Boolean = js.native
  
  /**
    * Number of response before we consider the connection "healthy."
    */
  var responsesRequiredToBeHealthy: Double = js.native
}
