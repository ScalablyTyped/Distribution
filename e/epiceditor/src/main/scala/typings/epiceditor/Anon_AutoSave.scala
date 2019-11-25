package typings.epiceditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoSave extends js.Object {
  var autoSave: js.Any
  var defaultContent: String
  var name: String
}

object Anon_AutoSave {
  @scala.inline
  def apply(autoSave: js.Any, defaultContent: String, name: String): Anon_AutoSave = {
    val __obj = js.Dynamic.literal(autoSave = autoSave.asInstanceOf[js.Any], defaultContent = defaultContent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoSave]
  }
}

