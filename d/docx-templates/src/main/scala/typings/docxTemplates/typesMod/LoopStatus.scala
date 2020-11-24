package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoopStatus extends js.Object {
  
  var idx: Double = js.native
  
  var isIf: js.UndefOr[Boolean] = js.native
  
  var loopOver: js.Array[VarValue] = js.native
  
  var refNode: Node = js.native
  
  var refNodeLevel: Double = js.native
  
  var varName: String = js.native
}
object LoopStatus {
  
  @scala.inline
  def apply(idx: Double, loopOver: js.Array[VarValue], refNode: Node, refNodeLevel: Double, varName: String): LoopStatus = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], loopOver = loopOver.asInstanceOf[js.Any], refNode = refNode.asInstanceOf[js.Any], refNodeLevel = refNodeLevel.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopStatus]
  }
  
  @scala.inline
  implicit class LoopStatusOps[Self <: LoopStatus] (val x: Self) extends AnyVal {
    
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopOverVarargs(value: VarValue*): Self = this.set("loopOver", js.Array(value :_*))
    
    @scala.inline
    def setLoopOver(value: js.Array[VarValue]): Self = this.set("loopOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNode(value: Node): Self = this.set("refNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNodeLevel(value: Double): Self = this.set("refNodeLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarName(value: String): Self = this.set("varName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIf(value: Boolean): Self = this.set("isIf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIf: Self = this.set("isIf", js.undefined)
  }
}
