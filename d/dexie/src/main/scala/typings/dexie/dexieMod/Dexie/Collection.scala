package typings.dexie.dexieMod.Dexie

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.Anon_Key
import typings.dexie.Anon_Value
import typings.dexie.dexieMod.IndexableType
import typings.dexie.dexieMod.IndexableTypeArray
import typings.dexie.dexieMod.ThenShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T, Key] extends js.Object {
  def and(filter: js.Function1[/* x */ T, Boolean]): Collection[T, Key] = js.native
  def clone(props: js.Object): Collection[T, Key] = js.native
  def count(): Promise[Double] = js.native
  def count[R](thenShortcut: ThenShortcut[Double, R]): Promise[R] = js.native
  // Mutating methods
  def delete(): Promise[Double] = js.native
  def distinct(): Collection[T, Key] = js.native
  def each(callback: js.Function2[/* obj */ T, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
  def eachKey(callback: js.Function2[/* key */ IndexableType, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
  def eachPrimaryKey(callback: js.Function2[/* key */ Key, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
  def eachUniqueKey(callback: js.Function2[/* key */ IndexableType, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
  def filter(filter: js.Function1[/* x */ T, Boolean]): Collection[T, Key] = js.native
  def first(): Promise[js.UndefOr[T]] = js.native
  def first[R](thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
  def keys(): Promise[IndexableTypeArray] = js.native
  def keys[R](thenShortcut: ThenShortcut[IndexableTypeArray, R]): Promise[R] = js.native
  def last(): Promise[js.UndefOr[T]] = js.native
  def last[R](thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
  def limit(n: Double): Collection[T, Key] = js.native
  def modify(changeCallback: js.Function2[/* obj */ T, /* ctx */ Anon_Value[T], Unit]): Promise[Double] = js.native
  def modify(changes: StringDictionary[js.Any]): Promise[Double] = js.native
  def offset(n: Double): Collection[T, Key] = js.native
  def or(indexOrPrimayKey: String): WhereClause[T, Key] = js.native
  def primaryKeys(): Promise[js.Array[Key]] = js.native
  def primaryKeys[R](thenShortcut: ThenShortcut[js.Array[Key], R]): Promise[R] = js.native
  def raw(): Collection[T, Key] = js.native
  def reverse(): Collection[T, Key] = js.native
  def sortBy(keyPath: String): Promise[js.Array[T]] = js.native
  def sortBy[R](keyPath: String, thenShortcut: ThenShortcut[js.Array[T], R]): Promise[R] = js.native
  def toArray(): Promise[js.Array[T]] = js.native
  def toArray[R](thenShortcut: ThenShortcut[js.Array[T], R]): Promise[R] = js.native
  def uniqueKeys(): Promise[IndexableTypeArray] = js.native
  def uniqueKeys[R](thenShortcut: ThenShortcut[IndexableTypeArray, R]): Promise[R] = js.native
  def until(filter: js.Function1[/* value */ T, Boolean]): Collection[T, Key] = js.native
  def until(filter: js.Function1[/* value */ T, Boolean], includeStopEntry: Boolean): Collection[T, Key] = js.native
}

