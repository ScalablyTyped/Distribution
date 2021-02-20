package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionPathValue extends StObject {
  
  var conversionPathValue: js.UndefOr[js.Array[InteractionType]] = js.native
  
  var primitiveValue: js.UndefOr[String] = js.native
}
object ConversionPathValue {
  
  @scala.inline
  def apply(): ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionPathValue]
  }
  
  @scala.inline
  implicit class ConversionPathValueMutableBuilder[Self <: ConversionPathValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionPathValue(value: js.Array[InteractionType]): Self = StObject.set(x, "conversionPathValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionPathValueUndefined: Self = StObject.set(x, "conversionPathValue", js.undefined)
    
    @scala.inline
    def setConversionPathValueVarargs(value: InteractionType*): Self = StObject.set(x, "conversionPathValue", js.Array(value :_*))
    
    @scala.inline
    def setPrimitiveValue(value: String): Self = StObject.set(x, "primitiveValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveValueUndefined: Self = StObject.set(x, "primitiveValue", js.undefined)
  }
}
