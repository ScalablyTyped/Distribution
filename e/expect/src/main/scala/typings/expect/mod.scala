package typings.expect

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.expect.anon.Actual
import typings.expect.anon.OmitAsymmetricMatchersany
import typings.expect.anon.OmitSyncExpectationResult
import typings.expect.anon.PartialMatcherState
import typings.expect.anon.readonlyprintExpectedvalu
import typings.jestExpectUtils.mod.EqualsFunction
import typings.jestExpectUtils.mod.Tester
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("expect", JSImport.Default)
  @js.native
  val default: Expect_ = js.native
  
  /* note: abstract class */ @JSImport("expect", "AsymmetricMatcher")
  @js.native
  open class AsymmetricMatcher[T] protected ()
    extends StObject
       with AsymmetricMatcher2 {
    def this(sample: T) = this()
    def this(sample: T, inverse: Boolean) = this()
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    /* CompleteClass */
    override def asymmetricMatch(other: Any): Boolean = js.native
    
    /* protected */ def getMatcherContext(): MatcherContext = js.native
    
    /* protected */ var inverse: Boolean = js.native
    
    /* protected */ var sample: T = js.native
  }
  
  @JSImport("expect", "JestAssertionError")
  @js.native
  open class JestAssertionError ()
    extends StObject
       with Error {
    
    var matcherResult: js.UndefOr[OmitSyncExpectationResult] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("expect", "expect")
  @js.native
  val expect: Expect_ = js.native
  
  trait AsymmetricMatcher2 extends StObject {
    
    def asymmetricMatch(other: Any): Boolean
    
    var getExpectedType: js.UndefOr[js.Function0[String]] = js.undefined
    
    var toAsymmetricMatcher: js.UndefOr[js.Function0[String]] = js.undefined
  }
  object AsymmetricMatcher2 {
    
    inline def apply(asymmetricMatch: Any => Boolean): AsymmetricMatcher2 = {
      val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction1(asymmetricMatch))
      __obj.asInstanceOf[AsymmetricMatcher2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsymmetricMatcher2] (val x: Self) extends AnyVal {
      
      inline def setAsymmetricMatch(value: Any => Boolean): Self = StObject.set(x, "asymmetricMatch", js.Any.fromFunction1(value))
      
      inline def setGetExpectedType(value: () => String): Self = StObject.set(x, "getExpectedType", js.Any.fromFunction0(value))
      
      inline def setGetExpectedTypeUndefined: Self = StObject.set(x, "getExpectedType", js.undefined)
      
      inline def setToAsymmetricMatcher(value: () => String): Self = StObject.set(x, "toAsymmetricMatcher", js.Any.fromFunction0(value))
      
      inline def setToAsymmetricMatcherUndefined: Self = StObject.set(x, "toAsymmetricMatcher", js.undefined)
    }
  }
  
  @js.native
  trait AsymmetricMatchers extends StObject {
    
    def any(sample: Any): AsymmetricMatcher2 = js.native
    
    def anything(): AsymmetricMatcher2 = js.native
    
    def arrayContaining(sample: js.Array[Any]): AsymmetricMatcher2 = js.native
    
    def closeTo(sample: Double): AsymmetricMatcher2 = js.native
    def closeTo(sample: Double, precision: Double): AsymmetricMatcher2 = js.native
    
    def objectContaining(sample: Record[String, Any]): AsymmetricMatcher2 = js.native
    
    def stringContaining(sample: String): AsymmetricMatcher2 = js.native
    
    def stringMatching(sample: String): AsymmetricMatcher2 = js.native
    def stringMatching(sample: js.RegExp): AsymmetricMatcher2 = js.native
  }
  
  type AsyncExpectationResult = js.Promise[SyncExpectationResult]
  
  trait BaseExpect extends StObject {
    
    def addEqualityTesters(testers: js.Array[Tester]): Unit
    
    def assertions(numberOfAssertions: Double): Unit
    
    def extend(matchers: MatchersObject): Unit
    
    def extractExpectedAssertionsErrors(): ExpectedAssertionsErrors
    
    def getState(): MatcherState
    
    def hasAssertions(): Unit
    
    def setState(state: PartialMatcherState): Unit
  }
  object BaseExpect {
    
    inline def apply(
      addEqualityTesters: js.Array[Tester] => Unit,
      assertions: Double => Unit,
      extend: MatchersObject => Unit,
      extractExpectedAssertionsErrors: () => ExpectedAssertionsErrors,
      getState: () => MatcherState,
      hasAssertions: () => Unit,
      setState: PartialMatcherState => Unit
    ): BaseExpect = {
      val __obj = js.Dynamic.literal(addEqualityTesters = js.Any.fromFunction1(addEqualityTesters), assertions = js.Any.fromFunction1(assertions), extend = js.Any.fromFunction1(extend), extractExpectedAssertionsErrors = js.Any.fromFunction0(extractExpectedAssertionsErrors), getState = js.Any.fromFunction0(getState), hasAssertions = js.Any.fromFunction0(hasAssertions), setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[BaseExpect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseExpect] (val x: Self) extends AnyVal {
      
      inline def setAddEqualityTesters(value: js.Array[Tester] => Unit): Self = StObject.set(x, "addEqualityTesters", js.Any.fromFunction1(value))
      
      inline def setAssertions(value: Double => Unit): Self = StObject.set(x, "assertions", js.Any.fromFunction1(value))
      
      inline def setExtend(value: MatchersObject => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setExtractExpectedAssertionsErrors(value: () => ExpectedAssertionsErrors): Self = StObject.set(x, "extractExpectedAssertionsErrors", js.Any.fromFunction0(value))
      
      inline def setGetState(value: () => MatcherState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setHasAssertions(value: () => Unit): Self = StObject.set(x, "hasAssertions", js.Any.fromFunction0(value))
      
      inline def setSetState(value: PartialMatcherState => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
  
  type Expect_ = (js.Function1[
    /* actual */ Any, 
    (Matchers[Unit, Any]) & (Inverse[Matchers[Unit, Any]]) & PromiseMatchers[Any]
  ]) & BaseExpect & AsymmetricMatchers & Inverse[OmitAsymmetricMatchersany]
  
  type ExpectationResult = SyncExpectationResult | js.Promise[SyncExpectationResult]
  
  type ExpectedAssertionsErrors = js.Array[Actual]
  
  trait Inverse[Matchers] extends StObject {
    
    /**
      * Inverse next matcher. If you know how to test something, `.not` lets you test its opposite.
      */
    var not: Matchers
  }
  object Inverse {
    
    inline def apply[Matchers](not: Matchers): Inverse[Matchers] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inverse[Matchers]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inverse[?], Matchers] (val x: Self & Inverse[Matchers]) extends AnyVal {
      
      inline def setNot(value: Matchers): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined expect.expect.MatcherUtils & std.Readonly<expect.expect.MatcherState> */
  trait MatcherContext extends StObject {
    
    val assertionCalls: Double
    
    val currentTestName: js.UndefOr[String] = js.undefined
    
    var customTesters: js.Array[Tester]
    
    def dontThrow(): Unit
    
    def equals(a: Any, b: Any): Boolean
    def equals(a: Any, b: Any, customTesters: js.Array[Tester]): Boolean
    def equals(a: Any, b: Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean
    def equals(a: Any, b: Any, customTesters: Unit, strictCheck: Boolean): Boolean
    @JSName("equals")
    var equals_Original: EqualsFunction
    
    val error: js.UndefOr[js.Error] = js.undefined
    
    val expand: js.UndefOr[Boolean] = js.undefined
    
    val expectedAssertionsNumber: js.UndefOr[Double | Null] = js.undefined
    
    val expectedAssertionsNumberError: js.UndefOr[js.Error] = js.undefined
    
    val isExpectingAssertions: Boolean
    
    val isExpectingAssertionsError: js.UndefOr[js.Error] = js.undefined
    
    val isNot: js.UndefOr[Boolean] = js.undefined
    
    val numPassingAsserts: Double
    
    val promise: js.UndefOr[String] = js.undefined
    
    val suppressedErrors: js.Array[js.Error]
    
    val testPath: js.UndefOr[String] = js.undefined
    
    var utils: readonlyprintExpectedvalu
  }
  object MatcherContext {
    
    inline def apply(
      assertionCalls: Double,
      customTesters: js.Array[Tester],
      dontThrow: () => Unit,
      equals_ : (/* a */ Any, /* b */ Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean,
      isExpectingAssertions: Boolean,
      numPassingAsserts: Double,
      suppressedErrors: js.Array[js.Error],
      utils: readonlyprintExpectedvalu
    ): MatcherContext = {
      val __obj = js.Dynamic.literal(assertionCalls = assertionCalls.asInstanceOf[js.Any], customTesters = customTesters.asInstanceOf[js.Any], dontThrow = js.Any.fromFunction0(dontThrow), isExpectingAssertions = isExpectingAssertions.asInstanceOf[js.Any], numPassingAsserts = numPassingAsserts.asInstanceOf[js.Any], suppressedErrors = suppressedErrors.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction4(equals_))
      __obj.asInstanceOf[MatcherContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatcherContext] (val x: Self) extends AnyVal {
      
      inline def setAssertionCalls(value: Double): Self = StObject.set(x, "assertionCalls", value.asInstanceOf[js.Any])
      
      inline def setCurrentTestName(value: String): Self = StObject.set(x, "currentTestName", value.asInstanceOf[js.Any])
      
      inline def setCurrentTestNameUndefined: Self = StObject.set(x, "currentTestName", js.undefined)
      
      inline def setCustomTesters(value: js.Array[Tester]): Self = StObject.set(x, "customTesters", value.asInstanceOf[js.Any])
      
      inline def setCustomTestersVarargs(value: Tester*): Self = StObject.set(x, "customTesters", js.Array(value*))
      
      inline def setDontThrow(value: () => Unit): Self = StObject.set(x, "dontThrow", js.Any.fromFunction0(value))
      
      inline def setEquals_(
        value: (/* a */ Any, /* b */ Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "equals", js.Any.fromFunction4(value))
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpectedAssertionsNumber(value: Double): Self = StObject.set(x, "expectedAssertionsNumber", value.asInstanceOf[js.Any])
      
      inline def setExpectedAssertionsNumberError(value: js.Error): Self = StObject.set(x, "expectedAssertionsNumberError", value.asInstanceOf[js.Any])
      
      inline def setExpectedAssertionsNumberErrorUndefined: Self = StObject.set(x, "expectedAssertionsNumberError", js.undefined)
      
      inline def setExpectedAssertionsNumberNull: Self = StObject.set(x, "expectedAssertionsNumber", null)
      
      inline def setExpectedAssertionsNumberUndefined: Self = StObject.set(x, "expectedAssertionsNumber", js.undefined)
      
      inline def setIsExpectingAssertions(value: Boolean): Self = StObject.set(x, "isExpectingAssertions", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsError(value: js.Error): Self = StObject.set(x, "isExpectingAssertionsError", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsErrorUndefined: Self = StObject.set(x, "isExpectingAssertionsError", js.undefined)
      
      inline def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
      
      inline def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
      
      inline def setNumPassingAsserts(value: Double): Self = StObject.set(x, "numPassingAsserts", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setSuppressedErrors(value: js.Array[js.Error]): Self = StObject.set(x, "suppressedErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressedErrorsVarargs(value: js.Error*): Self = StObject.set(x, "suppressedErrors", js.Array(value*))
      
      inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
      
      inline def setTestPathUndefined: Self = StObject.set(x, "testPath", js.undefined)
      
      inline def setUtils(value: readonlyprintExpectedvalu): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    }
  }
  
  type MatcherFunction[Expected /* <: js.Array[Any] */] = MatcherFunctionWithContext[MatcherContext, Expected]
  
  type MatcherFunctionWithContext[Context /* <: MatcherContext */, Expected /* <: js.Array[Any] */] = js.ThisFunction2[/* this */ Context, /* actual */ Any, /* expected */ Expected, ExpectationResult]
  
  trait MatcherState extends StObject {
    
    var assertionCalls: Double
    
    var currentTestName: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var expand: js.UndefOr[Boolean] = js.undefined
    
    var expectedAssertionsNumber: Double | Null
    
    var expectedAssertionsNumberError: js.UndefOr[js.Error] = js.undefined
    
    var isExpectingAssertions: Boolean
    
    var isExpectingAssertionsError: js.UndefOr[js.Error] = js.undefined
    
    var isNot: js.UndefOr[Boolean] = js.undefined
    
    var numPassingAsserts: Double
    
    var promise: js.UndefOr[String] = js.undefined
    
    var suppressedErrors: js.Array[js.Error]
    
    var testPath: js.UndefOr[String] = js.undefined
  }
  object MatcherState {
    
    inline def apply(
      assertionCalls: Double,
      isExpectingAssertions: Boolean,
      numPassingAsserts: Double,
      suppressedErrors: js.Array[js.Error]
    ): MatcherState = {
      val __obj = js.Dynamic.literal(assertionCalls = assertionCalls.asInstanceOf[js.Any], isExpectingAssertions = isExpectingAssertions.asInstanceOf[js.Any], numPassingAsserts = numPassingAsserts.asInstanceOf[js.Any], suppressedErrors = suppressedErrors.asInstanceOf[js.Any], expectedAssertionsNumber = null)
      __obj.asInstanceOf[MatcherState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatcherState] (val x: Self) extends AnyVal {
      
      inline def setAssertionCalls(value: Double): Self = StObject.set(x, "assertionCalls", value.asInstanceOf[js.Any])
      
      inline def setCurrentTestName(value: String): Self = StObject.set(x, "currentTestName", value.asInstanceOf[js.Any])
      
      inline def setCurrentTestNameUndefined: Self = StObject.set(x, "currentTestName", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpectedAssertionsNumber(value: Double): Self = StObject.set(x, "expectedAssertionsNumber", value.asInstanceOf[js.Any])
      
      inline def setExpectedAssertionsNumberError(value: js.Error): Self = StObject.set(x, "expectedAssertionsNumberError", value.asInstanceOf[js.Any])
      
      inline def setExpectedAssertionsNumberErrorUndefined: Self = StObject.set(x, "expectedAssertionsNumberError", js.undefined)
      
      inline def setExpectedAssertionsNumberNull: Self = StObject.set(x, "expectedAssertionsNumber", null)
      
      inline def setIsExpectingAssertions(value: Boolean): Self = StObject.set(x, "isExpectingAssertions", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsError(value: js.Error): Self = StObject.set(x, "isExpectingAssertionsError", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsErrorUndefined: Self = StObject.set(x, "isExpectingAssertionsError", js.undefined)
      
      inline def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
      
      inline def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
      
      inline def setNumPassingAsserts(value: Double): Self = StObject.set(x, "numPassingAsserts", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setSuppressedErrors(value: js.Array[js.Error]): Self = StObject.set(x, "suppressedErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressedErrorsVarargs(value: js.Error*): Self = StObject.set(x, "suppressedErrors", js.Array(value*))
      
      inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
      
      inline def setTestPathUndefined: Self = StObject.set(x, "testPath", js.undefined)
    }
  }
  
  trait MatcherUtils extends StObject {
    
    var customTesters: js.Array[Tester]
    
    def dontThrow(): Unit
    
    def equals(a: Any, b: Any): Boolean
    def equals(a: Any, b: Any, customTesters: js.Array[Tester]): Boolean
    def equals(a: Any, b: Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean
    def equals(a: Any, b: Any, customTesters: Unit, strictCheck: Boolean): Boolean
    @JSName("equals")
    var equals_Original: EqualsFunction
    
    var utils: readonlyprintExpectedvalu
  }
  object MatcherUtils {
    
    inline def apply(
      customTesters: js.Array[Tester],
      dontThrow: () => Unit,
      equals_ : (/* a */ Any, /* b */ Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean,
      utils: readonlyprintExpectedvalu
    ): MatcherUtils = {
      val __obj = js.Dynamic.literal(customTesters = customTesters.asInstanceOf[js.Any], dontThrow = js.Any.fromFunction0(dontThrow), utils = utils.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction4(equals_))
      __obj.asInstanceOf[MatcherUtils]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatcherUtils] (val x: Self) extends AnyVal {
      
      inline def setCustomTesters(value: js.Array[Tester]): Self = StObject.set(x, "customTesters", value.asInstanceOf[js.Any])
      
      inline def setCustomTestersVarargs(value: Tester*): Self = StObject.set(x, "customTesters", js.Array(value*))
      
      inline def setDontThrow(value: () => Unit): Self = StObject.set(x, "dontThrow", js.Any.fromFunction0(value))
      
      inline def setEquals_(
        value: (/* a */ Any, /* b */ Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "equals", js.Any.fromFunction4(value))
      
      inline def setUtils(value: readonlyprintExpectedvalu): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Matchers[R /* <: Unit | js.Promise[Unit] */, T] extends StObject {
    
    /**
      * Ensures the last call to a mock function was provided specific args.
      */
    def lastCalledWith(expected: Any*): R = js.native
    
    /**
      * Ensure that the last call to a mock function has returned a specified value.
      */
    def lastReturnedWith(): R = js.native
    def lastReturnedWith(expected: Any): R = js.native
    
    /**
      * Ensure that a mock function is called with specific arguments on an Nth call.
      */
    def nthCalledWith(nth: Double, expected: Any*): R = js.native
    
    /**
      * Ensure that the nth call to a mock function has returned a specified value.
      */
    def nthReturnedWith(nth: Double): R = js.native
    def nthReturnedWith(nth: Double, expected: Any): R = js.native
    
    /**
      * Checks that a value is what you expect. It calls `Object.is` to compare values.
      * Don't use `toBe` with floating-point numbers.
      */
    def toBe(expected: Any): R = js.native
    
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
    def toBeCalledWith(expected: Any*): R = js.native
    
    /**
      * Using exact equality with floating point numbers is a bad idea.
      * Rounding means that intuitive things fail.
      * The default for `precision` is 2.
      */
    def toBeCloseTo(expected: Double): R = js.native
    def toBeCloseTo(expected: Double, precision: Double): R = js.native
    
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
    def toBeInstanceOf(expected: Any): R = js.native
    
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
    def toContain(expected: Any): R = js.native
    
    /**
      * Used when you want to check that an item is in a list.
      * For testing the items in the list, this  matcher recursively checks the
      * equality of all fields, rather than checking for object identity.
      */
    def toContainEqual(expected: Any): R = js.native
    
    /**
      * Used when you want to check that two objects have the same value.
      * This matcher recursively checks the equality of all fields, rather than checking for object identity.
      */
    def toEqual(expected: Any): R = js.native
    
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
    def toHaveBeenCalledWith(expected: Any*): R = js.native
    
    /**
      * If you have a mock function, you can use `.toHaveBeenLastCalledWith`
      * to test what arguments it was last called with.
      */
    def toHaveBeenLastCalledWith(expected: Any*): R = js.native
    
    /**
      * Ensure that a mock function is called with specific arguments on an Nth call.
      */
    def toHaveBeenNthCalledWith(nth: Double, expected: Any*): R = js.native
    
    /**
      * Use to test the specific value that a mock function last returned.
      * If the last call to the mock function threw an error, then this matcher will fail
      * no matter what value you provided as the expected return value.
      */
    def toHaveLastReturnedWith(): R = js.native
    def toHaveLastReturnedWith(expected: Any): R = js.native
    
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
    def toHaveNthReturnedWith(nth: Double): R = js.native
    def toHaveNthReturnedWith(nth: Double, expected: Any): R = js.native
    
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
    def toHaveProperty(expectedPath: String): R = js.native
    def toHaveProperty(expectedPath: String, expectedValue: Any): R = js.native
    def toHaveProperty(expectedPath: js.Array[String]): R = js.native
    def toHaveProperty(expectedPath: js.Array[String], expectedValue: Any): R = js.native
    
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
    def toHaveReturnedWith(): R = js.native
    def toHaveReturnedWith(expected: Any): R = js.native
    
    /**
      * Check that a string matches a regular expression.
      */
    def toMatch(expected: String): R = js.native
    def toMatch(expected: js.RegExp): R = js.native
    
    def toMatchObject(expected: js.Array[Record[String, Any]]): R = js.native
    /**
      * Used to check that a JavaScript object matches a subset of the properties of an object
      */
    def toMatchObject(expected: Record[String, Any]): R = js.native
    
    /**
      * Ensure that a mock function has returned (as opposed to thrown) at least once.
      */
    def toReturn(): R = js.native
    
    /**
      * Ensure that a mock function has returned (as opposed to thrown) a specified number of times.
      */
    def toReturnTimes(expected: Double): R = js.native
    
    /**
      * Ensure that a mock function has returned a specified value at least once.
      */
    def toReturnWith(): R = js.native
    def toReturnWith(expected: Any): R = js.native
    
    /**
      * Use to test that objects have the same types as well as structure.
      */
    def toStrictEqual(expected: Any): R = js.native
    
    /**
      * Used to test that a function throws when it is called.
      */
    def toThrow(): R = js.native
    def toThrow(expected: Any): R = js.native
    
    /**
      * If you want to test that a specific error is thrown inside a function.
      */
    def toThrowError(): R = js.native
    def toThrowError(expected: Any): R = js.native
  }
  
  type MatchersObject = StringDictionary[RawMatcherFn[MatcherContext]]
  
  trait PromiseMatchers[T] extends StObject {
    
    /**
      * Unwraps the reason of a rejected promise so any other matcher can be chained.
      * If the promise is fulfilled the assertion fails.
      */
    var rejects: (Matchers[js.Promise[Unit], T]) & (Inverse[Matchers[js.Promise[Unit], T]])
    
    /**
      * Unwraps the value of a fulfilled promise so any other matcher can be chained.
      * If the promise is rejected the assertion fails.
      */
    var resolves: (Matchers[js.Promise[Unit], T]) & (Inverse[Matchers[js.Promise[Unit], T]])
  }
  object PromiseMatchers {
    
    inline def apply[T](
      rejects: (Matchers[js.Promise[Unit], T]) & (Inverse[Matchers[js.Promise[Unit], T]]),
      resolves: (Matchers[js.Promise[Unit], T]) & (Inverse[Matchers[js.Promise[Unit], T]])
    ): PromiseMatchers[T] = {
      val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseMatchers[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseMatchers[?], T] (val x: Self & PromiseMatchers[T]) extends AnyVal {
      
      inline def setRejects(value: (Matchers[js.Promise[Unit], T]) & (Inverse[Matchers[js.Promise[Unit], T]])): Self = StObject.set(x, "rejects", value.asInstanceOf[js.Any])
      
      inline def setResolves(value: (Matchers[js.Promise[Unit], T]) & (Inverse[Matchers[js.Promise[Unit], T]])): Self = StObject.set(x, "resolves", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RawMatcherFn[Context /* <: MatcherContext */] extends StObject {
    
    def apply(actual: Any, expected: Any*): ExpectationResult = js.native
  }
  
  trait SyncExpectationResult extends StObject {
    
    def message(): String
    
    var pass: Boolean
  }
  object SyncExpectationResult {
    
    inline def apply(message: () => String, pass: Boolean): SyncExpectationResult = {
      val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncExpectationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncExpectationResult] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Expect_
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Expect_ = default
}
