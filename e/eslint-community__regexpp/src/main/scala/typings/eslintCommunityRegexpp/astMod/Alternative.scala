package typings.eslintCommunityRegexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative
  extends StObject
     with NodeBase
     with BranchNode {
  
  var elements: js.Array[Element]
  
  @JSName("parent")
  var parent_Alternative: CapturingGroup | Group | LookaroundAssertion | Pattern
  
  @JSName("type")
  var type_Alternative: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Alternative
}
object Alternative {
  
  inline def apply(
    elements: js.Array[Element],
    end: Double,
    parent: CapturingGroup | Group | LookaroundAssertion | Pattern,
    raw: String,
    start: Double
  ): Alternative = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[Alternative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setParent(value: CapturingGroup | Group | LookaroundAssertion | Pattern): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Alternative): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
