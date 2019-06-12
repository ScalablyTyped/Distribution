package typings
package firstDashMateLib.firstDashMateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("first-mate", "Grammar")
@js.native
class Grammar protected () extends js.Object {
  def this(registry: GrammarRegistry) = this()
  def this(registry: GrammarRegistry, options: GrammarOptions) = this()
  var fileTypes: js.Array[java.lang.String] = js.native
  var maxLineLength: scala.Double = js.native
  var maxTokensPerLine: scala.Double = js.native
  var name: java.lang.String = js.native
  var scopeName: java.lang.String = js.native
  // Event Subscription
  def onDidUpdate(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
    *  Tokenizes the line of text.
    *  @param line A string of text to tokenize.
    *  @param ruleStack An optional array of rules previously returned from this
    *  method. This should be null when tokenizing the first line in the file.
    *  @param firstLine A optional boolean denoting whether this is the first line
    *  in the file which defaults to `false`.
    *  @return An object representing the result of the tokenize.
    */
  def tokenizeLine(line: java.lang.String): TokenizeLineResult = js.native
  /**
    *  Tokenizes the line of text.
    *  @param line A string of text to tokenize.
    *  @param ruleStack An optional array of rules previously returned from this
    *  method. This should be null when tokenizing the first line in the file.
    *  @param firstLine A optional boolean denoting whether this is the first line
    *  in the file which defaults to `false`.
    *  @return An object representing the result of the tokenize.
    */
  def tokenizeLine(line: java.lang.String, ruleStack: js.Array[GrammarRule]): TokenizeLineResult = js.native
  def tokenizeLine(line: java.lang.String, ruleStack: scala.Null, firstLine: scala.Boolean): TokenizeLineResult = js.native
  @JSName("tokenizeLine")
  def tokenizeLine_false(
    line: java.lang.String,
    ruleStack: js.Array[GrammarRule],
    firstLine: firstDashMateLib.firstDashMateLibNumbers.`false`
  ): TokenizeLineResult = js.native
  // Tokenizing
  /**
    *  Tokenize all lines in the given text.
    *  @param text A string containing one or more lines.
    *  @return An array of token arrays for each line tokenized.
    */
  def tokenizeLines(text: java.lang.String): js.Array[js.Array[GrammarToken]] = js.native
}

