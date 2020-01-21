package typings.evernote

import typings.evernote.mod.Evernote.BootstrapProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProfiles extends js.Object {
  var profiles: js.Array[BootstrapProfile]
}

object AnonProfiles {
  @scala.inline
  def apply(profiles: js.Array[BootstrapProfile]): AnonProfiles = {
    val __obj = js.Dynamic.literal(profiles = profiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProfiles]
  }
}

