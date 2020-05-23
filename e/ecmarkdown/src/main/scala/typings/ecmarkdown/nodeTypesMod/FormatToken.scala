package typings.ecmarkdown.nodeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: Format
}

object FormatToken {
  @scala.inline
  def apply(contents: String, name: Format, location: LocationRange = null): FormatToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatToken]
  }
}

