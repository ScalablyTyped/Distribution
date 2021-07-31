package typings.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.Options
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefetchableFragmentMod {
  
  @JSImport("@entria/relay-experimental/lib/useRefetchableFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ReturnTypeRefetchableFragment[TQuery, TKey]]
  
  type NonNullableFragmentReturn[TReturn] = ReturnType[NonNullableReturn[TReturn]]
  
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  
  type NullableFragmentReturn[TReturn] = ReturnType[NullableReturn[TReturn]]
  
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | Null], TFragmentData | Null]
  
  type ReturnTypeRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */] = js.Tuple2[
    (// NOTE: This ReturnType ensures that the type of the returned data is either:
  //   - nullable if the provided ref type is nullable
  //   - non-nullable if the provided ref type is non-nullable
  NonNullableFragmentReturn[TKey]) & NullableFragmentReturn[TKey], 
    RefetchFnDynamic[TQuery, TKey, Options]
  ]
}
