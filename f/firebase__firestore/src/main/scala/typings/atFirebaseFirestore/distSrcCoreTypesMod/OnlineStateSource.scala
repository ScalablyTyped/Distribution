package typings.atFirebaseFirestore.distSrcCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnlineStateSource extends js.Object

@JSImport("@firebase/firestore/dist/src/core/types", "OnlineStateSource")
@js.native
object OnlineStateSource extends js.Object {
  @js.native
  sealed trait RemoteStore extends OnlineStateSource
  
  @js.native
  sealed trait SharedClientState extends OnlineStateSource
  
  /* 0 */ val RemoteStore: typings.atFirebaseFirestore.distSrcCoreTypesMod.OnlineStateSource.RemoteStore with Double = js.native
  /* 1 */ val SharedClientState: typings.atFirebaseFirestore.distSrcCoreTypesMod.OnlineStateSource.SharedClientState with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnlineStateSource with Double] = js.native
}

