package typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var begin: js.UndefOr[Double] = js.native
  var end: js.UndefOr[Double] = js.native
  var pathList: js.Array[Double] = js.native
  var sourceFile: js.UndefOr[String] = js.native
}

object AsObject {
  @scala.inline
  def apply(pathList: js.Array[Double]): AsObject = {
    val __obj = js.Dynamic.literal(pathList = pathList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setPathListVarargs(value: Double*): Self = this.set("pathList", js.Array(value :_*))
    @scala.inline
    def setPathList(value: js.Array[Double]): Self = this.set("pathList", value.asInstanceOf[js.Any])
    @scala.inline
    def setBegin(value: Double): Self = this.set("begin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setSourceFile(value: String): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFile: Self = this.set("sourceFile", js.undefined)
  }
  
}

