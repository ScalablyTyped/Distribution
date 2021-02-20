package typings.devextreme.anon

import typings.devextreme.devextremeStrings.onClick
import typings.devextreme.devextremeStrings.onHover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelayName extends StObject {
  
  var delay: js.UndefOr[Show | Double] = js.native
  
  var name: js.UndefOr[onClick | onHover] = js.native
}
object DelayName {
  
  @scala.inline
  def apply(): DelayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayName]
  }
  
  @scala.inline
  implicit class DelayNameMutableBuilder[Self <: DelayName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Show | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setName(value: onClick | onHover): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
