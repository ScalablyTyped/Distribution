package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /**
    * Value range in the underlying resource (if available).
    */
  var range: js.UndefOr[SourceRange] = js.undefined
  
  /**
    * Specificity of the selector.
    */
  var specificity: js.UndefOr[Specificity] = js.undefined
  
  /**
    * Value text.
    */
  var text: String
}
object Value {
  
  inline def apply(text: String): Value = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
    
    inline def setSpecificityUndefined: Self = StObject.set(x, "specificity", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
