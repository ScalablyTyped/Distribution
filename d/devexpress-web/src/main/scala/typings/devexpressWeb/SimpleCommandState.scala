package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a simple state common to most of the client commands.
  */
trait SimpleCommandState extends StObject {
  
  /**
    * Specifies a command availability.
    */
  var enabled: Boolean
  
  /**
    * Specifies a command visibility.
    */
  var visible: Boolean
}
object SimpleCommandState {
  
  inline def apply(enabled: Boolean, visible: Boolean): SimpleCommandState = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCommandState]
  }
  
  extension [Self <: SimpleCommandState](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
