package typings.ecmarkup.anon

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintingErrors extends js.Object {
  var grammar: typings.grammarkdown.mod.Grammar
  var lintingErrors: js.Array[LintingError]
  var oneOffGrammars: js.Array[GrammarEle]
}

object LintingErrors {
  @scala.inline
  def apply(
    grammar: typings.grammarkdown.mod.Grammar,
    lintingErrors: js.Array[LintingError],
    oneOffGrammars: js.Array[GrammarEle]
  ): LintingErrors = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], lintingErrors = lintingErrors.asInstanceOf[js.Any], oneOffGrammars = oneOffGrammars.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintingErrors]
  }
}

