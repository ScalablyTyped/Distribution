package typings.atEntriaRelayDashExperimental.libUseFragmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useFragment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def useFragment(fragmentInput: GraphQLTaggedNode): NullableArrayFragmentReturn[Null] = js.native
  def useFragment(fragmentInput: GraphQLTaggedNode, fragmentRef: js.Array[StringDictionary[_]]): NullableArrayFragmentReturn[js.Array[StringDictionary[_]]] = js.native
  def useFragment[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_StringDictionaryAny_NonNullableFragmentReturn[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_UnionStringDictionaryAnyNull_NullableFragmentReturn[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = js.native
}

