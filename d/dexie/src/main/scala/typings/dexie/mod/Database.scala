package typings.dexie.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends StObject {
  
  val name: String = js.native
  
  def table[T, TKey](tableName: String): Table[T, TKey] = js.native
  
  val tables: js.Array[Table[Any, IndexableType]] = js.native
  
  def transaction[U](
    mode: TransactionMode,
    tables: js.Array[Table[Any, IndexableType]],
    scope: js.Function0[PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](mode: TransactionMode, table: Table[Any, IndexableType], scope: js.Function0[PromiseLike[U] | U]): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    scope: js.Function0[PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    table3: Table[Any, IndexableType],
    scope: js.Function0[PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    table3: Table[Any, IndexableType],
    table4: Table[Any, IndexableType],
    scope: js.Function0[PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    table3: Table[Any, IndexableType],
    table4: Table[Any, IndexableType],
    table5: Table[Any, IndexableType],
    scope: js.Function0[PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
}
