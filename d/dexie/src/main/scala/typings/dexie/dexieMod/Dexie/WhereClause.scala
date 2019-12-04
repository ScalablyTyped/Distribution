package typings.dexie.dexieMod.Dexie

import typings.dexie.dexieMod.IndexableType
import typings.dexie.dexieMod.IndexableTypeArray
import typings.dexie.dexieMod.IndexableTypeArrayReadonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereClause[T, Key] extends js.Object {
  def above(key: IndexableType): Collection[T, Key] = js.native
  def aboveOrEqual(key: IndexableType): Collection[T, Key] = js.native
  def anyOf(keys: IndexableTypeArray | IndexableTypeArrayReadonly): Collection[T, Key] = js.native
  def anyOfIgnoreCase(keys: String*): Collection[T, Key] = js.native
  def anyOfIgnoreCase(keys: js.Array[String]): Collection[T, Key] = js.native
  def below(key: IndexableType): Collection[T, Key] = js.native
  def belowOrEqual(key: IndexableType): Collection[T, Key] = js.native
  def between(lower: IndexableType, upper: IndexableType): Collection[T, Key] = js.native
  def between(lower: IndexableType, upper: IndexableType, includeLower: Boolean): Collection[T, Key] = js.native
  def between(lower: IndexableType, upper: IndexableType, includeLower: Boolean, includeUpper: Boolean): Collection[T, Key] = js.native
  def equals(key: IndexableType): Collection[T, Key] = js.native
  def equalsIgnoreCase(key: String): Collection[T, Key] = js.native
  def inAnyRange(ranges: js.Array[IndexableTypeArrayReadonly]): Collection[T, Key] = js.native
  def noneOf(keys: js.Array[IndexableType]): Collection[T, Key] = js.native
  def notEqual(key: IndexableType): Collection[T, Key] = js.native
  def startsWith(key: String): Collection[T, Key] = js.native
  def startsWithAnyOf(prefixes: String*): Collection[T, Key] = js.native
  def startsWithAnyOf(prefixes: js.Array[String]): Collection[T, Key] = js.native
  def startsWithAnyOfIgnoreCase(prefixes: String*): Collection[T, Key] = js.native
  def startsWithAnyOfIgnoreCase(prefixes: js.Array[String]): Collection[T, Key] = js.native
  def startsWithIgnoreCase(key: String): Collection[T, Key] = js.native
}

