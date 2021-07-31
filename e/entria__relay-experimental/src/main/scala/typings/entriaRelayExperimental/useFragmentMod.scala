package typings.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFragmentMod {
  
  @JSImport("@entria/relay-experimental/lib/useFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useFragment[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NonNullableFragmentReturn[TKey]]
  
  @scala.inline
  def useFragment_TKey_ArrayStringDictionaryAny_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[js.Any]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NonNullableArrayFragmentReturn[TKey]]
  
  @scala.inline
  def useFragment_TKey_UnionArrayStringDictionaryAnyNull_NullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[js.Any]] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableArrayFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NullableArrayFragmentReturn[TKey]]
  
  @scala.inline
  def useFragment_TKey_UnionStringDictionaryAnyNull_NullableFragmentReturn[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NullableFragmentReturn[TKey]]
  
  type NonNullableArrayFragmentReturn[T] = ReturnType[NonNullableArrayReturn[T]]
  
  type NonNullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData]
  
  type NonNullableFragmentReturn[T] = ReturnType[NonNullableReturn[T]]
  
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  
  type NullableArrayFragmentReturn[T] = ReturnType[NullableArrayReturn[T]]
  
  type NullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData | Null]
  
  type NullableFragmentReturn[T] = ReturnType[NullableReturn[T]]
  
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData | Null]
}
