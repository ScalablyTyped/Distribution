package typings.feathersjsFeathers

import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Hook
import typings.feathersjsFeathers.mod.HookContext
import typings.feathersjsFeathers.mod.Id
import typings.feathersjsFeathers.mod.NullableId
import typings.feathersjsFeathers.mod.Paginated
import typings.feathersjsFeathers.mod.Params
import typings.feathersjsFeathers.mod.SkipSymbol
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HookMap> */
  trait PartialHookMap extends StObject {
    
    var all: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var create: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var find: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var get: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var patch: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var remove: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var update: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
  }
  object PartialHookMap {
    
    inline def apply(): PartialHookMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHookMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialHookMap] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Hook | js.Array[Hook]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAllVarargs(value: Hook*): Self = StObject.set(x, "all", js.Array(value*))
      
      inline def setCreate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCreateVarargs(value: Hook*): Self = StObject.set(x, "create", js.Array(value*))
      
      inline def setFind(value: Hook | js.Array[Hook]): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFindVarargs(value: Hook*): Self = StObject.set(x, "find", js.Array(value*))
      
      inline def setGet(value: Hook | js.Array[Hook]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setGetVarargs(value: Hook*): Self = StObject.set(x, "get", js.Array(value*))
      
      inline def setPatch(value: Hook | js.Array[Hook]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPatchVarargs(value: Hook*): Self = StObject.set(x, "patch", js.Array(value*))
      
      inline def setRemove(value: Hook | js.Array[Hook]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRemoveVarargs(value: Hook*): Self = StObject.set(x, "remove", js.Array(value*))
      
      inline def setUpdate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setUpdateVarargs(value: Hook*): Self = StObject.set(x, "update", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HooksObject> */
  trait PartialHooksObject extends StObject {
    
    var after: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
    
    var before: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
    
    var error: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
    
    var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
  }
  object PartialHooksObject {
    
    inline def apply(): PartialHooksObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHooksObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialHooksObject] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: Hook*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: Hook*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setError(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVarargs(value: Hook*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setFinally(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "finally", value.asInstanceOf[js.Any])
      
      inline def setFinallyFunction1(
        value: /* hook */ HookContext[Any] => (js.Promise[HookContext[Any] | SkipSymbol | Unit]) | HookContext[Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "finally", js.Any.fromFunction1(value))
      
      inline def setFinallyUndefined: Self = StObject.set(x, "finally", js.undefined)
      
      inline def setFinallyVarargs(value: Hook*): Self = StObject.set(x, "finally", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
  trait PartialServiceMethodsanyS extends StObject {
    
    var create: js.UndefOr[
        js.Function2[
          /* data */ Partial[Any] | js.Array[Partial[Any]], 
          /* params */ js.UndefOr[Params], 
          js.Promise[Any | js.Array[Any]]
        ]
      ] = js.undefined
    
    var find: js.UndefOr[
        js.Function1[/* params */ js.UndefOr[Params], js.Promise[Any | js.Array[Any] | Paginated[Any]]]
      ] = js.undefined
    
    var get: js.UndefOr[js.Function2[/* id */ Id, /* params */ js.UndefOr[Params], js.Promise[Any]]] = js.undefined
    
    var patch: js.UndefOr[
        js.Function3[
          /* id */ NullableId, 
          /* data */ Partial[Any], 
          /* params */ js.UndefOr[Params], 
          js.Promise[Any]
        ]
      ] = js.undefined
    
    var remove: js.UndefOr[
        js.Function2[/* id */ NullableId, /* params */ js.UndefOr[Params], js.Promise[Any]]
      ] = js.undefined
    
    var setup: js.UndefOr[js.Function2[/* app */ Application[Any], /* path */ String, Unit]] = js.undefined
    
    var update: js.UndefOr[
        js.Function3[/* id */ NullableId, /* data */ Any, /* params */ js.UndefOr[Params], js.Promise[Any]]
      ] = js.undefined
  }
  object PartialServiceMethodsanyS {
    
    inline def apply(): PartialServiceMethodsanyS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServiceMethodsanyS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialServiceMethodsanyS] (val x: Self) extends AnyVal {
      
      inline def setCreate(
        value: (/* data */ Partial[Any] | js.Array[Partial[Any]], /* params */ js.UndefOr[Params]) => js.Promise[Any | js.Array[Any]]
      ): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setFind(value: /* params */ js.UndefOr[Params] => js.Promise[Any | js.Array[Any] | Paginated[Any]]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setGet(value: (/* id */ Id, /* params */ js.UndefOr[Params]) => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setPatch(
        value: (/* id */ NullableId, /* data */ Partial[Any], /* params */ js.UndefOr[Params]) => js.Promise[Any]
      ): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setRemove(value: (/* id */ NullableId, /* params */ js.UndefOr[Params]) => js.Promise[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSetup(value: (/* app */ Application[Any], /* path */ String) => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setUpdate(value: (/* id */ NullableId, /* data */ Any, /* params */ js.UndefOr[Params]) => js.Promise[Any]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@feathersjs/feathers.@feathersjs/feathers.PaginationOptions, 'max'> */
  trait PickPaginationOptionsmax extends StObject {
    
    var max: Double
  }
  object PickPaginationOptionsmax {
    
    inline def apply(max: Double): PickPaginationOptionsmax = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickPaginationOptionsmax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickPaginationOptionsmax] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
}
