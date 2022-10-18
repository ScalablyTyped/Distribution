package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetInfluencersRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Page] = js.undefined
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var influencer_score: js.UndefOr[double] = js.undefined
  
  var job_id: Id
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Field] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
}
object MlGetInfluencersRequest {
  
  inline def apply(job_id: Id): MlGetInfluencersRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetInfluencersRequest]
  }
  
  extension [Self <: MlGetInfluencersRequest](x: Self) {
    
    inline def setBody(value: Page): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setExclude_interim(value: Boolean): Self = StObject.set(x, "exclude_interim", value.asInstanceOf[js.Any])
    
    inline def setExclude_interimUndefined: Self = StObject.set(x, "exclude_interim", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setInfluencer_score(value: double): Self = StObject.set(x, "influencer_score", value.asInstanceOf[js.Any])
    
    inline def setInfluencer_scoreUndefined: Self = StObject.set(x, "influencer_score", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Field): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
