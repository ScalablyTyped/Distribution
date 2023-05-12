package typings.eslintCommunityRegexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.eslintCommunityRegexpp.astMod.Alternative
  - typings.eslintCommunityRegexpp.astMod.CapturingGroup
  - typings.eslintCommunityRegexpp.astMod.CharacterClass
  - typings.eslintCommunityRegexpp.astMod.CharacterClassRange
  - typings.eslintCommunityRegexpp.astMod.Group
  - typings.eslintCommunityRegexpp.astMod.LookaroundAssertion
  - typings.eslintCommunityRegexpp.astMod.Pattern
  - typings.eslintCommunityRegexpp.astMod.Quantifier
  - typings.eslintCommunityRegexpp.astMod.RegExpLiteral
*/
trait BranchNode
  extends StObject
     with Node
object BranchNode {
  
  inline def Alternative(
    elements: js.Array[Element],
    end: Double,
    parent: CapturingGroup | Group | LookaroundAssertion | Pattern,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.Alternative = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.Alternative]
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
  
  inline def CharacterClassRange(end: Double, max: Character, min: Character, parent: CharacterClass, raw: String, start: Double): typings.eslintCommunityRegexpp.astMod.CharacterClassRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClassRange")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.CharacterClassRange]
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
  
  inline def LookbehindAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "lookbehind", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.LookbehindAssertion]
  }
  
  inline def Pattern(alternatives: js.Array[Alternative], end: Double, raw: String, start: Double): typings.eslintCommunityRegexpp.astMod.Pattern = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")("Pattern")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.Pattern]
  }
  
  inline def Quantifier(
    element: QuantifiableElement,
    end: Double,
    greedy: Boolean,
    max: Double,
    min: Double,
    parent: Alternative,
    raw: String,
    start: Double
  ): typings.eslintCommunityRegexpp.astMod.Quantifier = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.Quantifier]
  }
  
  inline def RegExpLiteral(end: Double, flags: Flags, parent: Null, pattern: Pattern, raw: String, start: Double): typings.eslintCommunityRegexpp.astMod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.RegExpLiteral]
  }
}
