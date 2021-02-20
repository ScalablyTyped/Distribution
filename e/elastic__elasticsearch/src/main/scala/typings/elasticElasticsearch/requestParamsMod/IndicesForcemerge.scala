package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesForcemerge extends Generic {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  
  var flush: js.UndefOr[Boolean] = js.native
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var max_num_segments: js.UndefOr[Double] = js.native
  
  var only_expunge_deletes: js.UndefOr[Boolean] = js.native
}
object IndicesForcemerge {
  
  @scala.inline
  def apply(): IndicesForcemerge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesForcemerge]
  }
  
  @scala.inline
  implicit class IndicesForcemergeMutableBuilder[Self <: IndicesForcemerge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setMax_num_segments(value: Double): Self = StObject.set(x, "max_num_segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_segmentsUndefined: Self = StObject.set(x, "max_num_segments", js.undefined)
    
    @scala.inline
    def setOnly_expunge_deletes(value: Boolean): Self = StObject.set(x, "only_expunge_deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly_expunge_deletesUndefined: Self = StObject.set(x, "only_expunge_deletes", js.undefined)
  }
}
