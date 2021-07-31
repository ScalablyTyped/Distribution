package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg extends StObject {
  
  var alg: typings.std.Element
  
  var grammar: typings.std.Element
}
object Alg {
  
  @scala.inline
  def apply(alg: typings.std.Element, grammar: typings.std.Element): Alg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
  
  @scala.inline
  implicit class AlgMutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: typings.std.Element): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrammar(value: typings.std.Element): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
  }
}
