package typings.domutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DecodeEntities extends StObject {
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeEntities {
    
    inline def apply(): DecodeEntities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeEntities]
    }
    
    extension [Self <: DecodeEntities](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
}
