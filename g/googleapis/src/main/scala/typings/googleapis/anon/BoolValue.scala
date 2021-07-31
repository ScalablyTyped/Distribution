package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoolValue extends StObject {
  
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  var intValue: js.UndefOr[String] = js.undefined
  
  var multiIntValue: js.UndefOr[js.Array[String]] = js.undefined
  
  var multiValue: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object BoolValue {
  
  @scala.inline
  def apply(): BoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoolValue]
  }
  
  @scala.inline
  implicit class BoolValueMutableBuilder[Self <: BoolValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setMultiIntValue(value: js.Array[String]): Self = StObject.set(x, "multiIntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiIntValueUndefined: Self = StObject.set(x, "multiIntValue", js.undefined)
    
    @scala.inline
    def setMultiIntValueVarargs(value: String*): Self = StObject.set(x, "multiIntValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiValue(value: js.Array[String]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    @scala.inline
    def setMultiValueVarargs(value: String*): Self = StObject.set(x, "multiValue", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
