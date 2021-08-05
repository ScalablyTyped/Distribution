package typings.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.entriaRelayExperimental.queryResourceMod.FetchPolicy
import typings.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.std.Error
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefetchableFragmentNodeMod {
  
  @JSImport("@entria/relay-experimental/lib/useRefetchableFragmentNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readQuery(
    environment: js.Any,
    query: js.Any,
    fetchPolicy: js.Any,
    renderPolicy: js.Any,
    refetchGeneration: js.Any,
    componentDisplayName: js.Any,
    hasStartComplete: js.Any,
    profilerContext: js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readQuery")(environment.asInstanceOf[js.Any], query.asInstanceOf[js.Any], fetchPolicy.asInstanceOf[js.Any], renderPolicy.asInstanceOf[js.Any], refetchGeneration.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any], hasStartComplete.asInstanceOf[js.Any], profilerContext.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def reducer(state: RefetchState, action: Action): RefetchState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[RefetchState]
  
  inline def useRefetchFunction[TQuery /* <: OperationType */](
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
  RefetchFn[TQuery, InternalOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchFunction")(fragmentNode.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], fragmentIdentifier.asInstanceOf[js.Any], fragmentRefPathInResponse.asInstanceOf[js.Any], fragmentData.asInstanceOf[js.Any], refetchGenerationRef.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], disposeFetch.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line:no-unnecessary-generics
  RefetchFn[TQuery, InternalOptions]]
  
  inline def useRefetchableFragmentNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentNode: ReaderFragment, parentFragmentRef: js.Any, componentDisplayName: String): // tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragmentNode")(fragmentNode.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.entriaRelayExperimental.anon.Environment
    - typings.entriaRelayExperimental.anon.FetchPolicy
  */
  trait Action extends StObject
  object Action {
    
    inline def Environment(
      environment: typings.relayRuntime.relayStoreTypesMod.Environment,
      fragmentIdentifier: String,
      `type`: String
    ): typings.entriaRelayExperimental.anon.Environment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.entriaRelayExperimental.anon.Environment]
    }
    
    inline def FetchPolicy(environment: Environment, refetchVariables: Variables, `type`: String): typings.entriaRelayExperimental.anon.FetchPolicy = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.entriaRelayExperimental.anon.FetchPolicy]
    }
  }
  
  trait DebugIDandTypename extends StObject {
    
    var id: String
    
    var typename: String
  }
  object DebugIDandTypename {
    
    inline def apply(id: String, typename: String): DebugIDandTypename = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typename = typename.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugIDandTypename]
    }
    
    extension [Self <: DebugIDandTypename](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTypename(value: String): Self = StObject.set(x, "typename", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalOptions
    extends StObject
       with Options {
    
    var __environment: js.UndefOr[Environment] = js.undefined
    
    var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  }
  object InternalOptions {
    
    inline def apply(): InternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalOptions]
    }
    
    extension [Self <: InternalOptions](x: Self) {
      
      inline def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
      
      inline def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
      
      inline def set__environment(value: Environment): Self = StObject.set(x, "__environment", value.asInstanceOf[js.Any])
      
      inline def set__environmentUndefined: Self = StObject.set(x, "__environment", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setOnComplete(value: /* arg */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    }
  }
  
  type RefetchExact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[js.Any | Null], RefetchFnExact[TQuery, TOptions]]
  
  type RefetchExactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchExact[TQuery, TOptions]]
  
  type RefetchFn[TQuery /* <: OperationType */, TOptions] = RefetchFnExact[TQuery, TOptions]
  
  type RefetchFnBase[TVars, TOptions] = js.Function2[/* vars */ TVars, /* options */ js.UndefOr[TOptions], Disposable]
  
  type RefetchFnDynamic[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] = (RefetchInexactDynamicResponse[TQuery, TOptions]) & (RefetchExactDynamicResponse[TQuery, TOptions])
  
  type RefetchFnExact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  
  type RefetchFnInexact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  
  type RefetchInexact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[js.Any], RefetchFnInexact[TQuery, TOptions]]
  
  type RefetchInexactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchInexact[TQuery, TOptions]]
  
  trait RefetchState extends StObject {
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
    
    var mirroredEnvironment: Environment
    
    var mirroredFragmentIdentifier: String
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
    
    var refetchEnvironment: js.UndefOr[Environment | Null] = js.undefined
    
    var refetchVariables: js.UndefOr[Variables | Null] = js.undefined
    
    var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  }
  object RefetchState {
    
    inline def apply(mirroredEnvironment: Environment, mirroredFragmentIdentifier: String): RefetchState = {
      val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefetchState]
    }
    
    extension [Self <: RefetchState](x: Self) {
      
      inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setMirroredEnvironment(value: Environment): Self = StObject.set(x, "mirroredEnvironment", value.asInstanceOf[js.Any])
      
      inline def setMirroredFragmentIdentifier(value: String): Self = StObject.set(x, "mirroredFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setOnComplete(value: /* arg */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setRefetchEnvironment(value: Environment): Self = StObject.set(x, "refetchEnvironment", value.asInstanceOf[js.Any])
      
      inline def setRefetchEnvironmentNull: Self = StObject.set(x, "refetchEnvironment", null)
      
      inline def setRefetchEnvironmentUndefined: Self = StObject.set(x, "refetchEnvironment", js.undefined)
      
      inline def setRefetchVariables(value: Variables): Self = StObject.set(x, "refetchVariables", value.asInstanceOf[js.Any])
      
      inline def setRefetchVariablesNull: Self = StObject.set(x, "refetchVariables", null)
      
      inline def setRefetchVariablesUndefined: Self = StObject.set(x, "refetchVariables", js.undefined)
      
      inline def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
      
      inline def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
    }
  }
  
  trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] extends StObject {
    
    def disableStoreUpdates(): Unit
    
    def enableStoreUpdates(): Unit
    
    var fragmentData: js.Any
    
    var fragmentRef: js.Any
    
    var refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  }
  object ReturnTypeNode {
    
    inline def apply[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions](
      disableStoreUpdates: () => Unit,
      enableStoreUpdates: () => Unit,
      fragmentData: js.Any,
      fragmentRef: js.Any,
      refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
    ): ReturnTypeNode[TQuery, TKey, TOptions] = {
      val __obj = js.Dynamic.literal(disableStoreUpdates = js.Any.fromFunction0(disableStoreUpdates), enableStoreUpdates = js.Any.fromFunction0(enableStoreUpdates), fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
    }
    
    extension [Self <: ReturnTypeNode[?, ?, ?], TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions](x: Self & (ReturnTypeNode[TQuery, TKey, TOptions])) {
      
      inline def setDisableStoreUpdates(value: () => Unit): Self = StObject.set(x, "disableStoreUpdates", js.Any.fromFunction0(value))
      
      inline def setEnableStoreUpdates(value: () => Unit): Self = StObject.set(x, "enableStoreUpdates", js.Any.fromFunction0(value))
      
      inline def setFragmentData(value: js.Any): Self = StObject.set(x, "fragmentData", value.asInstanceOf[js.Any])
      
      inline def setFragmentRef(value: js.Any): Self = StObject.set(x, "fragmentRef", value.asInstanceOf[js.Any])
      
      inline def setRefetch(value: RefetchFnDynamic[TQuery, TKey, TOptions]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
