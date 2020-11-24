package typings.gaeaModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceIndex extends js.Object {
  
  // 移除的位置
  var sourceIndex: Double = js.native
  
  // 移动前父级 mapKey
  var sourceParentMapUniqueKey: String = js.native
  
  // 插入的位置
  var targetIndex: Double = js.native
  
  // 移动到的父级 mapKey
  var targetParentMapUniqueKey: String = js.native
}
object SourceIndex {
  
  @scala.inline
  def apply(
    sourceIndex: Double,
    sourceParentMapUniqueKey: String,
    targetIndex: Double,
    targetParentMapUniqueKey: String
  ): SourceIndex = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], sourceParentMapUniqueKey = sourceParentMapUniqueKey.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any], targetParentMapUniqueKey = targetParentMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIndex]
  }
  
  @scala.inline
  implicit class SourceIndexOps[Self <: SourceIndex] (val x: Self) extends AnyVal {
    
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
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceParentMapUniqueKey(value: String): Self = this.set("sourceParentMapUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIndex(value: Double): Self = this.set("targetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParentMapUniqueKey(value: String): Self = this.set("targetParentMapUniqueKey", value.asInstanceOf[js.Any])
  }
}
