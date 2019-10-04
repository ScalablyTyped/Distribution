package typings.atEntriaRelayDashExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUseRefetchableFragmentMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod.Options
  import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod.RefetchFnDynamic
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
  import typings.std.ReturnType

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
