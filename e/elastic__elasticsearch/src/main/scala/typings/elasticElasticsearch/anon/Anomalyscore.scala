package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DateTime
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlPage
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anomalyscore extends StObject {
  
  var anomaly_score: js.UndefOr[double] = js.undefined
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[MlPage] = js.undefined
  
  var sort: js.UndefOr[Field] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
}
object Anomalyscore {
  
  inline def apply(): Anomalyscore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anomalyscore]
  }
  
  extension [Self <: Anomalyscore](x: Self) {
    
    inline def setAnomaly_score(value: double): Self = StObject.set(x, "anomaly_score", value.asInstanceOf[js.Any])
    
    inline def setAnomaly_scoreUndefined: Self = StObject.set(x, "anomaly_score", js.undefined)
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setExclude_interim(value: Boolean): Self = StObject.set(x, "exclude_interim", value.asInstanceOf[js.Any])
    
    inline def setExclude_interimUndefined: Self = StObject.set(x, "exclude_interim", js.undefined)
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setPage(value: MlPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSort(value: Field): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
