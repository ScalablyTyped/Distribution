package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flag extends js.Object {
  var encoding: String = js.native
  var flag: js.UndefOr[String] = js.native
}

object Flag {
  @scala.inline
  def apply(encoding: String): Flag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flag]
  }
  @scala.inline
  implicit class FlagOps[Self <: Flag] (val x: Self) extends AnyVal {
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
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
  }
  
}

