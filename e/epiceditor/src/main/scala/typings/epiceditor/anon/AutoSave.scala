package typings.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSave extends js.Object {
  var autoSave: js.Any
  var defaultContent: String
  var name: String
}

object AutoSave {
  @scala.inline
  def apply(autoSave: js.Any, defaultContent: String, name: String): AutoSave = {
    val __obj = js.Dynamic.literal(autoSave = autoSave.asInstanceOf[js.Any], defaultContent = defaultContent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSave]
  }
}

