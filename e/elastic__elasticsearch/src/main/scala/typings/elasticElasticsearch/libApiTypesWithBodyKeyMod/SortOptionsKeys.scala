package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortOptionsKeys extends StObject {
  
  var _doc: js.UndefOr[ScoreSort] = js.undefined
  
  var _geo_distance: js.UndefOr[GeoDistanceSort] = js.undefined
  
  var _score: js.UndefOr[ScoreSort] = js.undefined
  
  var _script: js.UndefOr[ScriptSort] = js.undefined
}
object SortOptionsKeys {
  
  inline def apply(): SortOptionsKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOptionsKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortOptionsKeys] (val x: Self) extends AnyVal {
    
    inline def set_doc(value: ScoreSort): Self = StObject.set(x, "_doc", value.asInstanceOf[js.Any])
    
    inline def set_docUndefined: Self = StObject.set(x, "_doc", js.undefined)
    
    inline def set_geo_distance(value: GeoDistanceSort): Self = StObject.set(x, "_geo_distance", value.asInstanceOf[js.Any])
    
    inline def set_geo_distanceUndefined: Self = StObject.set(x, "_geo_distance", js.undefined)
    
    inline def set_score(value: ScoreSort): Self = StObject.set(x, "_score", value.asInstanceOf[js.Any])
    
    inline def set_scoreUndefined: Self = StObject.set(x, "_score", js.undefined)
    
    inline def set_script(value: ScriptSort): Self = StObject.set(x, "_script", value.asInstanceOf[js.Any])
    
    inline def set_scriptUndefined: Self = StObject.set(x, "_script", js.undefined)
  }
}
