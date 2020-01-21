package typings.evernote

import typings.evernote.mod.Evernote.BootstrapSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var settings: BootstrapSettings
}

object AnonName {
  @scala.inline
  def apply(name: String, settings: BootstrapSettings): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

