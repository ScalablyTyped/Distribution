package typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useRefetchableFragmentNode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def readQuery(
    environment: js.Any,
    query: js.Any,
    fetchPolicy: js.Any,
    renderPolicy: js.Any,
    refetchGeneration: js.Any,
    componentDisplayName: js.Any,
    hasStartComplete: js.Any,
    profilerContext: js.Any
  ): js.Any = js.native
  def reducer(state: RefetchState, action: Action): RefetchState = js.native
  def useRefetchFunction[TQuery /* <: OperationType */](
    fragmentNode: js.Any,
    parentFragmentRef: js.Any,
    fragmentIdentifier: js.Any,
    fragmentRefPathInResponse: js.Any,
    fragmentData: js.Any,
    refetchGenerationRef: js.Any,
    dispatch: js.Any,
    disposeFetch: js.Any,
    componentDisplayName: js.Any
  ): // tslint:disable-next-line:no-unnecessary-generics
  RefetchFn[TQuery, InternalOptions] = js.native
  def useRefetchableFragmentNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentNode: ReaderFragment, parentFragmentRef: js.Any, componentDisplayName: String): // tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions] = js.native
}

