package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesResolveIndex
  extends StObject
     with Generic {
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  
  var name: String | js.Array[String]
}
object IndicesResolveIndex {
  
  @scala.inline
  def apply(name: String | js.Array[String]): IndicesResolveIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesResolveIndex]
  }
  
  @scala.inline
  implicit class IndicesResolveIndexMutableBuilder[Self <: IndicesResolveIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
