package typings.atEntriaRelayDashExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useFragment", JSImport.Namespace)
@js.native
object libUseFragmentMod extends js.Object {
  def useFragment(fragmentInput: GraphQLTaggedNode): NullableArrayFragmentReturn[Null] = js.native
  def useFragment(fragmentInput: GraphQLTaggedNode, fragmentRef: js.Array[StringDictionary[_]]): NullableArrayFragmentReturn[js.Array[StringDictionary[_]]] = js.native
  def useFragment[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayStringDictionaryWildcard_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSName("useFragment")
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

