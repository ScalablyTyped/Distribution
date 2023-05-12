package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptiveDetailRowPreparingInfo extends StObject {
  
  val formOptions: Any
}
object AdaptiveDetailRowPreparingInfo {
  
  inline def apply(formOptions: Any): AdaptiveDetailRowPreparingInfo = {
    val __obj = js.Dynamic.literal(formOptions = formOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveDetailRowPreparingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdaptiveDetailRowPreparingInfo] (val x: Self) extends AnyVal {
    
    inline def setFormOptions(value: Any): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
  }
}
