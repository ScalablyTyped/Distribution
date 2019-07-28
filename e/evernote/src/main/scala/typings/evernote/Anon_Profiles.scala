package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.BootstrapProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Profiles extends js.Object {
  var profiles: js.Array[BootstrapProfile]
}

object Anon_Profiles {
  @scala.inline
  def apply(profiles: js.Array[BootstrapProfile]): Anon_Profiles = {
    val __obj = js.Dynamic.literal(profiles = profiles)
  
    __obj.asInstanceOf[Anon_Profiles]
  }
}

