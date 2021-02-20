package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupInterval extends StObject {
  
  var groupInterval: js.UndefOr[String | Double] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double | typings.std.Date] = js.native
  
  var valueText: js.UndefOr[String] = js.native
}
object GroupInterval {
  
  @scala.inline
  def apply(): GroupInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupInterval]
  }
  
  @scala.inline
  implicit class GroupIntervalMutableBuilder[Self <: GroupInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupInterval(value: String | Double): Self = StObject.set(x, "groupInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIntervalUndefined: Self = StObject.set(x, "groupInterval", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
