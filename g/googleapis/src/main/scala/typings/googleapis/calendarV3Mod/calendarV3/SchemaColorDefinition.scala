package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColorDefinition extends StObject {
  
  /**
    * The background color associated with this color definition.
    */
  var background: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The foreground color that can be used to write on top of a background with 'background' color.
    */
  var foreground: js.UndefOr[String | Null] = js.undefined
}
object SchemaColorDefinition {
  
  inline def apply(): SchemaColorDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColorDefinition]
  }
  
  extension [Self <: SchemaColorDefinition](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundNull: Self = StObject.set(x, "foreground", null)
    
    inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
  }
}
