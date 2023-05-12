package typings.fullcalendarCore.anon

import typings.fullcalendarCore.internalCommonMod.ViewOptions
import typings.fullcalendarCore.internalCommonMod.ViewOptionsRefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawOptions extends StObject {
  
  var rawOptions: ViewOptions
  
  var refinedOptions: ViewOptionsRefined
}
object RawOptions {
  
  inline def apply(rawOptions: ViewOptions, refinedOptions: ViewOptionsRefined): RawOptions = {
    val __obj = js.Dynamic.literal(rawOptions = rawOptions.asInstanceOf[js.Any], refinedOptions = refinedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawOptions] (val x: Self) extends AnyVal {
    
    inline def setRawOptions(value: ViewOptions): Self = StObject.set(x, "rawOptions", value.asInstanceOf[js.Any])
    
    inline def setRefinedOptions(value: ViewOptionsRefined): Self = StObject.set(x, "refinedOptions", value.asInstanceOf[js.Any])
  }
}
