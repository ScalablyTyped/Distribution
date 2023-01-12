package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlChunkingConfig extends StObject {
  
  var mode: MlChunkingMode
  
  var time_span: js.UndefOr[Duration] = js.undefined
}
object MlChunkingConfig {
  
  inline def apply(mode: MlChunkingMode): MlChunkingConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlChunkingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlChunkingConfig] (val x: Self) extends AnyVal {
    
    inline def setMode(value: MlChunkingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTime_span(value: Duration): Self = StObject.set(x, "time_span", value.asInstanceOf[js.Any])
    
    inline def setTime_spanUndefined: Self = StObject.set(x, "time_span", js.undefined)
  }
}
