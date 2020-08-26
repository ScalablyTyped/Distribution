package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  forkedFromId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait forkedFromIdnumberundefin
  extends /* key */ StringDictionary[js.Any] {
  var forkedFromId: js.UndefOr[Double] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object forkedFromIdnumberundefin {
  @scala.inline
  def apply(): forkedFromIdnumberundefin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[forkedFromIdnumberundefin]
  }
  @scala.inline
  implicit class forkedFromIdnumberundefinOps[Self <: forkedFromIdnumberundefin] (val x: Self) extends AnyVal {
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
    def setForkedFromId(value: Double): Self = this.set("forkedFromId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForkedFromId: Self = this.set("forkedFromId", js.undefined)
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
  
}

