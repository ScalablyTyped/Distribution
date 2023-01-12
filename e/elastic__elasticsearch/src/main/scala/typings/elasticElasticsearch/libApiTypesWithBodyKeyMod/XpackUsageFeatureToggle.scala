package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageFeatureToggle extends StObject {
  
  var enabled: Boolean
}
object XpackUsageFeatureToggle {
  
  inline def apply(enabled: Boolean): XpackUsageFeatureToggle = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageFeatureToggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageFeatureToggle] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
