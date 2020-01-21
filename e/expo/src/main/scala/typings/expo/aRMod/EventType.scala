package typings.expo.aRMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("expo/build/AR", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait AnchorsDidUpdate extends EventType
  
  @js.native
  sealed trait CameraDidChangeTrackingState extends EventType
  
  @js.native
  sealed trait DidFailWithError extends EventType
  
  @js.native
  sealed trait FrameDidUpdate extends EventType
  
  @js.native
  sealed trait SessionInterruptionEnded extends EventType
  
  @js.native
  sealed trait SessionWasInterrupted extends EventType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
  /* 2 */ @js.native
  object AnchorsDidUpdate extends TopLevel[AnchorsDidUpdate with Double]
  
  /* 3 */ @js.native
  object CameraDidChangeTrackingState extends TopLevel[CameraDidChangeTrackingState with Double]
  
  /* 1 */ @js.native
  object DidFailWithError extends TopLevel[DidFailWithError with Double]
  
  /* 0 */ @js.native
  object FrameDidUpdate extends TopLevel[FrameDidUpdate with Double]
  
  /* 5 */ @js.native
  object SessionInterruptionEnded extends TopLevel[SessionInterruptionEnded with Double]
  
  /* 4 */ @js.native
  object SessionWasInterrupted extends TopLevel[SessionWasInterrupted with Double]
  
}

