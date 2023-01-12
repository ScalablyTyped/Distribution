package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapGridViewCellInfo extends StObject {
  
  /* protected */ val instance: Any
  
  val rowVisibleIndex: Double
}
object BootstrapGridViewCellInfo {
  
  inline def apply(instance: Any, rowVisibleIndex: Double): BootstrapGridViewCellInfo = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridViewCellInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapGridViewCellInfo] (val x: Self) extends AnyVal {
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setRowVisibleIndex(value: Double): Self = StObject.set(x, "rowVisibleIndex", value.asInstanceOf[js.Any])
  }
}
