package typings.atEntriaRelayDashExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentMod.NonNullableFragmentReturn
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentMod.NonNullableReturn
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentMod.NullableFragmentReturn
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentMod.NullableReturn
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentMod.ReturnTypeRefetchableFragment
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod.Options
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useRefetchableFragment", JSImport.Namespace)
@js.native
object libUseRefetchableFragmentMod extends js.Object {
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = js.native
  type NonNullableFragmentReturn[TReturn] = ReturnType[NonNullableReturn[TReturn]]
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  type NullableFragmentReturn[TReturn] = ReturnType[NullableReturn[TReturn]]
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | Null], TFragmentData | Null]
  type ReturnTypeRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */] = js.Tuple2[
    (// NOTE: This ReturnType ensures that the type of the returned data is either:
  //   - nullable if the provided ref type is nullable
  //   - non-nullable if the provided ref type is non-nullable
  NonNullableFragmentReturn[TKey]) with NullableFragmentReturn[TKey], 
    RefetchFnDynamic[TQuery, TKey, Options]
  ]
}

