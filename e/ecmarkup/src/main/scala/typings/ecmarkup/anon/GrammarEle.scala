package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarEle extends StObject {
  
  var grammar: typings.grammarkdown.mod.Grammar
  
  var grammarEle: typings.std.Element
}
object GrammarEle {
  
  inline def apply(grammar: typings.grammarkdown.mod.Grammar, grammarEle: typings.std.Element): GrammarEle = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], grammarEle = grammarEle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarEle]
  }
  
  extension [Self <: GrammarEle](x: Self) {
    
    inline def setGrammar(value: typings.grammarkdown.mod.Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    inline def setGrammarEle(value: typings.std.Element): Self = StObject.set(x, "grammarEle", value.asInstanceOf[js.Any])
  }
}
