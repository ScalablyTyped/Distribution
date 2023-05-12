package typings.eslintCommunityRegexpp.astMod

import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.end
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeAssertion
  extends StObject
     with NodeBase
     with BoundaryAssertion {
  
  var kind: end | start
  
  @JSName("parent")
  var parent_EdgeAssertion: Alternative | Quantifier
  
  @JSName("type")
  var type_EdgeAssertion: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion
}
object EdgeAssertion {
  
  inline def apply(end: Double, kind: end | start, parent: Alternative | Quantifier, raw: String, start: Double): EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[EdgeAssertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeAssertion] (val x: Self) extends AnyVal {
    
    inline def setKind(value: end | start): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
