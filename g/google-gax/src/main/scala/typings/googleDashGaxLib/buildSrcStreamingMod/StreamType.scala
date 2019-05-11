package typings
package googleDashGaxLib.buildSrcStreamingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamType extends js.Object

@JSImport("google-gax/build/src/streaming", "StreamType")
@js.native
object StreamType extends js.Object {
  /** Both client and server stream objects. */
  @js.native
  sealed trait BIDI_STREAMING
    extends googleDashGaxLib.buildSrcStreamingMod.StreamType
  
  /** Client streams requests, server returns a single response. */
  @js.native
  sealed trait CLIENT_STREAMING
    extends googleDashGaxLib.buildSrcStreamingMod.StreamType
  
  /** Client sends a single request, server streams responses. */
  @js.native
  sealed trait SERVER_STREAMING
    extends googleDashGaxLib.buildSrcStreamingMod.StreamType
  
  /* 3 */ val BIDI_STREAMING: BIDI_STREAMING with scala.Double = js.native
  /* 2 */ val CLIENT_STREAMING: CLIENT_STREAMING with scala.Double = js.native
  /* 1 */ val SERVER_STREAMING: SERVER_STREAMING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashGaxLib.buildSrcStreamingMod.StreamType with scala.Double] = js.native
}

