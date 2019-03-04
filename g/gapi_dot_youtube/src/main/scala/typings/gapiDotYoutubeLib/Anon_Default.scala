package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  /**
    * The default value for the property.
    */
  var default: java.lang.String
  /**
    * A list of objects that specify language-specific values for the property.
    */
  var localized: js.Array[Anon_Language]
}

object Anon_Default {
  @scala.inline
  def apply(default: java.lang.String, localized: js.Array[Anon_Language]): Anon_Default = {
    val __obj = js.Dynamic.literal(default = default, localized = localized)
  
    __obj.asInstanceOf[Anon_Default]
  }
}

