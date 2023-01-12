package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultBackgroundColorOverrideRequest extends StObject {
  
  /**
    * RGBA of the default background color. If not specified, any existing override will be
    * cleared.
    */
  var color: js.UndefOr[RGBA] = js.undefined
}
object SetDefaultBackgroundColorOverrideRequest {
  
  inline def apply(): SetDefaultBackgroundColorOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDefaultBackgroundColorOverrideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDefaultBackgroundColorOverrideRequest] (val x: Self) extends AnyVal {
    
    inline def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
