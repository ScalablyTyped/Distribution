package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicProfile extends js.Object {
  def getEmail(): String = js.native
  def getFamilyName(): String = js.native
  def getGivenName(): String = js.native
  def getId(): String = js.native
  def getImageUrl(): String = js.native
  def getName(): String = js.native
}

object BasicProfile {
  @scala.inline
  def apply(
    getEmail: () => String,
    getFamilyName: () => String,
    getGivenName: () => String,
    getId: () => String,
    getImageUrl: () => String,
    getName: () => String
  ): BasicProfile = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getFamilyName = js.Any.fromFunction0(getFamilyName), getGivenName = js.Any.fromFunction0(getGivenName), getId = js.Any.fromFunction0(getId), getImageUrl = js.Any.fromFunction0(getImageUrl), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[BasicProfile]
  }
  @scala.inline
  implicit class BasicProfileOps[Self <: BasicProfile] (val x: Self) extends AnyVal {
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
    def setGetEmail(value: () => String): Self = this.set("getEmail", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFamilyName(value: () => String): Self = this.set("getFamilyName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGivenName(value: () => String): Self = this.set("getGivenName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetImageUrl(value: () => String): Self = this.set("getImageUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
  }
  
}

