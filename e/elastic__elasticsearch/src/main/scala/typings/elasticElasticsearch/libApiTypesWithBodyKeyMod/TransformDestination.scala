package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformDestination extends StObject {
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var pipeline: js.UndefOr[String] = js.undefined
}
object TransformDestination {
  
  inline def apply(): TransformDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformDestination]
  }
  
  extension [Self <: TransformDestination](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
