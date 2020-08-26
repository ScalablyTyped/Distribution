package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexSpec extends js.Object {
  var auto: js.UndefOr[Boolean] = js.native
  var compound: js.UndefOr[Boolean] = js.native
  var keyPath: js.UndefOr[String | js.Array[String]] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var src: String = js.native
  var unique: js.UndefOr[Boolean] = js.native
}

object IndexSpec {
  @scala.inline
  def apply(name: String, src: String): IndexSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSpec]
  }
  @scala.inline
  implicit class IndexSpecOps[Self <: IndexSpec] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setCompound(value: Boolean): Self = this.set("compound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompound: Self = this.set("compound", js.undefined)
    @scala.inline
    def setKeyPathVarargs(value: String*): Self = this.set("keyPath", js.Array(value :_*))
    @scala.inline
    def setKeyPath(value: String | js.Array[String]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPath: Self = this.set("keyPath", js.undefined)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

