package typings.fsMerger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSMergerObject extends js.Object {
  var absRootWithSep: String = js.native
  var getDestinationPath: js.UndefOr[js.Function] = js.native
  var prefix: js.UndefOr[String] = js.native
  var root: String = js.native
}

object FSMergerObject {
  @scala.inline
  def apply(absRootWithSep: String, root: String): FSMergerObject = {
    val __obj = js.Dynamic.literal(absRootWithSep = absRootWithSep.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSMergerObject]
  }
  @scala.inline
  implicit class FSMergerObjectOps[Self <: FSMergerObject] (val x: Self) extends AnyVal {
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
    def setAbsRootWithSep(value: String): Self = this.set("absRootWithSep", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDestinationPath(value: js.Function): Self = this.set("getDestinationPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetDestinationPath: Self = this.set("getDestinationPath", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

