package typings.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: String
  var editor: String
  var preview: String
}

object Base {
  @scala.inline
  def apply(base: String, editor: String, preview: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

