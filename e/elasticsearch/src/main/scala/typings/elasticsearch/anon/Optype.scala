package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Optype extends js.Object {
  
  var index: String = js.native
  
  var op_type: js.UndefOr[String] = js.native
  
  var pipeline: js.UndefOr[String] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var version_type: js.UndefOr[String] = js.native
}
object Optype {
  
  @scala.inline
  def apply(index: String): Optype = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optype]
  }
  
  @scala.inline
  implicit class OptypeOps[Self <: Optype] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp_type(value: String): Self = this.set("op_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOp_type: Self = this.set("op_type", js.undefined)
    
    @scala.inline
    def setPipeline(value: String): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    
    @scala.inline
    def setVersion_type(value: String): Self = this.set("version_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion_type: Self = this.set("version_type", js.undefined)
  }
}
