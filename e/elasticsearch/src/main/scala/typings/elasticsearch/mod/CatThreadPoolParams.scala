package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings._empty
import typings.elasticsearch.elasticsearchStrings.g
import typings.elasticsearch.elasticsearchStrings.k
import typings.elasticsearch.elasticsearchStrings.m
import typings.elasticsearch.elasticsearchStrings.p
import typings.elasticsearch.elasticsearchStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatThreadPoolParams extends CatCommonParams {
  
  var size: js.UndefOr[_empty | k | m | g | t | p] = js.native
  
  var threadPoolPatterns: js.UndefOr[NameList] = js.native
}
object CatThreadPoolParams {
  
  @scala.inline
  def apply(format: String): CatThreadPoolParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatThreadPoolParams]
  }
  
  @scala.inline
  implicit class CatThreadPoolParamsOps[Self <: CatThreadPoolParams] (val x: Self) extends AnyVal {
    
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
    def setSize(value: _empty | k | m | g | t | p): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setThreadPoolPatternsVarargs(value: String*): Self = this.set("threadPoolPatterns", js.Array(value :_*))
    
    @scala.inline
    def setThreadPoolPatterns(value: NameList): Self = this.set("threadPoolPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadPoolPatterns: Self = this.set("threadPoolPatterns", js.undefined)
  }
}
