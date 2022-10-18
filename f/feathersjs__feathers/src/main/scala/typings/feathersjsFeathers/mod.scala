package typings.feathersjsFeathers

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.feathersjsFeathers.anon.PartialHookMap
import typings.feathersjsFeathers.anon.PartialHooksObject
import typings.feathersjsFeathers.anon.PartialServiceMethodsanyS
import typings.feathersjsFeathers.anon.PickPaginationOptionsmax
import typings.feathersjsFeathers.feathersjsFeathersBooleans.`false`
import typings.feathersjsFeathers.feathersjsFeathersStrings.__feathersSkipHooks
import typings.feathersjsFeathers.feathersjsFeathersStrings.after
import typings.feathersjsFeathers.feathersjsFeathersStrings.before
import typings.feathersjsFeathers.feathersjsFeathersStrings.error
import typings.node.eventsMod.EventEmitter
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@feathersjs/feathers", JSImport.Namespace)
  @js.native
  val ^ : Feathers = js.native
  
  @js.native
  trait Application[ServiceTypes] extends EventEmitter {
    
    def configure(callback: js.ThisFunction1[/* this */ this.type, /* app */ this.type, Unit]): this.type = js.native
    
    def disable(name: String): this.type = js.native
    
    def disabled(name: String): Boolean = js.native
    
    def enable(name: String): this.type = js.native
    
    def enabled(name: String): Boolean = js.native
    
    def get(name: String): Any = js.native
    
    def hooks(hooks: PartialHooksObject): this.type = js.native
    
    def service(location: String): /* import warning: importer.ImportType#apply Failed type conversion: keyof ServiceTypes extends never ? @feathersjs/feathers.@feathersjs/feathers.Service<any> : never */ js.Any = js.native
    def service[L /* <: /* keyof ServiceTypes */ String */](location: L): Service[
        /* import warning: importer.ImportType#apply Failed type conversion: ServiceTypes[L] */ js.Any
      ] = js.native
    
    def set(name: String, value: Any): this.type = js.native
    
    def setup(): this.type = js.native
    def setup(server: Any): this.type = js.native
    
    def use(path: String, service: PartialServiceMethodsanyS): this.type = js.native
    def use(path: String, service: PartialServiceMethodsanyS, options: Any): this.type = js.native
    def use(path: String, service: Application[Any]): this.type = js.native
    def use(path: String, service: Application[Any], options: Any): this.type = js.native
    
    var version: String = js.native
  }
  
  /* Inlined std.Pick<@feathersjs/feathers.@feathersjs/feathers.Params, 'query' | 'paginate'> */
  trait ClientSideParams extends StObject {
    
    var paginate: js.UndefOr[`false` | PickPaginationOptionsmax] = js.undefined
    
    var query: js.UndefOr[Query] = js.undefined
  }
  object ClientSideParams {
    
    inline def apply(): ClientSideParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientSideParams]
    }
    
    extension [Self <: ClientSideParams](x: Self) {
      
      inline def setPaginate(value: `false` | PickPaginationOptionsmax): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
      
      inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  @js.native
  trait Feathers extends StObject {
    
    // tslint:disable-next-line no-unnecessary-generics
    def apply[T](): Application[T] = js.native
    
    // tslint:disable-next-line no-unnecessary-generics
    def default[T](): Application[T] = js.native
    
    var SKIP: SkipSymbol = js.native
    
    @JSName("default")
    var default_Original: Feathers = js.native
    
    var version: String = js.native
  }
  
  // tslint:disable-next-line void-return
  type Hook = js.Function1[
    /* hook */ HookContext[Any], 
    (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
  ]
  
  trait HookContext[T] extends StObject {
    
    /**
      * A read only property that contains the Feathers application object. This can be used to
      * retrieve other services (via context.app.service('name')) or configuration values.
      */
    val app: Application[js.Object]
    
    /**
      * A writeable property containing the data of a create, update and patch service
      * method call.
      */
    var data: js.UndefOr[T] = js.undefined
    
    /**
      * A writeable, optional property and contains a "safe" version of the data that
      * should be sent to any client. If context.dispatch has not been set context.result
      * will be sent to the client instead.
      */
    var dispatch: js.UndefOr[T] = js.undefined
    
    /**
      * A writeable property with the error object that was thrown in a failed method call.
      * It is only available in error hooks.
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /**
      * A writeable property and the id for a get, remove, update and patch service
      * method call. For remove, update and patch context.id can also be null when
      * modifying multiple entries. In all other cases it will be undefined.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * A read only property with the name of the service method (one of find, get,
      * create, update, patch, remove).
      */
    val method: String
    
    /**
      * A writeable property that contains the service method parameters (including
      * params.query).
      */
    var params: Params
    
    /**
      * A read only property and contains the service name (or path) without leading or
      * trailing slashes.
      */
    val path: String
    
    /**
      * A writeable property containing the result of the successful service method call.
      * It is only available in after hooks.
      *
      * `context.result` can also be set in
      *
      *  - A before hook to skip the actual service method (database) call
      *  - An error hook to swallow the error and return a result instead
      */
    var result: js.UndefOr[T] = js.undefined
    
    /**
      * A read only property and contains the service this hook currently runs on.
      */
    val service: Service[T]
    
    /**
      * A writeable, optional property that allows to override the standard HTTP status
      * code that should be returned.
      */
    var statusCode: js.UndefOr[Double] = js.undefined
    
    /**
      * A read only property with the hook type (one of before, after or error).
      */
    val `type`: before | after | error
  }
  object HookContext {
    
    inline def apply[T](
      app: Application[js.Object],
      method: String,
      params: Params,
      path: String,
      service: Service[T],
      `type`: before | after | error
    ): HookContext[T] = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookContext[T]]
    }
    
    extension [Self <: HookContext[?], T](x: Self & HookContext[T]) {
      
      inline def setApp(value: Application[js.Object]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDispatch(value: T): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setService(value: Service[T]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setType(value: before | after | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HookMap extends StObject {
    
    var all: Hook | js.Array[Hook]
    
    var create: Hook | js.Array[Hook]
    
    var find: Hook | js.Array[Hook]
    
    var get: Hook | js.Array[Hook]
    
    var patch: Hook | js.Array[Hook]
    
    var remove: Hook | js.Array[Hook]
    
    var update: Hook | js.Array[Hook]
  }
  object HookMap {
    
    inline def apply(
      all: Hook | js.Array[Hook],
      create: Hook | js.Array[Hook],
      find: Hook | js.Array[Hook],
      get: Hook | js.Array[Hook],
      patch: Hook | js.Array[Hook],
      remove: Hook | js.Array[Hook],
      update: Hook | js.Array[Hook]
    ): HookMap = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookMap]
    }
    
    extension [Self <: HookMap](x: Self) {
      
      inline def setAll(value: Hook | js.Array[Hook]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      inline def setAllVarargs(value: Hook*): Self = StObject.set(x, "all", js.Array(value*))
      
      inline def setCreate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateVarargs(value: Hook*): Self = StObject.set(x, "create", js.Array(value*))
      
      inline def setFind(value: Hook | js.Array[Hook]): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindVarargs(value: Hook*): Self = StObject.set(x, "find", js.Array(value*))
      
      inline def setGet(value: Hook | js.Array[Hook]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetVarargs(value: Hook*): Self = StObject.set(x, "get", js.Array(value*))
      
      inline def setPatch(value: Hook | js.Array[Hook]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      inline def setPatchVarargs(value: Hook*): Self = StObject.set(x, "patch", js.Array(value*))
      
      inline def setRemove(value: Hook | js.Array[Hook]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveVarargs(value: Hook*): Self = StObject.set(x, "remove", js.Array(value*))
      
      inline def setUpdate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateVarargs(value: Hook*): Self = StObject.set(x, "update", js.Array(value*))
    }
  }
  
  trait HooksObject extends StObject {
    
    var after: PartialHookMap | Hook | js.Array[Hook]
    
    var before: PartialHookMap | Hook | js.Array[Hook]
    
    var error: PartialHookMap | Hook | js.Array[Hook]
    
    var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
  }
  object HooksObject {
    
    inline def apply(
      after: PartialHookMap | Hook | js.Array[Hook],
      before: PartialHookMap | Hook | js.Array[Hook],
      error: PartialHookMap | Hook | js.Array[Hook]
    ): HooksObject = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[HooksObject]
    }
    
    extension [Self <: HooksObject](x: Self) {
      
      inline def setAfter(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterVarargs(value: Hook*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeVarargs(value: Hook*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setError(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorVarargs(value: Hook*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setFinally(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "finally", value.asInstanceOf[js.Any])
      
      inline def setFinallyFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "finally", js.Any.fromFunction1(value))
      
      inline def setFinallyUndefined: Self = StObject.set(x, "finally", js.undefined)
      
      inline def setFinallyVarargs(value: Hook*): Self = StObject.set(x, "finally", js.Array(value*))
    }
  }
  
  type Id = Double | String
  
  type NullableId = Id | Null
  
  trait Paginated[T] extends StObject {
    
    var data: js.Array[T]
    
    var limit: Double
    
    var skip: Double
    
    var total: Double
  }
  object Paginated {
    
    inline def apply[T](data: js.Array[T], limit: Double, skip: Double, total: Double): Paginated[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paginated[T]]
    }
    
    extension [Self <: Paginated[?], T](x: Self & Paginated[T]) {
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationOptions extends StObject {
    
    var default: Double
    
    var max: Double
  }
  object PaginationOptions {
    
    inline def apply(default: Double, max: Double): PaginationOptions = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationOptions]
    }
    
    extension [Self <: PaginationOptions](x: Self) {
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var paginate: js.UndefOr[`false` | PickPaginationOptionsmax] = js.undefined
    
    var query: js.UndefOr[Query] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setPaginate(value: `false` | PickPaginationOptionsmax): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
      
      inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type Query = StringDictionary[Any]
  
  type ServerSideParams = Params
  
  @js.native
  trait Service[T]
    extends ServiceAddons[T]
       with ServiceOverloads[T]
       with ServiceMethods[T] {
    
    /* InferMemberOverrides */
    override def create(data: js.Array[Partial[T]]): (js.Promise[T | js.Array[T]]) & js.Promise[js.Array[T]] = js.native
    /* InferMemberOverrides */
    override def create(data: js.Array[Partial[T]], params: Params): (js.Promise[T | js.Array[T]]) & js.Promise[js.Array[T]] = js.native
    /* InferMemberOverrides */
    override def create(data: Partial[T]): (js.Promise[T | js.Array[T]]) & js.Promise[T] = js.native
    /* InferMemberOverrides */
    override def create(data: Partial[T], params: Params): (js.Promise[T | js.Array[T]]) & js.Promise[T] = js.native
    
    /* InferMemberOverrides */
    override def patch(id: NullableId, data: Partial[T]): js.Promise[T] = js.native
    /* InferMemberOverrides */
    override def patch(id: NullableId, data: Partial[T], params: Params): js.Promise[T] = js.native
  }
  
  @js.native
  trait ServiceAddons[T] extends EventEmitter {
    
    def hooks(hooks: PartialHooksObject): this.type = js.native
  }
  
  // todo: figure out what to do: These methods don't actually need to be implemented, so they can be undefined at runtime. Yet making them optional gets cumbersome in strict mode.
  @js.native
  trait ServiceMethods[T] extends StObject {
    
    def create(data: js.Array[Partial[T]]): js.Promise[T | js.Array[T]] = js.native
    def create(data: js.Array[Partial[T]], params: Params): js.Promise[T | js.Array[T]] = js.native
    def create(data: Partial[T]): js.Promise[T | js.Array[T]] = js.native
    def create(data: Partial[T], params: Params): js.Promise[T | js.Array[T]] = js.native
    
    def find(): js.Promise[T | js.Array[T] | Paginated[T]] = js.native
    def find(params: Params): js.Promise[T | js.Array[T] | Paginated[T]] = js.native
    
    def get(id: Id): js.Promise[T] = js.native
    def get(id: Id, params: Params): js.Promise[T] = js.native
    
    def patch(id: NullableId, data: Partial[T]): js.Promise[T] = js.native
    def patch(id: NullableId, data: Partial[T], params: Params): js.Promise[T] = js.native
    
    def remove(id: NullableId): js.Promise[T] = js.native
    def remove(id: NullableId, params: Params): js.Promise[T] = js.native
    
    def update(id: NullableId, data: T): js.Promise[T] = js.native
    def update(id: NullableId, data: T, params: Params): js.Promise[T] = js.native
  }
  
  @js.native
  trait ServiceOverloads[T] extends StObject {
    
    def create(data: js.Array[Partial[T]]): js.Promise[js.Array[T]] = js.native
    def create(data: js.Array[Partial[T]], params: Params): js.Promise[js.Array[T]] = js.native
    def create(data: Partial[T]): js.Promise[T] = js.native
    def create(data: Partial[T], params: Params): js.Promise[T] = js.native
    
    def patch(id: NullableId, data: Pick[T, /* keyof T */ String]): js.Promise[T] = js.native
    def patch(id: NullableId, data: Pick[T, /* keyof T */ String], params: Params): js.Promise[T] = js.native
  }
  
  trait SetupMethod extends StObject {
    
    def setup(app: Application[Any], path: String): Unit
  }
  object SetupMethod {
    
    inline def apply(setup: (Application[Any], String) => Unit): SetupMethod = {
      val __obj = js.Dynamic.literal(setup = js.Any.fromFunction2(setup))
      __obj.asInstanceOf[SetupMethod]
    }
    
    extension [Self <: SetupMethod](x: Self) {
      
      inline def setSetup(value: (Application[Any], String) => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
    }
  }
  
  type SkipSymbol = js.Symbol | __feathersSkipHooks
  
  type _To = Feathers
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Feathers = ^
}
