package typings.eslintCommunityRegexpp.astMod

import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordBoundaryAssertion
  extends StObject
     with NodeBase
     with BoundaryAssertion {
  
  var kind: word
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_WordBoundaryAssertion: Alternative | Quantifier
  
  @JSName("type")
  var type_WordBoundaryAssertion: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion
}
object WordBoundaryAssertion {
  
  inline def apply(end: Double, negate: Boolean, parent: Alternative | Quantifier, raw: String, start: Double): WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "word", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[WordBoundaryAssertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordBoundaryAssertion] (val x: Self) extends AnyVal {
    
    inline def setKind(value: word): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
