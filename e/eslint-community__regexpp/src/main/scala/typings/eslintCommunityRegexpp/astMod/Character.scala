package typings.eslintCommunityRegexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Character
  extends StObject
     with NodeBase
     with CharacterClassElement
     with LeafNode
     with QuantifiableElement {
  
  @JSName("parent")
  var parent_Character: Alternative | CharacterClass | CharacterClassRange | Quantifier
  
  @JSName("type")
  var type_Character: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Character
  
  var value: Double
}
object Character {
  
  inline def apply(
    end: Double,
    parent: Alternative | CharacterClass | CharacterClassRange | Quantifier,
    raw: String,
    start: Double,
    value: Double
  ): Character = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Character")
    __obj.asInstanceOf[Character]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Character] (val x: Self) extends AnyVal {
    
    inline def setParent(value: Alternative | CharacterClass | CharacterClassRange | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Character): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
