package typings.extensibleDuck

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("extensible-duck", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Duck[TState, TAction, TActionTypes /* <: Record[String, _] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ _, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, _]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ _, _]] */, TTakes /* <: js.Array[_] */, TConsts /* <: Record[String, js.Array[String]] */] protected () extends js.Object {
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
  
  @js.native
  trait DuckOptions[TState, TAction, TActionTypes /* <: Record[String, _] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ _, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, _]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ _, _]] */, TTakes /* <: js.Array[_] */, TConsts /* <: Record[String, js.Array[String]] */] extends js.Object {
    
    var consts: js.UndefOr[TConsts] = js.native
    
    def creators(
      D: DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
    ): TActionCreators = js.native
    @JSName("creators")
    var creators_Original: DuckCreators[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] = js.native
    
    var initialState: TState = js.native
    
    var namespace: String = js.native
    
    def reducer(
      S: TState,
      A: TAction,
      D: DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
    ): TState = js.native
    @JSName("reducer")
    var reducer_Original: DuckReducer[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts] = js.native
    
    var sagas: js.UndefOr[
        DuckSagas[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
      ] = js.native
    
    var selectors: TSelectors = js.native
    
    var store: String = js.native
    
    var storePath: js.UndefOr[String] = js.native
    
    var takes: js.UndefOr[
        DuckTakes[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]
      ] = js.native
    
    var types: js.Array[/* keyof TActionTypes */ String] = js.native
  }
  
  type AnyObject = Record[js.Any, js.Any]
  
  type DuckActionTypes[TActionTypes] = Record[/* keyof TActionTypes */ String, String]
  
  type DuckConsts[TConsts] = Record[/* keyof TConsts */ String, Record[String, String]]
  
  type DuckCreators[TState, TAction, TActionTypes /* <: Record[String, _] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ _, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, _]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ _, _]] */, TTakes /* <: js.Array[_] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function1[
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TActionCreators
  ]
  
  type DuckInstance[TState, TAction, TActionTypes /* <: Record[String, _] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ _, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, _]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ _, _]] */, TTakes /* <: js.Array[_] */, TConsts /* <: Record[String, js.Array[String]] */] = (Duck[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts]) with DuckConsts[TConsts]
  
  type DuckReducer[TState, TAction, TActionTypes /* <: Record[String, _] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ _, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, _]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ _, _]] */, TTakes /* <: js.Array[_] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function3[
    /* S */ TState, 
    /* A */ TAction, 
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TState
  ]
  
  type DuckSagas[TState, TAction, TActionTypes /* <: Record[String, _] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ _, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, _]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ _, _]] */, TTakes /* <: js.Array[_] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function1[
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TSagas
  ]
  
  type DuckTakes[TState, TAction, TActionTypes /* <: Record[String, _] */, TActionCreators /* <: Record[String, js.Function1[/* repeated */ _, TAction]] */, TSelectors /* <: Record[String, js.Function1[/* s */ TState, _]] */, TSagas /* <: Record[String, js.Function1[/* repeated */ _, _]] */, TTakes /* <: js.Array[_] */, TConsts /* <: Record[String, js.Array[String]] */] = js.Function1[
    /* D */ DuckInstance[TState, TAction, TActionTypes, TActionCreators, TSelectors, TSagas, TTakes, TConsts], 
    TTakes
  ]
}
