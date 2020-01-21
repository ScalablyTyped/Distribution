package typings.entriaRelayExperimental.useLoadMoreFunctionMod

import typings.entriaRelayExperimental.AnonCursor
import typings.relayRuntime.readerNodeMod.ReaderFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useLoadMoreFunction", "getConnectionState")
@js.native
object getConnectionState extends js.Object {
  def apply(
    direction: Direction,
    fragmentNode: ReaderFragment,
    fragmentData: js.Any,
    connectionPathInFragmentData: js.Array[String | Double]
  ): AnonCursor = js.native
}

