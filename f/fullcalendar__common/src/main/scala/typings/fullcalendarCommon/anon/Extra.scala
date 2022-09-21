package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.ViewOptions
import typings.fullcalendarCommon.mod.ViewOptionsRefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  var rawOptions: ViewOptions
  
  var refinedOptions: ViewOptionsRefined
}
object Extra {
  
  inline def apply(rawOptions: ViewOptions, refinedOptions: ViewOptionsRefined): Extra = {
    val __obj = js.Dynamic.literal(rawOptions = rawOptions.asInstanceOf[js.Any], refinedOptions = refinedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  extension [Self <: Extra](x: Self) {
    
    inline def setRawOptions(value: ViewOptions): Self = StObject.set(x, "rawOptions", value.asInstanceOf[js.Any])
    
    inline def setRefinedOptions(value: ViewOptionsRefined): Self = StObject.set(x, "refinedOptions", value.asInstanceOf[js.Any])
  }
}
