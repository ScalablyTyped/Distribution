package typings.googleDashGax.buildSrcStreamingCallsStreamingMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamType extends js.Object

@JSImport("google-gax/build/src/streamingCalls/streaming", "StreamType")
@js.native
object StreamType extends js.Object {
  /** Both client and server stream objects. */
  @js.native
  sealed trait BIDI_STREAMING extends StreamType
  
  /** Client streams requests, server returns a single response. */
  @js.native
  sealed trait CLIENT_STREAMING extends StreamType
  
  /** Client sends a single request, server streams responses. */
  @js.native
  sealed trait SERVER_STREAMING extends StreamType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamType with Double] = js.native
  /* 3 */ @js.native
  object BIDI_STREAMING extends TopLevel[BIDI_STREAMING with Double]
  
  /* 2 */ @js.native
  object CLIENT_STREAMING extends TopLevel[CLIENT_STREAMING with Double]
  
  /* 1 */ @js.native
  object SERVER_STREAMING extends TopLevel[SERVER_STREAMING with Double]
  
}

