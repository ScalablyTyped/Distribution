package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of Display Device options
  */
trait SchemaDisplayDevice extends StObject {
  
  /**
    * Defines whether the instance has Display enabled.
    */
  var enableDisplay: js.UndefOr[Boolean] = js.undefined
}
object SchemaDisplayDevice {
  
  inline def apply(): SchemaDisplayDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayDevice]
  }
  
  extension [Self <: SchemaDisplayDevice](x: Self) {
    
    inline def setEnableDisplay(value: Boolean): Self = StObject.set(x, "enableDisplay", value.asInstanceOf[js.Any])
    
    inline def setEnableDisplayUndefined: Self = StObject.set(x, "enableDisplay", js.undefined)
  }
}
