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

@js.native
trait ReturnTypePaginationFragment[TQuery /* <: OperationType */, TKey, TFragmentData] extends js.Object {
  var data: TFragmentData = js.native
  var hasNext: Boolean = js.native
  var hasPrevious: Boolean = js.native
  var isLoadingNext: Boolean = js.native
  var isLoadingPrevious: Boolean = js.native
  var loadNext: LoadMoreFn = js.native
  var loadPrevious: LoadMoreFn = js.native
  var refetch: RefetchFnDynamic[TQuery, TKey, Options] = js.native
}

object ReturnTypePaginationFragment {
  @scala.inline
  def apply[/* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TQuery, TKey, TFragmentData](
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
  @scala.inline
  implicit class ReturnTypePaginationFragmentOps[Self <: ReturnTypePaginationFragment[_, _, _], /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TQuery, TKey, TFragmentData] (val x: Self with (ReturnTypePaginationFragment[TQuery, TKey, TFragmentData])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: TFragmentData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasNext(value: Boolean): Self = this.set("hasNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPrevious(value: Boolean): Self = this.set("hasPrevious", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoadingNext(value: Boolean): Self = this.set("isLoadingNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoadingPrevious(value: Boolean): Self = this.set("isLoadingPrevious", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable): Self = this.set("loadNext", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable): Self = this.set("loadPrevious", js.Any.fromFunction2(value))
    @scala.inline
    def setRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self = this.set("refetch", value.asInstanceOf[js.Any])
  }
  
}

