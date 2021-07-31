package typings.expect

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.expect.anon.Actual
import typings.expect.anon.PartialMatcherState
import typings.expect.anon.readonlyprintExpectedvalu
import typings.jestTypes.configMod.Path
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AsymmetricMatcher = Record[String, js.Any]
  
  type AsyncExpectationResult = js.Promise[SyncExpectationResult]
  
  @js.native
  trait Constructable
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  @js.native
  trait Expect
    extends StObject
       with /* id */ StringDictionary[AsymmetricMatcher] {
    
    def apply[T](actual: T): Matchers[T] = js.native
    
    def addSnapshotSerializer(arg0: js.Any): Unit = js.native
    
    def any(expectedObject: js.Any): AsymmetricMatcher = js.native
    
    def anything(): AsymmetricMatcher = js.native
    
    def arrayContaining(sample: js.Array[js.Any]): AsymmetricMatcher = js.native
    
    def assertions(arg0: Double): Unit = js.native
    
    def extend(arg0: js.Any): Unit = js.native
    
    def extractExpectedAssertionsErrors(): ExpectedAssertionsErrors = js.native
    
    def getState(): MatcherState = js.native
    
    def hasAssertions(): Unit = js.native
    
    var not: StringDictionary[AsymmetricMatcher] = js.native
    
    def objectContaining(sample: Record[String, js.Any]): AsymmetricMatcher = js.native
    
    def setState(state: PartialMatcherState): Unit = js.native
    
    def stringContaining(expected: String): AsymmetricMatcher = js.native
    
    def stringMatching(expected: String): AsymmetricMatcher = js.native
    def stringMatching(expected: RegExp): AsymmetricMatcher = js.native
  }
  
  type ExpectationResult = SyncExpectationResult | AsyncExpectationResult
  
  type ExpectedAssertionsErrors = js.Array[Actual]
  
  @js.native
  trait MatcherState extends StObject {
    
    var assertionCalls: Double = js.native
    
    var currentTestName: js.UndefOr[String] = js.native
    
    var dontThrow: js.UndefOr[js.Function0[Unit]] = js.native
    
    def equals(a: js.Any, b: js.Any): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: Unit, strictCheck: Boolean): Boolean = js.native
    
    var error: js.UndefOr[Error] = js.native
    
    var expand: js.UndefOr[Boolean] = js.native
    
    var expectedAssertionsNumber: js.UndefOr[Double | Null] = js.native
    
    var expectedAssertionsNumberError: js.UndefOr[Error] = js.native
    
    var isExpectingAssertions: js.UndefOr[Boolean] = js.native
    
    var isExpectingAssertionsError: js.UndefOr[Error] = js.native
    
    var isNot: Boolean = js.native
    
    var promise: String = js.native
    
    var suppressedErrors: js.Array[Error] = js.native
    
    var testPath: js.UndefOr[Path] = js.native
    
    var utils: readonlyprintExpectedvalu = js.native
  }
  
  @js.native
  trait Matchers[R] extends StObject {
    
    /**
      * Ensures the last call to a mock function was provided specific args.
      */
    def lastCalledWith(args: js.Any*): R = js.native
    
    /**
      * Ensure that the last call to a mock function has returned a specified value.
      */
    def lastReturnedWith(value: js.Any): R = js.native
    
    /**
      * If you know how to test something, `.not` lets you test its opposite.
      */
    var not: Matchers[R] = js.native
    
    /**
      * Ensure that a mock function is called with specific arguments on an Nth call.
      */
    def nthCalledWith(nthCall: Double, args: js.Any*): R = js.native
    
    /**
      * Ensure that the nth call to a mock function has returned a specified value.
      */
    def nthReturnedWith(n: Double, value: js.Any): R = js.native
    
    /**
      * Unwraps the reason of a rejected promise so any other matcher can be chained.
      * If the promise is fulfilled the assertion fails.
      */
    var rejects: Matchers[js.Promise[R]] = js.native
    
    /**
      * Use resolves to unwrap the value of a fulfilled promise so any other
      * matcher can be chained. If the promise is rejected the assertion fails.
      */
    var resolves: Matchers[js.Promise[R]] = js.native
    
    /**
      * Checks that a value is what you expect. It uses `===` to check strict equality.
      * Don't use `toBe` with floating-point numbers.
      */
    def toBe(expected: js.Any): R = js.native
    
    /**
      * Ensures that a mock function is called.
      */
    def toBeCalled(): R = js.native
    
    /**
      * Ensures that a mock function is called an exact number of times.
      */
    def toBeCalledTimes(expected: Double): R = js.native
    
    /**
      * Ensure that a mock function is called with specific arguments.
      */
    def toBeCalledWith(args: js.Any*): R = js.native
    
    /**
      * Using exact equality with floating point numbers is a bad idea.
      * Rounding means that intuitive things fail.
      * The default for numDigits is 2.
      */
    def toBeCloseTo(expected: Double): R = js.native
    def toBeCloseTo(expected: Double, numDigits: Double): R = js.native
    
    /**
      * Ensure that a variable is not undefined.
      */
    def toBeDefined(): R = js.native
    
    /**
      * When you don't care what a value is, you just want to
      * ensure a value is false in a boolean context.
      */
    def toBeFalsy(): R = js.native
    
    def toBeGreaterThan(expected: js.BigInt): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeGreaterThan(expected: Double): R = js.native
    
    def toBeGreaterThanOrEqual(expected: js.BigInt): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeGreaterThanOrEqual(expected: Double): R = js.native
    
    /**
      * Ensure that an object is an instance of a class.
      * This matcher uses `instanceof` underneath.
      */
    def toBeInstanceOf(expected: js.Function): R = js.native
    
    def toBeLessThan(expected: js.BigInt): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeLessThan(expected: Double): R = js.native
    
    def toBeLessThanOrEqual(expected: js.BigInt): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeLessThanOrEqual(expected: Double): R = js.native
    
    /**
      * Used to check that a variable is NaN.
      */
    def toBeNaN(): R = js.native
    
    /**
      * This is the same as `.toBe(null)` but the error messages are a bit nicer.
      * So use `.toBeNull()` when you want to check that something is null.
      */
    def toBeNull(): R = js.native
    
    /**
      * Use when you don't care what a value is, you just want to ensure a value
      * is true in a boolean context. In JavaScript, there are six falsy values:
      * `false`, `0`, `''`, `null`, `undefined`, and `NaN`. Everything else is truthy.
      */
    def toBeTruthy(): R = js.native
    
    /**
      * Used to check that a variable is undefined.
      */
    def toBeUndefined(): R = js.native
    
    /**
      * Used when you want to check that an item is in a list.
      * For testing the items in the list, this uses `===`, a strict equality check.
      */
    def toContain(expected: js.Any): R = js.native
    
    /**
      * Used when you want to check that an item is in a list.
      * For testing the items in the list, this  matcher recursively checks the
      * equality of all fields, rather than checking for object identity.
      */
    def toContainEqual(expected: js.Any): R = js.native
    
    /**
      * Used when you want to check that two objects have the same value.
      * This matcher recursively checks the equality of all fields, rather than checking for object identity.
      */
    def toEqual(expected: js.Any): R = js.native
    
    /**
      * Ensures that a mock function is called.
      */
    def toHaveBeenCalled(): R = js.native
    
    /**
      * Ensures that a mock function is called an exact number of times.
      */
    def toHaveBeenCalledTimes(expected: Double): R = js.native
    
    /**
      * Ensure that a mock function is called with specific arguments.
      */
    def toHaveBeenCalledWith(args: js.Any*): R = js.native
    
    /**
      * If you have a mock function, you can use `.toHaveBeenLastCalledWith`
      * to test what arguments it was last called with.
      */
    def toHaveBeenLastCalledWith(args: js.Any*): R = js.native
    
    /**
      * Ensure that a mock function is called with specific arguments on an Nth call.
      */
    def toHaveBeenNthCalledWith(nthCall: Double, args: js.Any*): R = js.native
    
    /**
      * Use to test the specific value that a mock function last returned.
      * If the last call to the mock function threw an error, then this matcher will fail
      * no matter what value you provided as the expected return value.
      */
    def toHaveLastReturnedWith(expected: js.Any): R = js.native
    
    /**
      * Used to check that an object has a `.length` property
      * and it is set to a certain numeric value.
      */
    def toHaveLength(expected: Double): R = js.native
    
    /**
      * Use to test the specific value that a mock function returned for the nth call.
      * If the nth call to the mock function threw an error, then this matcher will fail
      * no matter what value you provided as the expected return value.
      */
    def toHaveNthReturnedWith(nthCall: Double, expected: js.Any): R = js.native
    
    /**
      * Use to check if property at provided reference keyPath exists for an object.
      * For checking deeply nested properties in an object you may use dot notation or an array containing
      * the keyPath for deep references.
      *
      * Optionally, you can provide a value to check if it's equal to the value present at keyPath
      * on the target object. This matcher uses 'deep equality' (like `toEqual()`) and recursively checks
      * the equality of all fields.
      *
      * @example
      *
      * expect(houseForSale).toHaveProperty('kitchen.area', 20);
      */
    def toHaveProperty(keyPath: String): R = js.native
    def toHaveProperty(keyPath: String, value: js.Any): R = js.native
    def toHaveProperty(keyPath: js.Array[String]): R = js.native
    def toHaveProperty(keyPath: js.Array[String], value: js.Any): R = js.native
    
    /**
      * Use to test that the mock function successfully returned (i.e., did not throw an error) at least one time
      */
    def toHaveReturned(): R = js.native
    
    /**
      * Use to ensure that a mock function returned successfully (i.e., did not throw an error) an exact number of times.
      * Any calls to the mock function that throw an error are not counted toward the number of times the function returned.
      */
    def toHaveReturnedTimes(expected: Double): R = js.native
    
    /**
      * Use to ensure that a mock function returned a specific value.
      */
    def toHaveReturnedWith(expected: js.Any): R = js.native
    
    /**
      * Check that a string matches a regular expression.
      */
    def toMatch(expected: String): R = js.native
    def toMatch(expected: RegExp): R = js.native
    
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/en/snapshot-testing) for more information.
      */
    def toMatchInlineSnapshot(): R = js.native
    def toMatchInlineSnapshot(snapshot: String): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/en/snapshot-testing) for more information.
      */
    def toMatchInlineSnapshot[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof R ]: unknown}
      */ typings.expect.expectStrings.Matchers & TopLevel[js.Any] */](propertyMatchers: Partial[T]): R = js.native
    def toMatchInlineSnapshot[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof R ]: unknown}
      */ typings.expect.expectStrings.Matchers & TopLevel[js.Any] */](propertyMatchers: Partial[T], snapshot: String): R = js.native
    
    def toMatchObject(expected: js.Array[js.Any]): R = js.native
    /**
      * Used to check that a JavaScript object matches a subset of the properties of an object
      */
    def toMatchObject(expected: Record[String, js.Any]): R = js.native
    
    /**
      * This ensures that a value matches the most recent snapshot.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/en/snapshot-testing) for more information.
      */
    def toMatchSnapshot(): R = js.native
    def toMatchSnapshot(snapshotName: String): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/en/snapshot-testing) for more information.
      */
    def toMatchSnapshot[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof R ]: unknown}
      */ typings.expect.expectStrings.Matchers & TopLevel[js.Any] */](propertyMatchers: Partial[T]): R = js.native
    def toMatchSnapshot[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof R ]: unknown}
      */ typings.expect.expectStrings.Matchers & TopLevel[js.Any] */](propertyMatchers: Partial[T], snapshotName: String): R = js.native
    
    /**
      * Ensure that a mock function has returned (as opposed to thrown) at least once.
      */
    def toReturn(): R = js.native
    
    /**
      * Ensure that a mock function has returned (as opposed to thrown) a specified number of times.
      */
    def toReturnTimes(count: Double): R = js.native
    
    /**
      * Ensure that a mock function has returned a specified value at least once.
      */
    def toReturnWith(value: js.Any): R = js.native
    
    /**
      * Use to test that objects have the same types as well as structure.
      */
    def toStrictEqual(expected: js.Any): R = js.native
    
    /**
      * Used to test that a function throws when it is called.
      */
    def toThrow(): R = js.native
    def toThrow(error: String): R = js.native
    def toThrow(error: Constructable): R = js.native
    def toThrow(error: Error): R = js.native
    def toThrow(error: RegExp): R = js.native
    
    /**
      * If you want to test that a specific error is thrown inside a function.
      */
    def toThrowError(): R = js.native
    def toThrowError(error: String): R = js.native
    def toThrowError(error: Constructable): R = js.native
    def toThrowError(error: Error): R = js.native
    def toThrowError(error: RegExp): R = js.native
    
    /**
      * Used to test that a function throws a error matching the most recent snapshot when it is called.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      */
    def toThrowErrorMatchingInlineSnapshot(): R = js.native
    def toThrowErrorMatchingInlineSnapshot(snapshot: String): R = js.native
    
    /**
      * Used to test that a function throws a error matching the most recent snapshot when it is called.
      */
    def toThrowErrorMatchingSnapshot(): R = js.native
  }
  
  type MatchersObject = StringDictionary[RawMatcherFn]
  
  type PromiseMatcherFn = js.Function1[/* actual */ js.Any, js.Promise[Unit]]
  
  @js.native
  trait RawMatcherFn extends StObject {
    
    def apply(received: js.Any, expected: js.Any): ExpectationResult = js.native
    def apply(received: js.Any, expected: js.Any, options: js.Any): ExpectationResult = js.native
  }
  
  trait SyncExpectationResult extends StObject {
    
    def message(): String
    
    var pass: Boolean
  }
  object SyncExpectationResult {
    
    @scala.inline
    def apply(message: () => String, pass: Boolean): SyncExpectationResult = {
      val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncExpectationResult]
    }
    
    @scala.inline
    implicit class SyncExpectationResultMutableBuilder[Self <: SyncExpectationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  type Tester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[Boolean]]
  
  type ThrowingMatcherFn = js.Function1[/* actual */ js.Any, Unit]
}
