package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InheritedPseudoElementMatches extends StObject {
  
  /**
    * Matches of pseudo styles from the pseudos of an ancestor node.
    */
  var pseudoElements: js.Array[PseudoElementMatches]
}
object InheritedPseudoElementMatches {
  
  inline def apply(pseudoElements: js.Array[PseudoElementMatches]): InheritedPseudoElementMatches = {
    val __obj = js.Dynamic.literal(pseudoElements = pseudoElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritedPseudoElementMatches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InheritedPseudoElementMatches] (val x: Self) extends AnyVal {
    
    inline def setPseudoElements(value: js.Array[PseudoElementMatches]): Self = StObject.set(x, "pseudoElements", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementsVarargs(value: PseudoElementMatches*): Self = StObject.set(x, "pseudoElements", js.Array(value*))
  }
}
