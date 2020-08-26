package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.anon.Name
import typings.dexie.anon.`1`
import typings.dexie.dexieStrings.blocked
import typings.dexie.dexieStrings.populate
import typings.dexie.dexieStrings.ready
import typings.dexie.dexieStrings.versionchange
import typings.std.ArrayLike
import typings.std.IDBDatabase
import typings.std.IDBTransactionMode
import typings.std.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dexie_ extends Database {
  val _allTables: StringDictionary[Table[_, IndexableType]] = js.native
  var _dbSchema: DbSchema = js.native
  val core: DBCore = js.native
  @JSName("on")
  var on_Original: DbEvents = js.native
  val verno: Double = js.native
  def _createTransaction(mode: IDBTransactionMode, storeNames: ArrayLike[String], dbschema: DbSchema): Transaction = js.native
  def _createTransaction(
    mode: IDBTransactionMode,
    storeNames: ArrayLike[String],
    dbschema: DbSchema,
    parentTransaction: Transaction
  ): Transaction = js.native
  def backendDB(): IDBDatabase = js.native
  def close(): Unit = js.native
  def delete(): PromiseExtended[Unit] = js.native
  def dynamicallyOpened(): Boolean = js.native
  def hasBeenClosed(): Boolean = js.native
  def hasFailed(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  def on_blocked(eventName: blocked, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  @JSName("on")
  def on_populate(eventName: populate, subscriber: js.Function1[/* trans */ Transaction, _]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
  @JSName("on")
  def on_versionchange(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  def open(): PromiseExtended[Dexie] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    table3: String,
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    table3: String,
    table4: String,
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    table3: String,
    table4: String,
    table5: String,
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    tables: js.Array[String | (Table[_, IndexableType])],
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    table3: Table[_, IndexableType],
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    table3: Table[_, IndexableType],
    table4: Table[_, IndexableType],
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    table3: Table[_, IndexableType],
    table4: Table[_, IndexableType],
    table5: Table[_, IndexableType],
    scope: js.Function1[/* trans */ Transaction, js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  // Add more supported stacks here... : use(middleware: Middleware<HookStack>): this;
  def unuse(hasStackCreate: Middleware[`1`]): this.type = js.native
  def unuse(hasStackName: Name): this.type = js.native
  def use(middleware: Middleware[DBCore]): this.type = js.native
  def version(versionNumber: Double): Version = js.native
}

