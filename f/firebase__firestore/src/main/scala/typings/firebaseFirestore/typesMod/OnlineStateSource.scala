package typings.firebaseFirestore.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnlineStateSource extends js.Object

@JSImport("@firebase/firestore/dist/lib/src/core/types", "OnlineStateSource")
@js.native
object OnlineStateSource extends js.Object {
  @js.native
  sealed trait RemoteStore extends OnlineStateSource
  
  @js.native
  sealed trait SharedClientState extends OnlineStateSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnlineStateSource with Double] = js.native
  /* 0 */ @js.native
  object RemoteStore extends TopLevel[RemoteStore with Double]
  
  /* 1 */ @js.native
  object SharedClientState extends TopLevel[SharedClientState with Double]
  
}

