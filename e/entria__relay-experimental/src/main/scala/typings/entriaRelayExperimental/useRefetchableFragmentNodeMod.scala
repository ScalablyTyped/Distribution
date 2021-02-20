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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefetchableFragmentNodeMod {
  
  @JSImport("@entria/relay-experimental/lib/useRefetchableFragmentNode", "readQuery")
  @js.native
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
  
  @JSImport("@entria/relay-experimental/lib/useRefetchableFragmentNode", "reducer")
  @js.native
  def reducer(state: RefetchState, action: Action): RefetchState = js.native
  
  @JSImport("@entria/relay-experimental/lib/useRefetchableFragmentNode", "useRefetchFunction")
  @js.native
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
  
  @JSImport("@entria/relay-experimental/lib/useRefetchableFragmentNode", "useRefetchableFragmentNode")
  @js.native
  def useRefetchableFragmentNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentNode: ReaderFragment, parentFragmentRef: js.Any, componentDisplayName: String): // tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.entriaRelayExperimental.anon.Environment
    - typings.entriaRelayExperimental.anon.FetchPolicy
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def Environment(
      environment: typings.relayRuntime.relayStoreTypesMod.Environment,
      fragmentIdentifier: String,
      `type`: String
    ): typings.entriaRelayExperimental.anon.Environment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.entriaRelayExperimental.anon.Environment]
    }
    
    @scala.inline
    def FetchPolicy(environment: Environment, refetchVariables: Variables, `type`: String): typings.entriaRelayExperimental.anon.FetchPolicy = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.entriaRelayExperimental.anon.FetchPolicy]
    }
  }
  
  @js.native
  trait DebugIDandTypename extends StObject {
    
    var id: String = js.native
    
    var typename: String = js.native
  }
  object DebugIDandTypename {
    
    @scala.inline
    def apply(id: String, typename: String): DebugIDandTypename = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typename = typename.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugIDandTypename]
    }
    
    @scala.inline
    implicit class DebugIDandTypenameMutableBuilder[Self <: DebugIDandTypename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypename(value: String): Self = StObject.set(x, "typename", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalOptions extends Options {
    
    var __environment: js.UndefOr[Environment] = js.native
    
    var renderPolicy: js.UndefOr[RenderPolicy] = js.native
  }
  object InternalOptions {
    
    @scala.inline
    def apply(): InternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalOptions]
    }
    
    @scala.inline
    implicit class InternalOptionsMutableBuilder[Self <: InternalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
      
      @scala.inline
      def set__environment(value: Environment): Self = StObject.set(x, "__environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__environmentUndefined: Self = StObject.set(x, "__environment", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* arg */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    }
  }
  
  type RefetchExact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[js.Any | Null], RefetchFnExact[TQuery, TOptions]]
  
  type RefetchExactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchExact[TQuery, TOptions]]
  
  type RefetchFn[TQuery /* <: OperationType */, TOptions] = RefetchFnExact[TQuery, TOptions]
  
  type RefetchFnBase[TVars, TOptions] = js.Function2[/* vars */ TVars, /* options */ js.UndefOr[TOptions], Disposable]
  
  type RefetchFnDynamic[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] = (RefetchInexactDynamicResponse[TQuery, TOptions]) with (RefetchExactDynamicResponse[TQuery, TOptions])
  
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
  
  @js.native
  trait RefetchState extends StObject {
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
    
    var mirroredEnvironment: Environment = js.native
    
    var mirroredFragmentIdentifier: String = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.native
    
    var refetchEnvironment: js.UndefOr[Environment | Null] = js.native
    
    var refetchVariables: js.UndefOr[Variables | Null] = js.native
    
    var renderPolicy: js.UndefOr[RenderPolicy] = js.native
  }
  object RefetchState {
    
    @scala.inline
    def apply(mirroredEnvironment: Environment, mirroredFragmentIdentifier: String): RefetchState = {
      val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefetchState]
    }
    
    @scala.inline
    implicit class RefetchStateMutableBuilder[Self <: RefetchState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setMirroredEnvironment(value: Environment): Self = StObject.set(x, "mirroredEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirroredFragmentIdentifier(value: String): Self = StObject.set(x, "mirroredFragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnComplete(value: /* arg */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setRefetchEnvironment(value: Environment): Self = StObject.set(x, "refetchEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetchEnvironmentNull: Self = StObject.set(x, "refetchEnvironment", null)
      
      @scala.inline
      def setRefetchEnvironmentUndefined: Self = StObject.set(x, "refetchEnvironment", js.undefined)
      
      @scala.inline
      def setRefetchVariables(value: Variables): Self = StObject.set(x, "refetchVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetchVariablesNull: Self = StObject.set(x, "refetchVariables", null)
      
      @scala.inline
      def setRefetchVariablesUndefined: Self = StObject.set(x, "refetchVariables", js.undefined)
      
      @scala.inline
      def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
    }
  }
  
  @js.native
  trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] extends StObject {
    
    def disableStoreUpdates(): Unit = js.native
    
    def enableStoreUpdates(): Unit = js.native
    
    var fragmentData: js.Any = js.native
    
    var fragmentRef: js.Any = js.native
    
    var refetch: RefetchFnDynamic[TQuery, TKey, TOptions] = js.native
  }
  object ReturnTypeNode {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions](
      disableStoreUpdates: () => Unit,
      enableStoreUpdates: () => Unit,
      fragmentData: js.Any,
      fragmentRef: js.Any,
      refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
    ): ReturnTypeNode[TQuery, TKey, TOptions] = {
      val __obj = js.Dynamic.literal(disableStoreUpdates = js.Any.fromFunction0(disableStoreUpdates), enableStoreUpdates = js.Any.fromFunction0(enableStoreUpdates), fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
    }
    
    @scala.inline
    implicit class ReturnTypeNodeMutableBuilder[Self <: ReturnTypeNode[_, _, _], TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] (val x: Self with (ReturnTypeNode[TQuery, TKey, TOptions])) extends AnyVal {
      
      @scala.inline
      def setDisableStoreUpdates(value: () => Unit): Self = StObject.set(x, "disableStoreUpdates", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableStoreUpdates(value: () => Unit): Self = StObject.set(x, "enableStoreUpdates", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFragmentData(value: js.Any): Self = StObject.set(x, "fragmentData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentRef(value: js.Any): Self = StObject.set(x, "fragmentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetch(value: RefetchFnDynamic[TQuery, TKey, TOptions]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
