package typings.fromjs

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FromJS {
  
  @js.native
  trait IOrderedQueryable[T]
    extends StObject
       with IQueryable[T] {
    
    def thenBy[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
    
    def thenByDesc[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
  }
  
  @js.native
  trait IQueryable[T] extends StObject {
    
    def all(predicate: js.Function1[/* item */ T, Boolean]): Boolean = js.native
    
    def any(): Boolean = js.native
    def any(predicate: js.Function1[/* item */ T, Boolean]): Boolean = js.native
    
    def concat(second: js.Array[T]): IQueryable[T] = js.native
    
    def contains(item: T): Boolean = js.native
    
    def count(): Double = js.native
    
    def distinct(): IQueryable[T] = js.native
    
    def each(action: js.Function1[/* item */ T, Unit]): Unit = js.native
    def each(action: js.Function1[/* item */ T, Unit], a: Boolean): Unit = js.native
    def each[TKey](action: js.Function2[/* value */ T, /* key */ TKey, Unit]): Unit = js.native
    
    def first(): T = js.native
    def first(predicate: js.Function1[/* item */ T, Boolean]): T = js.native
    
    def firstOrDefault(): T = js.native
    
    def last(): T = js.native
    
    def max(): T = js.native
    
    def orderBy[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
    
    def orderByDesc[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
    
    def select[TResult](item: js.Function1[/* item */ T, TResult]): IQueryable[TResult] = js.native
    
    def selectMany[TResult](item: js.Function1[/* item */ T, js.Array[TResult]]): IQueryable[TResult] = js.native
    
    def single(): T = js.native
    def single(predicate: js.Function1[/* item */ T, Boolean]): T = js.native
    
    def singleOrDefault(): T = js.native
    def singleOrDefault(predicate: js.Function1[/* item */ T, Boolean]): T = js.native
    
    def skip[TResult](count: Number): IQueryable[TResult] = js.native
    
    def sum(): T = js.native
    
    def take[TResult](count: Number): IQueryable[TResult] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def where(predicate: js.Function1[/* item */ T, Boolean]): IQueryable[T] = js.native
  }
}
