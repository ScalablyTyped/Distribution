package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSlowlogSettings extends StObject {
  
  var level: js.UndefOr[String] = js.undefined
  
  var reformat: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[integer] = js.undefined
  
  var threshold: js.UndefOr[IndicesSlowlogTresholds] = js.undefined
}
object IndicesSlowlogSettings {
  
  inline def apply(): IndicesSlowlogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSlowlogSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSlowlogSettings] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setReformat(value: Boolean): Self = StObject.set(x, "reformat", value.asInstanceOf[js.Any])
    
    inline def setReformatUndefined: Self = StObject.set(x, "reformat", js.undefined)
    
    inline def setSource(value: integer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setThreshold(value: IndicesSlowlogTresholds): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
