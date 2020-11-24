package typings.dexie.mod

import typings.dexie.anon.IncludeLowers
import typings.dexie.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhereClause[T, TKey] extends js.Object {
  
  def above(key: js.Any): Collection[T, TKey] = js.native
  
  def aboveOrEqual(key: js.Any): Collection[T, TKey] = js.native
  
  def anyOf(keys: IndexableType*): Collection[T, TKey] = js.native
  def anyOf(keys: js.Array[IndexableType]): Collection[T, TKey] = js.native
  
  def anyOfIgnoreCase(keys: String*): Collection[T, TKey] = js.native
  def anyOfIgnoreCase(keys: js.Array[String]): Collection[T, TKey] = js.native
  
  def below(key: js.Any): Collection[T, TKey] = js.native
  
  def belowOrEqual(key: js.Any): Collection[T, TKey] = js.native
  
  def between(lower: js.Any, upper: js.Any): Collection[T, TKey] = js.native
  def between(lower: js.Any, upper: js.Any, includeLower: js.UndefOr[scala.Nothing], includeUpper: Boolean): Collection[T, TKey] = js.native
  def between(lower: js.Any, upper: js.Any, includeLower: Boolean): Collection[T, TKey] = js.native
  def between(lower: js.Any, upper: js.Any, includeLower: Boolean, includeUpper: Boolean): Collection[T, TKey] = js.native
  
  def equals(key: IndexableType): Collection[T, TKey] = js.native
  
  def equalsIgnoreCase(key: String): Collection[T, TKey] = js.native
  
  def inAnyRange(ranges: js.Array[`0`]): Collection[T, TKey] = js.native
  def inAnyRange(ranges: js.Array[`0`], options: IncludeLowers): Collection[T, TKey] = js.native
  
  def noneOf(keys: js.Array[IndexableType]): Collection[T, TKey] = js.native
  
  def notEqual(key: IndexableType): Collection[T, TKey] = js.native
  
  def startsWith(key: String): Collection[T, TKey] = js.native
  
  def startsWithAnyOf(prefixes: String*): Collection[T, TKey] = js.native
  def startsWithAnyOf(prefixes: js.Array[String]): Collection[T, TKey] = js.native
  
  def startsWithAnyOfIgnoreCase(prefixes: String*): Collection[T, TKey] = js.native
  def startsWithAnyOfIgnoreCase(prefixes: js.Array[String]): Collection[T, TKey] = js.native
  
  def startsWithIgnoreCase(key: String): Collection[T, TKey] = js.native
}
