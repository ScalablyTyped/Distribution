package typings.expectJs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Expect")
@js.native
object Expect extends js.Object {
  @js.native
  trait An extends Assertion {
    /**
      * Assert typeof.
      */
    def apply(`type`: String): Assertion = js.native
    /**
      * Assert instanceof.
      */
    def apply(`type`: js.Function): Assertion = js.native
  }
  
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
    def a(`type`: String): Assertion = js.native
    /**
      * Assert instanceof.
      */
    def a(`type`: js.Function): Assertion = js.native
    /**
      * Assert numeric value above n.
      */
    def above(n: Double): Assertion = js.native
    /**
      * Assert typeof.
      */
    /**
      * Assert typeof / instanceof.
      */
    def an(`type`: String): Assertion = js.native
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
    def below(n: Double): Assertion = js.native
    /**
      * Assert that the array contains obj.
      */
    def contain(obj: js.Any): Assertion = js.native
    /**
      * Assert that string contains str.
      */
    def contain(str: String): Assertion = js.native
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
    def fail(message: String): Assertion = js.native
    /**
      * Assert numeric value above n.
      */
    def greaterThan(n: Double): Assertion = js.native
    /**
      * Assert exact keys or inclusion of keys by using the `.own` modifier.
      */
    def key(keys: String*): Assertion = js.native
    /**
      * Assert exact keys or inclusion of keys by using the `.own` modifier.
      */
    def key(keys: js.Array[String]): Assertion = js.native
    /**
      * Assert exact keys or inclusion of keys by using the `.own` modifier.
      */
    def keys(keys: String*): Assertion = js.native
    /**
      * Assert exact keys or inclusion of keys by using the `.own` modifier.
      */
    def keys(keys: js.Array[String]): Assertion = js.native
    /**
      * Assert property "length" exists and has value of n.
      *
      * @param n
      */
    def length(n: Double): Assertion = js.native
    /**
      * Assert numeric value below n.
      */
    def lessThan(n: Double): Assertion = js.native
    /**
      * Assert string value matches regexp.
      *
      * @param regexp
      */
    def `match`(regexp: RegExp): Assertion = js.native
    /**
      * Check if the value is truthy
      */
    def ok(): Unit = js.native
    /**
      * Assert property name exists, with optional val.
      *
      * @param name
      * @param val
      */
    def property(name: String): Assertion = js.native
    def property(name: String, `val`: js.Any): Assertion = js.native
    def string(obj: js.Any): Assertion = js.native
    def string(str: String): Assertion = js.native
    /**
      * Assert that the function throws.
      *
      * @param fn callback to match error string against
      */
    def throwError(): Unit = js.native
    def throwError(fn: js.Function1[/* exception */ js.Any, Unit]): Unit = js.native
    /**
      * Assert that the function throws.
      *
      * @param regexp regexp to match error string against
      */
    def throwError(regexp: RegExp): Unit = js.native
    /**
      * Assert that the function throws.
      *
      * @param fn callback to match error string against
      */
    def throwException(): Unit = js.native
    def throwException(fn: js.Function1[/* exception */ js.Any, Unit]): Unit = js.native
    /**
      * Assert that the function throws.
      *
      * @param fn callback to match error string against
      */
    def throwException(regexp: RegExp): Unit = js.native
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
    def within(start: Double, finish: Double): Assertion = js.native
  }
  
  @js.native
  trait Be extends Assertion {
    /**
      * Checks if the obj exactly equals another.
      */
    def apply(obj: js.Any): Assertion = js.native
  }
  
  @js.native
  trait Have extends Assertion {
    var own: Assertion = js.native
  }
  
  @js.native
  trait Not extends NotBase {
    var to: ToBase = js.native
  }
  
  @js.native
  trait NotBase extends Assertion {
    @JSName("be")
    var be_Original: Be = js.native
    var have: Have = js.native
    var include: Assertion = js.native
    var only: Only = js.native
    /**
      * Checks if the obj exactly equals another.
      */
    def be(obj: js.Any): Assertion = js.native
  }
  
  @js.native
  trait Only extends Assertion {
    var have: Have = js.native
  }
  
  @js.native
  trait Root extends Assertion {
    @JSName("be")
    var be_Original: Be = js.native
    var have: Have = js.native
    var not: Not = js.native
    var only: Only = js.native
    var to: To = js.native
    /**
      * Checks if the obj exactly equals another.
      */
    def be(obj: js.Any): Assertion = js.native
  }
  
  @js.native
  trait To extends ToBase {
    var not: NotBase = js.native
  }
  
  @js.native
  trait ToBase extends Assertion {
    @JSName("be")
    var be_Original: Be = js.native
    var have: Have = js.native
    var include: Assertion = js.native
    var only: Only = js.native
    /**
      * Checks if the obj exactly equals another.
      */
    def be(obj: js.Any): Assertion = js.native
  }
  
}

