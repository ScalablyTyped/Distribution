package typings.evernote

import typings.evernote.mod.UserStore.BootstrapProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProfiles extends js.Object {
  var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.undefined
}

object AnonProfiles {
  @scala.inline
  def apply(profiles: js.Array[BootstrapProfile] = null): AnonProfiles = {
    val __obj = js.Dynamic.literal()
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProfiles]
  }
}

