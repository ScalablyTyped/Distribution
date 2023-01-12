package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPerPartitionCategorization extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var stop_on_warn: js.UndefOr[Boolean] = js.undefined
}
object MlPerPartitionCategorization {
  
  inline def apply(): MlPerPartitionCategorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPerPartitionCategorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPerPartitionCategorization] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setStop_on_warn(value: Boolean): Self = StObject.set(x, "stop_on_warn", value.asInstanceOf[js.Any])
    
    inline def setStop_on_warnUndefined: Self = StObject.set(x, "stop_on_warn", js.undefined)
  }
}
