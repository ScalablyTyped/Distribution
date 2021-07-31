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
  
  @scala.inline
  def apply(): SchemaDisplayDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayDevice]
  }
  
  @scala.inline
  implicit class SchemaDisplayDeviceMutableBuilder[Self <: SchemaDisplayDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDisplay(value: Boolean): Self = StObject.set(x, "enableDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDisplayUndefined: Self = StObject.set(x, "enableDisplay", js.undefined)
  }
}
