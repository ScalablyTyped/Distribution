package typings.atEntriaRelayDashExperimental.libUseLegacyPaginationFragmentMod

import typings.atEntriaRelayDashExperimental.libUseLoadMoreFunctionMod.LoadMoreFn
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod.Options
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnTypePaginationFragment[TQuery /* <: OperationType */, TKey, TFragmentData] extends js.Object {
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
  @scala.inline
  def apply[TQuery /* <: OperationType */, TKey, TFragmentData](
    data: TFragmentData,
    hasNext: Boolean,
    hasPrevious: Boolean,
    isLoadingNext: Boolean,
    isLoadingPrevious: Boolean,
    loadNext: LoadMoreFn,
    loadPrevious: LoadMoreFn,
    refetch: RefetchFnDynamic[TQuery, TKey, Options]
  ): ReturnTypePaginationFragment[TQuery, TKey, TFragmentData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext, hasPrevious = hasPrevious, isLoadingNext = isLoadingNext, isLoadingPrevious = isLoadingPrevious, loadNext = loadNext, loadPrevious = loadPrevious, refetch = refetch)
  
    __obj.asInstanceOf[ReturnTypePaginationFragment[TQuery, TKey, TFragmentData]]
  }
}

