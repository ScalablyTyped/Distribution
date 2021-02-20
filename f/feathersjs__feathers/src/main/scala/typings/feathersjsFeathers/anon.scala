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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HookMap> */
  @js.native
  trait PartialHookMap extends StObject {
    
    var all: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var create: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var find: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var get: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var patch: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var remove: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var update: js.UndefOr[Hook | js.Array[Hook]] = js.native
  }
  object PartialHookMap {
    
    @scala.inline
    def apply(): PartialHookMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHookMap]
    }
    
    @scala.inline
    implicit class PartialHookMapMutableBuilder[Self <: PartialHookMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Hook | js.Array[Hook]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setAllVarargs(value: Hook*): Self = StObject.set(x, "all", js.Array(value :_*))
      
      @scala.inline
      def setCreate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCreateVarargs(value: Hook*): Self = StObject.set(x, "create", js.Array(value :_*))
      
      @scala.inline
      def setFind(value: Hook | js.Array[Hook]): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      @scala.inline
      def setFindVarargs(value: Hook*): Self = StObject.set(x, "find", js.Array(value :_*))
      
      @scala.inline
      def setGet(value: Hook | js.Array[Hook]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setGetVarargs(value: Hook*): Self = StObject.set(x, "get", js.Array(value :_*))
      
      @scala.inline
      def setPatch(value: Hook | js.Array[Hook]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setPatchVarargs(value: Hook*): Self = StObject.set(x, "patch", js.Array(value :_*))
      
      @scala.inline
      def setRemove(value: Hook | js.Array[Hook]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setRemoveVarargs(value: Hook*): Self = StObject.set(x, "remove", js.Array(value :_*))
      
      @scala.inline
      def setUpdate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setUpdateVarargs(value: Hook*): Self = StObject.set(x, "update", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HooksObject> */
  @js.native
  trait PartialHooksObject extends StObject {
    
    var after: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
    
    var before: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
    
    var error: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
    
    var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
  }
  object PartialHooksObject {
    
    @scala.inline
    def apply(): PartialHooksObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHooksObject]
    }
    
    @scala.inline
    implicit class PartialHooksObjectMutableBuilder[Self <: PartialHooksObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAfterVarargs(value: Hook*): Self = StObject.set(x, "after", js.Array(value :_*))
      
      @scala.inline
      def setBefore(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBeforeVarargs(value: Hook*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      @scala.inline
      def setError(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrorVarargs(value: Hook*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setFinally(value: PartialHookMap | Hook | js.Array[Hook]): Self = StObject.set(x, "finally", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinallyFunction1(
        value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
      ): Self = StObject.set(x, "finally", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinallyUndefined: Self = StObject.set(x, "finally", js.undefined)
      
      @scala.inline
      def setFinallyVarargs(value: Hook*): Self = StObject.set(x, "finally", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
  @js.native
  trait PartialServiceMethodsanyS extends StObject {
    
    var create: js.UndefOr[
        js.Function2[
          /* data */ Partial[_] | js.Array[Partial[_]], 
          /* params */ js.UndefOr[Params], 
          js.Promise[_ | js.Array[_]]
        ]
      ] = js.native
    
    var find: js.UndefOr[
        js.Function1[/* params */ js.UndefOr[Params], js.Promise[_ | js.Array[_] | Paginated[_]]]
      ] = js.native
    
    var get: js.UndefOr[js.Function2[/* id */ Id, /* params */ js.UndefOr[Params], js.Promise[_]]] = js.native
    
    var patch: js.UndefOr[
        js.Function3[
          /* id */ NullableId, 
          /* data */ Partial[_], 
          /* params */ js.UndefOr[Params], 
          js.Promise[_]
        ]
      ] = js.native
    
    var remove: js.UndefOr[
        js.Function2[/* id */ NullableId, /* params */ js.UndefOr[Params], js.Promise[_]]
      ] = js.native
    
    var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.native
    
    var update: js.UndefOr[
        js.Function3[/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params], js.Promise[_]]
      ] = js.native
  }
  object PartialServiceMethodsanyS {
    
    @scala.inline
    def apply(): PartialServiceMethodsanyS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServiceMethodsanyS]
    }
    
    @scala.inline
    implicit class PartialServiceMethodsanySMutableBuilder[Self <: PartialServiceMethodsanyS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(
        value: (/* data */ Partial[_] | js.Array[Partial[_]], /* params */ js.UndefOr[Params]) => js.Promise[_ | js.Array[_]]
      ): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setFind(value: /* params */ js.UndefOr[Params] => js.Promise[_ | js.Array[_] | Paginated[_]]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      @scala.inline
      def setGet(value: (/* id */ Id, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setPatch(
        value: (/* id */ NullableId, /* data */ Partial[_], /* params */ js.UndefOr[Params]) => js.Promise[_]
      ): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* id */ NullableId, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSetup(value: (/* app */ Application[_], /* path */ String) => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setUpdate(value: (/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@feathersjs/feathers.@feathersjs/feathers.PaginationOptions, 'max'> */
  @js.native
  trait PickPaginationOptionsmax extends StObject {
    
    var max: Double = js.native
  }
  object PickPaginationOptionsmax {
    
    @scala.inline
    def apply(max: Double): PickPaginationOptionsmax = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickPaginationOptionsmax]
    }
    
    @scala.inline
    implicit class PickPaginationOptionsmaxMutableBuilder[Self <: PickPaginationOptionsmax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
}
