package typings.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.entriaRelayExperimental.anon.OnComplete
import typings.entriaRelayExperimental.useLoadMoreFunctionMod.LoadMoreFn
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.Options
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLegacyPaginationFragmentMod {
  
  @JSImport("@entria/relay-experimental/lib/useLegacyPaginationFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLegacyPaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[TQuery, TKey, NonNullableFragmentReturn[TKey] & NullableFragmentReturn[TKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLegacyPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[TQuery, TKey, NonNullableFragmentReturn[TKey] & NullableFragmentReturn[TKey]]]
  
  type NonNullableFragmentReturn[TReturn] = ReturnType[NonNullableReturn[TReturn]]
  
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  
  type NullableFragmentReturn[TReturn] = ReturnType[NullableReturn[TReturn]]
  
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | Null], TFragmentData | Null]
  
  trait ReturnTypePaginationFragment[TQuery /* <: OperationType */, TKey, TFragmentData] extends StObject {
    
    var data: TFragmentData
    
    var hasNext: Boolean
    
    var hasPrevious: Boolean
    
    var isLoadingNext: Boolean
    
    var isLoadingPrevious: Boolean
    
    var loadNext: LoadMoreFn
    
    var loadPrevious: LoadMoreFn
    
    var refetch: RefetchFnDynamic[TQuery, TKey, Options]
  }
  object ReturnTypePaginationFragment {
    
    inline def apply[TQuery /* <: OperationType */, TKey, TFragmentData](
      data: TFragmentData,
      hasNext: Boolean,
      hasPrevious: Boolean,
      isLoadingNext: Boolean,
      isLoadingPrevious: Boolean,
      loadNext: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable,
      loadPrevious: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable,
      refetch: RefetchFnDynamic[TQuery, TKey, Options]
    ): ReturnTypePaginationFragment[TQuery, TKey, TFragmentData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], isLoadingNext = isLoadingNext.asInstanceOf[js.Any], isLoadingPrevious = isLoadingPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnTypePaginationFragment[TQuery, TKey, TFragmentData]]
    }
    
    extension [Self <: ReturnTypePaginationFragment[?, ?, ?], TQuery /* <: OperationType */, TKey, TFragmentData](x: Self & (ReturnTypePaginationFragment[TQuery, TKey, TFragmentData])) {
      
      inline def setData(value: TFragmentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHasNext(value: Boolean): Self = StObject.set(x, "hasNext", value.asInstanceOf[js.Any])
      
      inline def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingNext(value: Boolean): Self = StObject.set(x, "isLoadingNext", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingPrevious(value: Boolean): Self = StObject.set(x, "isLoadingPrevious", value.asInstanceOf[js.Any])
      
      inline def setLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable): Self = StObject.set(x, "loadNext", js.Any.fromFunction2(value))
      
      inline def setLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable): Self = StObject.set(x, "loadPrevious", js.Any.fromFunction2(value))
      
      inline def setRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
