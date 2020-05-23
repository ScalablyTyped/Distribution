package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  /**
    * The default value for the property.
    */
  var default: String
  /**
    * A list of objects that specify language-specific values for the property.
    */
  var localized: js.Array[Language]
}

object Default {
  @scala.inline
  def apply(default: String, localized: js.Array[Language]): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], localized = localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

