package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStyleTextsResponse extends StObject {
  
  /**
    * The resulting styles after modification.
    */
  var styles: js.Array[CSSStyle]
}
object SetStyleTextsResponse {
  
  inline def apply(styles: js.Array[CSSStyle]): SetStyleTextsResponse = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleTextsResponse]
  }
  
  extension [Self <: SetStyleTextsResponse](x: Self) {
    
    inline def setStyles(value: js.Array[CSSStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: CSSStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
