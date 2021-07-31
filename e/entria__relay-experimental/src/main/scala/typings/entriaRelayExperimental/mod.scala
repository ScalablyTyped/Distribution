package typings.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.entriaRelayExperimental.anon.FetchKey
import typings.entriaRelayExperimental.anon.NetworkCacheConfig
import typings.entriaRelayExperimental.relayEnvironmentProviderMod.Props
import typings.entriaRelayExperimental.useFragmentMod.NonNullableArrayFragmentReturn
import typings.entriaRelayExperimental.useFragmentMod.NonNullableFragmentReturn
import typings.entriaRelayExperimental.useFragmentMod.NullableArrayFragmentReturn
import typings.entriaRelayExperimental.useFragmentMod.NullableFragmentReturn
import typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.ReturnTypePaginationFragment
import typings.entriaRelayExperimental.useRefetchableFragmentMod.ReturnTypeRefetchableFragment
import typings.react.mod.global.JSX.Element
import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@entria/relay-experimental", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def RelayEnvironmentProvider(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RelayEnvironmentProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], query.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ]]
  @scala.inline
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: NetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], query.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ]]
  
  @scala.inline
  def useFragment[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NonNullableFragmentReturn[TKey]]
  
  @scala.inline
  def useFragment_TKey_ArrayStringDictionaryAny_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[js.Any]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NonNullableArrayFragmentReturn[TKey]]
  
  @scala.inline
  def useFragment_TKey_UnionArrayStringDictionaryAnyNull_NullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[js.Any]] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableArrayFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NullableArrayFragmentReturn[TKey]]
  
  @scala.inline
  def useFragment_TKey_UnionStringDictionaryAnyNull_NullableFragmentReturn[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[NullableFragmentReturn[TKey]]
  
  @scala.inline
  def useLegacyPaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] & typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLegacyPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] & typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ]]
  
  @scala.inline
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] & typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] & typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ]]
  
  @scala.inline
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Null, options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Unit, options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  @scala.inline
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  @scala.inline
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ReturnTypeRefetchableFragment[TQuery, TKey]]
  
  @scala.inline
  def useRelayEnvironment(): Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("useRelayEnvironment")().asInstanceOf[Environment]
}
