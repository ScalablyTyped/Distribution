package typings
package expectDotJsLib.ExpectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  /**
    * Assert typeof / instanceof.
    */
  @JSName("an")
  var an_Original: An = js.native
  /**
    * Assert typeof.
    */
  def a(`type`: java.lang.String): Assertion = js.native
  /**
    * Assert instanceof.
    */
  def a(`type`: js.Function): Assertion = js.native
  /**
    * Assert numeric value above n.
    */
  def above(n: scala.Double): Assertion = js.native
  /**
    * Assert typeof.
    */
  /**
    * Assert typeof / instanceof.
    */
  def an(`type`: java.lang.String): Assertion = js.native
  /**
    * Assert instanceof.
    */
  /**
    * Assert typeof / instanceof.
    */
  def an(`type`: js.Function): Assertion = js.native
  /**
    * Assert numeric value below n.
    */
  def below(n: scala.Double): Assertion = js.native
  /**
    * Assert that the array contains obj.
    */
  def contain(obj: js.Any): Assertion = js.native
  /**
    * Assert that string contains str.
    */
  def contain(str: java.lang.String): Assertion = js.native
  /**
    * Checks if the array is empty.
    */
  def empty(): Assertion = js.native
  /**
    * Checks if the obj sortof equals another.
    */
  def eql(obj: js.Any): Assertion = js.native
  /**
    * Checks if the obj exactly equals another.
    */
  def equal(obj: js.Any): Assertion = js.native
  /**
    * Assert a failure.
    */
  def fail(): Assertion = js.native
  def fail(message: java.lang.String): Assertion = js.native
  /**
    * Assert numeric value above n.
    */
  def greaterThan(n: scala.Double): Assertion = js.native
  /**
    * Assert exact keys or inclusion of keys by using the `.own` modifier.
    */
  def key(keys: java.lang.String*): Assertion = js.native
  /**
    * Assert exact keys or inclusion of keys by using the `.own` modifier.
    */
  def key(keys: js.Array[java.lang.String]): Assertion = js.native
  /**
    * Assert exact keys or inclusion of keys by using the `.own` modifier.
    */
  def keys(keys: java.lang.String*): Assertion = js.native
  /**
    * Assert exact keys or inclusion of keys by using the `.own` modifier.
    */
  def keys(keys: js.Array[java.lang.String]): Assertion = js.native
  /**
    * Assert property "length" exists and has value of n.
    *
    * @param n
    */
  def length(n: scala.Double): Assertion = js.native
  /**
    * Assert numeric value below n.
    */
  def lessThan(n: scala.Double): Assertion = js.native
  /**
    * Assert string value matches regexp.
    *
    * @param regexp
    */
  def `match`(regexp: stdLib.RegExp): Assertion = js.native
  /**
    * Check if the value is truthy
    */
  def ok(): scala.Unit = js.native
  /**
    * Assert property name exists, with optional val.
    *
    * @param name
    * @param val
    */
  def property(name: java.lang.String): Assertion = js.native
  def property(name: java.lang.String, `val`: js.Any): Assertion = js.native
  def string(obj: js.Any): Assertion = js.native
  def string(str: java.lang.String): Assertion = js.native
  /**
    * Assert that the function throws.
    *
    * @param fn callback to match error string against
    */
  def throwError(): scala.Unit = js.native
  def throwError(fn: js.Function1[/* exception */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Assert that the function throws.
    *
    * @param regexp regexp to match error string against
    */
  def throwError(regexp: stdLib.RegExp): scala.Unit = js.native
  /**
    * Assert that the function throws.
    *
    * @param fn callback to match error string against
    */
  def throwException(): scala.Unit = js.native
  def throwException(fn: js.Function1[/* exception */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Assert that the function throws.
    *
    * @param fn callback to match error string against
    */
  def throwException(regexp: stdLib.RegExp): scala.Unit = js.native
  /**
    * Creates an anonymous function which calls fn with arguments.
    */
  def withArgs(args: js.Any*): Root = js.native
  /**
    * Assert within start to finish (inclusive).
    *
    * @param start
    * @param finish
    */
  def within(start: scala.Double, finish: scala.Double): Assertion = js.native
}

