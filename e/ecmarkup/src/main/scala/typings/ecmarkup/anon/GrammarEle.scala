package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarEle extends js.Object {
  var grammar: typings.grammarkdown.mod.Grammar
  var grammarEle: typings.std.Element
}

object GrammarEle {
  @scala.inline
  def apply(grammar: typings.grammarkdown.mod.Grammar, grammarEle: typings.std.Element): GrammarEle = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], grammarEle = grammarEle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarEle]
  }
}

