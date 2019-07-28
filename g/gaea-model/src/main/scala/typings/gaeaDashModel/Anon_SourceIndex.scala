package typings.gaeaDashModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceIndex extends js.Object {
  // 移除的位置
  var sourceIndex: Double
  // 移动前父级 mapKey
  var sourceParentMapUniqueKey: String
  // 插入的位置
  var targetIndex: Double
  // 移动到的父级 mapKey
  var targetParentMapUniqueKey: String
}

object Anon_SourceIndex {
  @scala.inline
  def apply(
    sourceIndex: Double,
    sourceParentMapUniqueKey: String,
    targetIndex: Double,
    targetParentMapUniqueKey: String
  ): Anon_SourceIndex = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex, sourceParentMapUniqueKey = sourceParentMapUniqueKey, targetIndex = targetIndex, targetParentMapUniqueKey = targetParentMapUniqueKey)
  
    __obj.asInstanceOf[Anon_SourceIndex]
  }
}

