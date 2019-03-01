package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var settings: evernoteLib.evernoteMod.EvernoteNs.BootstrapSettings
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, settings: evernoteLib.evernoteMod.EvernoteNs.BootstrapSettings): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Anon_Name]
  }
}

