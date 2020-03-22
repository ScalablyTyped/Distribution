package typings.firebaseDatabase

import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.transportMod.TransportConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/realtime/TransportManager", JSImport.Namespace)
@js.native
object transportManagerMod extends js.Object {
  @js.native
  class TransportManager protected () extends js.Object {
    /**
      * @param {!RepoInfo} repoInfo Metadata around the namespace we're connecting to
      */
    def this(repoInfo: RepoInfo) = this()
    /**
      * @param {!RepoInfo} repoInfo
      * @private
      */
    var initTransports_ : js.Any = js.native
    var transports_ : js.Any = js.native
    /**
      * @return {function(new:Transport, !string, !RepoInfo, string=, string=)} The constructor for the
      * initial transport to use
      */
    def initialTransport(): TransportConstructor = js.native
    /**
      * @return {?function(new:Transport, function(),function(), string=)} The constructor for the next
      * transport, or null
      */
    def upgradeTransport(): TransportConstructor | Null = js.native
  }
  
  /* static members */
  @js.native
  object TransportManager extends js.Object {
    /**
      * @const
      * @type {!Array.<function(new:Transport, string, RepoInfo, string=)>}
      */
    def ALL_TRANSPORTS(): js.Array[TypeofBrowserPollConnecti | TypeofWebSocketConnection] = js.native
  }
  
}

