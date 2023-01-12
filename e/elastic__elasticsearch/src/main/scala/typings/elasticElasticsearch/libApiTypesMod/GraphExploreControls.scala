package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphExploreControls extends StObject {
  
  var sample_diversity: js.UndefOr[GraphSampleDiversity] = js.undefined
  
  var sample_size: js.UndefOr[integer] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var use_significance: Boolean
}
object GraphExploreControls {
  
  inline def apply(use_significance: Boolean): GraphExploreControls = {
    val __obj = js.Dynamic.literal(use_significance = use_significance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphExploreControls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphExploreControls] (val x: Self) extends AnyVal {
    
    inline def setSample_diversity(value: GraphSampleDiversity): Self = StObject.set(x, "sample_diversity", value.asInstanceOf[js.Any])
    
    inline def setSample_diversityUndefined: Self = StObject.set(x, "sample_diversity", js.undefined)
    
    inline def setSample_size(value: integer): Self = StObject.set(x, "sample_size", value.asInstanceOf[js.Any])
    
    inline def setSample_sizeUndefined: Self = StObject.set(x, "sample_size", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUse_significance(value: Boolean): Self = StObject.set(x, "use_significance", value.asInstanceOf[js.Any])
  }
}
