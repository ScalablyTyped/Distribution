package typings.ecmarkup.anon

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintingErrors extends js.Object {
  var grammar: typings.grammarkdown.mod.Grammar = js.native
  var lintingErrors: js.Array[LintingError] = js.native
  var oneOffGrammars: js.Array[GrammarEle] = js.native
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
  @scala.inline
  implicit class LintingErrorsOps[Self <: LintingErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGrammar(value: typings.grammarkdown.mod.Grammar): Self = this.set("grammar", value.asInstanceOf[js.Any])
    @scala.inline
    def setLintingErrorsVarargs(value: LintingError*): Self = this.set("lintingErrors", js.Array(value :_*))
    @scala.inline
    def setLintingErrors(value: js.Array[LintingError]): Self = this.set("lintingErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneOffGrammarsVarargs(value: GrammarEle*): Self = this.set("oneOffGrammars", js.Array(value :_*))
    @scala.inline
    def setOneOffGrammars(value: js.Array[GrammarEle]): Self = this.set("oneOffGrammars", value.asInstanceOf[js.Any])
  }
  
}

