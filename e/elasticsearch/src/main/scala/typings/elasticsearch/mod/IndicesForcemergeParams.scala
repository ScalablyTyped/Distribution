package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesForcemergeParams
  extends StObject
     with GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var flush: js.UndefOr[Boolean] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
  
  var maxNumSegments: js.UndefOr[Double] = js.undefined
  
  var onlyExpungeDeletes: js.UndefOr[Boolean] = js.undefined
  
  var operationThreading: js.UndefOr[js.Any] = js.undefined
  
  // even the docs don't know what this does
  var waitForMerge: js.UndefOr[Boolean] = js.undefined
}
object IndicesForcemergeParams {
  
  @scala.inline
  def apply(index: NameList): IndicesForcemergeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesForcemergeParams]
  }
  
  @scala.inline
  implicit class IndicesForcemergeParamsMutableBuilder[Self <: IndicesForcemergeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    @scala.inline
    def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setMaxNumSegments(value: Double): Self = StObject.set(x, "maxNumSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumSegmentsUndefined: Self = StObject.set(x, "maxNumSegments", js.undefined)
    
    @scala.inline
    def setOnlyExpungeDeletes(value: Boolean): Self = StObject.set(x, "onlyExpungeDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyExpungeDeletesUndefined: Self = StObject.set(x, "onlyExpungeDeletes", js.undefined)
    
    @scala.inline
    def setOperationThreading(value: js.Any): Self = StObject.set(x, "operationThreading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationThreadingUndefined: Self = StObject.set(x, "operationThreading", js.undefined)
    
    @scala.inline
    def setWaitForMerge(value: Boolean): Self = StObject.set(x, "waitForMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForMergeUndefined: Self = StObject.set(x, "waitForMerge", js.undefined)
  }
}
