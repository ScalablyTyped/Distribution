package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  val name: String = js.native
  
  def table[T, TKey](tableName: String): Table[T, TKey] = js.native
  
  val tables: js.Array[Table[_, IndexableType]] = js.native
  
  def transaction[U](
    mode: TransactionMode,
    tables: js.Array[Table[_, IndexableType]],
    scope: js.Function0[js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](mode: TransactionMode, table: Table[_, IndexableType], scope: js.Function0[js.Thenable[U] | U]): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    scope: js.Function0[js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    table3: Table[_, IndexableType],
    scope: js.Function0[js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    table3: Table[_, IndexableType],
    table4: Table[_, IndexableType],
    scope: js.Function0[js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, IndexableType],
    table2: Table[_, IndexableType],
    table3: Table[_, IndexableType],
    table4: Table[_, IndexableType],
    table5: Table[_, IndexableType],
    scope: js.Function0[js.Thenable[U] | U]
  ): PromiseExtended[U] = js.native
}
