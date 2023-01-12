package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsEwmaModelSettings extends StObject {
  
  var alpha: js.UndefOr[float] = js.undefined
}
object AggregationsEwmaModelSettings {
  
  inline def apply(): AggregationsEwmaModelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsEwmaModelSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsEwmaModelSettings] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: float): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
  }
}
