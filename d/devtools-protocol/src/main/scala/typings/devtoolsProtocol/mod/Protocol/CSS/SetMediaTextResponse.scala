package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetMediaTextResponse extends StObject {
  
  /**
    * The resulting CSS media rule after modification.
    */
  var media: CSSMedia
}
object SetMediaTextResponse {
  
  @scala.inline
  def apply(media: CSSMedia): SetMediaTextResponse = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMediaTextResponse]
  }
  
  @scala.inline
  implicit class SetMediaTextResponseMutableBuilder[Self <: SetMediaTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: CSSMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
