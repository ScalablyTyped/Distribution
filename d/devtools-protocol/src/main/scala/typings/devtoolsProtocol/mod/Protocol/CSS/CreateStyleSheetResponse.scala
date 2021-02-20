package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStyleSheetResponse extends StObject {
  
  /**
    * Identifier of the created "via-inspector" stylesheet.
    */
  var styleSheetId: StyleSheetId = js.native
}
object CreateStyleSheetResponse {
  
  @scala.inline
  def apply(styleSheetId: StyleSheetId): CreateStyleSheetResponse = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStyleSheetResponse]
  }
  
  @scala.inline
  implicit class CreateStyleSheetResponseMutableBuilder[Self <: CreateStyleSheetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
