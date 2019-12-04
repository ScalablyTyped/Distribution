package typings.atFirebaseFirestore.distSrcCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnlineState extends js.Object

@JSImport("@firebase/firestore/dist/src/core/types", "OnlineState")
@js.native
object OnlineState extends js.Object {
  /**
    * The client is either trying to establish a connection but failing, or it
    * has been explicitly marked offline via a call to disableNetwork().
    * Higher-level components should operate in offline mode.
    */
  @js.native
  sealed trait Offline extends OnlineState
  
  /**
    * The client is connected and the connections are healthy. This state is
    * reached after a successful connection and there has been at least one
    * successful message received from the backends.
    */
  @js.native
  sealed trait Online extends OnlineState
  
  /**
    * The Firestore client is in an unknown online state. This means the client
    * is either not actively trying to establish a connection or it is currently
    * trying to establish a connection, but it has not succeeded or failed yet.
    * Higher-level components should not operate in offline mode.
    */
  @js.native
  sealed trait Unknown extends OnlineState
  
  /* 2 */ val Offline: typings.atFirebaseFirestore.distSrcCoreTypesMod.OnlineState.Offline with Double = js.native
  /* 1 */ val Online: typings.atFirebaseFirestore.distSrcCoreTypesMod.OnlineState.Online with Double = js.native
  /* 0 */ val Unknown: typings.atFirebaseFirestore.distSrcCoreTypesMod.OnlineState.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnlineState with Double] = js.native
}

