package typings.dva

import org.scalablytyped.runtime.StringDictionary
import typings.dva.anon.Type
import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.global.JSX.Element
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.MiddlewareAPI
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.redux.mod.StoreEnhancer
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dva", JSImport.Default)
  @js.native
  def default(): DvaInstance = js.native
  @JSImport("dva", JSImport.Default)
  @js.native
  def default(opts: DvaOption): DvaInstance = js.native
  
  @JSImport("dva", "connect")
  @js.native
  def connect(): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: js.UndefOr[scala.Nothing],
    mergeProps: js.UndefOr[scala.Nothing],
    options: js.Object
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: js.UndefOr[scala.Nothing],
    mergeProps: js.Function
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: js.UndefOr[scala.Nothing],
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(mapStateToProps: js.UndefOr[scala.Nothing], mapDispatchToProps: js.Function): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: js.Function,
    mergeProps: js.UndefOr[scala.Nothing],
    options: js.Object
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: js.Function,
    mergeProps: js.Function
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: js.Function,
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(mapStateToProps: js.Function): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.UndefOr[scala.Nothing],
    mergeProps: js.UndefOr[scala.Nothing],
    options: js.Object
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.UndefOr[scala.Nothing],
    mergeProps: js.Function
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.UndefOr[scala.Nothing],
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(mapStateToProps: js.Function, mapDispatchToProps: js.Function): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.Function,
    mergeProps: js.UndefOr[scala.Nothing],
    options: js.Object
  ): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(mapStateToProps: js.Function, mapDispatchToProps: js.Function, mergeProps: js.Function): js.Function = js.native
  @JSImport("dva", "connect")
  @js.native
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.Function,
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = js.native
  
  @js.native
  trait DvaInstance extends StObject {
    
    /**
      * Register a model.
      *
      * @param model
      */
    def model(model: Model): Unit = js.native
    
    /**
      * Config router. Takes a function with arguments { history, dispatch },
      * and expects router config. It use the same api as react-router,
      * return jsx elements or JavaScript Object for dynamic routing.
      *
      * @param router
      */
    def router(router: Router): Unit = js.native
    
    /**
      * Start the application. Selector is optional. If no selector
      * arguments, it will return a function that return JSX elements.
      *
      * @param selector
      */
    def start(): js.Any = js.native
    def start(selector: String): js.Any = js.native
    def start(selector: HTMLElement): js.Any = js.native
    
    /**
      * Unregister a model.
      *
      * @param namespace
      */
    def unmodel(namespace: String): Unit = js.native
    
    /**
      * Register an object of hooks on the application.
      *
      * @param hooks
      */
    def use(hooks: Hooks): Unit = js.native
  }
  
  /* Inlined dva.dva.Hooks & {  initialState :std.Object | undefined,   history :std.Object | undefined} */
  @js.native
  trait DvaOption extends StObject {
    
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
    implicit class DvaOptionMutableBuilder[Self <: DvaOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraEnhancers(value: js.Array[StoreEnhancer[_, js.Object]]): Self = StObject.set(x, "extraEnhancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraEnhancersUndefined: Self = StObject.set(x, "extraEnhancers", js.undefined)
      
      @scala.inline
      def setExtraEnhancersVarargs(value: (StoreEnhancer[js.Any, js.Object])*): Self = StObject.set(x, "extraEnhancers", js.Array(value :_*))
      
      @scala.inline
      def setExtraReducers(value: ReducersMapObject[_, Action[_]]): Self = StObject.set(x, "extraReducers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReducersUndefined: Self = StObject.set(x, "extraReducers", js.undefined)
      
      @scala.inline
      def setHistory(value: js.Object): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setInitialState(value: js.Object): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnAction(value: onActionFunc | js.Array[onActionFunc]): Self = StObject.set(x, "onAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActionFunction1(value: /* api */ MiddlewareAPI[js.Any, js.Any] => Unit): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      @scala.inline
      def setOnActionVarargs(value: onActionFunc*): Self = StObject.set(x, "onAction", js.Array(value :_*))
      
      @scala.inline
      def setOnEffect(value: () => Unit): Self = StObject.set(x, "onEffect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEffectUndefined: Self = StObject.set(x, "onEffect", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* e */ Error, /* dispatch */ Dispatch[_]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnHmr(value: () => Unit): Self = StObject.set(x, "onHmr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHmrUndefined: Self = StObject.set(x, "onHmr", js.undefined)
      
      @scala.inline
      def setOnReducer(value: /* reducer */ Reducer[js.Any, AnyAction] => Unit): Self = StObject.set(x, "onReducer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReducerUndefined: Self = StObject.set(x, "onReducer", js.undefined)
      
      @scala.inline
      def setOnStateChange(value: () => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    }
  }
  
  type Effect = js.Function2[/* action */ AnyAction, /* effects */ EffectsCommandMap, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dva.dvaStrings.takeEvery
    - typings.dva.dvaStrings.takeLatest
    - typings.dva.dvaStrings.watcher
    - typings.dva.dvaStrings.throttle
  */
  trait EffectType extends StObject
  object EffectType {
    
    @scala.inline
    def takeEvery: typings.dva.dvaStrings.takeEvery = "takeEvery".asInstanceOf[typings.dva.dvaStrings.takeEvery]
    
    @scala.inline
    def takeLatest: typings.dva.dvaStrings.takeLatest = "takeLatest".asInstanceOf[typings.dva.dvaStrings.takeLatest]
    
    @scala.inline
    def throttle: typings.dva.dvaStrings.throttle = "throttle".asInstanceOf[typings.dva.dvaStrings.throttle]
    
    @scala.inline
    def watcher: typings.dva.dvaStrings.watcher = "watcher".asInstanceOf[typings.dva.dvaStrings.watcher]
  }
  
  type EffectWithType = js.Tuple2[Effect, Type]
  
  @js.native
  trait EffectsCommandMap
    extends /* key */ StringDictionary[js.Any] {
    
    var call: js.Function = js.native
    
    var cancel: js.Function = js.native
    
    def put[A /* <: AnyAction */](action: A): js.Any = js.native
    
    var select: js.Function = js.native
    
    var take: js.Function = js.native
  }
  object EffectsCommandMap {
    
    @scala.inline
    def apply(
      call: js.Function,
      cancel: js.Function,
      put: js.Any => js.Any,
      select: js.Function,
      take: js.Function
    ): EffectsCommandMap = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), select = select.asInstanceOf[js.Any], take = take.asInstanceOf[js.Any])
      __obj.asInstanceOf[EffectsCommandMap]
    }
    
    @scala.inline
    implicit class EffectsCommandMapMutableBuilder[Self <: EffectsCommandMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: js.Function): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: js.Function): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPut(value: js.Any => js.Any): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelect(value: js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTake(value: js.Function): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    }
  }
  
  type EffectsMapObject = StringDictionary[Effect | EffectWithType]
  
  @js.native
  trait Hooks extends StObject {
    
    var extraEnhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.native
    
    var extraReducers: js.UndefOr[ReducersMapObject[_, Action[_]]] = js.native
    
    var onAction: js.UndefOr[onActionFunc | js.Array[onActionFunc]] = js.native
    
    var onEffect: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onError: js.UndefOr[js.Function2[/* e */ Error, /* dispatch */ Dispatch[_], Unit]] = js.native
    
    var onHmr: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onReducer: js.UndefOr[ReducerEnhancer] = js.native
    
    var onStateChange: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object Hooks {
    
    @scala.inline
    def apply(): Hooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hooks]
    }
    
    @scala.inline
    implicit class HooksMutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraEnhancers(value: js.Array[StoreEnhancer[_, js.Object]]): Self = StObject.set(x, "extraEnhancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraEnhancersUndefined: Self = StObject.set(x, "extraEnhancers", js.undefined)
      
      @scala.inline
      def setExtraEnhancersVarargs(value: (StoreEnhancer[js.Any, js.Object])*): Self = StObject.set(x, "extraEnhancers", js.Array(value :_*))
      
      @scala.inline
      def setExtraReducers(value: ReducersMapObject[_, Action[_]]): Self = StObject.set(x, "extraReducers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReducersUndefined: Self = StObject.set(x, "extraReducers", js.undefined)
      
      @scala.inline
      def setOnAction(value: onActionFunc | js.Array[onActionFunc]): Self = StObject.set(x, "onAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActionFunction1(value: /* api */ MiddlewareAPI[js.Any, js.Any] => Unit): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      @scala.inline
      def setOnActionVarargs(value: onActionFunc*): Self = StObject.set(x, "onAction", js.Array(value :_*))
      
      @scala.inline
      def setOnEffect(value: () => Unit): Self = StObject.set(x, "onEffect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEffectUndefined: Self = StObject.set(x, "onEffect", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* e */ Error, /* dispatch */ Dispatch[_]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnHmr(value: () => Unit): Self = StObject.set(x, "onHmr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHmrUndefined: Self = StObject.set(x, "onHmr", js.undefined)
      
      @scala.inline
      def setOnReducer(value: /* reducer */ Reducer[js.Any, AnyAction] => Unit): Self = StObject.set(x, "onReducer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReducerUndefined: Self = StObject.set(x, "onReducer", js.undefined)
      
      @scala.inline
      def setOnStateChange(value: () => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    var effects: js.UndefOr[EffectsMapObject] = js.native
    
    var namespace: String = js.native
    
    var reducers: js.UndefOr[(ReducersMapObject[_, Action[_]]) | ReducersMapObjectWithEnhancer] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var subscriptions: js.UndefOr[SubscriptionsMapObject] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(namespace: String): Model = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEffects(value: EffectsMapObject): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReducers(value: (ReducersMapObject[_, Action[_]]) | ReducersMapObjectWithEnhancer): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReducersUndefined: Self = StObject.set(x, "reducers", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSubscriptions(value: SubscriptionsMapObject): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    }
  }
  
  type ReducerEnhancer = js.Function1[/* reducer */ Reducer[js.Any, AnyAction], Unit]
  
  type ReducersMapObjectWithEnhancer = js.Tuple2[ReducersMapObject[js.Any, Action[js.Any]], ReducerEnhancer]
  
  type Router = js.Function1[/* api */ js.UndefOr[RouterAPI], Element | js.Object]
  
  @js.native
  trait RouterAPI extends StObject {
    
    var app: DvaInstance = js.native
    
    var history: History[LocationState] = js.native
  }
  object RouterAPI {
    
    @scala.inline
    def apply(app: DvaInstance, history: History[LocationState]): RouterAPI = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterAPI]
    }
    
    @scala.inline
    implicit class RouterAPIMutableBuilder[Self <: RouterAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: DvaInstance): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscription = js.Function2[/* api */ SubscriptionAPI, /* done */ js.Function, Unit]
  
  @js.native
  trait SubscriptionAPI extends StObject {
    
    var dispatch: Dispatch[_] = js.native
    
    var history: History[LocationState] = js.native
  }
  object SubscriptionAPI {
    
    @scala.inline
    def apply(dispatch: _ => _, history: History[LocationState]): SubscriptionAPI = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionAPI]
    }
    
    @scala.inline
    implicit class SubscriptionAPIMutableBuilder[Self <: SubscriptionAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: _ => _): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  type SubscriptionsMapObject = StringDictionary[Subscription]
  
  type onActionFunc = js.Function1[/* api */ MiddlewareAPI[js.Any, js.Any], Unit]
}
