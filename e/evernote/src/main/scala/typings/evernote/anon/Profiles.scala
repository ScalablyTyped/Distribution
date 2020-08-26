package typings.evernote.anon

import typings.evernote.mod.UserStore.BootstrapProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profiles extends js.Object {
  var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.native
}

object Profiles {
  @scala.inline
  def apply(): Profiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profiles]
  }
  @scala.inline
  implicit class ProfilesOps[Self <: Profiles] (val x: Self) extends AnyVal {
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
    def setProfilesVarargs(value: BootstrapProfile*): Self = this.set("profiles", js.Array(value :_*))
    @scala.inline
    def setProfiles(value: js.Array[BootstrapProfile]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
  }
  
}

