package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * Equivalent to KeyboardEvent.altKey.
    */
  var alt: Boolean
  
  /**
    * Equivalent to KeyboardEvent.code.
    */
  var code: String
  
  /**
    * Equivalent to KeyboardEvent.controlKey.
    */
  var control: Boolean
  
  /**
    * Equivalent to KeyboardEvent.repeat.
    */
  var isAutoRepeat: Boolean
  
  /**
    * Equivalent to KeyboardEvent.isComposing.
    */
  var isComposing: Boolean
  
  /**
    * Equivalent to KeyboardEvent.key.
    */
  var key: String
  
  /**
    * Equivalent to KeyboardEvent.metaKey.
    */
  var meta: Boolean
  
  /**
    * Equivalent to KeyboardEvent.shiftKey.
    */
  var shift: Boolean
  
  /**
    * Either `keyUp` or `keyDown`.
    */
  var `type`: String
}
object Input {
  
  @scala.inline
  def apply(
    alt: Boolean,
    code: String,
    control: Boolean,
    isAutoRepeat: Boolean,
    isComposing: Boolean,
    key: String,
    meta: Boolean,
    shift: Boolean,
    `type`: String
  ): Input = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], isAutoRepeat = isAutoRepeat.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: Boolean): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoRepeat(value: Boolean): Self = StObject.set(x, "isAutoRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
