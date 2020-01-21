package typings.firebaseFirestore.watchChangeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchTargetChangeState extends js.Object

@JSImport("@firebase/firestore/dist/lib/src/remote/watch_change", "WatchTargetChangeState")
@js.native
object WatchTargetChangeState extends js.Object {
  @js.native
  sealed trait Added extends WatchTargetChangeState
  
  @js.native
  sealed trait Current extends WatchTargetChangeState
  
  @js.native
  sealed trait NoChange extends WatchTargetChangeState
  
  @js.native
  sealed trait Removed extends WatchTargetChangeState
  
  @js.native
  sealed trait Reset extends WatchTargetChangeState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchTargetChangeState with Double] = js.native
  /* 1 */ @js.native
  object Added extends TopLevel[Added with Double]
  
  /* 3 */ @js.native
  object Current extends TopLevel[Current with Double]
  
  /* 0 */ @js.native
  object NoChange extends TopLevel[NoChange with Double]
  
  /* 2 */ @js.native
  object Removed extends TopLevel[Removed with Double]
  
  /* 4 */ @js.native
  object Reset extends TopLevel[Reset with Double]
  
}

