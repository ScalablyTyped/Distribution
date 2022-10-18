package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOffGrammars extends StObject {
  
  var grammar: typings.grammarkdown.mod.Grammar
  
  var oneOffGrammars: js.Array[GrammarEle]
}
object OneOffGrammars {
  
  inline def apply(grammar: typings.grammarkdown.mod.Grammar, oneOffGrammars: js.Array[GrammarEle]): OneOffGrammars = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], oneOffGrammars = oneOffGrammars.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOffGrammars]
  }
  
  extension [Self <: OneOffGrammars](x: Self) {
    
    inline def setGrammar(value: typings.grammarkdown.mod.Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    inline def setOneOffGrammars(value: js.Array[GrammarEle]): Self = StObject.set(x, "oneOffGrammars", value.asInstanceOf[js.Any])
    
    inline def setOneOffGrammarsVarargs(value: GrammarEle*): Self = StObject.set(x, "oneOffGrammars", js.Array(value*))
  }
}
