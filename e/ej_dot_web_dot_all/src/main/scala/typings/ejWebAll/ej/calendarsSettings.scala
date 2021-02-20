package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait calendarsSettings extends StObject {
  
  var standard: standardSettings = js.native
}
object calendarsSettings {
  
  @scala.inline
  def apply(standard: standardSettings): calendarsSettings = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[calendarsSettings]
  }
  
  @scala.inline
  implicit class calendarsSettingsMutableBuilder[Self <: calendarsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStandard(value: standardSettings): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
