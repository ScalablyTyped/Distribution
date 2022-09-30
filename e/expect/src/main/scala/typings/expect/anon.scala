package typings.expect

import typings.expect.mod.AsymmetricMatcher2
import typings.jestExpectUtils.mod.Tester
import typings.jestMatcherUtils.mod.DiffOptions
import typings.jestMatcherUtils.mod.MatcherHintOptions
import typings.jestMatcherUtils.mod.PrintLabel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual extends StObject {
    
    var actual: String | Double
    
    var error: js.Error
    
    var expected: String
  }
  object Actual {
    
    inline def apply(actual: String | Double, error: js.Error, expected: String): Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actual]
    }
    
    extension [Self <: Actual](x: Self) {
      
      inline def setActual(value: String | Double): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<expect.expect.AsymmetricMatchers, 'any' | 'anything'> */
  trait OmitAsymmetricMatchersany extends StObject {
    
    var arrayContaining: js.Function1[/* sample */ js.Array[Any], AsymmetricMatcher2]
    
    var closeTo: js.Function2[/* sample */ Double, /* precision */ js.UndefOr[Double], AsymmetricMatcher2]
    
    var objectContaining: js.Function1[/* sample */ Record[String, Any], AsymmetricMatcher2]
    
    var stringContaining: js.Function1[/* sample */ String, AsymmetricMatcher2]
    
    var stringMatching: js.Function1[/* sample */ String | js.RegExp, AsymmetricMatcher2]
  }
  object OmitAsymmetricMatchersany {
    
    inline def apply(
      arrayContaining: /* sample */ js.Array[Any] => AsymmetricMatcher2,
      closeTo: (/* sample */ Double, /* precision */ js.UndefOr[Double]) => AsymmetricMatcher2,
      objectContaining: /* sample */ Record[String, Any] => AsymmetricMatcher2,
      stringContaining: /* sample */ String => AsymmetricMatcher2,
      stringMatching: /* sample */ String | js.RegExp => AsymmetricMatcher2
    ): OmitAsymmetricMatchersany = {
      val __obj = js.Dynamic.literal(arrayContaining = js.Any.fromFunction1(arrayContaining), closeTo = js.Any.fromFunction2(closeTo), objectContaining = js.Any.fromFunction1(objectContaining), stringContaining = js.Any.fromFunction1(stringContaining), stringMatching = js.Any.fromFunction1(stringMatching))
      __obj.asInstanceOf[OmitAsymmetricMatchersany]
    }
    
    extension [Self <: OmitAsymmetricMatchersany](x: Self) {
      
      inline def setArrayContaining(value: /* sample */ js.Array[Any] => AsymmetricMatcher2): Self = StObject.set(x, "arrayContaining", js.Any.fromFunction1(value))
      
      inline def setCloseTo(value: (/* sample */ Double, /* precision */ js.UndefOr[Double]) => AsymmetricMatcher2): Self = StObject.set(x, "closeTo", js.Any.fromFunction2(value))
      
      inline def setObjectContaining(value: /* sample */ Record[String, Any] => AsymmetricMatcher2): Self = StObject.set(x, "objectContaining", js.Any.fromFunction1(value))
      
      inline def setStringContaining(value: /* sample */ String => AsymmetricMatcher2): Self = StObject.set(x, "stringContaining", js.Any.fromFunction1(value))
      
      inline def setStringMatching(value: /* sample */ String | js.RegExp => AsymmetricMatcher2): Self = StObject.set(x, "stringMatching", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Omit<expect.expect.SyncExpectationResult, 'message'> & {  message :string} */
  trait OmitSyncExpectationResult extends StObject {
    
    var message: String
    
    var pass: Boolean
  }
  object OmitSyncExpectationResult {
    
    inline def apply(message: String, pass: Boolean): OmitSyncExpectationResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitSyncExpectationResult]
    }
    
    extension [Self <: OmitSyncExpectationResult](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<expect.expect.MatcherState> */
  trait PartialMatcherState extends StObject {
    
    var assertionCalls: js.UndefOr[Double] = js.undefined
    
    var currentTestName: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var expand: js.UndefOr[Boolean] = js.undefined
    
    var expectedAssertionsNumber: js.UndefOr[Double | Null] = js.undefined
    
    var expectedAssertionsNumberError: js.UndefOr[js.Error] = js.undefined
    
    var isExpectingAssertions: js.UndefOr[Boolean] = js.undefined
    
    var isExpectingAssertionsError: js.UndefOr[js.Error] = js.undefined
    
    var isNot: js.UndefOr[Boolean] = js.undefined
    
    var promise: js.UndefOr[String] = js.undefined
    
    var suppressedErrors: js.UndefOr[js.Array[js.Error]] = js.undefined
    
    var testPath: js.UndefOr[String] = js.undefined
  }
  object PartialMatcherState {
    
    inline def apply(): PartialMatcherState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMatcherState]
    }
    
    extension [Self <: PartialMatcherState](x: Self) {
      
      inline def setAssertionCalls(value: Double): Self = StObject.set(x, "assertionCalls", value.asInstanceOf[js.Any])
      
      inline def setAssertionCallsUndefined: Self = StObject.set(x, "assertionCalls", js.undefined)
      
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
      
      inline def setExpectedAssertionsNumberUndefined: Self = StObject.set(x, "expectedAssertionsNumber", js.undefined)
      
      inline def setIsExpectingAssertions(value: Boolean): Self = StObject.set(x, "isExpectingAssertions", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsError(value: js.Error): Self = StObject.set(x, "isExpectingAssertionsError", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsErrorUndefined: Self = StObject.set(x, "isExpectingAssertionsError", js.undefined)
      
      inline def setIsExpectingAssertionsUndefined: Self = StObject.set(x, "isExpectingAssertions", js.undefined)
      
      inline def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
      
      inline def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
      
      inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setSuppressedErrors(value: js.Array[js.Error]): Self = StObject.set(x, "suppressedErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressedErrorsUndefined: Self = StObject.set(x, "suppressedErrors", js.undefined)
      
      inline def setSuppressedErrorsVarargs(value: js.Error*): Self = StObject.set(x, "suppressedErrors", js.Array(value*))
      
      inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
      
      inline def setTestPathUndefined: Self = StObject.set(x, "testPath", js.undefined)
    }
  }
  
  /* Inlined {readonly printExpected (value : unknown): string,  readonly BOLD_WEIGHT :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk * / any,  readonly EXPECTED_COLOR :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk * / any, readonly ensureActualIsNumber (actual : unknown, matcherName : string): void, readonly ensureActualIsNumber (actual : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly getLabelPrinter (strings : ...string): jest-matcher-utils.jest-matcher-utils.PrintLabel, readonly pluralize (word : string, count : number): string, readonly printDiffOrStringify (expected : unknown, received : unknown, expectedLabel : string, receivedLabel : string, expand : boolean): string, readonly ensureNoExpected (expected : unknown, matcherName : string): void, readonly ensureNoExpected (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly ensureExpectedIsNonNegativeInteger (expected : unknown, matcherName : string): void, readonly ensureExpectedIsNonNegativeInteger (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void,  readonly SUGGEST_TO_CONTAIN_EQUAL :string, readonly matcherHint (matcherName : string): string, readonly matcherHint (matcherName : string, received : string): string, readonly matcherHint (matcherName : string, received : string, expected : string): string, readonly matcherHint (matcherName : string, received : undefined, expected : string): string, readonly matcherHint (matcherName : string, received : string, expected : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : undefined, expected : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : string, expected : undefined, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : undefined, expected : undefined, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly ensureNumbers (actual : unknown, expected : unknown, matcherName : string): void, readonly ensureNumbers (actual : unknown, expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly printReceived (object : unknown): string, readonly diff (a : unknown, b : unknown): string | null, readonly diff (a : unknown, b : unknown, options : jest-matcher-utils.jest-matcher-utils.DiffOptions): string | null,  readonly DIM_COLOR :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk * / any, readonly ensureExpectedIsNumber (expected : unknown, matcherName : string): void, readonly ensureExpectedIsNumber (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void,  readonly INVERTED_COLOR :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk * / any, readonly printWithType <T>(name : string, value : T, print : (value : T): string): string, readonly highlightTrailingWhitespace (text : string): string, readonly matcherErrorMessage (hint : string, generic : string): string, readonly matcherErrorMessage (hint : string, generic : string, specific : string): string,  readonly RECEIVED_COLOR :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk * / any, readonly stringify (object : unknown): string, readonly stringify (object : unknown, maxDepth : number): string, readonly stringify (object : unknown, maxDepth : number, maxWidth : number): string, readonly stringify (object : unknown, maxDepth : undefined, maxWidth : number): string} & {  iterableEquality :@jest/expect-utils.@jest/expect-utils.Tester,   subsetEquality :@jest/expect-utils.@jest/expect-utils.Tester} */
  @js.native
  trait readonlyprintExpectedvalu extends StObject {
    
    val BOLD_WEIGHT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    
    val DIM_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    
    val EXPECTED_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    
    val INVERTED_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    
    val RECEIVED_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    
    val SUGGEST_TO_CONTAIN_EQUAL: String = js.native
    
    def diff(a: Any, b: Any): String | Null = js.native
    def diff(a: Any, b: Any, options: DiffOptions): String | Null = js.native
    
    def ensureActualIsNumber(actual: Any, matcherName: String): Unit = js.native
    def ensureActualIsNumber(actual: Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureExpectedIsNonNegativeInteger(expected: Any, matcherName: String): Unit = js.native
    def ensureExpectedIsNonNegativeInteger(expected: Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureExpectedIsNumber(expected: Any, matcherName: String): Unit = js.native
    def ensureExpectedIsNumber(expected: Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureNoExpected(expected: Any, matcherName: String): Unit = js.native
    def ensureNoExpected(expected: Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureNumbers(actual: Any, expected: Any, matcherName: String): Unit = js.native
    def ensureNumbers(actual: Any, expected: Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def getLabelPrinter(strings: String*): PrintLabel = js.native
    
    def highlightTrailingWhitespace(text: String): String = js.native
    
    var iterableEquality: Tester = js.native
    
    def matcherErrorMessage(hint: String, generic: String): String = js.native
    def matcherErrorMessage(hint: String, generic: String, specific: String): String = js.native
    
    def matcherHint(matcherName: String): String = js.native
    def matcherHint(matcherName: String, received: String): String = js.native
    def matcherHint(matcherName: String, received: String, expected: String): String = js.native
    def matcherHint(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = js.native
    def matcherHint(matcherName: String, received: String, expected: Unit, options: MatcherHintOptions): String = js.native
    def matcherHint(matcherName: String, received: Unit, expected: String): String = js.native
    def matcherHint(matcherName: String, received: Unit, expected: String, options: MatcherHintOptions): String = js.native
    def matcherHint(matcherName: String, received: Unit, expected: Unit, options: MatcherHintOptions): String = js.native
    
    def pluralize(word: String, count: Double): String = js.native
    
    def printDiffOrStringify(expected: Any, received: Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = js.native
    
    def printExpected(value: Any): String = js.native
    
    def printReceived(`object`: Any): String = js.native
    
    def printWithType[T](name: String, value: T, print: js.Function1[/* value */ T, String]): String = js.native
    
    def stringify(`object`: Any): String = js.native
    def stringify(`object`: Any, maxDepth: Double): String = js.native
    def stringify(`object`: Any, maxDepth: Double, maxWidth: Double): String = js.native
    def stringify(`object`: Any, maxDepth: Unit, maxWidth: Double): String = js.native
    
    var subsetEquality: Tester = js.native
  }
}
