package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesRecovery extends Generic {
  
  var active_only: js.UndefOr[Boolean] = js.native
  
  var detailed: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
}
object IndicesRecovery {
  
  @scala.inline
  def apply(): IndicesRecovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRecovery]
  }
  
  @scala.inline
  implicit class IndicesRecoveryOps[Self <: IndicesRecovery] (val x: Self) extends AnyVal {
    
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
    def setActive_only(value: Boolean): Self = this.set("active_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive_only: Self = this.set("active_only", js.undefined)
    
    @scala.inline
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
