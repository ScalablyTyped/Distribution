package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataErrorOccurredInfo extends StObject {
  
  val error: js.UndefOr[js.Error] = js.undefined
}
object DataErrorOccurredInfo {
  
  inline def apply(): DataErrorOccurredInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataErrorOccurredInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataErrorOccurredInfo] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
