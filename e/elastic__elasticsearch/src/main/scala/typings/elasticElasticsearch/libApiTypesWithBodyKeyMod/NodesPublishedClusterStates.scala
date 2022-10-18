package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesPublishedClusterStates extends StObject {
  
  var compatible_diffs: js.UndefOr[long] = js.undefined
  
  var full_states: js.UndefOr[long] = js.undefined
  
  var incompatible_diffs: js.UndefOr[long] = js.undefined
}
object NodesPublishedClusterStates {
  
  inline def apply(): NodesPublishedClusterStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPublishedClusterStates]
  }
  
  extension [Self <: NodesPublishedClusterStates](x: Self) {
    
    inline def setCompatible_diffs(value: long): Self = StObject.set(x, "compatible_diffs", value.asInstanceOf[js.Any])
    
    inline def setCompatible_diffsUndefined: Self = StObject.set(x, "compatible_diffs", js.undefined)
    
    inline def setFull_states(value: long): Self = StObject.set(x, "full_states", value.asInstanceOf[js.Any])
    
    inline def setFull_statesUndefined: Self = StObject.set(x, "full_states", js.undefined)
    
    inline def setIncompatible_diffs(value: long): Self = StObject.set(x, "incompatible_diffs", value.asInstanceOf[js.Any])
    
    inline def setIncompatible_diffsUndefined: Self = StObject.set(x, "incompatible_diffs", js.undefined)
  }
}
