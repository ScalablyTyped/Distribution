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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dva", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): DvaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[DvaInstance]
  @scala.inline
  def default(opts: DvaOption): DvaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[DvaInstance]
  
  @scala.inline
  def connect(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: js.Function, mapDispatchToProps: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: js.Function, mapDispatchToProps: js.Function, mergeProps: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.Function,
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: js.Function,
    mergeProps: Unit,
    options: js.Object
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: js.Function, mapDispatchToProps: Unit, mergeProps: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(
    mapStateToProps: js.Function,
    mapDispatchToProps: Unit,
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: js.Function, mapDispatchToProps: Unit, mergeProps: Unit, options: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: Unit, mapDispatchToProps: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: Unit, mapDispatchToProps: js.Function, mergeProps: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(
    mapStateToProps: Unit,
    mapDispatchToProps: js.Function,
    mergeProps: js.Function,
    options: js.Object
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: Unit, mapDispatchToProps: js.Function, mergeProps: Unit, options: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: Unit, mapDispatchToProps: Unit, mergeProps: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: Unit, mapDispatchToProps: Unit, mergeProps: js.Function, options: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def connect(mapStateToProps: Unit, mapDispatchToProps: Unit, mergeProps: Unit, options: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
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
  
  trait DvaOption
    extends StObject
       with Hooks {
    
    var history: js.UndefOr[js.Object] = js.undefined
    
    var initialState: js.UndefOr[js.Object] = js.undefined
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
      def setHistory(value: js.Object): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setInitialState(value: js.Object): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
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
  
  trait EffectsCommandMap
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var call: js.Function
    
    var cancel: js.Function
    
    def put[A /* <: AnyAction */](action: A): js.Any
    
    var select: js.Function
    
    var take: js.Function
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
  
  trait Hooks extends StObject {
    
    var extraEnhancers: js.UndefOr[js.Array[StoreEnhancer[js.Any, js.Object]]] = js.undefined
    
    var extraReducers: js.UndefOr[ReducersMapObject[js.Any, Action[js.Any]]] = js.undefined
    
    var onAction: js.UndefOr[onActionFunc | js.Array[onActionFunc]] = js.undefined
    
    var onEffect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* e */ Error, /* dispatch */ Dispatch[js.Any], Unit]] = js.undefined
    
    var onHmr: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onReducer: js.UndefOr[ReducerEnhancer] = js.undefined
    
    var onStateChange: js.UndefOr[js.Function0[Unit]] = js.undefined
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
      def setExtraEnhancers(value: js.Array[StoreEnhancer[js.Any, js.Object]]): Self = StObject.set(x, "extraEnhancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraEnhancersUndefined: Self = StObject.set(x, "extraEnhancers", js.undefined)
      
      @scala.inline
      def setExtraEnhancersVarargs(value: (StoreEnhancer[js.Any, js.Object])*): Self = StObject.set(x, "extraEnhancers", js.Array(value :_*))
      
      @scala.inline
      def setExtraReducers(value: ReducersMapObject[js.Any, Action[js.Any]]): Self = StObject.set(x, "extraReducers", value.asInstanceOf[js.Any])
      
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
      def setOnError(value: (/* e */ Error, /* dispatch */ Dispatch[js.Any]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
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
  
  trait Model extends StObject {
    
    var effects: js.UndefOr[EffectsMapObject] = js.undefined
    
    var namespace: String
    
    var reducers: js.UndefOr[(ReducersMapObject[js.Any, Action[js.Any]]) | ReducersMapObjectWithEnhancer] = js.undefined
    
    var state: js.UndefOr[js.Any] = js.undefined
    
    var subscriptions: js.UndefOr[SubscriptionsMapObject] = js.undefined
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
      def setReducers(value: (ReducersMapObject[js.Any, Action[js.Any]]) | ReducersMapObjectWithEnhancer): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
      
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
  
  trait RouterAPI extends StObject {
    
    var app: DvaInstance
    
    var history: History[LocationState]
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
  
  trait SubscriptionAPI extends StObject {
    
    var dispatch: Dispatch[js.Any]
    
    var history: History[LocationState]
  }
  object SubscriptionAPI {
    
    @scala.inline
    def apply(dispatch: js.Any => js.Any, history: History[LocationState]): SubscriptionAPI = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionAPI]
    }
    
    @scala.inline
    implicit class SubscriptionAPIMutableBuilder[Self <: SubscriptionAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: js.Any => js.Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  type SubscriptionsMapObject = StringDictionary[Subscription]
  
  type onActionFunc = js.Function1[/* api */ MiddlewareAPI[js.Any, js.Any], Unit]
}
