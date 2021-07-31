package typings.entriaRelayExperimental

import typings.entriaRelayExperimental.lrucacheMod.Cache
import typings.relayRuntime.mod.Observable
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.Observer
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.FragmentPointer
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.Snapshot
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryResourceMod {
  
  @JSImport("@entria/relay-experimental/lib/QueryResource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createQueryResource(environment: Environment): QueryResource = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryResource")(environment.asInstanceOf[js.Any]).asInstanceOf[QueryResource]
  
  @scala.inline
  def getQueryResourceForEnvironment(environment: Environment): QueryResourceImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryResourceForEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[QueryResourceImpl]
  
  /* Rewritten from type alias, can be one of: 
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only`
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network`
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network`
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only`
  */
  trait FetchPolicy extends StObject
  object FetchPolicy {
    
    @scala.inline
    def `network-only`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only` = "network-only".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only`]
    
    @scala.inline
    def `store-and-network`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network` = "store-and-network".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network`]
    
    @scala.inline
    def `store-only`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only` = "store-only".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only`]
    
    @scala.inline
    def `store-or-network`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network` = "store-or-network".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network`]
  }
  
  type QueryResource = QueryResourceImpl
  
  type QueryResourceCache = Cache[QueryResourceCacheEntry]
  
  @js.native
  trait QueryResourceCacheEntry extends StObject {
    
    val cacheKey: String = js.native
    
    def getRetainCount(): Double = js.native
    
    def getValue(): Error | js.Promise[Unit] | QueryResult = js.native
    
    def permanentRetain(environment: Environment): Disposable = js.native
    
    def setValue(value: js.Promise[Unit]): Unit = js.native
    def setValue(value: QueryResult): Unit = js.native
    def setValue(value: Error): Unit = js.native
    
    def temporaryRetain(environment: Environment): Unit = js.native
  }
  
  @js.native
  trait QueryResourceImpl extends StObject {
    
    def getCacheEntry(operation: OperationDescriptor, fetchPolicy: FetchPolicy): QueryResourceCacheEntry | Null = js.native
    def getCacheEntry(operation: OperationDescriptor, fetchPolicy: FetchPolicy, maybeRenderPolicy: RenderPolicy): QueryResourceCacheEntry | Null = js.native
    
    /**
      * This function should be called during a Component's render function,
      * to either read an existing cached value for the query, or fetch the query
      * and suspend.
      */
    def prepare(operation: OperationDescriptor, fetchObservable: Observable[GraphQLResponse]): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: Null,
      observer: Unit,
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: Null,
      observer: Unit,
      cacheKeyBuster: Double
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: Null,
      observer: Observer[Snapshot]
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: Null,
      observer: Observer[Snapshot],
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: Null,
      observer: Observer[Snapshot],
      cacheKeyBuster: Double
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: RenderPolicy
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: RenderPolicy,
      observer: Unit,
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: RenderPolicy,
      observer: Unit,
      cacheKeyBuster: Double
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: RenderPolicy,
      observer: Observer[Snapshot]
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: RenderPolicy,
      observer: Observer[Snapshot],
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: Null,
      maybeRenderPolicy: RenderPolicy,
      observer: Observer[Snapshot],
      cacheKeyBuster: Double
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: Null,
      observer: Unit,
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: Null,
      observer: Unit,
      cacheKeyBuster: Double
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: Null,
      observer: Observer[Snapshot]
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: Null,
      observer: Observer[Snapshot],
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: Null,
      observer: Observer[Snapshot],
      cacheKeyBuster: Double
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: RenderPolicy
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: RenderPolicy,
      observer: Unit,
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: RenderPolicy,
      observer: Unit,
      cacheKeyBuster: Double
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: RenderPolicy,
      observer: Observer[Snapshot]
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: RenderPolicy,
      observer: Observer[Snapshot],
      cacheKeyBuster: String
    ): QueryResult = js.native
    def prepare(
      operation: OperationDescriptor,
      fetchObservable: Observable[GraphQLResponse],
      maybeFetchPolicy: FetchPolicy,
      maybeRenderPolicy: RenderPolicy,
      observer: Observer[Snapshot],
      cacheKeyBuster: Double
    ): QueryResult = js.native
    
    /**
      * This function should be called during a Component's commit phase
      * (e.g. inside useEffect), in order to retain the operation in the Relay store
      * and transfer ownership of the operation to the component lifecycle.
      */
    def retain(queryResult: QueryResult): Disposable = js.native
  }
  
  trait QueryResult extends StObject {
    
    var cacheKey: String
    
    var fragmentNode: ReaderFragment
    
    var fragmentRef: FragmentPointer
    
    var operation: OperationDescriptor
  }
  object QueryResult {
    
    @scala.inline
    def apply(
      cacheKey: String,
      fragmentNode: ReaderFragment,
      fragmentRef: FragmentPointer,
      operation: OperationDescriptor
    ): QueryResult = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], fragmentNode = fragmentNode.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult]
    }
    
    @scala.inline
    implicit class QueryResultMutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentNode(value: ReaderFragment): Self = StObject.set(x, "fragmentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentRef(value: FragmentPointer): Self = StObject.set(x, "fragmentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.full
    - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.partial
  */
  trait RenderPolicy extends StObject
  object RenderPolicy {
    
    @scala.inline
    def full: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.full = "full".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.full]
    
    @scala.inline
    def partial: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.partial = "partial".asInstanceOf[typings.entriaRelayExperimental.entriaRelayExperimentalStrings.partial]
  }
}
