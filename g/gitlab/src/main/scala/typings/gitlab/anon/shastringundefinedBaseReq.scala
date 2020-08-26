package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  sha :string | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait shastringundefinedBaseReq
  extends /* key */ StringDictionary[js.Any] {
  var sha: js.UndefOr[String] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object shastringundefinedBaseReq {
  @scala.inline
  def apply(): shastringundefinedBaseReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shastringundefinedBaseReq]
  }
  @scala.inline
  implicit class shastringundefinedBaseReqOps[Self <: shastringundefinedBaseReq] (val x: Self) extends AnyVal {
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
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha: Self = this.set("sha", js.undefined)
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
  
}

