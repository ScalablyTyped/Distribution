package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDownsampleConfig extends StObject {
  
  var fixed_interval: DurationLarge
}
object IndicesDownsampleConfig {
  
  inline def apply(fixed_interval: DurationLarge): IndicesDownsampleConfig = {
    val __obj = js.Dynamic.literal(fixed_interval = fixed_interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDownsampleConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesDownsampleConfig] (val x: Self) extends AnyVal {
    
    inline def setFixed_interval(value: DurationLarge): Self = StObject.set(x, "fixed_interval", value.asInstanceOf[js.Any])
  }
}
