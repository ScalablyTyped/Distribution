package typings.dmx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventExtraData
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var origin: js.UndefOr[String] = js.undefined
}
object UpdateEventExtraData {
  
  inline def apply(): UpdateEventExtraData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventExtraData]
  }
  
  extension [Self <: UpdateEventExtraData](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
