package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Languages extends js.Object {
  var languages: js.Array[Language]
}

object Languages {
  @scala.inline
  def apply(languages: js.Array[Language]): Languages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
}

