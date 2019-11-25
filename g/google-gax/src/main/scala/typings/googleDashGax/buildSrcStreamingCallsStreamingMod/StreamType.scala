package typings.googleDashGax.buildSrcStreamingCallsStreamingMod

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
  
  /* 3 */ val BIDI_STREAMING: typings.googleDashGax.buildSrcStreamingCallsStreamingMod.StreamType.BIDI_STREAMING with Double = js.native
  /* 2 */ val CLIENT_STREAMING: typings.googleDashGax.buildSrcStreamingCallsStreamingMod.StreamType.CLIENT_STREAMING with Double = js.native
  /* 1 */ val SERVER_STREAMING: typings.googleDashGax.buildSrcStreamingCallsStreamingMod.StreamType.SERVER_STREAMING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamType with Double] = js.native
}

