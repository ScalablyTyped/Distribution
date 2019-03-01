package typings
package firstDashMateLib.firstDashMateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizeLineResult extends js.Object {
  /** The string of text that was tokenized. */
  var line: java.lang.String
  /**
    *  An array of rules representing the tokenized state at the end of the line.
    *  These should be passed back into this method when tokenizing the next line
    *  in the file.
    */
  var ruleStack: js.Array[GrammarRule]
  /**
    *  An array of integer scope ids and strings. Positive ids indicate the
    *  beginning of a scope, and negative tags indicate the end. To resolve ids
    *  to scope names, call GrammarRegistry::scopeForId with the absolute
    *  value of the id.
    */
  var tags: js.Array[scala.Double | java.lang.String]
  /**
    *  This is a dynamic property. Invoking it will incur additional overhead,
    *  but will automatically translate the `tags` into token objects with `value`
    *  and `scopes` properties.
    */
  var tokens: js.Array[GrammarToken]
}

object TokenizeLineResult {
  @scala.inline
  def apply(
    line: java.lang.String,
    ruleStack: js.Array[GrammarRule],
    tags: js.Array[scala.Double | java.lang.String],
    tokens: js.Array[GrammarToken]
  ): TokenizeLineResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("ruleStack")(ruleStack)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[TokenizeLineResult]
  }
}

