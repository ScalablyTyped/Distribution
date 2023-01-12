package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DateTime
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.double
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucketspan extends StObject {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var bucket_span: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  
  var overall_score: js.UndefOr[double | String] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
  
  var top_n: js.UndefOr[integer] = js.undefined
}
object Bucketspan {
  
  inline def apply(): Bucketspan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucketspan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bucketspan] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setBucket_span(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setBucket_spanUndefined: Self = StObject.set(x, "bucket_span", js.undefined)
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setExclude_interim(value: Boolean): Self = StObject.set(x, "exclude_interim", value.asInstanceOf[js.Any])
    
    inline def setExclude_interimUndefined: Self = StObject.set(x, "exclude_interim", js.undefined)
    
    inline def setOverall_score(value: double | String): Self = StObject.set(x, "overall_score", value.asInstanceOf[js.Any])
    
    inline def setOverall_scoreUndefined: Self = StObject.set(x, "overall_score", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTop_n(value: integer): Self = StObject.set(x, "top_n", value.asInstanceOf[js.Any])
    
    inline def setTop_nUndefined: Self = StObject.set(x, "top_n", js.undefined)
  }
}
