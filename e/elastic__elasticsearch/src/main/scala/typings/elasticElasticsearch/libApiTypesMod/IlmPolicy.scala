package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmPolicy extends StObject {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var phases: IlmPhases
}
object IlmPolicy {
  
  inline def apply(phases: IlmPhases): IlmPolicy = {
    val __obj = js.Dynamic.literal(phases = phases.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmPolicy]
  }
  
  extension [Self <: IlmPolicy](x: Self) {
    
    inline def setPhases(value: IlmPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
