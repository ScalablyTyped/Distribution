package typings.gaeaModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  // 插入的位置
  var index: Double = js.native
  // 父级 mapKey
  var parentMapUniqueKey: String = js.native
  // 新增组件的唯一标识 id
  var uniqueId: String = js.native
}

object Index {
  @scala.inline
  def apply(index: Double, parentMapUniqueKey: String, uniqueId: String): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentMapUniqueKey(value: String): Self = this.set("parentMapUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
  }
  
}

