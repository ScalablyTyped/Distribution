package typings.firebaseDatabase

import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.transportMod.TransportConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportManagerMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/realtime/TransportManager", "TransportManager")
  @js.native
  open class TransportManager protected () extends StObject {
    /**
      * @param repoInfo - Metadata around the namespace we're connecting to
      */
    def this(repoInfo: RepoInfo) = this()
    
    /* private */ var initTransports_ : Any = js.native
    
    /**
      * @returns The constructor for the initial transport to use
      */
    def initialTransport(): TransportConstructor = js.native
    
    /* private */ var transports_ : Any = js.native
    
    /**
      * @returns The constructor for the next transport, or null
      */
    def upgradeTransport(): TransportConstructor | Null = js.native
  }
  /* static members */
  object TransportManager {
    
    @JSImport("@firebase/database/dist/node-esm/src/realtime/TransportManager", "TransportManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database/dist/node-esm/src/realtime/TransportManager", "TransportManager.globalTransportInitialized_")
    @js.native
    def globalTransportInitialized_ : Boolean = js.native
    inline def globalTransportInitialized__=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalTransportInitialized_")(x.asInstanceOf[js.Any])
  }
}
