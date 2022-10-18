package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.anon.AllKeys
import typings.dexie.anon.AllKeysBoolean
import typings.dexie.anon.PrimaryKey
import typings.dexie.dexieStrings.creating
import typings.dexie.dexieStrings.deleting
import typings.dexie.dexieStrings.reading
import typings.dexie.dexieStrings.updating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table[T, TKey] extends StObject {
  
  def add(item: T): PromiseExtended[TKey] = js.native
  def add(item: T, key: TKey): PromiseExtended[TKey] = js.native
  
  def bulkAdd(items: js.Array[T]): PromiseExtended[TKey] = js.native
  def bulkAdd(items: js.Array[T], keys: Unit, options: AllKeysBoolean): PromiseExtended[TKey] = js.native
  def bulkAdd(items: js.Array[T], keys: IndexableTypeArrayReadonly): PromiseExtended[TKey] = js.native
  def bulkAdd(items: js.Array[T], keys: IndexableTypeArrayReadonly, options: AllKeysBoolean): PromiseExtended[TKey] = js.native
  def bulkAdd[B /* <: Boolean */](items: js.Array[T], keys: IndexableTypeArrayReadonly, options: AllKeys[B]): PromiseExtended[
    /* import warning: importer.ImportType#apply Failed type conversion: B extends true ? std.Array<TKey> : TKey */ js.Any
  ] = js.native
  def bulkAdd[B /* <: Boolean */](items: js.Array[T], options: AllKeys[B]): PromiseExtended[
    /* import warning: importer.ImportType#apply Failed type conversion: B extends true ? std.Array<TKey> : TKey */ js.Any
  ] = js.native
  
  def bulkDelete(keys: js.Array[TKey]): PromiseExtended[Unit] = js.native
  
  def bulkGet(keys: js.Array[TKey]): PromiseExtended[js.Array[js.UndefOr[T]]] = js.native
  
  def bulkPut(items: js.Array[T]): PromiseExtended[TKey] = js.native
  def bulkPut(items: js.Array[T], keys: Unit, options: AllKeysBoolean): PromiseExtended[TKey] = js.native
  def bulkPut(items: js.Array[T], keys: IndexableTypeArrayReadonly): PromiseExtended[TKey] = js.native
  def bulkPut(items: js.Array[T], keys: IndexableTypeArrayReadonly, options: AllKeysBoolean): PromiseExtended[TKey] = js.native
  def bulkPut[B /* <: Boolean */](items: js.Array[T], keys: IndexableTypeArrayReadonly, options: AllKeys[B]): PromiseExtended[
    /* import warning: importer.ImportType#apply Failed type conversion: B extends true ? std.Array<TKey> : TKey */ js.Any
  ] = js.native
  def bulkPut[B /* <: Boolean */](items: js.Array[T], options: AllKeys[B]): PromiseExtended[
    /* import warning: importer.ImportType#apply Failed type conversion: B extends true ? std.Array<TKey> : TKey */ js.Any
  ] = js.native
  
  def clear(): PromiseExtended[Unit] = js.native
  
  var core: DBCoreTable = js.native
  
  def count(): PromiseExtended[Double] = js.native
  def count[R](thenShortcut: ThenShortcut[Double, R]): PromiseExtended[R] = js.native
  
  var db: Database = js.native
  
  def delete(key: TKey): PromiseExtended[Unit] = js.native
  
  def each(callback: js.Function2[/* obj */ T, /* cursor */ PrimaryKey[TKey], Any]): PromiseExtended[Unit] = js.native
  
  def filter(fn: js.Function1[/* obj */ T, Boolean]): Collection[T, TKey] = js.native
  
  def get(equalityCriterias: StringDictionary[Any]): PromiseExtended[js.UndefOr[T]] = js.native
  def get(key: TKey): PromiseExtended[js.UndefOr[T]] = js.native
  def get[R](equalityCriterias: StringDictionary[Any], thenShortcut: ThenShortcut[js.UndefOr[T], R]): PromiseExtended[R] = js.native
  def get[R](key: TKey, thenShortcut: ThenShortcut[js.UndefOr[T], R]): PromiseExtended[R] = js.native
  
  def hook(eventName: String): DexieEvent = js.native
  @JSName("hook")
  var hook_Original: TableHooks[T, TKey] = js.native
  @JSName("hook")
  def hook_creating(
    eventName: creating,
    subscriber: js.ThisFunction3[
      /* this */ CreatingHookContext[T, TKey], 
      /* primKey */ TKey, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      Any
    ]
  ): Unit = js.native
  @JSName("hook")
  def hook_deleting(
    eventName: deleting,
    subscriber: js.ThisFunction3[
      /* this */ DeletingHookContext[T, TKey], 
      /* primKey */ TKey, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      Any
    ]
  ): Unit = js.native
  @JSName("hook")
  def hook_reading(eventName: reading, subscriber: js.Function1[/* obj */ T, T | Any]): Unit = js.native
  @JSName("hook")
  def hook_updating(
    eventName: updating,
    subscriber: js.ThisFunction4[
      /* this */ UpdatingHookContext[T, TKey], 
      /* modifications */ js.Object, 
      /* primKey */ TKey, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      Any
    ]
  ): Unit = js.native
  
  def limit(n: Double): Collection[T, TKey] = js.native
  
  def mapToClass(constructor: js.Function): js.Function = js.native
  
  var name: String = js.native
  
  def offset(n: Double): Collection[T, TKey] = js.native
  
  def orderBy(index: String): Collection[T, TKey] = js.native
  def orderBy(index: js.Array[String]): Collection[T, TKey] = js.native
  
  def put(item: T): PromiseExtended[TKey] = js.native
  def put(item: T, key: TKey): PromiseExtended[TKey] = js.native
  
  def reverse(): Collection[T, TKey] = js.native
  
  var schema: TableSchema = js.native
  
  def toArray(): PromiseExtended[js.Array[T]] = js.native
  def toArray[R](thenShortcut: ThenShortcut[js.Array[T], R]): PromiseExtended[R] = js.native
  
  def toCollection(): Collection[T, TKey] = js.native
  
  def update(key: T | TKey, changes: StringDictionary[Any]): PromiseExtended[Double] = js.native
  
  def where(equalityCriterias: StringDictionary[Any]): Collection[T, TKey] = js.native
  def where(index: String): WhereClause[T, TKey] = js.native
  def where(index: js.Array[String]): WhereClause[T, TKey] = js.native
}
