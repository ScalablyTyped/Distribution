package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOffGrammars extends StObject {
  
  var grammar: typings.grammarkdown.mod.Grammar
  
  var oneOffGrammars: js.Array[GrammarEle]
}
object OneOffGrammars {
  
  @scala.inline
  def apply(grammar: typings.grammarkdown.mod.Grammar, oneOffGrammars: js.Array[GrammarEle]): OneOffGrammars = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], oneOffGrammars = oneOffGrammars.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOffGrammars]
  }
  
  @scala.inline
  implicit class OneOffGrammarsMutableBuilder[Self <: OneOffGrammars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrammar(value: typings.grammarkdown.mod.Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOffGrammars(value: js.Array[GrammarEle]): Self = StObject.set(x, "oneOffGrammars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOffGrammarsVarargs(value: GrammarEle*): Self = StObject.set(x, "oneOffGrammars", js.Array(value :_*))
  }
}
