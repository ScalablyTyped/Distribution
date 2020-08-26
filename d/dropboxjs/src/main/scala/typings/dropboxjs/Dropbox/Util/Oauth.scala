package typings.dropboxjs.Dropbox.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oauth extends js.Object {
  def checkAuthStateParam(stateParam: String): Boolean = js.native
}

object Oauth {
  @scala.inline
  def apply(checkAuthStateParam: String => Boolean): Oauth = {
    val __obj = js.Dynamic.literal(checkAuthStateParam = js.Any.fromFunction1(checkAuthStateParam))
    __obj.asInstanceOf[Oauth]
  }
  @scala.inline
  implicit class OauthOps[Self <: Oauth] (val x: Self) extends AnyVal {
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
    def setCheckAuthStateParam(value: String => Boolean): Self = this.set("checkAuthStateParam", js.Any.fromFunction1(value))
  }
  
}

