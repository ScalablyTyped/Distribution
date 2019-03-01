package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Profiles extends js.Object {
  var profiles: js.Array[evernoteLib.evernoteMod.EvernoteNs.BootstrapProfile]
}

object Anon_Profiles {
  @scala.inline
  def apply(profiles: js.Array[evernoteLib.evernoteMod.EvernoteNs.BootstrapProfile]): Anon_Profiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("profiles")(profiles)
    __obj.asInstanceOf[Anon_Profiles]
  }
}

