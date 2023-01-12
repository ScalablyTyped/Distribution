package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDelayedDataCheckConfig extends StObject {
  
  var check_window: js.UndefOr[Duration] = js.undefined
  
  var enabled: Boolean
}
object MlDelayedDataCheckConfig {
  
  inline def apply(enabled: Boolean): MlDelayedDataCheckConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDelayedDataCheckConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDelayedDataCheckConfig] (val x: Self) extends AnyVal {
    
    inline def setCheck_window(value: Duration): Self = StObject.set(x, "check_window", value.asInstanceOf[js.Any])
    
    inline def setCheck_windowUndefined: Self = StObject.set(x, "check_window", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
