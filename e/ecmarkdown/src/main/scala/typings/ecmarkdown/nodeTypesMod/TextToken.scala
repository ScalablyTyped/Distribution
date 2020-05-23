package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: text
}

object TextToken {
  @scala.inline
  def apply(contents: String, name: text, location: LocationRange = null): TextToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextToken]
  }
}

