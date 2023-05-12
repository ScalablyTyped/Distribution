package typings.eslintCommunityRegexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeBase extends StObject {
  
  /** The 0-based index that this node ends. */
  var end: Double
  
  /** The parent node. */
  var parent: CapturingGroup | Group | LookaroundAssertion | Pattern | Alternative | Quantifier | CharacterClass | RegExpLiteral | Null | CharacterClassRange
  
  /** The raw text of this node. */
  var raw: String
  
  /** The 0-based index that this node starts. */
  var start: Double
  
  /** The node type. */
  var `type`: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Alternative | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CapturingGroup | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterClass | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterClassRange | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Group | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Pattern | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Quantifier | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.RegExpLiteral | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Backreference | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Character | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterSet | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Flags
}
object NodeBase {
  
  inline def apply(
    end: Double,
    raw: String,
    start: Double,
    `type`: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Alternative | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CapturingGroup | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterClass | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterClassRange | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Group | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Pattern | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Quantifier | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.RegExpLiteral | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Backreference | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Character | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterSet | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Flags
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeBase] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setParent(
      value: CapturingGroup | Group | LookaroundAssertion | Pattern | Alternative | Quantifier | CharacterClass | RegExpLiteral | CharacterClassRange
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Alternative | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CapturingGroup | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterClass | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterClassRange | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Group | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Assertion | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Pattern | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Quantifier | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.RegExpLiteral | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Backreference | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Character | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.CharacterSet | typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.Flags
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
