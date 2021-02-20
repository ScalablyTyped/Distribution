package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a simple state common to most of the client commands.
  */
@js.native
trait SimpleCommandState extends StObject {
  
  /**
    * Specifies a command availability.
    */
  var enabled: Boolean = js.native
  
  /**
    * Specifies a command visibility.
    */
  var visible: Boolean = js.native
}
object SimpleCommandState {
  
  @scala.inline
  def apply(enabled: Boolean, visible: Boolean): SimpleCommandState = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCommandState]
  }
  
  @scala.inline
  implicit class SimpleCommandStateMutableBuilder[Self <: SimpleCommandState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
