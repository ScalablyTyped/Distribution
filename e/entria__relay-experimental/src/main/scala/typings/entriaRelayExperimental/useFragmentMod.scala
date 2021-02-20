package typings.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFragmentMod {
  
  @JSImport("@entria/relay-experimental/lib/useFragment", "useFragment")
  @js.native
  def useFragment[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSImport("@entria/relay-experimental/lib/useFragment", "useFragment")
  @js.native
  def useFragment_TKey_ArrayStringDictionaryWildcard_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSImport("@entria/relay-experimental/lib/useFragment", "useFragment")
  @js.native
  def useFragment_TKey_UnionArrayStringDictionaryWildcardNull_NullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableArrayFragmentReturn[TKey] = js.native
  @JSImport("@entria/relay-experimental/lib/useFragment", "useFragment")
  @js.native
  def useFragment_TKey_UnionStringDictionaryAnyNull_NullableFragmentReturn[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = js.native
  
  type NonNullableArrayFragmentReturn[T] = ReturnType[NonNullableArrayReturn[T]]
  
  type NonNullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData]
  
  type NonNullableFragmentReturn[T] = ReturnType[NonNullableReturn[T]]
  
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  
  type NullableArrayFragmentReturn[T] = ReturnType[NullableArrayReturn[T]]
  
  type NullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData | Null]
  
  type NullableFragmentReturn[T] = ReturnType[NullableReturn[T]]
  
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData | Null]
}
