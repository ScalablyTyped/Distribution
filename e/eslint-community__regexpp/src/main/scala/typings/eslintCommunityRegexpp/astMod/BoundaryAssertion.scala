package typings.eslintCommunityRegexpp.astMod

import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.end
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.eslintCommunityRegexpp.astMod.EdgeAssertion
  - typings.eslintCommunityRegexpp.astMod.WordBoundaryAssertion
*/
trait BoundaryAssertion
  extends StObject
     with Assertion
     with LeafNode
object BoundaryAssertion {
  
  inline def EdgeAssertion(end: Double, kind: end | start, parent: Alternative | Quantifier, raw: String, start: Double): typings.eslintCommunityRegexpp.astMod.EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.EdgeAssertion]
  }
  
  inline def WordBoundaryAssertion(end: Double, negate: Boolean, parent: Alternative | Quantifier, raw: String, start: Double): typings.eslintCommunityRegexpp.astMod.WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "word", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.eslintCommunityRegexpp.astMod.WordBoundaryAssertion]
  }
}
