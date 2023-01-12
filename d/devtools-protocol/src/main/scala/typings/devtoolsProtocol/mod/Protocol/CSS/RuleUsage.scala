package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleUsage extends StObject {
  
  /**
    * Offset of the end of the rule body from the beginning of the stylesheet.
    */
  var endOffset: Double
  
  /**
    * Offset of the start of the rule (including selector) from the beginning of the stylesheet.
    */
  var startOffset: Double
  
  /**
    * The css style sheet identifier (absent for user agent stylesheet and user-specified
    * stylesheet rules) this rule came from.
    */
  var styleSheetId: StyleSheetId
  
  /**
    * Indicates whether the rule was actually used by some element in the page.
    */
  var used: Boolean
}
object RuleUsage {
  
  inline def apply(endOffset: Double, startOffset: Double, styleSheetId: StyleSheetId, used: Boolean): RuleUsage = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleUsage] (val x: Self) extends AnyVal {
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
  }
}
