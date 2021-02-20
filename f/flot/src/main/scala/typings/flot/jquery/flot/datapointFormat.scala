package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait datapointFormat extends StObject {
  
  var defaultValue: js.UndefOr[Double] = js.native
  
  var number: Boolean = js.native
  
  var required: Boolean = js.native
  
  var x: js.UndefOr[Boolean] = js.native
  
  var y: js.UndefOr[Boolean] = js.native
}
object datapointFormat {
  
  @scala.inline
  def apply(number: Boolean, required: Boolean): datapointFormat = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[datapointFormat]
  }
  
  @scala.inline
  implicit class datapointFormatMutableBuilder[Self <: datapointFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
