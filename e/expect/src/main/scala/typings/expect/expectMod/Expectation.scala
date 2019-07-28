package typings.expect.expectMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect", "Expectation")
@js.native
class Expectation[T] protected () extends js.Object {
  def this(actual: js.Any) = this()
  var not: Expectation[T] = js.native
  def toBe(value: T): Expectation[T] = js.native
  def toBe(value: T, message: String): Expectation[T] = js.native
  def toBeA(value: String): Expectation[T] = js.native
  def toBeA(value: String, message: String): Expectation[T] = js.native
  def toBeA(value: js.Object): Expectation[T] = js.native
  def toBeA(value: js.Object, message: String): Expectation[T] = js.native
  def toBeAn(value: String): Expectation[T] = js.native
  def toBeAn(value: String, message: String): Expectation[T] = js.native
  def toBeAn(value: js.Object): Expectation[T] = js.native
  def toBeAn(value: js.Object, message: String): Expectation[T] = js.native
  def toBeDefined(): Expectation[T] = js.native
  def toBeDefined(message: String): Expectation[T] = js.native
  def toBeFalsy(): Expectation[T] = js.native
  def toBeFalsy(message: String): Expectation[T] = js.native
  def toBeFewerThan(value: Double): Expectation[T] = js.native
  def toBeFewerThan(value: Double, message: String): Expectation[T] = js.native
  def toBeGreaterThan(value: Double): Expectation[T] = js.native
  def toBeGreaterThan(value: Double, message: String): Expectation[T] = js.native
  def toBeGreaterThanOrEqualTo(value: Double): Expectation[T] = js.native
  def toBeGreaterThanOrEqualTo(value: Double, messasge: String): Expectation[T] = js.native
  def toBeLessThan(value: Double): Expectation[T] = js.native
  def toBeLessThan(value: Double, message: String): Expectation[T] = js.native
  def toBeLessThanOrEqualTo(value: Double): Expectation[T] = js.native
  def toBeLessThanOrEqualTo(value: Double, messasge: String): Expectation[T] = js.native
  def toBeMoreThan(value: Double): Expectation[T] = js.native
  def toBeMoreThan(value: Double, message: String): Expectation[T] = js.native
  def toBeNull(): Expectation[T] = js.native
  def toBeNull(message: String): Expectation[T] = js.native
  def toBeTruthy(): Expectation[T] = js.native
  def toBeTruthy(message: String): Expectation[T] = js.native
  def toBeUndefined(): Expectation[T] = js.native
  def toBeUndefined(message: String): Expectation[T] = js.native
  def toContain[U](value: js.Any): Expectation[T] = js.native
  def toContain[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toContain[U](value: js.Any, compareValues: CompareValues[U], message: String): Expectation[T] = js.native
  def toContainKey(key: KeyType): Expectation[T] = js.native
  def toContainKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toContainKey(key: KeyType, comparator: Comparator, message: String): Expectation[T] = js.native
  def toContainKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toContainKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toContainKeys(keys: js.Array[KeyType], comparator: Comparator, message: String): Expectation[T] = js.native
  def toEqual(value: js.Any): Expectation[T] = js.native
  def toEqual(value: js.Any, message: String): Expectation[T] = js.native
  def toExclude[U](value: js.Any): Expectation[T] = js.native
  def toExclude[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toExclude[U](value: js.Any, compareValues: CompareValues[U], message: String): Expectation[T] = js.native
  def toExcludeKey(key: KeyType): Expectation[T] = js.native
  def toExcludeKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toExcludeKey(key: KeyType, comparator: Comparator, message: String): Expectation[T] = js.native
  def toExcludeKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toExcludeKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toExcludeKeys(keys: js.Array[KeyType], comparator: Comparator, message: String): Expectation[T] = js.native
  def toExist(): Expectation[T] = js.native
  def toExist(message: String): Expectation[T] = js.native
  def toHaveBeenCalled(): Expectation[T] = js.native
  def toHaveBeenCalled(message: String): Expectation[T] = js.native
  def toHaveBeenCalledWith(args: js.Any*): Expectation[T] = js.native
  def toHaveBeenLastCalledWith(args: js.Any*): Expectation[T] = js.native
  def toInclude[U](value: js.Any): Expectation[T] = js.native
  def toInclude[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toInclude[U](value: js.Any, compareValues: CompareValues[U], message: String): Expectation[T] = js.native
  def toIncludeKey(key: KeyType): Expectation[T] = js.native
  def toIncludeKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toIncludeKey(key: KeyType, comparator: Comparator, message: String): Expectation[T] = js.native
  def toIncludeKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toIncludeKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toIncludeKeys(keys: js.Array[KeyType], comparator: Comparator, message: String): Expectation[T] = js.native
  def toMatch(value: String): Expectation[T] = js.native
  def toMatch(value: String, message: String): Expectation[T] = js.native
  def toMatch(value: js.Object): Expectation[T] = js.native
  def toMatch(value: js.Object, message: String): Expectation[T] = js.native
  def toMatch(value: RegExp): Expectation[T] = js.native
  def toMatch(value: RegExp, message: String): Expectation[T] = js.native
  def toMatchObject(value: js.Object): Expectation[T] = js.native
  def toMatchObject(value: js.Object, message: String): Expectation[T] = js.native
  def toNotBe(value: js.Any): Expectation[T] = js.native
  def toNotBe(value: js.Any, message: String): Expectation[T] = js.native
  def toNotBeA(value: String): Expectation[T] = js.native
  def toNotBeA(value: String, message: String): Expectation[T] = js.native
  def toNotBeA(value: js.Object): Expectation[T] = js.native
  def toNotBeA(value: js.Object, message: String): Expectation[T] = js.native
  def toNotBeAn(value: String): Expectation[T] = js.native
  def toNotBeAn(value: String, message: String): Expectation[T] = js.native
  def toNotBeAn(value: js.Object): Expectation[T] = js.native
  def toNotBeAn(value: js.Object, message: String): Expectation[T] = js.native
  def toNotContain[U](value: js.Any): Expectation[T] = js.native
  def toNotContain[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toNotContain[U](value: js.Any, compareValues: CompareValues[U], message: String): Expectation[T] = js.native
  def toNotContainKey(key: KeyType): Expectation[T] = js.native
  def toNotContainKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toNotContainKey(key: KeyType, comparator: Comparator, message: String): Expectation[T] = js.native
  def toNotContainKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toNotContainKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toNotContainKeys(keys: js.Array[KeyType], comparator: Comparator, message: String): Expectation[T] = js.native
  def toNotEqual(value: js.Any): Expectation[T] = js.native
  def toNotEqual(value: js.Any, message: String): Expectation[T] = js.native
  def toNotExist(): Expectation[T] = js.native
  def toNotExist(message: String): Expectation[T] = js.native
  def toNotHaveBeenCalled(): Expectation[T] = js.native
  def toNotHaveBeenCalled(message: String): Expectation[T] = js.native
  def toNotIncludeKey(key: KeyType): Expectation[T] = js.native
  def toNotIncludeKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toNotIncludeKey(key: KeyType, comparator: Comparator, message: String): Expectation[T] = js.native
  def toNotIncludeKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toNotIncludeKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toNotIncludeKeys(keys: js.Array[KeyType], comparator: Comparator, message: String): Expectation[T] = js.native
  def toNotMatch(value: String): Expectation[T] = js.native
  def toNotMatch(value: String, message: String): Expectation[T] = js.native
  def toNotMatch(value: js.Object): Expectation[T] = js.native
  def toNotMatch(value: js.Object, message: String): Expectation[T] = js.native
  def toNotMatch(value: RegExp): Expectation[T] = js.native
  def toNotMatch(value: RegExp, message: String): Expectation[T] = js.native
  def toNotThrow(): Expectation[T] = js.native
  def toNotThrow(error: js.Object): Expectation[T] = js.native
  def toNotThrow(error: js.Object, message: String): Expectation[T] = js.native
  def toThrow(): Expectation[T] = js.native
  def toThrow(error: js.Object): Expectation[T] = js.native
  def toThrow(error: js.Object, message: String): Expectation[T] = js.native
  def withArgs(args: js.Any*): Expectation[T] = js.native
  // deprecated
  def withContext(context: js.Any): Expectation[T] = js.native
}

