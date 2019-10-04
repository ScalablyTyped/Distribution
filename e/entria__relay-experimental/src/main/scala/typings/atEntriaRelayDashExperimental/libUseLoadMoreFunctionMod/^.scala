package typings.atEntriaRelayDashExperimental.libUseLoadMoreFunctionMod

import typings.atEntriaRelayDashExperimental.Anon_Cursor
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useLoadMoreFunction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getConnectionState(
    direction: Direction,
    fragmentNode: ReaderFragment,
    fragmentData: js.Any,
    connectionPathInFragmentData: js.Array[String | Double]
  ): Anon_Cursor = js.native
  def useLoadMoreFunction(args: UseLoadMoreFunctionArgs): js.Tuple3[LoadMoreFn, Boolean, js.Function0[Unit]] = js.native
}

