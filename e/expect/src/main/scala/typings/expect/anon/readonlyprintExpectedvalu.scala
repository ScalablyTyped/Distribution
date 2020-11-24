package typings.expect.anon

import typings.chalk.mod.Chalk
import typings.expect.typesMod.Tester
import typings.jestDiff.typesMod.DiffOptions
import typings.jestMatcherUtils.mod.MatcherHintOptions
import typings.jestMatcherUtils.mod.PrintLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {readonly printExpected (value : unknown): string,  readonly BOLD_WEIGHT :chalk.chalk.Chalk,  readonly EXPECTED_COLOR :chalk.chalk.Chalk, readonly ensureActualIsNumber (actual : unknown, matcherName : string): void, readonly ensureActualIsNumber (actual : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly getLabelPrinter (strings : ...string): jest-matcher-utils.jest-matcher-utils.PrintLabel, readonly pluralize (word : string, count : number): string, readonly printDiffOrStringify (expected : unknown, received : unknown, expectedLabel : string, receivedLabel : string, expand : boolean): string, readonly ensureNoExpected (expected : unknown, matcherName : string): void, readonly ensureNoExpected (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly ensureExpectedIsNonNegativeInteger (expected : unknown, matcherName : string): void, readonly ensureExpectedIsNonNegativeInteger (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void,  readonly SUGGEST_TO_CONTAIN_EQUAL :string, readonly matcherHint (matcherName : string): string, readonly matcherHint (matcherName : string, received : string): string, readonly matcherHint (matcherName : string, received : string, expected : string): string, readonly matcherHint (matcherName : string, received : undefined, expected : string): string, readonly matcherHint (matcherName : string, received : string, expected : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : undefined, expected : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : string, expected : undefined, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly matcherHint (matcherName : string, received : undefined, expected : undefined, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): string, readonly ensureNumbers (actual : unknown, expected : unknown, matcherName : string): void, readonly ensureNumbers (actual : unknown, expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void, readonly printReceived (object : unknown): string, readonly diff (a : unknown, b : unknown): string | null, readonly diff (a : unknown, b : unknown, options : jest-diff.jest-diff/build/types.DiffOptions): string | null,  readonly DIM_COLOR :chalk.chalk.Chalk, readonly ensureExpectedIsNumber (expected : unknown, matcherName : string): void, readonly ensureExpectedIsNumber (expected : unknown, matcherName : string, options : jest-matcher-utils.jest-matcher-utils.MatcherHintOptions): void,  readonly INVERTED_COLOR :chalk.chalk.Chalk, readonly printWithType (name : string, value : unknown, print : (value : unknown): string): string, readonly highlightTrailingWhitespace (text : string): string, readonly matcherErrorMessage (hint : string, generic : string): string, readonly matcherErrorMessage (hint : string, generic : string, specific : string): string,  readonly RECEIVED_COLOR :chalk.chalk.Chalk, readonly stringify (object : unknown): string, readonly stringify (object : unknown, maxDepth : number): string} & {  iterableEquality :expect.expect/build/types.Tester,   subsetEquality :expect.expect/build/types.Tester} */
@js.native
trait readonlyprintExpectedvalu extends js.Object {
  
  val BOLD_WEIGHT: Chalk = js.native
  
  val DIM_COLOR: Chalk = js.native
  
  val EXPECTED_COLOR: Chalk = js.native
  
  val INVERTED_COLOR: Chalk = js.native
  
  val RECEIVED_COLOR: Chalk = js.native
  
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
  def matcherHint(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  def matcherHint(matcherName: String, received: js.UndefOr[scala.Nothing], expected: String): String = js.native
  def matcherHint(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: String,
    options: MatcherHintOptions
  ): String = js.native
  def matcherHint(matcherName: String, received: String): String = js.native
  def matcherHint(
    matcherName: String,
    received: String,
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = js.native
  
  def pluralize(word: String, count: Double): String = js.native
  
  def printDiffOrStringify(expected: js.Any, received: js.Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = js.native
  
  def printExpected(value: js.Any): String = js.native
  
  def printReceived(`object`: js.Any): String = js.native
  
  def printWithType(name: String, value: js.Any, print: js.Function1[/* value */ js.Any, String]): String = js.native
  
  def stringify(`object`: js.Any): String = js.native
  def stringify(`object`: js.Any, maxDepth: Double): String = js.native
  
  var subsetEquality: Tester = js.native
}
