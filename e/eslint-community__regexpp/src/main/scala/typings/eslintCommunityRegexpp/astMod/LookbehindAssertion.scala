package typings.eslintCommunityRegexpp.astMod

import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.lookbehind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookbehindAssertion
  extends StObject
     with NodeBase
     with LookaroundAssertion {
  
  var alternatives: js.Array[Alternative]
  
  var kind: lookbehind
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_LookbehindAssertion: Alternative
  
  @JSName("type")
  var type_LookbehindAssertion: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion
}
object LookbehindAssertion {
  
  inline def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double
  ): LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "lookbehind", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[LookbehindAssertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookbehindAssertion] (val x: Self) extends AnyVal {
    
    inline def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value*))
    
    inline def setKind(value: lookbehind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
