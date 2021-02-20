package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheetChangedEvent extends StObject {
  
  var styleSheetId: StyleSheetId = js.native
}
object StyleSheetChangedEvent {
  
  @scala.inline
  def apply(styleSheetId: StyleSheetId): StyleSheetChangedEvent = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetChangedEvent]
  }
  
  @scala.inline
  implicit class StyleSheetChangedEventMutableBuilder[Self <: StyleSheetChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
