package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositingReasonsResponse extends js.Object {
  
  /**
    * A list of strings specifying reason IDs for the given layer to become composited.
    */
  var compositingReasonIds: js.Array[String] = js.native
  
  /**
    * A list of strings specifying reasons for the given layer to become composited.
    */
  var compositingReasons: js.Array[String] = js.native
}
object CompositingReasonsResponse {
  
  @scala.inline
  def apply(compositingReasonIds: js.Array[String], compositingReasons: js.Array[String]): CompositingReasonsResponse = {
    val __obj = js.Dynamic.literal(compositingReasonIds = compositingReasonIds.asInstanceOf[js.Any], compositingReasons = compositingReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositingReasonsResponse]
  }
  
  @scala.inline
  implicit class CompositingReasonsResponseOps[Self <: CompositingReasonsResponse] (val x: Self) extends AnyVal {
    
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
    def setCompositingReasonIdsVarargs(value: String*): Self = this.set("compositingReasonIds", js.Array(value :_*))
    
    @scala.inline
    def setCompositingReasonIds(value: js.Array[String]): Self = this.set("compositingReasonIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositingReasonsVarargs(value: String*): Self = this.set("compositingReasons", js.Array(value :_*))
    
    @scala.inline
    def setCompositingReasons(value: js.Array[String]): Self = this.set("compositingReasons", value.asInstanceOf[js.Any])
  }
}
