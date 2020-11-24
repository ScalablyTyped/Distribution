package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneOffGrammars extends js.Object {
  
  var grammar: typings.grammarkdown.mod.Grammar = js.native
  
  var oneOffGrammars: js.Array[GrammarEle] = js.native
}
object OneOffGrammars {
  
  @scala.inline
  def apply(grammar: typings.grammarkdown.mod.Grammar, oneOffGrammars: js.Array[GrammarEle]): OneOffGrammars = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], oneOffGrammars = oneOffGrammars.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOffGrammars]
  }
  
  @scala.inline
  implicit class OneOffGrammarsOps[Self <: OneOffGrammars] (val x: Self) extends AnyVal {
    
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
    def setOneOffGrammarsVarargs(value: GrammarEle*): Self = this.set("oneOffGrammars", js.Array(value :_*))
    
    @scala.inline
    def setOneOffGrammars(value: js.Array[GrammarEle]): Self = this.set("oneOffGrammars", value.asInstanceOf[js.Any])
  }
}
