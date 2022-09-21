package typings.dmx.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[TDevices /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in string ]:? dmx.dmx.Device}
  */ typings.dmx.dmxStrings.Options & TopLevel[Any] */] extends StObject {
  
  var devices: js.UndefOr[TDevices] = js.undefined
}
object Options {
  
  inline def apply[TDevices /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]:? dmx.dmx.Device}
    */ typings.dmx.dmxStrings.Options & TopLevel[Any] */](): Options[TDevices] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TDevices]]
  }
  
  extension [Self <: Options[?], TDevices /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]:? dmx.dmx.Device}
    */ typings.dmx.dmxStrings.Options & TopLevel[Any] */](x: Self & Options[TDevices]) {
    
    inline def setDevices(value: TDevices): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
  }
}
