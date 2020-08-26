package typings.dva.mod

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.MiddlewareAPI
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.redux.mod.StoreEnhancer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dva.dva.Hooks & {  initialState :std.Object | undefined,   history :std.Object | undefined} */
@js.native
trait DvaOption extends js.Object {
  var extraEnhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.native
  var extraReducers: js.UndefOr[ReducersMapObject[_, Action[_]]] = js.native
  var history: js.UndefOr[js.Object] = js.native
  var initialState: js.UndefOr[js.Object] = js.native
  var onAction: js.UndefOr[onActionFunc | js.Array[onActionFunc]] = js.native
  var onEffect: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function2[/* e */ Error, /* dispatch */ Dispatch[_], Unit]] = js.native
  var onHmr: js.UndefOr[js.Function0[Unit]] = js.native
  var onReducer: js.UndefOr[ReducerEnhancer] = js.native
  var onStateChange: js.UndefOr[js.Function0[Unit]] = js.native
}

object DvaOption {
  @scala.inline
  def apply(): DvaOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvaOption]
  }
  @scala.inline
  implicit class DvaOptionOps[Self <: DvaOption] (val x: Self) extends AnyVal {
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
    def setExtraEnhancersVarargs(value: (StoreEnhancer[js.Any, js.Object])*): Self = this.set("extraEnhancers", js.Array(value :_*))
    @scala.inline
    def setExtraEnhancers(value: js.Array[StoreEnhancer[_, js.Object]]): Self = this.set("extraEnhancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraEnhancers: Self = this.set("extraEnhancers", js.undefined)
    @scala.inline
    def setExtraReducers(value: ReducersMapObject[_, Action[_]]): Self = this.set("extraReducers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraReducers: Self = this.set("extraReducers", js.undefined)
    @scala.inline
    def setHistory(value: js.Object): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setInitialState(value: js.Object): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnActionVarargs(value: onActionFunc*): Self = this.set("onAction", js.Array(value :_*))
    @scala.inline
    def setOnActionFunction1(value: /* api */ MiddlewareAPI[js.Any, js.Any] => Unit): Self = this.set("onAction", js.Any.fromFunction1(value))
    @scala.inline
    def setOnAction(value: onActionFunc | js.Array[onActionFunc]): Self = this.set("onAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAction: Self = this.set("onAction", js.undefined)
    @scala.inline
    def setOnEffect(value: () => Unit): Self = this.set("onEffect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEffect: Self = this.set("onEffect", js.undefined)
    @scala.inline
    def setOnError(value: (/* e */ Error, /* dispatch */ Dispatch[_]) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnHmr(value: () => Unit): Self = this.set("onHmr", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHmr: Self = this.set("onHmr", js.undefined)
    @scala.inline
    def setOnReducer(value: /* reducer */ Reducer[js.Any, AnyAction] => Unit): Self = this.set("onReducer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReducer: Self = this.set("onReducer", js.undefined)
    @scala.inline
    def setOnStateChange(value: () => Unit): Self = this.set("onStateChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
  }
  
}

