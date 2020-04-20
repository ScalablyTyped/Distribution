package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  /**
    * The default value for the property.
    */
  var default: String
  /**
    * A list of objects that specify language-specific values for the property.
    */
  var localized: js.Array[AnonLanguage]
}

object AnonDefault {
  @scala.inline
  def apply(default: String, localized: js.Array[AnonLanguage]): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], localized = localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

