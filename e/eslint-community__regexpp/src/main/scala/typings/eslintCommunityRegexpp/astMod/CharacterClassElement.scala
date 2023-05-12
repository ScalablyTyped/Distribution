package typings.eslintCommunityRegexpp.astMod

import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.digit
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.space
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.eslintCommunityRegexpp.astMod.Character
  - typings.eslintCommunityRegexpp.astMod.CharacterClassRange
  - typings.eslintCommunityRegexpp.astMod.EscapeCharacterSet
  - typings.eslintCommunityRegexpp.astMod.UnicodePropertyCharacterSet
*/
trait CharacterClassElement extends StObject
object CharacterClassElement {
  
  inline def Character(
    end: Double,
    parent: Alternative | CharacterClass | CharacterClassRange | Quantifier,
    raw: String,
    start: Double,
    value: Double
  ): typings.eslintCommunityRegexpp.astMod.Character = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Character")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.Character]
  }
  
  inline def CharacterClassRange(end: Double, max: Character, min: Character, parent: CharacterClass, raw: String, start: Double): typings.eslintCommunityRegexpp.astMod.CharacterClassRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClassRange")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.CharacterClassRange]
  }
  
  inline def EscapeCharacterSet(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | CharacterClass | Quantifier,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.EscapeCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.EscapeCharacterSet]
  }
  
  inline def UnicodePropertyCharacterSet(
    end: Double,
    key: String,
    negate: Boolean,
    parent: Alternative | CharacterClass | Quantifier,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.UnicodePropertyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = "property", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.UnicodePropertyCharacterSet]
  }
}
