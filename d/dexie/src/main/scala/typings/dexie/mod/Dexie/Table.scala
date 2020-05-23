package typings.dexie.mod.Dexie

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.anon.PrimaryKey
import typings.dexie.dexieStrings.creating
import typings.dexie.dexieStrings.deleting
import typings.dexie.dexieStrings.reading
import typings.dexie.dexieStrings.updating
import typings.dexie.mod.IndexableType
import typings.dexie.mod.IndexableTypeArrayReadonly
import typings.dexie.mod.ThenShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[T, Key] extends js.Object {
  @JSName("hook")
  var hook_Original: TableHooks[T, Key] = js.native
  var name: String = js.native
  var schema: TableSchema = js.native
  def add(item: T): Promise[Key] = js.native
  def add(item: T, key: Key): Promise[Key] = js.native
  def bulkAdd(items: js.Array[T]): Promise[Key] = js.native
  def bulkAdd(items: js.Array[T], keys: IndexableTypeArrayReadonly): Promise[Key] = js.native
  def bulkDelete(keys: IndexableTypeArrayReadonly): Promise[Unit] = js.native
  def bulkPut(items: js.Array[T]): Promise[Key] = js.native
  def bulkPut(items: js.Array[T], keys: IndexableTypeArrayReadonly): Promise[Key] = js.native
  def clear(): Promise[Unit] = js.native
  def count(): Promise[Double] = js.native
  def count[R](thenShortcut: ThenShortcut[Double, R]): Promise[R] = js.native
  def delete(key: Key): Promise[Unit] = js.native
  def each(callback: js.Function2[/* obj */ T, /* cursor */ PrimaryKey[Key], _]): Promise[Unit] = js.native
  def filter(fn: js.Function1[/* obj */ T, Boolean]): Collection[T, Key] = js.native
  def get(equalityCriterias: StringDictionary[IndexableType]): Promise[js.UndefOr[T]] = js.native
  def get(key: Key): Promise[js.UndefOr[T]] = js.native
  def get[R](equalityCriterias: StringDictionary[IndexableType], thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
  def get[R](key: Key, thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
  def hook(eventName: String): DexieEvent = js.native
  @JSName("hook")
  def hook_creating(
    eventName: creating,
    subscriber: js.ThisFunction3[
      /* this */ CreatingHookContext[T, Key], 
      /* primKey */ Key, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      _
    ]
  ): Unit = js.native
  @JSName("hook")
  def hook_deleting(
    eventName: deleting,
    subscriber: js.ThisFunction3[
      /* this */ DeletingHookContext[T, Key], 
      /* primKey */ Key, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      _
    ]
  ): Unit = js.native
  @JSName("hook")
  def hook_reading(eventName: reading, subscriber: js.Function1[/* obj */ T, T | _]): Unit = js.native
  @JSName("hook")
  def hook_updating(
    eventName: updating,
    subscriber: js.ThisFunction4[
      /* this */ UpdatingHookContext[T, Key], 
      /* modifications */ js.Object, 
      /* primKey */ Key, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      _
    ]
  ): Unit = js.native
  def limit(n: Double): Collection[T, Key] = js.native
  def mapToClass(constructor: js.Function): js.Function = js.native
  def offset(n: Double): Collection[T, Key] = js.native
  def orderBy(index: String): Collection[T, Key] = js.native
  def orderBy(index: js.Array[String]): Collection[T, Key] = js.native
  def put(item: T): Promise[Key] = js.native
  def put(item: T, key: Key): Promise[Key] = js.native
  def reverse(): Collection[T, Key] = js.native
  def toArray(): Promise[js.Array[T]] = js.native
  def toArray[R](thenShortcut: ThenShortcut[js.Array[T], R]): Promise[R] = js.native
  def toCollection(): Collection[T, Key] = js.native
  def update(key: Key, changes: StringDictionary[js.Any]): Promise[Double] = js.native
  def where(equalityCriterias: StringDictionary[IndexableType]): Collection[T, Key] = js.native
  def where(index: String): WhereClause[T, Key] = js.native
  def where(index: js.Array[String]): WhereClause[T, Key] = js.native
}

