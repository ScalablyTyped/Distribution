package typings.entriaRelayExperimental.useLegacyPaginationFragmentMod

import typings.entriaRelayExperimental.anon.OnComplete
import typings.entriaRelayExperimental.useLoadMoreFunctionMod.LoadMoreFn
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.Options
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
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
  def apply[TQuery, TKey, TFragmentData](
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
}

