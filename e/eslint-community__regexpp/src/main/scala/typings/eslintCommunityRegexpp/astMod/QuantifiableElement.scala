package typings.eslintCommunityRegexpp.astMod

import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.digit
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.space
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.eslintCommunityRegexpp.astMod.Backreference
  - typings.eslintCommunityRegexpp.astMod.CapturingGroup
  - typings.eslintCommunityRegexpp.astMod.Character
  - typings.eslintCommunityRegexpp.astMod.CharacterClass
  - typings.eslintCommunityRegexpp.astMod.CharacterSet
  - typings.eslintCommunityRegexpp.astMod.Group
  - typings.eslintCommunityRegexpp.astMod.LookaheadAssertion
*/
trait QuantifiableElement
  extends StObject
     with Element
object QuantifiableElement {
  
  inline def AnyCharacterSet(end: Double, parent: Alternative | Quantifier, raw: String, start: Double): typings.eslintCommunityRegexpp.astMod.AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "any", parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.AnyCharacterSet]
  }
  
  inline def Backreference(
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    ref: Double | String,
    resolved: CapturingGroup,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.Backreference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.Backreference]
  }
  
  inline def CapturingGroup(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    references: js.Array[Backreference],
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.CapturingGroup = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], name = null)
    __obj.updateDynamic("type")("CapturingGroup")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.CapturingGroup]
  }
  
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
  
  inline def CharacterClass(
    elements: js.Array[CharacterClassElement],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.CharacterClass = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClass")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.CharacterClass]
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
  
  inline def Group(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.Group = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.Group]
  }
  
  inline def LookaheadAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.LookaheadAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "lookahead", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.LookaheadAssertion]
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
