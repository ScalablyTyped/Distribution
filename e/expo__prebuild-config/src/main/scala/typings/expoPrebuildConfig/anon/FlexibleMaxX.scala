package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.interfaceBuilderMod.IBBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexibleMaxX extends StObject {
  
  var flexibleMaxX: IBBoolean
  
  var flexibleMaxY: IBBoolean
  
  var key: String
}
object FlexibleMaxX {
  
  inline def apply(flexibleMaxX: IBBoolean, flexibleMaxY: IBBoolean, key: String): FlexibleMaxX = {
    val __obj = js.Dynamic.literal(flexibleMaxX = flexibleMaxX.asInstanceOf[js.Any], flexibleMaxY = flexibleMaxY.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexibleMaxX]
  }
  
  extension [Self <: FlexibleMaxX](x: Self) {
    
    inline def setFlexibleMaxX(value: IBBoolean): Self = StObject.set(x, "flexibleMaxX", value.asInstanceOf[js.Any])
    
    inline def setFlexibleMaxY(value: IBBoolean): Self = StObject.set(x, "flexibleMaxY", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
