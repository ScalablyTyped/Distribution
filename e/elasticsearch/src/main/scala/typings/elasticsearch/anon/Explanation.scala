package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explanation[T] extends js.Object {
  
  var _explanation: js.UndefOr[typings.elasticsearch.mod.Explanation] = js.native
  
  var _id: String = js.native
  
  var _index: String = js.native
  
  var _score: Double = js.native
  
  var _source: T = js.native
  
  var _type: String = js.native
  
  var _version: js.UndefOr[Double] = js.native
  
  var fields: js.UndefOr[js.Any] = js.native
  
  var highlight: js.UndefOr[js.Any] = js.native
  
  var inner_hits: js.UndefOr[js.Any] = js.native
  
  var matched_queries: js.UndefOr[js.Array[String]] = js.native
  
  var sort: js.UndefOr[js.Array[String]] = js.native
}
object Explanation {
  
  @scala.inline
  def apply[T](_id: String, _index: String, _score: Double, _source: T, _type: String): Explanation[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _score = _score.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explanation[T]]
  }
  
  @scala.inline
  implicit class ExplanationOps[Self <: Explanation[_], T] (val x: Self with Explanation[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: String): Self = this.set("_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_score(value: Double): Self = this.set("_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source(value: T): Self = this.set("_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: String): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_explanation(value: typings.elasticsearch.mod.Explanation): Self = this.set("_explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_explanation: Self = this.set("_explanation", js.undefined)
    
    @scala.inline
    def set_version(value: Double): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setFields(value: js.Any): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setHighlight(value: js.Any): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setInner_hits(value: js.Any): Self = this.set("inner_hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner_hits: Self = this.set("inner_hits", js.undefined)
    
    @scala.inline
    def setMatched_queriesVarargs(value: String*): Self = this.set("matched_queries", js.Array(value :_*))
    
    @scala.inline
    def setMatched_queries(value: js.Array[String]): Self = this.set("matched_queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatched_queries: Self = this.set("matched_queries", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: js.Array[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
