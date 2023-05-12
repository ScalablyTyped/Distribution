package typings.eslintCommunityRegexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantifier
  extends StObject
     with NodeBase
     with BranchNode
     with Element {
  
  var element: QuantifiableElement
  
  var greedy: Boolean
  
  var max: Double
  
  var min: Double
  
  @JSName("parent")
  var parent_Quantifier: Alternative
  
  @JSName("type")
  var type_Quantifier: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Quantifier
}
object Quantifier {
  
  inline def apply(
    element: QuantifiableElement,
    end: Double,
    greedy: Boolean,
    max: Double,
    min: Double,
    parent: Alternative,
    raw: String,
    start: Double
  ): Quantifier = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[Quantifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Quantifier] (val x: Self) extends AnyVal {
    
    inline def setElement(value: QuantifiableElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Quantifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
