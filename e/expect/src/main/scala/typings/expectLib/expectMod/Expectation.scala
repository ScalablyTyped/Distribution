package typings
package expectLib.expectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect", "Expectation")
@js.native
class Expectation[T] protected () extends js.Object {
  def this(actual: js.Any) = this()
  var not: Expectation[T] = js.native
  def toBe(value: T): Expectation[T] = js.native
  def toBe(value: T, message: java.lang.String): Expectation[T] = js.native
  def toBeA(value: java.lang.String): Expectation[T] = js.native
  def toBeA(value: java.lang.String, message: java.lang.String): Expectation[T] = js.native
  def toBeA(value: js.Object): Expectation[T] = js.native
  def toBeA(value: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toBeAn(value: java.lang.String): Expectation[T] = js.native
  def toBeAn(value: java.lang.String, message: java.lang.String): Expectation[T] = js.native
  def toBeAn(value: js.Object): Expectation[T] = js.native
  def toBeAn(value: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toBeDefined(): Expectation[T] = js.native
  def toBeDefined(message: java.lang.String): Expectation[T] = js.native
  def toBeFalsy(): Expectation[T] = js.native
  def toBeFalsy(message: java.lang.String): Expectation[T] = js.native
  def toBeFewerThan(value: scala.Double): Expectation[T] = js.native
  def toBeFewerThan(value: scala.Double, message: java.lang.String): Expectation[T] = js.native
  def toBeGreaterThan(value: scala.Double): Expectation[T] = js.native
  def toBeGreaterThan(value: scala.Double, message: java.lang.String): Expectation[T] = js.native
  def toBeGreaterThanOrEqualTo(value: scala.Double): Expectation[T] = js.native
  def toBeGreaterThanOrEqualTo(value: scala.Double, messasge: java.lang.String): Expectation[T] = js.native
  def toBeLessThan(value: scala.Double): Expectation[T] = js.native
  def toBeLessThan(value: scala.Double, message: java.lang.String): Expectation[T] = js.native
  def toBeLessThanOrEqualTo(value: scala.Double): Expectation[T] = js.native
  def toBeLessThanOrEqualTo(value: scala.Double, messasge: java.lang.String): Expectation[T] = js.native
  def toBeMoreThan(value: scala.Double): Expectation[T] = js.native
  def toBeMoreThan(value: scala.Double, message: java.lang.String): Expectation[T] = js.native
  def toBeNull(): Expectation[T] = js.native
  def toBeNull(message: java.lang.String): Expectation[T] = js.native
  def toBeTruthy(): Expectation[T] = js.native
  def toBeTruthy(message: java.lang.String): Expectation[T] = js.native
  def toBeUndefined(): Expectation[T] = js.native
  def toBeUndefined(message: java.lang.String): Expectation[T] = js.native
  def toContain[U](value: js.Any): Expectation[T] = js.native
  def toContain[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toContain[U](value: js.Any, compareValues: CompareValues[U], message: java.lang.String): Expectation[T] = js.native
  def toContainKey(key: KeyType): Expectation[T] = js.native
  def toContainKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toContainKey(key: KeyType, comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toContainKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toContainKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toContainKeys(keys: js.Array[KeyType], comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toEqual(value: js.Any): Expectation[T] = js.native
  def toEqual(value: js.Any, message: java.lang.String): Expectation[T] = js.native
  def toExclude[U](value: js.Any): Expectation[T] = js.native
  def toExclude[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toExclude[U](value: js.Any, compareValues: CompareValues[U], message: java.lang.String): Expectation[T] = js.native
  def toExcludeKey(key: KeyType): Expectation[T] = js.native
  def toExcludeKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toExcludeKey(key: KeyType, comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toExcludeKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toExcludeKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toExcludeKeys(keys: js.Array[KeyType], comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toExist(): Expectation[T] = js.native
  def toExist(message: java.lang.String): Expectation[T] = js.native
  def toHaveBeenCalled(): Expectation[T] = js.native
  def toHaveBeenCalled(message: java.lang.String): Expectation[T] = js.native
  def toHaveBeenCalledWith(args: js.Any*): Expectation[T] = js.native
  def toHaveBeenLastCalledWith(args: js.Any*): Expectation[T] = js.native
  def toInclude[U](value: js.Any): Expectation[T] = js.native
  def toInclude[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toInclude[U](value: js.Any, compareValues: CompareValues[U], message: java.lang.String): Expectation[T] = js.native
  def toIncludeKey(key: KeyType): Expectation[T] = js.native
  def toIncludeKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toIncludeKey(key: KeyType, comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toIncludeKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toIncludeKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toIncludeKeys(keys: js.Array[KeyType], comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toMatch(value: java.lang.String): Expectation[T] = js.native
  def toMatch(value: java.lang.String, message: java.lang.String): Expectation[T] = js.native
  def toMatch(value: js.Object): Expectation[T] = js.native
  def toMatch(value: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toMatch(value: stdLib.RegExp): Expectation[T] = js.native
  def toMatch(value: stdLib.RegExp, message: java.lang.String): Expectation[T] = js.native
  def toMatchObject(value: js.Object): Expectation[T] = js.native
  def toMatchObject(value: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toNotBe(value: js.Any): Expectation[T] = js.native
  def toNotBe(value: js.Any, message: java.lang.String): Expectation[T] = js.native
  def toNotBeA(value: java.lang.String): Expectation[T] = js.native
  def toNotBeA(value: java.lang.String, message: java.lang.String): Expectation[T] = js.native
  def toNotBeA(value: js.Object): Expectation[T] = js.native
  def toNotBeA(value: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toNotBeAn(value: java.lang.String): Expectation[T] = js.native
  def toNotBeAn(value: java.lang.String, message: java.lang.String): Expectation[T] = js.native
  def toNotBeAn(value: js.Object): Expectation[T] = js.native
  def toNotBeAn(value: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toNotContain[U](value: js.Any): Expectation[T] = js.native
  def toNotContain[U](value: js.Any, compareValues: CompareValues[U]): Expectation[T] = js.native
  def toNotContain[U](value: js.Any, compareValues: CompareValues[U], message: java.lang.String): Expectation[T] = js.native
  def toNotContainKey(key: KeyType): Expectation[T] = js.native
  def toNotContainKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toNotContainKey(key: KeyType, comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toNotContainKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toNotContainKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toNotContainKeys(keys: js.Array[KeyType], comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toNotEqual(value: js.Any): Expectation[T] = js.native
  def toNotEqual(value: js.Any, message: java.lang.String): Expectation[T] = js.native
  def toNotExist(): Expectation[T] = js.native
  def toNotExist(message: java.lang.String): Expectation[T] = js.native
  def toNotHaveBeenCalled(): Expectation[T] = js.native
  def toNotHaveBeenCalled(message: java.lang.String): Expectation[T] = js.native
  def toNotIncludeKey(key: KeyType): Expectation[T] = js.native
  def toNotIncludeKey(key: KeyType, comparator: Comparator): Expectation[T] = js.native
  def toNotIncludeKey(key: KeyType, comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toNotIncludeKeys(keys: js.Array[KeyType]): Expectation[T] = js.native
  def toNotIncludeKeys(keys: js.Array[KeyType], comparator: Comparator): Expectation[T] = js.native
  def toNotIncludeKeys(keys: js.Array[KeyType], comparator: Comparator, message: java.lang.String): Expectation[T] = js.native
  def toNotMatch(value: java.lang.String): Expectation[T] = js.native
  def toNotMatch(value: java.lang.String, message: java.lang.String): Expectation[T] = js.native
  def toNotMatch(value: js.Object): Expectation[T] = js.native
  def toNotMatch(value: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toNotMatch(value: stdLib.RegExp): Expectation[T] = js.native
  def toNotMatch(value: stdLib.RegExp, message: java.lang.String): Expectation[T] = js.native
  def toNotThrow(): Expectation[T] = js.native
  def toNotThrow(error: js.Object): Expectation[T] = js.native
  def toNotThrow(error: js.Object, message: java.lang.String): Expectation[T] = js.native
  def toThrow(): Expectation[T] = js.native
  def toThrow(error: js.Object): Expectation[T] = js.native
  def toThrow(error: js.Object, message: java.lang.String): Expectation[T] = js.native
  def withArgs(args: js.Any*): Expectation[T] = js.native
  // deprecated
  def withContext(context: js.Any): Expectation[T] = js.native
}

