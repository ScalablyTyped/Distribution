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
  
  @scala.inline
  def apply(styles: js.Array[CSSStyle]): SetStyleTextsResponse = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleTextsResponse]
  }
  
  @scala.inline
  implicit class SetStyleTextsResponseMutableBuilder[Self <: SetStyleTextsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: js.Array[CSSStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: CSSStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
