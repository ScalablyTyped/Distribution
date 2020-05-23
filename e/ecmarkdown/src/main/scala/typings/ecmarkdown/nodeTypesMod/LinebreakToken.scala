package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.linebreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinebreakToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: linebreak
}

object LinebreakToken {
  @scala.inline
  def apply(contents: String, name: linebreak, location: LocationRange = null): LinebreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinebreakToken]
  }
}

