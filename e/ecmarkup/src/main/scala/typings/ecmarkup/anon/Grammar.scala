package typings.ecmarkup.anon

import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grammar extends StObject {
  
  var grammar: typings.std.Element = js.native
  
  var lists: js.Array[HTMLUListElement] = js.native
}
object Grammar {
  
  @scala.inline
  def apply(grammar: typings.std.Element, lists: js.Array[HTMLUListElement]): Grammar = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
  
  @scala.inline
  implicit class GrammarMutableBuilder[Self <: Grammar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrammar(value: typings.std.Element): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLists(value: js.Array[HTMLUListElement]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsVarargs(value: HTMLUListElement*): Self = StObject.set(x, "lists", js.Array(value :_*))
  }
}
