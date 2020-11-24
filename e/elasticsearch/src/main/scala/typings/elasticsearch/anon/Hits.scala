package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hits[T] extends js.Object {
  
  var hits: js.Array[Explanation[T]] = js.native
  
  var max_score: Double = js.native
  
  var total: Double = js.native
}
object Hits {
  
  @scala.inline
  def apply[T](hits: js.Array[Explanation[T]], max_score: Double, total: Double): Hits[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hits[T]]
  }
  
  @scala.inline
  implicit class HitsOps[Self <: Hits[_], T] (val x: Self with Hits[T]) extends AnyVal {
    
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
    def setHitsVarargs(value: Explanation[T]*): Self = this.set("hits", js.Array(value :_*))
    
    @scala.inline
    def setHits(value: js.Array[Explanation[T]]): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_score(value: Double): Self = this.set("max_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
