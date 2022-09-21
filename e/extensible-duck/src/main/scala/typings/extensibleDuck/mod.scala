package typings.extensibleDuck

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extensible-duck", JSImport.Default)
  @js.native
  open class default[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] protected () extends Duck[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] {
    def this(options: DuckOptions[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]) = this()
  }
  
  @JSImport("extensible-duck", "Duck")
  @js.native
  open class Duck[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] protected () extends StObject {
    def this(options: DuckOptions[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]) = this()
    
    var creators: TActionCreators = js.native
    
    var initialState: TState = js.native
    
    var options: DuckOptions[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] = js.native
    
    def reducer(
      S: TState,
      A: TAction,
      D: DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
    ): TState = js.native
    @JSName("reducer")
    var reducer_Original: DuckReducer[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] = js.native
    
    var sagas: TSagas = js.native
    
    var selectors: TSelectors = js.native
    
    var store: String = js.native
    
    var storePath: js.UndefOr[String] = js.native
    
    var takes: TTakes = js.native
    
    var types: DuckActionTypes[TActionTypes] = js.native
  }
  
  type AnyObject = Record[Any, Any]
  
  type DuckActionTypes[TActionTypes] = Record[/* keyof TActionTypes */ String, String]
  
  type DuckConsts[TConsts] = Record[/* keyof TConsts */ String, Record[String, String]]
  
  type DuckCreators[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function1[
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TActionCreators
  ]
  
  type DuckInstance[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] = (Duck[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]) & DuckConsts[TConsts]
  
  trait DuckOptions[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] extends StObject {
    
    var consts: js.UndefOr[TConsts] = js.undefined
    
    def creators(
      D: DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
    ): TActionCreators
    @JSName("creators")
    var creators_Original: DuckCreators[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
    
    var initialState: TState
    
    var namespace: String
    
    def reducer(
      S: TState,
      A: TAction,
      D: DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
    ): TState
    @JSName("reducer")
    var reducer_Original: DuckReducer[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
    
    var sagas: js.UndefOr[
        DuckSagas[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
      ] = js.undefined
    
    var selectors: TSelectors
    
    var store: String
    
    var storePath: js.UndefOr[String] = js.undefined
    
    var takes: js.UndefOr[
        DuckTakes[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
      ] = js.undefined
    
    var types: js.Array[/* keyof TActionTypes */ String]
  }
  object DuckOptions {
    
    inline def apply[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */](
      creators: /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] => TActionCreators,
      initialState: TState,
      namespace: String,
      reducer: (TState, TAction, /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]) => TState,
      selectors: TSelectors,
      store: String,
      types: js.Array[/* keyof TActionTypes */ String]
    ): DuckOptions[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] = {
      val __obj = js.Dynamic.literal(creators = js.Any.fromFunction1(creators), initialState = initialState.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reducer = js.Any.fromFunction3(reducer), selectors = selectors.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuckOptions[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]]
    }
    
    extension [Self <: DuckOptions[?, ?, ?, ?, ?, ?, ?, ?], TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */](x: Self & (DuckOptions[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts])) {
      
      inline def setConsts(value: TConsts): Self = StObject.set(x, "consts", value.asInstanceOf[js.Any])
      
      inline def setConstsUndefined: Self = StObject.set(x, "consts", js.undefined)
      
      inline def setCreators(
        value: /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] => TActionCreators
      ): Self = StObject.set(x, "creators", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: TState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setReducer(
        value: (TState, TAction, /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]) => TState
      ): Self = StObject.set(x, "reducer", js.Any.fromFunction3(value))
      
      inline def setSagas(
        value: /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] => TSagas
      ): Self = StObject.set(x, "sagas", js.Any.fromFunction1(value))
      
      inline def setSagasUndefined: Self = StObject.set(x, "sagas", js.undefined)
      
      inline def setSelectors(value: TSelectors): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setStore(value: String): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStorePath(value: String): Self = StObject.set(x, "storePath", value.asInstanceOf[js.Any])
      
      inline def setStorePathUndefined: Self = StObject.set(x, "storePath", js.undefined)
      
      inline def setTakes(
        value: /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] => TTakes
      ): Self = StObject.set(x, "takes", js.Any.fromFunction1(value))
      
      inline def setTakesUndefined: Self = StObject.set(x, "takes", js.undefined)
      
      inline def setTypes(value: js.Array[/* keyof TActionTypes */ String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: (/* keyof TActionTypes */ String)*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  type DuckReducer[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function3[
    /* S */ TState, 
    /* A */ TAction, 
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TState
  ]
  
  type DuckSagas[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function1[
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TSagas
  ]
  
  type DuckTakes[TState, TAction, TActionTypes /* <: Record[String, Any] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ Any, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, Any]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ Any, Any]] */, TTakes /* <: js.Array[Any] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function1[
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TTakes
  ]
}
