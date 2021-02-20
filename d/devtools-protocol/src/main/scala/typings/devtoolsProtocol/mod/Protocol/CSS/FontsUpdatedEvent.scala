package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontsUpdatedEvent extends StObject {
  
  /**
    * The web font that has loaded.
    */
  var font: js.UndefOr[FontFace] = js.native
}
object FontsUpdatedEvent {
  
  @scala.inline
  def apply(): FontsUpdatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontsUpdatedEvent]
  }
  
  @scala.inline
  implicit class FontsUpdatedEventMutableBuilder[Self <: FontsUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: FontFace): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
