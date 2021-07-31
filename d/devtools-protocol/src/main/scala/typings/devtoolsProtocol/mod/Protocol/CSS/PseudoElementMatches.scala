package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoElementMatches extends StObject {
  
  /**
    * Matches of CSS rules applicable to the pseudo style.
    */
  var matches: js.Array[RuleMatch]
  
  /**
    * Pseudo element type.
    */
  var pseudoType: PseudoType
}
object PseudoElementMatches {
  
  @scala.inline
  def apply(matches: js.Array[RuleMatch], pseudoType: PseudoType): PseudoElementMatches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], pseudoType = pseudoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementMatches]
  }
  
  @scala.inline
  implicit class PseudoElementMatchesMutableBuilder[Self <: PseudoElementMatches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: js.Array[RuleMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: RuleMatch*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setPseudoType(value: PseudoType): Self = StObject.set(x, "pseudoType", value.asInstanceOf[js.Any])
  }
}
