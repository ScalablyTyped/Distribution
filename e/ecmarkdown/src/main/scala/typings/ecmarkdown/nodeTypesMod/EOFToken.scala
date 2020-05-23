package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownBooleans.`true`
import typings.ecmarkdown.ecmarkdownStrings.EOF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EOFToken extends Token {
  var done: `true`
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: EOF
}

object EOFToken {
  @scala.inline
  def apply(done: `true`, name: EOF, location: LocationRange = null): EOFToken = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[EOFToken]
  }
}

