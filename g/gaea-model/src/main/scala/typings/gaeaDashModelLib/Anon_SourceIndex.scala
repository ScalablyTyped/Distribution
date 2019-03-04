package typings
package gaeaDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceIndex extends js.Object {
  // 移除的位置
  var sourceIndex: scala.Double
  // 移动前父级 mapKey
  var sourceParentMapUniqueKey: java.lang.String
  // 插入的位置
  var targetIndex: scala.Double
  // 移动到的父级 mapKey
  var targetParentMapUniqueKey: java.lang.String
}

object Anon_SourceIndex {
  @scala.inline
  def apply(
    sourceIndex: scala.Double,
    sourceParentMapUniqueKey: java.lang.String,
    targetIndex: scala.Double,
    targetParentMapUniqueKey: java.lang.String
  ): Anon_SourceIndex = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex, sourceParentMapUniqueKey = sourceParentMapUniqueKey, targetIndex = targetIndex, targetParentMapUniqueKey = targetParentMapUniqueKey)
  
    __obj.asInstanceOf[Anon_SourceIndex]
  }
}

