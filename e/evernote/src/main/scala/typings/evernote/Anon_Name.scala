package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.BootstrapSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var settings: BootstrapSettings
}

object Anon_Name {
  @scala.inline
  def apply(name: String, settings: BootstrapSettings): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, settings = settings)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

