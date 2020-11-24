package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.anon.Key
import typings.dexie.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[T, TKey] extends js.Object {
  
  //db: Database;
  def and(filter: js.Function1[/* x */ T, Boolean]): Collection[T, TKey] = js.native
  
  def clone(props: js.Object): Collection[T, TKey] = js.native
  
  def count(): PromiseExtended[Double] = js.native
  def count[R](thenShortcut: ThenShortcut[Double, R]): PromiseExtended[R] = js.native
  
  // Mutating methods
  def delete(): PromiseExtended[Double] = js.native
  
  def distinct(): Collection[T, TKey] = js.native
  
  def each(callback: js.Function2[/* obj */ T, /* cursor */ Key[TKey], _]): PromiseExtended[Unit] = js.native
  
  def eachKey(callback: js.Function2[/* key */ IndexableType, /* cursor */ Key[TKey], _]): PromiseExtended[Unit] = js.native
  
  def eachPrimaryKey(callback: js.Function2[/* key */ TKey, /* cursor */ Key[TKey], _]): PromiseExtended[Unit] = js.native
  
  def eachUniqueKey(callback: js.Function2[/* key */ IndexableType, /* cursor */ Key[TKey], _]): PromiseExtended[Unit] = js.native
  
  def filter(filter: js.Function1[/* x */ T, Boolean]): Collection[T, TKey] = js.native
  
  def first(): PromiseExtended[js.UndefOr[T]] = js.native
  def first[R](thenShortcut: ThenShortcut[js.UndefOr[T], R]): PromiseExtended[R] = js.native
  
  def keys(): PromiseExtended[IndexableTypeArray] = js.native
  def keys[R](thenShortcut: ThenShortcut[IndexableTypeArray, R]): PromiseExtended[R] = js.native
  
  def last(): PromiseExtended[js.UndefOr[T]] = js.native
  def last[R](thenShortcut: ThenShortcut[js.UndefOr[T], R]): PromiseExtended[R] = js.native
  
  def limit(n: Double): Collection[T, TKey] = js.native
  
  def modify(changeCallback: js.Function2[/* obj */ T, /* ctx */ Value[T], Unit | Boolean]): PromiseExtended[Double] = js.native
  def modify(changes: StringDictionary[js.Any]): PromiseExtended[Double] = js.native
  
  def offset(n: Double): Collection[T, TKey] = js.native
  
  def or(indexOrPrimayKey: String): WhereClause[T, TKey] = js.native
  
  def primaryKeys(): PromiseExtended[js.Array[TKey]] = js.native
  def primaryKeys[R](thenShortcut: ThenShortcut[js.Array[TKey], R]): PromiseExtended[R] = js.native
  
  def raw(): Collection[T, TKey] = js.native
  
  def reverse(): Collection[T, TKey] = js.native
  
  def sortBy(keyPath: String): PromiseExtended[js.Array[T]] = js.native
  def sortBy[R](keyPath: String, thenShortcut: ThenShortcut[js.Array[T], R]): PromiseExtended[R] = js.native
  
  def toArray(): PromiseExtended[js.Array[T]] = js.native
  def toArray[R](thenShortcut: ThenShortcut[js.Array[T], R]): PromiseExtended[R] = js.native
  
  def uniqueKeys(): PromiseExtended[IndexableTypeArray] = js.native
  def uniqueKeys[R](thenShortcut: ThenShortcut[IndexableTypeArray, R]): PromiseExtended[R] = js.native
  
  def until(filter: js.Function1[/* value */ T, Boolean]): Collection[T, TKey] = js.native
  def until(filter: js.Function1[/* value */ T, Boolean], includeStopEntry: Boolean): Collection[T, TKey] = js.native
}
