package typings.expect

import typings.chalk.mod.Chalk
import typings.expect.typesMod.Tester
import typings.jestDiff.typesMod.DiffOptions
import typings.jestMatcherUtils.mod.MatcherHintOptions
import typings.jestMatcherUtils.mod.PrintLabel
import typings.jestTypes.configMod.Path
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual extends StObject {
    
    var actual: String | Double
    
    var error: Error
    
    var expected: String
  }
  object Actual {
    
    inline def apply(actual: String | Double, error: Error, expected: String): Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actual]
    }
    
    extension [Self <: Actual](x: Self) {
      
      inline def setActual(value: String | Double): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<expect.expect/build/types.MatcherState> */
  trait PartialMatcherState extends StObject {
    
    var assertionCalls: js.UndefOr[Double] = js.undefined
    
    var currentTestName: js.UndefOr[String] = js.undefined
    
    var dontThrow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    @JSName("equals")
    var equals_FPartialMatcherState: js.UndefOr[
        js.Function4[
          /* a */ js.Any, 
          /* b */ js.Any, 
          /* customTesters */ js.UndefOr[js.Array[Tester]], 
          /* strictCheck */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.undefined
    
    var error: js.UndefOr[Error] = js.undefined
    
    var expand: js.UndefOr[Boolean] = js.undefined
    
    var expectedAssertionsNumber: js.UndefOr[Double | Null] = js.undefined
    
    var expectedAssertionsNumberError: js.UndefOr[Error] = js.undefined
    
    var isExpectingAssertions: js.UndefOr[Boolean] = js.undefined
    
    var isExpectingAssertionsError: js.UndefOr[Error] = js.undefined
    
    var isNot: js.UndefOr[Boolean] = js.undefined
    
    var promise: js.UndefOr[String] = js.undefined
    
    var suppressedErrors: js.UndefOr[js.Array[Error]] = js.undefined
    
    var testPath: js.UndefOr[Path] = js.undefined
    
    var utils: js.UndefOr[readonlyprintExpectedvalu] = js.undefined
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
      
      inline def setDontThrow(value: () => Unit): Self = StObject.set(x, "dontThrow", js.Any.fromFunction0(value))
      
      inline def setDontThrowUndefined: Self = StObject.set(x, "dontThrow", js.undefined)
      
      inline def setEquals_(
        value: (/* a */ js.Any, /* b */ js.Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "equals", js.Any.fromFunction4(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpectedAssertionsNumber(value: Double): Self = StObject.set(x, "expectedAssertionsNumber", value.asInstanceOf[js.Any])
      
      inline def setExpectedAssertionsNumberError(value: Error): Self = StObject.set(x, "expectedAssertionsNumberError", value.asInstanceOf[js.Any])
      
      inline def setExpectedAssertionsNumberErrorUndefined: Self = StObject.set(x, "expectedAssertionsNumberError", js.undefined)
      
      inline def setExpectedAssertionsNumberNull: Self = StObject.set(x, "expectedAssertionsNumber", null)
      
      inline def setExpectedAssertionsNumberUndefined: Self = StObject.set(x, "expectedAssertionsNumber", js.undefined)
      
      inline def setIsExpectingAssertions(value: Boolean): Self = StObject.set(x, "isExpectingAssertions", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsError(value: Error): Self = StObject.set(x, "isExpectingAssertionsError", value.asInstanceOf[js.Any])
      
      inline def setIsExpectingAssertionsErrorUndefined: Self = StObject.set(x, "isExpectingAssertionsError", js.undefined)
      
      inline def setIsExpectingAssertionsUndefined: Self = StObject.set(x, "isExpectingAssertions", js.undefined)
      
      inline def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
      
      inline def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
      
      inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setSuppressedErrors(value: js.Array[Error]): Self = StObject.set(x, "suppressedErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressedErrorsUndefined: Self = StObject.set(x, "suppressedErrors", js.undefined)
      
      inline def setSuppressedErrorsVarargs(value: Error*): Self = StObject.set(x, "suppressedErrors", js.Array(value :_*))
      
      inline def setTestPath(value: Path): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
      
      inline def setTestPathUndefined: Self = StObject.set(x, "testPath", js.undefined)
      
      inline def setUtils(value: readonlyprintExpectedvalu): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      inline def setUtilsUndefined: Self = StObject.set(x, "utils", js.undefined)
    }
  }
  
  @js.native
  trait TypeofBOLDWEIGHT
    extends StObject
       with Chalk
  
  @js.native
  trait TypeofDIMCOLOR
    extends StObject
       with Chalk
  
  @js.native
  trait TypeofEXPECTEDCOLOR
    extends StObject
       with Chalk
  
  @js.native
  trait TypeofINVERTEDCOLOR
    extends StObject
       with Chalk
  
  @js.native
  trait TypeofRECEIVEDCOLOR
    extends StObject
       with Chalk
  
  /* Inlined {readonly printExpected (value : unknown): string,  readonly BOLD_WEIGHT :{ readonly ^ :chalk.chalk.Chalk},  readonly EXPECTED_COLOR :{ readonly ^ :chalk.chalk.Chalk}, readonly ensureActualIsNumber (actual : unknown, matcherName : string): void, readonly ensureActualIsNumber (actual : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly getLabelPrinter (strings : ...string): jest-matcher-utils.jest-matcher-utils.PrintLabel, readonly pluralize (word : string, count : number): string, readonly printDiffOrStringify (expected : unknown, received : unknown, expectedLabel : string, receivedLabel : string, expand : boolean): string, readonly ensureNoExpected (expected : unknown, matcherName : string): void, readonly ensureNoExpected (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly ensureExpectedIsNonNegativeInteger (expected : unknown, matcherName : string): void, readonly ensureExpectedIsNonNegativeInteger (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void,  readonly SUGGEST_TO_CONTAIN_EQUAL :string, readonly matcherHint (matcherName : string): string, readonly matcherHint (matcherName : string, received : string): string, readonly matcherHint (matcherName : string, received : string, expected : string): string, readonly matcherHint (matcherName : string, received : undefined, expected : string): string, readonly matcherHint (matcherName : string, received : string, expected : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : undefined, expected : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : string, expected : undefined, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : undefined, expected : undefined, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly ensureNumbers (actual : unknown, expected : unknown, matcherName : string): void, readonly ensureNumbers (actual : unknown, expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly printReceived (object : unknown): string, readonly diff (a : unknown, b : unknown): string | null, readonly diff (a : unknown, b : unknown, options : jest-diff.jest-diff/build/types.DiffOptions): string | null,  readonly DIM_COLOR :{ readonly ^ :chalk.chalk.Chalk}, readonly ensureExpectedIsNumber (expected : unknown, matcherName : string): void, readonly ensureExpectedIsNumber (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void,  readonly INVERTED_COLOR :{ readonly ^ :chalk.chalk.Chalk}, readonly printWithType (name : string, value : unknown, print : (value : unknown): string): string, readonly highlightTrailingWhitespace (text : string): string, readonly matcherErrorMessage (hint : string, generic : string): string, readonly matcherErrorMessage (hint : string, generic : string, specific : string): string,  readonly RECEIVED_COLOR :{ readonly ^ :chalk.chalk.Chalk}, readonly stringify (object : unknown): string, readonly stringify (object : unknown, maxDepth : number): string} & {  iterableEquality :expect.expect/build/types.Tester,   subsetEquality :expect.expect/build/types.Tester} */
  @js.native
  trait readonlyprintExpectedvalu extends StObject {
    
    val BOLD_WEIGHT: TypeofBOLDWEIGHT = js.native
    
    val DIM_COLOR: TypeofDIMCOLOR = js.native
    
    val EXPECTED_COLOR: TypeofEXPECTEDCOLOR = js.native
    
    val INVERTED_COLOR: TypeofINVERTEDCOLOR = js.native
    
    val RECEIVED_COLOR: TypeofRECEIVEDCOLOR = js.native
    
    val SUGGEST_TO_CONTAIN_EQUAL: String = js.native
    
    def diff(a: js.Any, b: js.Any): String | Null = js.native
    def diff(a: js.Any, b: js.Any, options: DiffOptions): String | Null = js.native
    
    def ensureActualIsNumber(actual: js.Any, matcherName: String): Unit = js.native
    def ensureActualIsNumber(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String): Unit = js.native
    def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureExpectedIsNumber(expected: js.Any, matcherName: String): Unit = js.native
    def ensureExpectedIsNumber(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureNoExpected(expected: js.Any, matcherName: String): Unit = js.native
    def ensureNoExpected(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
    def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String): Unit = js.native
    def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
    
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
    
    def printDiffOrStringify(expected: js.Any, received: js.Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = js.native
    
    def printExpected(value: js.Any): String = js.native
    
    def printReceived(`object`: js.Any): String = js.native
    
    def printWithType(name: String, value: js.Any, print: js.Function1[/* value */ js.Any, String]): String = js.native
    
    def stringify(`object`: js.Any): String = js.native
    def stringify(`object`: js.Any, maxDepth: Double): String = js.native
    
    var subsetEquality: Tester = js.native
  }
}
