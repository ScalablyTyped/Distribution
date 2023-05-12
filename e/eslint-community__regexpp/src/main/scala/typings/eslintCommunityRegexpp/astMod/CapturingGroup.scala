package typings.eslintCommunityRegexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapturingGroup
  extends StObject
     with NodeBase
     with BranchNode
     with QuantifiableElement {
  
  var alternatives: js.Array[Alternative]
  
  var name: String | Null
  
  @JSName("parent")
  var parent_CapturingGroup: Alternative | Quantifier
  
  var references: js.Array[Backreference]
  
  @JSName("type")
  var type_CapturingGroup: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CapturingGroup
}
object CapturingGroup {
  
  inline def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    references: js.Array[Backreference],
    start: Double
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], name = null)
    __obj.updateDynamic("type")("CapturingGroup")
    __obj.asInstanceOf[CapturingGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapturingGroup] (val x: Self) extends AnyVal {
    
    inline def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[Backreference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: Backreference*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CapturingGroup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
