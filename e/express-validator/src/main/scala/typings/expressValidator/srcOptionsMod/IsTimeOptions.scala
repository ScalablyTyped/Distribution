package typings.expressValidator.srcOptionsMod

import typings.expressValidator.expressValidatorStrings.default
import typings.expressValidator.expressValidatorStrings.hour12
import typings.expressValidator.expressValidatorStrings.hour24
import typings.expressValidator.expressValidatorStrings.withSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsTimeOptions extends StObject {
  
  var hourFormat: js.UndefOr[hour24 | hour12] = js.undefined
  
  var mode: js.UndefOr[default | withSeconds] = js.undefined
}
object IsTimeOptions {
  
  inline def apply(): IsTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsTimeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsTimeOptions] (val x: Self) extends AnyVal {
    
    inline def setHourFormat(value: hour24 | hour12): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
    
    inline def setHourFormatUndefined: Self = StObject.set(x, "hourFormat", js.undefined)
    
    inline def setMode(value: default | withSeconds): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
