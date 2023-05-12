package typings.eslintCommunityRegexpp.astMod

import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.digit
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.space
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EscapeCharacterSet
  extends StObject
     with NodeBase
     with CharacterClassElement
     with CharacterSet {
  
  var kind: digit | space | word
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_EscapeCharacterSet: Alternative | CharacterClass | Quantifier
  
  @JSName("type")
  var type_EscapeCharacterSet: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterSet
}
object EscapeCharacterSet {
  
  inline def apply(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | CharacterClass | Quantifier,
    raw: String,
    start: Double
  ): EscapeCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[EscapeCharacterSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EscapeCharacterSet] (val x: Self) extends AnyVal {
    
    inline def setKind(value: digit | space | word): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | CharacterClass | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
