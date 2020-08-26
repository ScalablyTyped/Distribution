package typings.fsMerger.anon

import typings.fsMerger.fsMergerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithFileTypes extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.native
  var withFileTypes: js.UndefOr[`false`] = js.native
}

object WithFileTypes {
  @scala.inline
  def apply(): WithFileTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithFileTypes]
  }
  @scala.inline
  implicit class WithFileTypesOps[Self <: WithFileTypes] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setWithFileTypes(value: `false`): Self = this.set("withFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithFileTypes: Self = this.set("withFileTypes", js.undefined)
  }
  
}

